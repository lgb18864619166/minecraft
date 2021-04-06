package com.xDGCSJdMC.enderai.entity;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.gen.MapGenBase;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.registry.EntityRegistry;


public class EntityInit {
	

	public static void registerEntities() {
		
		registerEntity("wisdom_enderman", EntityWisdomEnderman.class, Reference.ENTITY_WISDOM_ENDERMAN, 50, 0, 65280);
		registerEntity("flame_enderman", EntityFlameEnderman.class, Reference.ENTITY_FLAME_ENDERMAN, 50, 0, 16711680);
	}

	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int primaryColor, int secondaryColor) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, EnderAI.instance, range, 1, true, primaryColor, secondaryColor);
		
	}
	

}
