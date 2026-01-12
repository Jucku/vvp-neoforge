package tech.vvp.vvp.network.message.send;

import com.atsuishio.superbwarfare.entity.vehicle.base.VehicleEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.jetbrains.annotations.NotNull;
import tech.vvp.vvp.VVP;

import java.util.List;

/**
 * Сообщение для смены места в технике
 * Клиент -> Сервер
 */
public record SeatSwapMessage(int targetSeatIndex) implements CustomPacketPayload {

    public static final Type<SeatSwapMessage> TYPE = new Type<>(
            VVP.loc("seat_swap")
    );

    public static final StreamCodec<FriendlyByteBuf, SeatSwapMessage> STREAM_CODEC =
            new StreamCodec<>() {
                @Override
                public @NotNull SeatSwapMessage decode(FriendlyByteBuf buffer) {
                    int seat = buffer.readInt();
                    return new SeatSwapMessage(seat);
                }

                @Override
                public void encode(FriendlyByteBuf buffer, SeatSwapMessage message) {
                    buffer.writeInt(message.targetSeatIndex());
                }
            };

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    // Server-side handler (Client -> Server)
    public static void handle(SeatSwapMessage message, IPayloadContext ctx) {
        ctx.enqueueWork(() -> {
            if (!(ctx.player() instanceof ServerPlayer player)) return;

            Entity vehicle = player.getVehicle();
            if (!(vehicle instanceof VehicleEntity vehicleEntity)) return;

            int targetSeat = message.targetSeatIndex();

            // Проверяем что место существует и свободно
            if (targetSeat < 0 || targetSeat >= vehicleEntity.getMaxPassengers()) return;

            // Получаем текущее место игрока
            int currentSeat = vehicleEntity.getSeatIndex(player);
            if (currentSeat == targetSeat) return; // Уже на этом месте

            // Проверяем что целевое место свободно
            List<Entity> passengers = vehicleEntity.getOrderedPassengers();
            Entity occupant = (targetSeat < passengers.size()) ? passengers.get(targetSeat) : null;
            if (occupant != null && occupant != player) return; // Место занято

            // Меняем место через метод SuperbWarfare
            vehicleEntity.changeSeat(player, targetSeat);
        });
    }
}
