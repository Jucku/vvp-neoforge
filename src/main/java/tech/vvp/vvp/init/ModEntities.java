package tech.vvp.vvp.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.entity.projectile.PantsirMissileEntity;
import tech.vvp.vvp.entity.vehicle.*;
import tech.vvp.vvp.entity.vehicle.util.CompactEntityHitbox;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, VVP.MOD_ID);

    /** SBW-style low hull hitbox (F3+B white box, lock-on center). */
    private static final float IFV_W = 3.6f;
    private static final float IFV_H = 2.15f;
    private static final float TANK_W = 4.62f;
    private static final float TANK_H = 2f;
    private static final float HELI_W = 3.375f;
    private static final float HELI_H = 2.5f;
    private static final float TRUCK_W = 2.8f;
    private static final float TRUCK_H = 2.5f;

    private static final float VIS_IFV = 3.5f;
    private static final float VIS_BMP2 = 3f;
    private static final float VIS_TANK = 4f;
    private static final float VIS_MBT = 5f;
    private static final float VIS_HELI = 4f;
    private static final float VIS_TRUCK = 4.5f;

    public static final DeferredHolder<EntityType<?>, EntityType<Btr4Entity>> BTR_4 =
            registerVehicle("btr_4", IFV_W, IFV_H, VIS_IFV, builder(Btr4Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Btr3Entity>> BTR_3 =
            registerVehicle("btr_3", IFV_W, IFV_H, VIS_IFV, builder(Btr3Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<BradleyEntity>> BRADLEY =
            registerVehicle("bradley", 3.6f, 2.3f, VIS_IFV, builder(BradleyEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<BrmEntity>> BRM =
            registerVehicle("brm", IFV_W, IFV_H, VIS_IFV, builder(BrmEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Bmp3Entity>> BMP_3 =
            registerVehicle("bmp_3", IFV_W, IFV_H, VIS_IFV, builder(Bmp3Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Bmp2Entity>> BMP_2 =
            registerVehicle("bmp_2", 3.6f, 2.1f, VIS_BMP2, builder(Bmp2Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Bmp2BakhchaEntity>> BMP_2_BAKHCHA =
            registerVehicle("bmp_2_bakhcha", 3.6f, 2.1f, VIS_BMP2, builder(Bmp2BakhchaEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Bmp2MEntity>> BMP_2M =
            registerVehicle("bmp_2m", 3.6f, 2.1f, VIS_BMP2, builder(Bmp2MEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<ChryzantemaEntity>> CHRYZANTEMA =
            registerVehicle("chryzantema", IFV_W, IFV_H, VIS_IFV, builder(ChryzantemaEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<CV90Entity>> CV_90 =
            registerVehicle("cv_90", IFV_W, IFV_H, VIS_IFV, builder(CV90Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<StrykerEntity>> STRYKER =
            registerVehicle("stryker", IFV_W, IFV_H, VIS_IFV, builder(StrykerEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Stryker_M1296Entity>> STRYKER_M1296 =
            registerVehicle("stryker_m1296", IFV_W, IFV_H, VIS_IFV, builder(Stryker_M1296Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<TerminatorEntity>> TERMINATOR =
            registerVehicle("terminator", IFV_W, IFV_H, VIS_IFV, builder(TerminatorEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<BMPT3KEntity>> BMPT_3K =
            registerVehicle("bmpt_3k", IFV_W, IFV_H, VIS_IFV, builder(BMPT3KEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<T90MEntity>> T90_M =
            registerVehicle("t90_m", TANK_W, TANK_H, VIS_TANK, builder(T90MEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<M1A2Entity>> M1A2 =
            registerVehicle("m1a2", TANK_W, TANK_H, VIS_MBT, builder(M1A2Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<M1A2SepEntity>> M1A2_SEP =
            registerVehicle("m1a2_sep", TANK_W, TANK_H, VIS_MBT, builder(M1A2SepEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<PumaEntity>> PUMA =
            registerVehicle("puma", IFV_W, 2.3f, VIS_IFV, builder(PumaEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<FMTVEntity>> FMTV =
            registerVehicle("fmtv", TRUCK_W, TRUCK_H, VIS_TRUCK, builder(FMTVEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Mi28Entity>> MI_28 =
            registerVehicle("mi_28", HELI_W, 3.375f, VIS_HELI, builder(Mi28Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Mi24Entity>> MI_24 =
            registerVehicle("mi_24", HELI_W, HELI_H, VIS_HELI, builder(Mi24Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Leopard2A7VEntity>> LEOPARD_2A7V =
            registerVehicle("leopard_2a7v", TANK_W, TANK_H, VIS_TANK, builder(Leopard2A7VEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Leopard2A4Entity>> LEOPARD_2A4 =
            registerVehicle("leopard_2a4", TANK_W, TANK_H, VIS_TANK, builder(Leopard2A4Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Ah64Entity>> AH_64 =
            registerVehicle("ah_64", HELI_W, HELI_H, VIS_HELI, builder(Ah64Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<GazTigrEntity>> GAZ_TIGR =
            registerVehicle("gaz_tigr", 2.4f, 2f, 2f, builder(GazTigrEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<ChallengerEntity>> CHALLENGER =
            registerVehicle("challenger", TANK_W, TANK_H, VIS_TANK, builder(ChallengerEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<T72B3MEntity>> T72_B3M =
            registerVehicle("t72_b3m", TANK_W, TANK_H, VIS_TANK, builder(T72B3MEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<UralEntity>> URAL =
            registerVehicle("ural", TRUCK_W, 3f, VIS_TRUCK, builder(UralEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<VartaEntity>> VARTA =
            registerVehicle("varta", 3f, 2.3f, VIS_IFV, builder(VartaEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<VartaPTRKEntity>> VARTA_PTRK =
            registerVehicle("varta_ptrk", 3f, 2.3f, VIS_IFV, builder(VartaPTRKEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<PantsirS1Entity>> PANTSIR_S1 =
            registerVehicle("pantsir_s1", 3.5f, 2.5f, VIS_HELI, builder(PantsirS1Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Ags30Entity>> AGS_30 =
            registerVehicle("ags_30", 0.8f, 1.2f, 1.5f, builder(Ags30Entity::new).setTrackingRange(256));
    public static final DeferredHolder<EntityType<?>, EntityType<KornetEntity>> KORNET =
            registerVehicle("kornet", 0.6f, 1.35f, 2f, builder(KornetEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<CobraEntity>> COBRA =
            registerVehicle("cobra", HELI_W, HELI_H, VIS_HELI, builder(CobraEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<CentauroEntity>> CENTAURO =
            registerVehicle("centauro", TANK_W, 2.2f, VIS_TANK, builder(CentauroEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<PantsirMissileEntity>> PANTSIR_MISSILE = register("pantsir_missile",
            EntityType.Builder.<PantsirMissileEntity>of(PantsirMissileEntity::new, MobCategory.MISC)
                    .setShouldReceiveVelocityUpdates(false).setTrackingRange(256).setUpdateInterval(1).noSave()
                    .fireImmune().sized(0.5f, 0.5f));
    public static final DeferredHolder<EntityType<?>, EntityType<AjaxEntity>> AJAX =
            registerVehicle("ajax", IFV_W, 2f, VIS_BMP2, builder(AjaxEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<Mi8Entity>> MI_8 =
            registerVehicle("mi_8", HELI_W, HELI_H, VIS_HELI, builder(Mi8Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<D30Entity>> D30 =
            registerVehicle("d30", 2.5f, 1.6f, 2f, builder(D30Entity::new).setTrackingRange(256));
    public static final DeferredHolder<EntityType<?>, EntityType<Nh90Entity>> NH_90 =
            registerVehicle("nh_90", HELI_W, HELI_H, VIS_HELI, builder(Nh90Entity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<OplotEntity>> OPLOT =
            registerVehicle("oplot", TANK_W, TANK_H, VIS_TANK, builder(OplotEntity::new));
    public static final DeferredHolder<EntityType<?>, EntityType<PautinaEntity>> PAUTINA =
            registerVehicle("pautina", IFV_W, IFV_H, VIS_HELI, builder(PautinaEntity::new));

    private static <T extends Entity> EntityType.Builder<T> builder(EntityType.EntityFactory<T> factory) {
        return EntityType.Builder.of(factory, MobCategory.MISC).setTrackingRange(512).setUpdateInterval(1).fireImmune();
    }

    private static <T extends Entity> DeferredHolder <EntityType<?>,EntityType<T>> registerVehicle(
            String name,
            float collisionWidth,
            float collisionHeight,
            float visualHeight,
            EntityType.Builder<T> entityTypeBuilder) {
        return ENTITY_TYPES.register(name, () -> {
            EntityType<T> type = entityTypeBuilder.sized(collisionWidth, collisionHeight).build(name);
            CompactEntityHitbox.registerVisualHeight(type, visualHeight);
            return type;
        });
    }

    private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String name, EntityType.Builder<T> entityTypeBuilder) {
        return ENTITY_TYPES.register(name, () -> entityTypeBuilder.build(name));
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}