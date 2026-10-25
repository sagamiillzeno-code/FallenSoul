
package com.fallensoul.blocks;

import com.fallensoul.items.MithrilAxe;
import com.fallensoul.items.MithrilHoe;
import com.fallensoul.items.MithrilPickaxe;
import com.fallensoul.items.MithrilShovel;
import com.fallensoul.items.MithrilSword;

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

    public static final Item MITHRIL_SWORD =
            new MithrilSword();

    public static final Item MITHRIL_AXE =
            new MithrilAxe();

    public static final Item MITHRIL_PICKAXE =
            new MithrilPickaxe();

    public static final Item MITHRIL_SHOVEL =
            new MithrilShovel();

    public static final Item MITHRIL_HOE =
            new MithrilHoe();

    @SubscribeEvent
    public static void registerItems(
            RegistryEvent.Register<Item> event) {

        event.getRegistry().register(MITHRIL_ORE_ITEM);
        event.getRegistry().register(MITHRIL_SWORD);
        event.getRegistry().register(MITHRIL_AXE);
        event.getRegistry().register(MITHRIL_PICKAXE);
        event.getRegistry().register(MITHRIL_SHOVEL);
        event.getRegistry().register(MITHRIL_HOE);
    }
}
