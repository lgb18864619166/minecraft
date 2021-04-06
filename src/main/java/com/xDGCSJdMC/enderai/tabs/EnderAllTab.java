package com.xDGCSJdMC.enderai.tabs;

import com.xDGCSJdMC.enderai.init.ModBlocks;
import com.xDGCSJdMC.enderai.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnderAllTab extends CreativeTabs {
	
	public EnderAllTab() {
		
		super("ender_tab");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.CHAOTIC_PEARL);
	}

}
