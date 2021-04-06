package com.xDGCSJdMC.enderai.init;

import com.xDGCSJdMC.enderai.effect.PotionEndermanTrueMeaning;
import com.xDGCSJdMC.enderai.util.Reference;

import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModPotions {
	
	public static final Potion ENDERMAN_TRUE_MEANING = new PotionEndermanTrueMeaning();

@SubscribeEvent
public static void registerPotions(RegistryEvent.Register<Potion> evt)
	{
		evt.getRegistry().register(ENDERMAN_TRUE_MEANING);
	}

}
