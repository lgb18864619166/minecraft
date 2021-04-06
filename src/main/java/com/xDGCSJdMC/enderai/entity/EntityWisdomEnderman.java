package com.xDGCSJdMC.enderai.entity;

import java.util.Set;

import com.google.common.base.Optional;
import com.google.common.collect.Sets;
import com.xDGCSJdMC.enderai.init.ModBlocks;
import com.xDGCSJdMC.enderai.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeCache;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class EntityWisdomEnderman extends EntityEnderman {


	public EntityWisdomEnderman(final World worldIn) {
		super(worldIn);
		this.setImmuneToFire(true);
		this.setSize(0.6F, 2.9F);
        this.stepHeight = 1.0F;
        this.setPathPriority(PathNodeType.WATER, -0.5F);
        this.getFireImmuneTicks();
        this.addHealItem(new ItemStack(ModItems.WISDOM_PEARL, 1), 0.01D);
        this.addHealItem(new ItemStack(ModItems.ENDERMAN_TRIPE, 1), 0.001D);
        this.addHealItem(new ItemStack(ModItems.WISDOM_ENDERMAN_FOOD, 1), 0.001D);
        this.addHealItem(new ItemStack(Items.ENDER_PEARL, 2), 0.25D);
        this.addHealItem(new ItemStack(Items.ENDER_EYE, 1), 0.25D);


	}
	

	private void addHealItem(ItemStack itemStack, double d) {
		
	}


	private void setImmuneToFire(boolean b) {
		
	}
	
	private void dropBlock(Block obsidian, int i) {
		
	}

	 
	 
	 @Override
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(2.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(64.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1);
	        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(18.0F);
	    }

	 @Override
	  public boolean attackEntityAsMob(final Entity entity) {
	    if (super.attackEntityAsMob(entity)) {
	      final int BLIND_CHANCE = 100;
	            addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 20 * (3 + rand.nextInt(5)), 0));
	      }
	      return true;
	}
	 
	 @Override
	  public void onLivingUpdate() {
	    super.onLivingUpdate();
	    // if burning, the fire never goes out on its own
	    if (this.isBurning()) {
	      this.setFire(5);
	    }
	  }

}
