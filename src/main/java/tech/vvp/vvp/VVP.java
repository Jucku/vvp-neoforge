package tech.vvp.vvp;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import tech.vvp.vvp.init.*;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.ModContainer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import tech.vvp.vvp.network.VVPNetwork;

@Mod(VVP.MOD_ID)
public class VVP {
    public static final String MOD_ID = "vvp";

    public VVP(IEventBus modEventBus, ModContainer container) {
        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);
        ModParticleTypes.PARTICLE_TYPES.register(modEventBus);
        ModSounds.REGISTRY.register(modEventBus);
        ModTabs.TABS.register(modEventBus);
        ModArmorMaterial.MATERIALS.register(modEventBus);

        modEventBus.addListener(VVPNetwork::register);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::onClientSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    public void onClientSetup(final FMLClientSetupEvent event) {}

    public static ResourceLocation loc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}