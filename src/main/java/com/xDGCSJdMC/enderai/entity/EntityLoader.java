package com.xDGCSJdMC.enderai.entity;

import java.util.Map;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.client.entity.EntityRenderFactory;
import com.xDGCSJdMC.enderai.client.entity.render.RenderFlameEnderman;
import com.xDGCSJdMC.enderai.client.entity.render.RenderWisdomEnderman;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityLoader {
	
	private static int nextID = 555;
	
    public EntityLoader()
    {
    	//wis
        registerEntity(EntityWisdomEnderman.class, "WisdomEnderman", 100, 10, true);
        registerEntityEgg(EntityWisdomEnderman.class, 0, 65280);
        registerEntitySpawn(EntityWisdomEnderman.class, 1, 0, 2, EnumCreatureType.MONSTER, BiomeGenBase.hell,
                BiomeGenBase.mushroomIsland);
        
        //fla
        registerEntity(EntityFlameEnderman.class, "FlameEnderman", 100, 10, true);
        registerEntityEgg(EntityFlameEnderman.class, 0, 16711680);
        registerEntitySpawn(EntityFlameEnderman.class, 2, 2, 4, EnumCreatureType.MONSTER, BiomeGenBase.hell,
                BiomeGenBase.mushroomIsland);
    }


	private static void registerEntityEgg(Class<? extends Entity> entityClass, int eggPrimary, int eggSecondary)
    {
        EntityRegistry.registerEgg(entityClass, eggPrimary, eggSecondary);
    }

    private static void registerEntity(Class<? extends Entity> entityClass, String name, int trackingRange,
            int updateFrequency, boolean sendsVelocityUpdates)
    {
        EntityRegistry.registerModEntity(entityClass, name, nextID++, EnderAI.instance, trackingRange, updateFrequency,
                sendsVelocityUpdates);
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerEntityRender(EntityWisdomEnderman.class, RenderWisdomEnderman.class);
        registerEntityRender(EntityFlameEnderman.class, RenderFlameEnderman.class);
    }

    @SideOnly(Side.CLIENT)
    private static <T extends Entity> void registerEntityRender(Class<T> entityClass, Class<? extends Render<T>> render)
    {
        RenderingRegistry.registerEntityRenderingHandler(entityClass, new EntityRenderFactory<T>(render));
    }
    
    private static void registerEntitySpawn(Class<? extends Entity> entityClass, int spawnWeight, int min,
            int max, EnumCreatureType typeOfCreature, BiomeGenBase... biomes)
    {
        if (EntityLiving.class.isAssignableFrom(entityClass))
        {
            Class<? extends EntityLiving> entityLivingClass = entityClass.asSubclass(EntityLiving.class);
            EntityRegistry.addSpawn(entityLivingClass, spawnWeight, min, max, typeOfCreature, biomes);
        }
    }

}
