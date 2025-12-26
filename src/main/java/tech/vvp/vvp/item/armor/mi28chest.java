package tech.vvp.vvp.item.armor;

import tech.vvp.vvp.client.renderer.armor.mi28chestRenderer;
import tech.vvp.vvp.init.ModArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Supplier;

public class mi28chest extends ModArmorMaterials {

    public mi28chest() {
        super(ModArmorMaterial.MI28,
                Type.CHESTPLATE,
                new Properties().durability(Type.CHESTPLATE.getDurability(50)),
                0.2f
        );
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public Supplier<GeoArmorRenderer<? extends Item>> getRenderer() {
        return mi28chestRenderer::new;
    }
}