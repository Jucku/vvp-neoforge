package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.ukr_chest;

public class ukr_chestModel extends GeoModel<ukr_chest> {
    @Override
    public ResourceLocation getModelResource(ukr_chest object) {
        return VVP.loc("geo/armor/ukr_chest.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ukr_chest object) {
        return VVP.loc("textures/armor/ukr.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ukr_chest animatable) {
        return VVP.loc("animations/usachest.animation.json");
    }
} 