
package com.fallensoul.registry;

import com.fallensoul.FallenSoul;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = FallenSoul.MODID)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        registerBlockItem(
            event,
            ModBlocks.MITHRIL_ORE,
            "mithril_ore"
        );
    }

    private static void registerBlockItem(
            RegistryEvent.Register<Item> event,
            Block block,
            String name) {

        if (block == null) {
            return;
        }

        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(
            new ResourceLocation(FallenSoul.MODID, name)
        );

        event.getRegistry().register(itemBlock);
    }
}
