package tech.vvp.vvp.client;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterGuiLayersEvent;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.client.overlay.D30InfoOverlay;

@SuppressWarnings("removal")
@EventBusSubscriber(modid = VVP.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void registerOverlays(RegisterGuiLayersEvent event) {
        event.registerAboveAll(ResourceLocation.parse(D30InfoOverlay.ID), new D30InfoOverlay());
    }
}