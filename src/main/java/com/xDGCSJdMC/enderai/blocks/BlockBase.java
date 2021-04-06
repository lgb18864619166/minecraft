package com.xDGCSJdMC.enderai.blocks;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.init.ModBlocks;
import com.xDGCSJdMC.enderai.init.ModItems;
import com.xDGCSJdMC.enderai.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material, CreativeTabs tab) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		
	}
	
	@Override
	public void registerModels() {
		EnderAI.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
