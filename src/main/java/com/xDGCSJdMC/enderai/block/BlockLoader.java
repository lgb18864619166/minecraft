package com.xDGCSJdMC.enderai.block;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	
	public static Block chaoticPearlBlock = new BlockChaoticPearlBlock();
	public static Block chaoticPearlOre = new BlockChaoticPearlOre();

    public BlockLoader(FMLPreInitializationEvent event)
    {
        register(chaoticPearlBlock, "chaotic_pearl_block");
        register(chaoticPearlOre, "chaotic_pearl_ore");
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(chaoticPearlBlock);
        registerRender(chaoticPearlOre);
    }

    private static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block.setRegistryName(name));
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
    }

}
