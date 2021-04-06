package com.xDGCSJdMC.enderai.item;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.creativetab.CreativeTabsLoader;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemEndermanArmor extends ItemArmor {
	
	 public static final ItemArmor.ArmorMaterial CHAOTIC_PEARL_ARMOR = EnumHelper.addArmorMaterial("CHAOTIC_PEARL_ARMOR",
	            EnderAI.MODID + ":" + "chaotic", 10, new int[]
	            { 6, 16, 14, 4 }, 30);

	    public ItemEndermanArmor(int armorType)
	    {
	        super(CHAOTIC_PEARL_ARMOR, CHAOTIC_PEARL_ARMOR.ordinal(), armorType);
	    }
	    
	    public static class Helmet extends ItemEndermanArmor
	    {
	        public Helmet()
	        {
	            super(0);
	            this.setUnlocalizedName("endermanHelmet");
	            this.setCreativeTab(CreativeTabsLoader.tabEnderAI);
	        }
	    }

	    public static class Chestplate extends ItemEndermanArmor
	    {
	        public Chestplate()
	        {
	            super(1);
	            this.setUnlocalizedName("endermanChestplate");
	            this.setCreativeTab(CreativeTabsLoader.tabEnderAI);
	        }
	    }

	    public static class Leggings extends ItemEndermanArmor
	    {
	        public Leggings()
	        {
	            super(2);
	            this.setUnlocalizedName("endermanLeggings");
	            this.setCreativeTab(CreativeTabsLoader.tabEnderAI);
	        }
	    }

	    public static class Boots extends ItemEndermanArmor
	    {
	        public Boots()
	        {
	            super(3);
	            this.setUnlocalizedName("endermanBoots");
	            this.setCreativeTab(CreativeTabsLoader.tabEnderAI);
	        }
	    }


}
