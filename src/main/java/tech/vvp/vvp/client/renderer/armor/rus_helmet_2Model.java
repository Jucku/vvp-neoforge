package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.rus_helmet_2;

public class rus_helmet_2Model extends GeoModel<rus_helmet_2> {
    @Override
    public ResourceLocation getModelResource(rus_helmet_2 object) {
        return VVP.loc("geo/armor/rus_helmet_2.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(rus_helmet_2 object) {
        return VVP.loc("textures/armor/rus_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(rus_helmet_2 animatable) {
        return VVP.loc("animations/usachest.animation.json");
    }
}
