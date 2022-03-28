package me.ivan1f.minestatistics;

import com.google.common.collect.Sets;
import me.ivan1f.minestatistics.mixins.StatsAccessor;
import net.minecraft.stat.StatFormatter;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Set;

public class MineStatisticsRegistry {
    private static final Set<Identifier> STATS_SET = Sets.newLinkedHashSet();
    public static final Identifier MINE_ALL = register("mine_all", StatFormatter.DEFAULT);

    // From net.minecraft.stat.Stats#register
    private static Identifier register(String name, StatFormatter statFormatter) {
        Identifier statId = new Identifier(name);
        Registry.register(Registry.CUSTOM_STAT, statId, statId);
        StatsAccessor.getCUSTOM().getOrCreateStat(statId, statFormatter);

        STATS_SET.add(statId);
        MineStatisticsMod.LOGGER.info("Registered custom statistic " + statId);

        return statId;
    }

    public static void init() {
        MineStatisticsMod.LOGGER.info(String.format("%s enabled with %d new statistics", MineStatisticsMod.MOD_NAME, STATS_SET.size()));
    }
}
