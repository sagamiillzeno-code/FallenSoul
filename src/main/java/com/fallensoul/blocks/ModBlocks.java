
package com.fallensoul.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "fallensoul")
public class ModBlocks {

    public static final Block MITHRIL_ORE =
            new BlockMithrilOre()
                    .setRegistryName("fallensoul", "mithril_ore")
                    .setUnlocalizedName("fallensoul.mithril_ore");

    @SubscribeEvent
    public static void registerBlocks(
            RegistryEvent.Register<Block> event) {
        event.getRegistry().register(MITHRIL_ORE);
    }

    @SubscribeEvent
    public static void registerItemBlocks(
            RegistryEvent.Register<Item> event) {
        event.getRegistry().register(
                new ItemBlock(MITHRIL_ORE)
                        .setRegistryName(
                                new ResourceLocation(
                                        "fallensoul",
                                        "mithril_ore"
                                )
                        )
        );
    }
}
