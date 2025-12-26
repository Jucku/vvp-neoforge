package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.kepka;

public class kepkaModel extends GeoModel<kepka> {
    @Override
    public ResourceLocation getModelResource(kepka object) {
        return VVP.loc("geo/kepka.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(kepka object) {
        return VVP.loc("textures/armor/kepki.png");
    }

    @Override
    public ResourceLocation getAnimationResource(kepka animatable) {
        return VVP.loc("animations/usahelmet.animation.json");
    }
} 