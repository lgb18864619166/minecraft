package com.xDGCSJdMC.enderai.block;

import com.xDGCSJdMC.enderai.creativetab.CreativeTabsLoader;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockChaoticPearlBlock extends Block {
	

	public BlockChaoticPearlBlock()
    {
        super(Material.ground);
        this.setUnlocalizedName("chaoticPearlBlock");
        this.setHardness(300.0F);
        this.setStepSound(soundTypeStone);
        this.setResistance(180000000.0F);
        this.setLightLevel(300.0F);
		this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(CreativeTabsLoader.tabEnderAI);
    }

	

}
