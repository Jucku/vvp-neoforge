package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.panama;

public class panamaModel extends GeoModel<panama> {
    @Override
    public ResourceLocation getModelResource(panama object) {
        return VVP.loc("geo/panama.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(panama object) {
        return VVP.loc("textures/armor/kepki.png");
    }

    @Override
    public ResourceLocation getAnimationResource(panama animatable) {
        return VVP.loc("animations/usahelmet.animation.json");
    }
} 