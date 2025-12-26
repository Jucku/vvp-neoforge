package tech.vvp.vvp.item.armor;

import tech.vvp.vvp.client.renderer.armor.rus_helmet_2Renderer;
import tech.vvp.vvp.init.ModArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Supplier;

public class rus_helmet_2 extends ModArmorMaterials {

    public rus_helmet_2() {
        super(ModArmorMaterial.RUS,
                Type.HELMET,
                new Properties().durability(Type.HELMET.getDurability(50))
        );
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public Supplier<GeoArmorRenderer<? extends Item>> getRenderer() {
        return rus_helmet_2Renderer::new;
    }
}