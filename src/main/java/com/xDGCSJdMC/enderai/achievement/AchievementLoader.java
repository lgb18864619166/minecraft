package com.xDGCSJdMC.enderai.achievement;

import com.xDGCSJdMC.enderai.item.ItemLoader;

import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

public class AchievementLoader {
	
	public static Achievement beAnEnderman = new Achievement("achievement.enderai.beanenderman",
            "enderai.beanenderman", 30, -40, ItemLoader.chaoticPearlPickaxe, AchievementList.theEnd);

    public AchievementLoader()
    {
    	beAnEnderman.setSpecial().registerStat();
    }

}
