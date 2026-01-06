package tech.vvp.vvp.network.message.recive;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.jetbrains.annotations.NotNull;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.client.PantsirClientHandler;

/**
 * Сообщение от сервера к клиенту для синхронизации состояния радара Pantsir
 */
public record PantsirRadarSyncMessage(
        int vehicleId,       // ID панциря, от которого пришло сообщение
        int radarState,
        int targetEntityId,  // -1 если нет цели
        double targetX,
        double targetY,
        double targetZ,
        double targetVelX,   // Скорость цели для отображения
        double targetVelY,
        double targetVelZ,
        int lockProgress,    // 0-100, прогресс захвата
        double targetDistance,
        float radarAngle,    // Угол вращения радара в градусах (абсолютный)
        float turretAngle,   // Угол башни (пассивный радар) в градусах

        // Все обнаруженные цели для отображения на радаре
        int[] allTargetIds,
        double[] allTargetX,
        double[] allTargetY,
        double[] allTargetZ,
        int[] allTargetTypes, // Тип каждой цели
        boolean[] allTargetIsAlly, // Союзник ли цель

        // Выпущенные ракеты для отображения на радаре
        double[] missileX,
        double[] missileY,
        double[] missileZ
) implements CustomPacketPayload {

    // Состояния радара
    public static final int STATE_IDLE = 0;        // Поиск - нет цели
    public static final int STATE_DETECTED = 1;    // Цель обнаружена, но не захвачена
    public static final int STATE_LOCKING = 2;     // Идёт процесс захвата
    public static final int STATE_LOCKED = 3;      // Цель захвачена
    public static final int STATE_LOST = 4;        // Захват потерян

    // Типы целей для иконок
    public static final int TARGET_TYPE_UNKNOWN = 0;
    public static final int TARGET_TYPE_HELICOPTER = 1;
    public static final int TARGET_TYPE_AIRPLANE = 2;
    public static final int TARGET_TYPE_MISSILE = 3;      // Вражеская ракета
    public static final int TARGET_TYPE_OWN_MISSILE = 4;  // Своя ракета

    public static final Type<PantsirRadarSyncMessage> TYPE =
            new Type<>(VVP.loc("pantsir_radar_sync")
    );

    public static final StreamCodec<FriendlyByteBuf, PantsirRadarSyncMessage> STREAM_CODEC =
            new StreamCodec<>() {
                @Override
                public @NotNull PantsirRadarSyncMessage decode(FriendlyByteBuf buffer) {
                    int vehicleId = buffer.readInt();
                    int radarState = buffer.readInt();
                    int targetEntityId = buffer.readInt();
                    double targetX = buffer.readDouble();
                    double targetY = buffer.readDouble();
                    double targetZ = buffer.readDouble();
                    double targetVelX = buffer.readDouble();
                    double targetVelY = buffer.readDouble();
                    double targetVelZ = buffer.readDouble();
                    int lockProgress = buffer.readInt();
                    double targetDistance = buffer.readDouble();
                    float radarAngle = buffer.readFloat();
                    float turretAngle = buffer.readFloat();

                    int count = buffer.readInt();
                    int[] allTargetIds = new int[count];
                    double[] allTargetX = new double[count];
                    double[] allTargetY = new double[count];
                    double[] allTargetZ = new double[count];
                    int[] allTargetTypes = new int[count];
                    boolean[] allTargetIsAlly = new boolean[count];

                    for (int i = 0; i < count; i++) {
                        allTargetIds[i] = buffer.readInt();
                        allTargetX[i] = buffer.readDouble();
                        allTargetY[i] = buffer.readDouble();
                        allTargetZ[i] = buffer.readDouble();
                        allTargetTypes[i] = buffer.readInt();
                        allTargetIsAlly[i] = buffer.readBoolean();
                    }

                    int missileCount = buffer.readInt();
                    double[] missileX = new double[missileCount];
                    double[] missileY = new double[missileCount];
                    double[] missileZ = new double[missileCount];

                    for (int i = 0; i < missileCount; i++) {
                        missileX[i] = buffer.readDouble();
                        missileY[i] = buffer.readDouble();
                        missileZ[i] = buffer.readDouble();
                    }

                    return new PantsirRadarSyncMessage(
                            vehicleId, radarState, targetEntityId, targetX, targetY, targetZ,
                            targetVelX, targetVelY, targetVelZ,
                            lockProgress, targetDistance, radarAngle, turretAngle,
                            allTargetIds, allTargetX, allTargetY, allTargetZ,
                            allTargetTypes, allTargetIsAlly,
                            missileX, missileY, missileZ
                    );
                }

                @Override
                public void encode(FriendlyByteBuf buffer, PantsirRadarSyncMessage message) {
                    buffer.writeInt(message.vehicleId());
                    buffer.writeInt(message.radarState());
                    buffer.writeInt(message.targetEntityId());
                    buffer.writeDouble(message.targetX());
                    buffer.writeDouble(message.targetY());
                    buffer.writeDouble(message.targetZ());
                    buffer.writeDouble(message.targetVelX());
                    buffer.writeDouble(message.targetVelY());
                    buffer.writeDouble(message.targetVelZ());
                    buffer.writeInt(message.lockProgress());
                    buffer.writeDouble(message.targetDistance());
                    buffer.writeFloat(message.radarAngle());
                    buffer.writeFloat(message.turretAngle());

                    // Все цели
                    buffer.writeInt(message.allTargetIds().length);
                    for (int i = 0; i < message.allTargetIds().length; i++) {
                        buffer.writeInt(message.allTargetIds()[i]);
                        buffer.writeDouble(message.allTargetX()[i]);
                        buffer.writeDouble(message.allTargetY()[i]);
                        buffer.writeDouble(message.allTargetZ()[i]);
                        buffer.writeInt(message.allTargetTypes()[i]);
                        buffer.writeBoolean(message.allTargetIsAlly[i]);
                    }

                    // Ракеты
                    buffer.writeInt(message.missileX().length);
                    for (int i = 0; i < message.missileX().length; i++) {
                        buffer.writeDouble(message.missileX()[i]);
                        buffer.writeDouble(message.missileY()[i]);
                        buffer.writeDouble(message.missileZ()[i]);
                    }
                }
            };

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(PantsirRadarSyncMessage message, IPayloadContext ctx) {
        ctx.enqueueWork(() -> PantsirClientHandler.handleRadarSync(message));
    }
}