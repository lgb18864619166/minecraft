package com.xDGCSJdMC.enderai.potion;

import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class PotionLoader {
	
	public static Potion potionEndermanTrueMeaning;

    public PotionLoader(FMLPreInitializationEvent event)
    {
    	potionEndermanTrueMeaning = new PotionEndermanTrueMeaning();
    }

}
