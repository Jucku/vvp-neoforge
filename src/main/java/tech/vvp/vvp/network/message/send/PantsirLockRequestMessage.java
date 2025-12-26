package tech.vvp.vvp.network.message.send;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.jetbrains.annotations.NotNull;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.entity.vehicle.PantsirS1Entity;

/**
 * Сообщение от клиента к серверу для запроса захвата цели
 */
public record PantsirLockRequestMessage(int action) implements CustomPacketPayload {

    public static final int ACTION_START_LOCK = 0;   // Начать захват
    public static final int ACTION_CANCEL_LOCK = 1;  // Отменить захват
    public static final int ACTION_NEXT_TARGET = 2;  // Следующая цель
    public static final int ACTION_PREV_TARGET = 3;  // Предыдущая цель

    public static final Type<PantsirLockRequestMessage> TYPE =
            new Type<>(VVP.loc("pantsir_lock_request"));

    public static final StreamCodec<FriendlyByteBuf, PantsirLockRequestMessage> STREAM_CODEC =
            new StreamCodec<>() {
                @Override
                public @NotNull PantsirLockRequestMessage decode(FriendlyByteBuf buf) {
                    return new PantsirLockRequestMessage(buf.readInt());
                }

                @Override
                public void encode(FriendlyByteBuf buf, PantsirLockRequestMessage value) {
                    buf.writeInt(value.action);
                }
            };

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(PantsirLockRequestMessage message, IPayloadContext ctx) {
        // Run on main thread
        ctx.enqueueWork(() -> {
            ServerPlayer player;
            try {
                player = (ServerPlayer) ctx.player();
            } catch (ClassCastException e) {
                return;
            }
            if (player == null) return;

            Entity vehicle = player.getVehicle();
            if (!(vehicle instanceof PantsirS1Entity pantsir)) return;

            // Проверяем что игрок на месте оператора (сидушка 1)
            int seatIndex = pantsir.getSeatIndex(player);
            if (seatIndex != 1) return;

            switch (message.action) {
                case ACTION_START_LOCK -> pantsir.requestLock(player);
                case ACTION_CANCEL_LOCK -> pantsir.cancelLock(player);
                case ACTION_NEXT_TARGET -> pantsir.selectNextTarget();
                case ACTION_PREV_TARGET -> pantsir.selectPrevTarget();
            }
        });
    }
}
