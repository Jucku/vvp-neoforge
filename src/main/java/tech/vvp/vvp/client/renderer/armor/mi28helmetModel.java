package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.mi28helmet;

public class mi28helmetModel extends GeoModel<mi28helmet> {
    @Override
    public ResourceLocation getModelResource(mi28helmet object) {
        return VVP.loc("geo/mi28_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(mi28helmet object) {
        return VVP.loc("textures/armor/mi28_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(mi28helmet animatable) {
        return VVP.loc("animations/usahelmet.animation.json");
    }
} 