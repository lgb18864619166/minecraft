package com.xDGCSJdMC.enderai.world;

import com.xDGCSJdMC.enderai.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunX, int chunZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){

        if(world.provider.getDimension() == 0){

            generatrOverworld(random, chunX, chunZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generatrOverworld(Random random, int chunX, int chunZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){

        generatrOre(ModBlocks.CHAOTIC_PEARL_ORE.getDefaultState(), world, random, chunX*6, chunZ*6, 2, 13, random.nextInt(1)+2, 4);

    }

    private void generatrOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances){

        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++){
            BlockPos pos = new BlockPos(x+random.nextInt(16), minY+random.nextInt(deltaY), z+random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }
}
