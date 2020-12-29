package com.bcoburn3.mendedgems.common.misc;

import com.bcoburn3.mendedgems.MendedGems;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;

@Config(modid = MendedGems.MOD_ID)
public class ConfigMendedGems {
        
    @Comment({
            "The cooldown, in ticks, of each tier of Mended Gems.",
            "Set the cooldown in the order of Weak, Normal, Strong, Ultimate."
    })
    public static int[] COOLDOWN = {200, 150, 100, 2};
}
