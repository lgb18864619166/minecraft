package com.xDGCSJdMC.enderai.items.food;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.init.ModItems;
import com.xDGCSJdMC.enderai.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {
	
	public FoodBase(String name, int amount, float saturation, boolean isWolfFood, CreativeTabs tab) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
		
        this.maxStackSize = 16;
        this.setCreativeTab(EnderAI.ENDER_AI);
		
	}
	
	@Override
	public void registerModels() {
	EnderAI.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	
}
