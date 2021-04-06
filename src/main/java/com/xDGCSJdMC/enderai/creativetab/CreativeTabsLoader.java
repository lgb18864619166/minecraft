package com.xDGCSJdMC.enderai.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {
	
	public static CreativeTabs tabEnderAI;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
        tabEnderAI = new CreativeTabsEnderAI();
    }

}
