package tech.vvp.vvp.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import tech.vvp.vvp.network.message.recive.*;
import tech.vvp.vvp.network.message.send.*;

public class VVPNetwork {
    private static PayloadRegistrar registrar;

    public static void register(final RegisterPayloadHandlersEvent event) {
        registrar = event.registrar("1");
        register();
    }

    private static void register() {

        playToServer(PantsirLockRequestMessage.TYPE, PantsirLockRequestMessage.STREAM_CODEC, PantsirLockRequestMessage::handle);

        playToClient(PantsirRadarSyncMessage.TYPE, PantsirRadarSyncMessage.STREAM_CODEC, PantsirRadarSyncMessage::handle);
    }

    public static <T extends CustomPacketPayload> void playToClient(CustomPacketPayload.Type<T> type, StreamCodec<? super RegistryFriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
        registrar.playToClient(type, reader, handler);
    }

    public static <T extends CustomPacketPayload> void playToServer(CustomPacketPayload.Type<T> type, StreamCodec<? super RegistryFriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
        registrar.playToServer(type, reader, handler);
    }
}
