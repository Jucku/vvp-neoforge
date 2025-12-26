package tech.vvp.vvp.item.armor;

import tech.vvp.vvp.client.renderer.armor.rus_armor_2Renderer;
import tech.vvp.vvp.init.ModArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Supplier;

public class rus_armor_2 extends ModArmorMaterials {

    public rus_armor_2() {
        super(ModArmorMaterial.RUS,
                Type.CHESTPLATE,
                new Properties().durability(Type.CHESTPLATE.getDurability(50)),
                0.2f
        );
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public Supplier<GeoArmorRenderer<? extends Item>> getRenderer() {
        return rus_armor_2Renderer::new;
    }
}