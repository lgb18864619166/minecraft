package com.xDGCSJdMC.enderai.creativetab;

import com.xDGCSJdMC.enderai.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsEnderAI extends CreativeTabs {
	
	public CreativeTabsEnderAI()
    {
        super("enderai");
    }

    @Override
    public Item getTabIconItem()
    {
        return ItemLoader.chaoticPearl;
    }

}
