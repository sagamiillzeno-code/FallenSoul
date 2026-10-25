
package com.fallensoul.blocks;

import net.minecraft.block.Block;
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
}
