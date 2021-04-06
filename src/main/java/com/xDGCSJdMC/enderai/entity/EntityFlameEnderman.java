package com.xDGCSJdMC.enderai.entity;

import com.xDGCSJdMC.enderai.init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class EntityFlameEnderman extends EntityEnderman {
	
	public EntityFlameEnderman(final World worldIn) {
		super(worldIn);
        this.setSize(0.6F, 2.9F);
        this.stepHeight = 1.0F;
        this.setPathPriority(PathNodeType.WATER, -1.0F);
        this.getFireImmuneTicks();
        this.addHealItem(new ItemStack(ModItems.FLAME_PEARL, 1, OreDictionary.WILDCARD_VALUE), 0.01D);
        this.addHealItem(new ItemStack(ModItems.ENDERMAN_HEAD, 1, OreDictionary.WILDCARD_VALUE), 0.001D);
        this.addHealItem(new ItemStack(Items.ENDER_PEARL, 3, OreDictionary.WILDCARD_VALUE), 0.25D);
        this.addHealItem(new ItemStack(Items.ENDER_EYE, 1, OreDictionary.WILDCARD_VALUE), 0.25D);

	}
	 public void setImmuneToFire(final boolean toSet) {
		    this.isImmuneToFire = toSet;
		  }
	
	 public EntityFlameEnderman addHealItem(final ItemStack s, final double multiplier) {
		 EntityFlameEnderman.put(s, multiplier);
		    return this;
		  }


	
	 
	 
	 private static void put(ItemStack s, double multiplier) {
		
	}
	@Override
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(2.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(64.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1);
	        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0F);
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
