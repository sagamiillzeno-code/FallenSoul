
package com.fallensoul.world;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.fallensoul.blocks.ModBlocks;

public class WorldGenMithrilOre implements IWorldGenerator {

    private final WorldGenMinable generator;

    public WorldGenMithrilOre() {
        IBlockState oreState = ModBlocks.MITHRIL_ORE.getDefaultState();

        generator = new WorldGenMinable(
                oreState,
                3,
                state -> state.getBlock() == Blocks.STONE
        );
    }

    @Override
    public void generate(
            Random random,
            int chunkX,
            int chunkZ,
            World world,
            IChunkGenerator chunkGenerator,
            IChunkProvider chunkProvider) {

        if (world.provider.getDimension() != 0) {
            return;
        }

        int veinsPerChunk = 2;

        for (int i = 0; i < veinsPerChunk; i++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = 5 + random.nextInt(21);
            int z = chunkZ * 16 + random.nextInt(16);

            generator.generate(
                    world,
                    random,
                    new BlockPos(x, y, z)
            );
        }
    }
}
