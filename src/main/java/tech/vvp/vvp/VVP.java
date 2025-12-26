package tech.vvp.vvp;

import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import tech.vvp.vvp.init.*;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.ModContainer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import tech.vvp.vvp.network.VVPNetwork;

import org.slf4j.Logger;

@Mod(VVP.MOD_ID)
public class VVP {
    public static final String MOD_ID = "vvp";
    private static final Logger LOGGER = LogUtils.getLogger();

    public VVP(IEventBus modEventBus, ModContainer container) {
        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);
        ModSounds.REGISTRY.register(modEventBus);
        ModTabs.TABS.register(modEventBus);
        ModArmorMaterial.MATERIALS.register(modEventBus);

        modEventBus.addListener(VVPNetwork::register);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::onClientSetup);

        NeoForge.EVENT_BUS.addListener(this::onItemTooltip);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    public void onClientSetup(final FMLClientSetupEvent event) {}


    private void onItemTooltip(ItemTooltipEvent event) {
        var stack = event.getItemStack();
        if (stack.getItem() instanceof BlockItem && stack.has(DataComponents.BLOCK_ENTITY_DATA)) {
            var blockEntityData = stack.get(DataComponents.BLOCK_ENTITY_DATA);
            if (blockEntityData != null) {
                CompoundTag tag = blockEntityData.copyTag();
                if (tag != null && tag.contains("EntityType")) {
                    String entityType = tag.getString("EntityType");
                    if (entityType.startsWith("vvp:vdv_")) {
                       // event.getToolTip().add(Component.translatable("tooltip.wmp.model_author"));
                        event.getToolTip().add(Component.translatable("tooltip.vvp.usage_restriction").withStyle(ChatFormatting.RED));
                    }
                }
            }
        }
    }

    public static ResourceLocation loc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}