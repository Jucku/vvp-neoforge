package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.bereta;

public class beretaModel extends GeoModel<bereta> {
    @Override
    public ResourceLocation getModelResource(bereta object) {
        return VVP.loc("geo/bereta.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(bereta object) {
        return VVP.loc("textures/armor/kepki.png");
    }

    @Override
    public ResourceLocation getAnimationResource(bereta animatable) {
        return VVP.loc("animations/usahelmet.animation.json");
    }
} 