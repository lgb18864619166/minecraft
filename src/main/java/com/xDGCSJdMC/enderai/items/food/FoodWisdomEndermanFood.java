package com.xDGCSJdMC.enderai.items.food;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.init.ModItems;
import com.xDGCSJdMC.enderai.init.ModPotions;
import com.xDGCSJdMC.enderai.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FoodWisdomEndermanFood extends ItemFood implements IHasModel {

	
	PotionEffect effect;
	
	public FoodWisdomEndermanFood(String name, int amount, float saturation, boolean isWolfFood, CreativeTabs tab) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setAlwaysEdible();
		
		ModItems.ITEMS.add(this);
		
        this.maxStackSize = 16;
        this.setCreativeTab(EnderAI.ENDER_AI);
		
	}
	
	@Override
	public void registerModels() {
	EnderAI.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		if(!worldIn.isRemote) {
			
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 2400, 2, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 2400, 2, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 1, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 2400, 2, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 200, 4, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 200, 5, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 60, 3, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 2400, 4, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 2400, 4, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 2400, 4, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 2400, 4, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 2400, 2, false, false));
			
			
		}
	}

}
