package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.crewhelmet;

public class crewModel extends GeoModel<crewhelmet> {
    @Override
    public ResourceLocation getModelResource(crewhelmet object) {
        return VVP.loc("geo/crew.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(crewhelmet object) {
        return VVP.loc("textures/armor/crew.png");
    }

    @Override
    public ResourceLocation getAnimationResource(crewhelmet animatable) {
        return VVP.loc("animations/usahelmet.animation.json");
    }
} 