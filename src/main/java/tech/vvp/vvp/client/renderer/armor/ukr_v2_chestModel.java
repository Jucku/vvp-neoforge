package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.ukr_v2_chest;

public class ukr_v2_chestModel extends GeoModel<ukr_v2_chest> {
    @Override
    public ResourceLocation getModelResource(ukr_v2_chest object) {
        return VVP.loc("geo/armor/ukr_v2_chest.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ukr_v2_chest object) {
        return VVP.loc("textures/armor/ukr_v2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ukr_v2_chest animatable) {
        return VVP.loc("animations/usachest.animation.json");
    }
} 