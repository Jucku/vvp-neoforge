package tech.vvp.vvp.item.armor;

import tech.vvp.vvp.client.renderer.armor.pmc_chestRenderer;
import tech.vvp.vvp.init.ModArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Supplier;

public class pmc_chest extends ModArmorMaterials {

    public pmc_chest() {
        super(ModArmorMaterial.PMC,
                Type.CHESTPLATE,
                new Properties().durability(Type.CHESTPLATE.getDurability(50)),
                0.2f
        );
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public Supplier<GeoArmorRenderer<? extends Item>> getRenderer() {
        return pmc_chestRenderer::new;
    }
}