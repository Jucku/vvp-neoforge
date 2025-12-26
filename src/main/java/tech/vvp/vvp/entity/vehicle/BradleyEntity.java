package tech.vvp.vvp.entity.vehicle;

import com.atsuishio.superbwarfare.entity.vehicle.damage.DamageModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import tech.vvp.vvp.VVP;

public class BradleyEntity extends CamoVehicleBase {

    private static final ResourceLocation[] CAMO_TEXTURES = {
        VVP.loc("textures/entity/bradley_green.png"),
        VVP.loc("textures/entity/bradley_usa.png"),
        VVP.loc("textures/entity/bradley_ukr.png")
    };
    
    private static final String[] CAMO_NAMES = {"Green", "USA", "Ukraine"};

    public BradleyEntity(EntityType<BradleyEntity> type, Level world) {
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

    @Override
    public DamageModifier getDamageModifier() {
        return super.getDamageModifier()
                .custom((source, damage) -> getSourceAngle(source, 0.4f) * damage);
    }

    @Override
    public void baseTick() {
        super.baseTick();
    }
}
