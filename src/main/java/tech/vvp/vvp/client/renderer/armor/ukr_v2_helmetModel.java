package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.ukr_v2_helmet;

public class ukr_v2_helmetModel extends GeoModel<ukr_v2_helmet> {
    @Override
    public ResourceLocation getModelResource(ukr_v2_helmet object) {
        return VVP.loc("geo/armor/ukr_v2_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ukr_v2_helmet object) {
        return VVP.loc("textures/armor/ukr_v2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ukr_v2_helmet animatable) {
        return VVP.loc("animations/usachest.animation.json");
    }
} 