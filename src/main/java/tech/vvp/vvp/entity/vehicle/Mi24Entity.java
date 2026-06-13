package tech.vvp.vvp.entity.vehicle;

import com.atsuishio.superbwarfare.entity.vehicle.damage.DamageModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import tech.vvp.vvp.VVP;

import java.lang.reflect.Field;

public class Mi24Entity extends CamoVehicleBase {

    private static final ResourceLocation[] CAMO_TEXTURES = {
            VVP.loc("textures/entity/mi24_sand_ru.png"),
            VVP.loc("textures/entity/mi24_green_ru.png"),
            VVP.loc("textures/entity/mi24_green_rb.png"),
            VVP.loc("textures/entity/mi24_sand.png"),
            VVP.loc("textures/entity/mi24_snow.png"),
            VVP.loc("textures/entity/mi24_tan.png"),
            VVP.loc("textures/entity/mi24_tan_zov.png")
    };

    private static final String[] CAMO_NAMES = {
            "Sand RU", "Green RU", "Green RB", "Sand", "Snow", "Tan", "Tan ZOV"
    };

    @Override
    public ResourceLocation[] getCamoTextures() {
        return CAMO_TEXTURES;
    }
    
    @Override
    public String[] getCamoNames() {
        return CAMO_NAMES;
    }

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

    public Mi24Entity(EntityType<Mi24Entity> type, Level world) {
        super(type, world);
    }

    @Override
    public DamageModifier getDamageModifier() {
        return super.getDamageModifier()
                .custom((source, damage) -> getSourceAngle(source, 0.4f) * damage);
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
