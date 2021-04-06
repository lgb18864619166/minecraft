package com.xDGCSJdMC.enderai.item;

import com.xDGCSJdMC.enderai.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemChaoticPearlPickaxe extends ItemPickaxe {
	
	public static final Item.ToolMaterial CHAOTICPEARL = EnumHelper.addToolMaterial("CHAOTICPEARL", 10, 2000, 30.0F, 396.0F, 30);
	
	public ItemChaoticPearlPickaxe()
    {
        super(CHAOTICPEARL);
        this.setUnlocalizedName("chaoticPickaxe");
        this.setCreativeTab(CreativeTabsLoader.tabEnderAI);
    }

}
