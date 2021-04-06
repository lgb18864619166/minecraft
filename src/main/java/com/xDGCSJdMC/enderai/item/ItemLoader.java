package com.xDGCSJdMC.enderai.item;

import com.xDGCSJdMC.enderai.item.ItemEndermanArmor.Boots;
import com.xDGCSJdMC.enderai.item.ItemEndermanArmor.Chestplate;
import com.xDGCSJdMC.enderai.item.ItemEndermanArmor.Helmet;
import com.xDGCSJdMC.enderai.item.ItemEndermanArmor.Leggings;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	
	//items
	public static Item wisdomPearl = new ItemWisdomPearl();
	public static Item flamePearl = new ItemFlamePearl();
	public static Item chaoticPearl = new ItemChaoticPearl();
	public static Item chaoticPearlPellet = new ItemChaoticPearlPellet();
	
	//tools
	public static Item chaoticPearlSword = new ItemChaoticPearlSword();
	public static Item chaoticPearlPickaxe = new ItemChaoticPearlPickaxe();
	
	//armors
	public static ItemArmor endermanHelmet = new ItemEndermanArmor.Helmet();
	public static ItemArmor endermanChestplate = new ItemEndermanArmor.Chestplate();
	public static ItemArmor endermanLeggings = new ItemEndermanArmor.Leggings();
	public static ItemArmor endermanBoots = new ItemEndermanArmor.Boots();
	
	//food
	public static Item wisdomEndermanFood = new ItemWisdomEndermanFood();
	

    public ItemLoader(FMLPreInitializationEvent event)
    {
    	//items
        register(wisdomPearl, "wisdom_pearl");
        register(flamePearl, "flame_pearl");
        register(chaoticPearl, "chaotic_pearl");
        register(chaoticPearlPellet, "chaotic_pearl_pellet");
        
        //tools
        register(chaoticPearlSword, "chaotic_pearl_sword");
        register(chaoticPearlPickaxe, "chaotic_pearl_pickaxe");
        
        //armors
        register(endermanHelmet, "enderman_helmet");
        register(endermanChestplate, "enderman_chestplate");
        register(endermanLeggings, "enderman_leggings");
        register(endermanBoots, "enderman_boots");
        
        //food
        register(wisdomEndermanFood, "wisdom_enderman_food");
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
    	//items
        registerRender(wisdomPearl);
        registerRender(flamePearl);
        registerRender(chaoticPearl);
        registerRender(chaoticPearlPellet);
        
        //tools
        registerRender(chaoticPearlSword);
        registerRender(chaoticPearlPickaxe);
        
        //armors
        registerRender(endermanHelmet);
        registerRender(endermanChestplate);
        registerRender(endermanLeggings);
        registerRender(endermanBoots);
        
        //food
        registerRender(wisdomEndermanFood);
        
    }

    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item.setRegistryName(name));
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }

}
