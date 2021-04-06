package com.xDGCSJdMC.enderai.entity;

import com.xDGCSJdMC.enderai.item.ItemLoader;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityFlameEnderman extends EntityEnderman {
	
	public EntityFlameEnderman(World worldIn)
    {
        super(worldIn);
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }
    
    @Override
    protected void dropFewItems(boolean arg1, int arg2)
    {
        if (this.rand.nextInt(5) == 0)
        {
            this.dropItem(Items.ender_eye, 1);
            this.dropItem(ItemLoader.flamePearl, 1);
            this.dropItem(ItemLoader.chaoticPearlPellet, 1);
        }
        super.dropFewItems(arg1, arg2);
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.7D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
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
    
    private void registerEntitySpawn(Class<EntityFlameEnderman> class1, int i, int j, int k, EnumCreatureType monster,
			BiomeGenBase hell, BiomeGenBase mushroomisland) {
		
	}

}
