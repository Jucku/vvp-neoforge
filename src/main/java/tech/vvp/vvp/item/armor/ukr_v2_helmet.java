package tech.vvp.vvp.item.armor;

import tech.vvp.vvp.client.renderer.armor.ukr_v2_helmetRenderer;
import tech.vvp.vvp.init.ModArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Supplier;

public class ukr_v2_helmet extends ModArmorMaterials {

    public ukr_v2_helmet() {
        super(ModArmorMaterial.UKR,
                Type.HELMET,
                new Properties().durability(Type.HELMET.getDurability(50))
        );
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public Supplier<GeoArmorRenderer<? extends Item>> getRenderer() {
        return ukr_v2_helmetRenderer::new;
    }
}