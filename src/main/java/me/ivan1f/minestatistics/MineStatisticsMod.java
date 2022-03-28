package me.ivan1f.minestatistics;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MineStatisticsMod implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_NAME = "Mine Statistics";
    public static final String MOD_ID = "mine-statistics";
    public static String VERSION;

    @Override
    public void onInitialize() {
        VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(RuntimeException::new).getMetadata().getVersion().getFriendlyString();
    }
}
