package tech.vvp.vvp.init;

import com.atsuishio.superbwarfare.init.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import tech.vvp.vvp.VVP;

import java.util.EnumMap;
import java.util.List;

public class ModArmorMaterial {
    public static final DeferredRegister<ArmorMaterial> MATERIALS = DeferredRegister.create(BuiltInRegistries.ARMOR_MATERIAL, VVP.MOD_ID);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> CEMENTED_CARBIDE = MATERIALS.register("cemented_carbide", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), p -> {
                p.put(ArmorItem.Type.BOOTS, 3);
                p.put(ArmorItem.Type.LEGGINGS, 6);
                p.put(ArmorItem.Type.CHESTPLATE, 8);
                p.put(ArmorItem.Type.HELMET, 3);
            }),
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.CEMENTED_CARBIDE_INGOT.value()),
            List.of(),
            4F, 0.05F)
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> MULTICAM = MATERIALS.register("multicam", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), p -> {
                p.put(ArmorItem.Type.CHESTPLATE, 10);
                p.put(ArmorItem.Type.HELMET, 5);
            }),
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.CEMENTED_CARBIDE_INGOT.value()),
            List.of(),
            5F, 0.1F)
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> MI28 = MATERIALS.register("mi28", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), p -> {
                p.put(ArmorItem.Type.LEGGINGS, 2);
                p.put(ArmorItem.Type.CHESTPLATE, 5);
                p.put(ArmorItem.Type.HELMET, 3);
            }),
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.CEMENTED_CARBIDE_INGOT.value()),
            List.of(),
            1F, 0F)
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> KEPKI = MATERIALS.register("kepki", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), p -> {
                p.put(ArmorItem.Type.HELMET, 1);
            }),
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.CEMENTED_CARBIDE_INGOT.value()),
            List.of(),
            0F, 0F)
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> UKR = MATERIALS.register("ukr", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), p -> {
                p.put(ArmorItem.Type.CHESTPLATE, 10);
                p.put(ArmorItem.Type.LEGGINGS, 3);
                p.put(ArmorItem.Type.HELMET, 6);
            }),
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.CEMENTED_CARBIDE_INGOT.value()),
            List.of(),
            1.5F, 0.2F)
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> RUS = MATERIALS.register("rus", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), p -> {
                p.put(ArmorItem.Type.CHESTPLATE, 10);
                p.put(ArmorItem.Type.LEGGINGS, 3);
                p.put(ArmorItem.Type.HELMET, 6);
            }),
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.CEMENTED_CARBIDE_INGOT.value()),
            List.of(),
            1.5F, 0.2F)
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> PMC = MATERIALS.register("pmc", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), p -> {
                p.put(ArmorItem.Type.CHESTPLATE, 10);
                p.put(ArmorItem.Type.LEGGINGS, 3);
                p.put(ArmorItem.Type.HELMET, 6);
            }),
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.CEMENTED_CARBIDE_INGOT.value()),
            List.of(),
            1.5F, 0.2F)
    );
}