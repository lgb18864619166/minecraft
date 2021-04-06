package com.xDGCSJdMC.enderai.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ChaoticPearlBlock extends BlockBase {

	public ChaoticPearlBlock(String name, Material material, CreativeTabs tab) {
		
		super(name, material, tab);
		
		
		setSoundType(SoundType.STONE);
		setHardness(500.0F);
		setResistance(18000000000.0F);
		setLightLevel(300.0F);
        setHarvestLevel("pickaxe", 3);
		setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
