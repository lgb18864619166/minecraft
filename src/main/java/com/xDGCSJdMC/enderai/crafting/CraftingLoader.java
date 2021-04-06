package com.xDGCSJdMC.enderai.crafting;

import com.xDGCSJdMC.enderai.block.BlockLoader;
import com.xDGCSJdMC.enderai.item.ItemLoader;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader {
	
	public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {
    	
    	GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.chaoticPearl), new Object[]
    	        {
    	                "#*#", "*#*", "***", '#', ItemLoader.wisdomPearl, '*', ItemLoader.flamePearl
    	        });
    	
    	GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.chaoticPearlBlock), new Object[]
    	        {
    	                "##", "##", '#', ItemLoader.chaoticPearl
    	        });
    	
    	GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.chaoticPearl), new Object[]
    	        {
    	        		"##", "##", '#', ItemLoader.chaoticPearlPellet
    	        });
    	
    	GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.endermanHelmet), new Object[]
    	        {
    	                "###", "# #", '#', ItemLoader.chaoticPearl
    	        });
    	        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.endermanChestplate), new Object[]
    	        {
    	                "# #", "###", "###", '#', ItemLoader.chaoticPearl
    	        });
    	        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.endermanLeggings), new Object[]
    	        {
    	                "###", "# #", "# #", '#', ItemLoader.chaoticPearl
    	        });
    	        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.endermanBoots), new Object[]
    	        {
    	                "# #", "# #", '#', ItemLoader.chaoticPearl
    	        });
    	
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockLoader.chaoticPearlBlock, 1), ItemLoader.chaoticPearl, 4);

    }

    private static void registerSmelting()
    {
    	
    	GameRegistry.addSmelting(BlockLoader.chaoticPearlOre, new ItemStack(ItemLoader.chaoticPearlPellet, 2), 1.0F);

    }

    private static void registerFuel()
    {

    }

}
