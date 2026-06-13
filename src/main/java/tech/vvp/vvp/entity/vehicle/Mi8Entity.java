package tech.vvp.vvp.entity.vehicle;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import tech.vvp.vvp.VVP;

import java.lang.reflect.Field;

public class Mi8Entity extends CamoVehicleBase {

    private static final ResourceLocation[] CAMO_TEXTURES = {
            VVP.loc("textures/entity/mi8_default.png"),
            VVP.loc("textures/entity/mi8_pepeshneyna.png"),
            VVP.loc("textures/entity/mi8_rf2.png"),
            VVP.loc("textures/entity/mi8_rf3.png"),
            VVP.loc("textures/entity/mi8_rf4.png"),
            VVP.loc("textures/entity/mi8_ukr.png"),
            VVP.loc("textures/entity/mi8_ukr2.png")
    };

    private static final String[] CAMO_NAMES = {"Default", "Pepeshneyna", "RF2", "RF3", "RF4", "Ukraine", "Ukraine2"};

    private static Field propellerRotField;
    private static Field propellerRotOField;

    static {
        try {
            Class<?> vehicleClass = Class.forName("com.atsuishio.superbwarfare.entity.vehicle.base.VehicleEntity");
            propellerRotField = vehicleClass.getDeclaredField("propellerRot");
            propellerRotField.setAccessible(true);
            propellerRotOField = vehicleClass.getDeclaredField("propellerRotO");
            propellerRotOField.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Mi8Entity(EntityType<Mi8Entity> type, Level world) {
        super(type, world);
    }

    @Override
    public ResourceLocation[] getCamoTextures() {
        return CAMO_TEXTURES;
    }

    @Override
    public String[] getCamoNames() {
        return CAMO_NAMES;
    }

    public float getPropellerRot() {
        try {
            return propellerRotField != null ? (float) propellerRotField.get(this) : 0f;
        } catch (Exception e) {
            return 0f;
        }
    }

    public float getPropellerRotO() {
        try {
            return propellerRotOField != null ? (float) propellerRotOField.get(this) : 0f;
        } catch (Exception e) {
            return 0f;
        }
    }
}