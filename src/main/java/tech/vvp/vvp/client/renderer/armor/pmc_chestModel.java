package tech.vvp.vvp.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.vvp.vvp.VVP;
import tech.vvp.vvp.item.armor.pmc_chest;

public class pmc_chestModel extends GeoModel<pmc_chest> {
    @Override
    public ResourceLocation getModelResource(pmc_chest object) {
        return VVP.loc("geo/armor/pmc_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(pmc_chest object) {
        return VVP.loc("textures/armor/pmc.png");
    }

    @Override
    public ResourceLocation getAnimationResource(pmc_chest animatable) {
        return VVP.loc("animations/usachest.animation.json");
    }
} 