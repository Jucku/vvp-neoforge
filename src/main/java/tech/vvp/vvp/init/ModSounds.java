package tech.vvp.vvp.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import tech.vvp.vvp.VVP;

/**
 * Класс для регистрации звуков, используемых в моде
 */
public class ModSounds {
    // Создаем регистр для звуков
    public static final DeferredRegister<SoundEvent> REGISTRY =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, VVP.MOD_ID);

    // Общие звуки
    public static final DeferredHolder<SoundEvent, SoundEvent> DOOR = register("door");
    public static final DeferredHolder<SoundEvent, SoundEvent> SPRAY = register("spray");
    public static final DeferredHolder<SoundEvent, SoundEvent> REMONT = register("remont");
    public static final DeferredHolder<SoundEvent, SoundEvent> WHEEL_STEP = register("wheel_step");
    public static final DeferredHolder<SoundEvent, SoundEvent> RADIOHEAD = register("radiohead");
    public static final DeferredHolder<SoundEvent, SoundEvent> ROCKET_SOUND = register("rocket_sound");

    // Звуки YX-100 (используют minecraft звуки, но регистрируем для совместимости)
    public static final DeferredHolder<SoundEvent, SoundEvent> YX_100_FAR = register("yx_100_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> YX_100_VERYFAR = register("yx_100_veryfar");

    // Звуки двигателей
    public static final DeferredHolder<SoundEvent, SoundEvent> PLANETA_ENGINE = register("planeta_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> BTR_80A_ENGINE = register("btr_80a_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> STRYKER_ENGINE = register("stryker_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> F35_ENGINE = register("f35_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> MI24_ENGINE = register("mi24_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> HUMVEE_ENGINE = register("humvee_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> COBRA_ENGINE = register("cobra_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> VAZIK_ENGINE = register("vazik_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> SU25_ENGINE = register("su25_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> F16_ENGINE = register("f16_engine");
    public static final DeferredHolder<SoundEvent, SoundEvent> BMP_IDLE = register("bmp_idle");
    public static final DeferredHolder<SoundEvent, SoundEvent> BMP_START = register("bmp_start");
    public static final DeferredHolder<SoundEvent, SoundEvent> UH60_IDLE = register("uh60_idle");
    public static final DeferredHolder<SoundEvent, SoundEvent> UH60_START = register("uh60_start");
    public static final DeferredHolder<SoundEvent, SoundEvent> MI8_IDLE = register("mi8_idle");
    public static final DeferredHolder<SoundEvent, SoundEvent> MI8_START = register("mi8_start");
    public static final DeferredHolder<SoundEvent, SoundEvent> T72_ENGINE_IDLE = register("t72_engine_idle");

    // Звуки оружия M2
    public static final DeferredHolder<SoundEvent, SoundEvent> M2_1P = register("m2_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> M2_3P = register("m2_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> M2_FAR = register("m2_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> M2_VERYFAR = register("m2_veryfar");

    // Звуки оружия TOW
    public static final DeferredHolder<SoundEvent, SoundEvent> TOW_1P = register("tow_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> TOW_3P = register("tow_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> TOW_FAR = register("tow_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> TOW_RELOAD = register("tow_reload");

    // Звуки оружия Bushmaster
    public static final DeferredHolder<SoundEvent, SoundEvent> BUSHMASTER_1P = register("bushmaster_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> BUSHMASTER_3P = register("bushmaster_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> BUSHMASTER_FAR = register("bushmaster_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> BUSHMASTER_VERYFAR = register("bushmaster_veryfar");

    // Звуки оружия M1128
    public static final DeferredHolder<SoundEvent, SoundEvent> M1128_1P = register("m1128_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> M1128_3P = register("m1128_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> M1128_FAR = register("m1128_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> M1128_VERYFAR = register("m1128_veryfar");
    public static final DeferredHolder<SoundEvent, SoundEvent> M1128_RELOAD = register("m1128_reload");

    // Звуки оружия 2A72
    public static final DeferredHolder<SoundEvent, SoundEvent> PUSHKA_2A72_1P = register("pushka_2a72_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> PUSHKA_2A72_3P = register("pushka_2a72_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> PUSHKA_2A72_FAR = register("pushka_2a72_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> PUSHKA_2A72_VERYFAR = register("pushka_2a72_veryfar");

    // Звуки оружия 2A42
    public static final DeferredHolder<SoundEvent, SoundEvent> A42_1P = register("2a42_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> A42_3P = register("2a42_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> A42_FAR = register("2a42_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> A42_VERYFAR = register("2a42_veryfar");

    // Звуки оружия Abrams
    public static final DeferredHolder<SoundEvent, SoundEvent> ABRAMS_1P = register("abrams_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> ABRAMS_3P = register("abrams_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> ABRAMS_FAR = register("abrams_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> ABRAMS_VERYFAR = register("abrams_veryfar");
    public static final DeferredHolder<SoundEvent, SoundEvent> ABRAMS_COAX_1P = register("abrams_coax_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> ABRAMS_COAX_3P = register("abrams_coax_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> ABRAMS_COAX_FAR = register("abrams_coax_far");
    public static final DeferredHolder<SoundEvent, SoundEvent> ABRAMS_COAX_VERYFAR = register("abrams_coax_veryfar");

    // Звуки оружия HK GMG
    public static final DeferredHolder<SoundEvent, SoundEvent> HK_GMG_1P = register("hk_gmg_1p");
    public static final DeferredHolder<SoundEvent, SoundEvent> HK_GMG_3P = register("hk_gmg_3p");
    public static final DeferredHolder<SoundEvent, SoundEvent> HK_GMG_RELOAD = register("hk_gmg_reload");

    // Звуки перезарядки
    public static final DeferredHolder<SoundEvent, SoundEvent> T90_AUTORELOAD = register("t90_autoreload");
    public static final DeferredHolder<SoundEvent, SoundEvent> T72_AUTORELOAD = register("t72_autoreload");
    public static final DeferredHolder<SoundEvent, SoundEvent> T64_RELOAD = register("t64_reload");

    // Звуки переключения оружия
    public static final DeferredHolder<SoundEvent, SoundEvent> INTO_ATGM = register("into_atgm");
    public static final DeferredHolder<SoundEvent, SoundEvent> INTO_AUTOCANNON = register("into_autocannon");
    public static final DeferredHolder<SoundEvent, SoundEvent> INTO_COAX = register("into_coax");
    public static final DeferredHolder<SoundEvent, SoundEvent> INTO_MAIN_CANNON = register("into_main_cannon");




    /**
     * Вспомогательный метод для регистрации звуков
     * @param name Название звука (без пространства имен)
     * @return RegistryObject для звукового события
     */
    private static DeferredHolder<SoundEvent, SoundEvent> register(String name) {
        return REGISTRY.register(name, () -> SoundEvent.createVariableRangeEvent(VVP.loc(name)));
    }

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
} 