package tech.vvp.vvp.init;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.client.particle.VvpMuzzleParticleOption;

public class ModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, VVP.MOD_ID);

    public static final DeferredHolder<ParticleType<?>, ParticleType<VvpMuzzleParticleOption>> MUZZLE_SMOKE =
            PARTICLE_TYPES.register("muzzle_smoke", () -> create(VvpMuzzleParticleOption.CODEC, true, VvpMuzzleParticleOption.STREAM_CODEC));

    public static final DeferredHolder<ParticleType<?>, ParticleType<VvpMuzzleParticleOption>> MUZZLE_BLOOM =
            PARTICLE_TYPES.register("muzzle_bloom", () -> create(VvpMuzzleParticleOption.CODEC, true, VvpMuzzleParticleOption.STREAM_CODEC));

    public static final DeferredHolder<ParticleType<?>, ParticleType<VvpMuzzleParticleOption>> MUZZLE_FLASH =
            PARTICLE_TYPES.register("muzzle_flash", () -> create(VvpMuzzleParticleOption.CODEC, true, VvpMuzzleParticleOption.STREAM_CODEC));

    public static final DeferredHolder<ParticleType<?>, ParticleType<VvpMuzzleParticleOption>> MUZZLE_BANG =
            PARTICLE_TYPES.register("muzzle_bang", () -> create(VvpMuzzleParticleOption.CODEC, true, VvpMuzzleParticleOption.STREAM_CODEC));

    public static final DeferredHolder<ParticleType<?>, ParticleType<VvpMuzzleParticleOption>> MUZZLE_SPARK =
            PARTICLE_TYPES.register("muzzle_spark", () -> create(VvpMuzzleParticleOption.CODEC, true, VvpMuzzleParticleOption.STREAM_CODEC));

    public static <T extends ParticleOptions> ParticleType<T> create(MapCodec<T> codec, boolean overrideLimiter, StreamCodec<? super RegistryFriendlyByteBuf, T> streamCodec) {
        return new ParticleType<>(overrideLimiter) {
            public @NotNull MapCodec<T> codec() {
                return codec;
            }

            public @NotNull StreamCodec<? super RegistryFriendlyByteBuf, T> streamCodec() {
                return streamCodec;
            }
        };
    }
}