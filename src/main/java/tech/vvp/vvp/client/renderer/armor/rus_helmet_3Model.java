package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.rus_helmet_3;

public class rus_helmet_3Model extends GeoModel<rus_helmet_3> {
    @Override
    public ResourceLocation getModelResource(rus_helmet_3 object) {
        return VVP.loc("geo/armor/rus_helmet_3.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(rus_helmet_3 object) {
        return VVP.loc("textures/armor/rus_helmet_3.png");
    }

    @Override
    public ResourceLocation getAnimationResource(rus_helmet_3 animatable) {
        return VVP.loc("animations/usachest.animation.json");
    }
}
