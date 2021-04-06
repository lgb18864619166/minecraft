package com.xDGCSJdMC.enderai.blocks;

import com.xDGCSJdMC.enderai.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class ChaoticPearlOre extends BlockBase {

    public ChaoticPearlOre(String name, Material material, CreativeTabs tab){

        super(name, material, tab);

        setSoundType(SoundType.STONE);
        setHardness(70.0F);
        setResistance(18000000000000.0F);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(30.0F);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){

        return ModItems.CHAOTIC_PEARL_PELLET;
    }

    @Override
    public int quantityDropped(Random rand){

        int min = 0;
        int max = 2;
        return rand.nextInt(max)+min;
    }
}
