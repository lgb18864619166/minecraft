package com.xDGCSJdMC.enderai.items.tools;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.init.ModItems;
import com.xDGCSJdMC.enderai.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
	
    public ToolSword(String name, CreativeTabs tab, ToolMaterial material) {
    	  
    	super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	
	@Override
	public void registerModels() {
		EnderAI.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
