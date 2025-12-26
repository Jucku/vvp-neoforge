package tech.vvp.vvp.item.armor;

import tech.vvp.vvp.init.ModArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import tech.vvp.vvp.client.renderer.armor.beretaRenderer;

import java.util.function.Supplier;

public class bereta extends ModArmorMaterials {

    public bereta() {
        super(ModArmorMaterial.KEPKI,
                Type.HELMET,
                new Properties().durability(Type.HELMET.getDurability(50)),
                0f
        );
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public Supplier<GeoArmorRenderer<? extends Item>> getRenderer() {
        return beretaRenderer::new;
    }
}