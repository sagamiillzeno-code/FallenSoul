
package com.fallensoul;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

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

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("FallenSoul: Preparing the magic system...");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("FallenSoul: Magic awakens!");
    }
}
