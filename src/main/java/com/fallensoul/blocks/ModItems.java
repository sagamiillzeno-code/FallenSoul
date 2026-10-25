
package com.fallensoul.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "fallensoul")
public class ModItems {

    public static final Item MITHRIL_ORE_ITEM =
            new ItemBlock(ModBlocks.MITHRIL_ORE)
                    .setRegistryName(
                            new ResourceLocation(
                                    "fallensoul",
                                    "mithril_ore"
                            )
                    );

    @SubscribeEvent
    public static void registerItems(
            RegistryEvent.Register<Item> event) {
        event.getRegistry().register(MITHRIL_ORE_ITEM);
    }
}
