
package com.fallensoul.registry;

import com.fallensoul.FallenSoul;
import com.fallensoul.blocks.BlockMithrilOre;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = FallenSoul.MODID)
public class ModBlocks {

    @GameRegistry.ObjectHolder("fallensoul:mithril_ore")
    public static final Block MITHRIL_ORE = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(
            new BlockMithrilOre()
                .setRegistryName(new ResourceLocation(
                    FallenSoul.MODID, "mithril_ore"))
                .setUnlocalizedName(FallenSoul.MODID + ".mithril_ore")
        );
    }
}
