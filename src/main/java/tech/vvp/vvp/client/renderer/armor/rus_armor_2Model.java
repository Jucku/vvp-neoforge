package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.rus_armor_2;

public class rus_armor_2Model extends GeoModel<rus_armor_2> {
    @Override
    public ResourceLocation getModelResource(rus_armor_2 object) {
        return VVP.loc("geo/armor/rus_armor_2.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(rus_armor_2 object) {
        return VVP.loc("textures/armor/rus_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(rus_armor_2 animatable) {
        return VVP.loc("animations/usachest.animation.json");
    }
}
