package tech.vvp.vvp.item.armor;

import tech.vvp.vvp.client.renderer.armor.pmc_helmetRenderer;
import tech.vvp.vvp.init.ModArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Supplier;

public class pmc_helmet extends ModArmorMaterials {

    public pmc_helmet() {
        super(ModArmorMaterial.PMC,
                Type.HELMET,
                new Properties().durability(Type.HELMET.getDurability(50))
        );
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public Supplier<GeoArmorRenderer<? extends Item>> getRenderer() {
        return pmc_helmetRenderer::new;
    }
}