package tech.vvp.vvp.client.particle;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.init.ModParticleTypes;

@SuppressWarnings("removal")
@EventBusSubscriber(modid = VVP.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModParticles {
    @SubscribeEvent
    public static void registerProviders(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticleTypes.MUZZLE_SMOKE.get(), VvpMuzzleParticle.Provider::new);
        event.registerSpriteSet(ModParticleTypes.MUZZLE_BLOOM.get(), VvpMuzzleParticle.Provider::new);
        event.registerSpriteSet(ModParticleTypes.MUZZLE_FLASH.get(), VvpMuzzleParticle.Provider::new);
        event.registerSpriteSet(ModParticleTypes.MUZZLE_BANG.get(), VvpMuzzleParticle.Provider::new);
        event.registerSpriteSet(ModParticleTypes.MUZZLE_SPARK.get(), VvpMuzzleParticle.Provider::new);
    }
}