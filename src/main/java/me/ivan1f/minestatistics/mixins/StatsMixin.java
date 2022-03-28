package me.ivan1f.minestatistics.mixins;

import me.ivan1f.minestatistics.MineStatisticsRegistry;
import net.minecraft.stat.Stats;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Stats.class)
public class StatsMixin {
    static {
        MineStatisticsRegistry.init();
    }
}
