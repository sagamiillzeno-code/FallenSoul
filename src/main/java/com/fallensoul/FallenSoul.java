
package com.fallensoul;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
    modid = FallenSoul.MODID,
    name = FallenSoul.NAME,
    version = FallenSoul.VERSION,
    acceptedMinecraftVersions = "[1.12.2]"
)
public class FallenSoul {

    public static final String MODID = "fallensoul";
    public static final String NAME = "FallenSoul";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        event.getModLog().info("FallenSoul: Preparing the magic system...");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        event.getModLog().info("FallenSoul: Magic awakens!");
    }
}
