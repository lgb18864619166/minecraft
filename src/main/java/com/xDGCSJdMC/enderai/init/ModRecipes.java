package com.xDGCSJdMC.enderai.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void  init(){

        GameRegistry.addSmelting(ModBlocks.CHAOTIC_PEARL_ORE, new ItemStack(ModItems.CHAOTIC_PEARL_PELLET, 2), 1.0F);
    }
}
