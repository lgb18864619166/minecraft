package com.xDGCSJdMC.enderai.init;

import java.util.ArrayList;
import java.util.List;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.blocks.BlockBase;
import com.xDGCSJdMC.enderai.blocks.ChaoticPearlBlock;
import com.xDGCSJdMC.enderai.blocks.ChaoticPearlOre;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CHAOTIC_PEARL_BLOCK = new ChaoticPearlBlock("chaotic_pearl_block", Material.IRON, EnderAI.ENDER_AI);
	public static final Block CHAOTIC_PEARL_ORE = new ChaoticPearlOre("chaotic_pearl_ore", Material.ROCK, EnderAI.ENDER_AI);

}
