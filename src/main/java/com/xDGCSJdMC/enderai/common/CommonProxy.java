package com.xDGCSJdMC.enderai.common;

import com.xDGCSJdMC.enderai.achievement.AchievementLoader;
import com.xDGCSJdMC.enderai.block.BlockLoader;
import com.xDGCSJdMC.enderai.creativetab.CreativeTabsLoader;
import com.xDGCSJdMC.enderai.entity.EntityLoader;
import com.xDGCSJdMC.enderai.item.ItemLoader;
import com.xDGCSJdMC.enderai.potion.PotionLoader;
import com.xDGCSJdMC.enderai.worldgen.WorldGeneratorLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event)
    {
        new ConfigLoader(event);
        new CreativeTabsLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
        new PotionLoader(event);
        new EntityLoader();
    }

    public void init(FMLInitializationEvent event)
    {
        new AchievementLoader();
        new WorldGeneratorLoader();

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
