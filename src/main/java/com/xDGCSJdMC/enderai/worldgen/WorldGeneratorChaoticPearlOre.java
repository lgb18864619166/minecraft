package com.xDGCSJdMC.enderai.worldgen;

import java.util.Random;

import com.xDGCSJdMC.enderai.block.BlockLoader;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class WorldGeneratorChaoticPearlOre extends WorldGenerator {
	
	
	private final WorldGenerator chaoticPearlOreGenerator = new WorldGenMinable(BlockLoader.chaoticPearlOre.getDefaultState(), 16);

    @Override
    public boolean generate(World world, Random rand, BlockPos pos)
    {
        if (TerrainGen.generateOre(world, rand, this, pos, OreGenEvent.GenerateMinable.EventType.CUSTOM))
        {
            for (int i = 0; i < 4; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 3 + rand.nextInt(13);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                BiomeGenBase biomeGenBase = world.getBiomeGenForCoords(blockpos);
                if (biomeGenBase.getIntRainfall() < rand.nextInt(36524))
                {
                	chaoticPearlOreGenerator.generate(world, rand, blockpos);
                }
            }
        }
        return true;
    }

}
