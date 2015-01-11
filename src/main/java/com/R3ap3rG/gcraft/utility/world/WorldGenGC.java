package com.R3ap3rG.gcraft.utility.world;

import com.R3ap3rG.gcraft.handler.BlockGC;
import com.R3ap3rG.gcraft.init.ModBlocks;
import com.R3ap3rG.gcraft.utility.world.WorldGenEndMinable;
import com.R3ap3rG.gcraft.utility.world.WorldGenNetherMinable;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGenGC implements IWorldGenerator{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId){
            case 0:
                generateSurface(world, random, chunkX*16, chunkZ*16);
            case -1:
                generateNether(world, random, chunkX*16, chunkZ*16);
            case 1:
                generateEnd(world, random, chunkX*16, chunkZ*16);
        }
    }


    private void generateSurface(World world, Random random, int x, int z){
        //(Block, world, random, chunk X Pos, chunk Z Pos, max x, max z, vein size, chance, low Y, high Y)
        this.addOreSpawn(ModBlocks.copperOre, world ,random, x, z, 16, 16, 4+random.nextInt(8),37,32,58);
        this.addOreSpawn(ModBlocks.tinOre, world ,random, x, z, 16, 16, 4+random.nextInt(7),31,21,47);
        this.addOreSpawn(ModBlocks.crystalOre, world ,random, x, z, 16, 16, 1+random.nextInt(4),25,3,27);
    }

    private void generateNether(World world, Random random, int x, int z) {
        this.addNetherOreSpawn(ModBlocks.coalNetherOre, world, random, x, z, 16, 16, 6 + random.nextInt(10), 37, 27, 100);
        this.addNetherOreSpawn(ModBlocks.copperNetherOre, world, random, x, z, 16, 16, 6 + random.nextInt(10), 37, 27, 100);
        this.addNetherOreSpawn(ModBlocks.tinNetherOre, world, random, x, z, 16, 16, 6 + random.nextInt(10), 37, 27, 100);
        this.addNetherOreSpawn(ModBlocks.ironNetherOre, world, random, x, z, 16, 16, 4 + random.nextInt(8), 37, 27, 100);
        this.addNetherOreSpawn(ModBlocks.goldNetherOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 19, 27, 100);
        this.addNetherOreSpawn(ModBlocks.diamondNetherOre, world, random, x, z, 16, 16, 1 + random.nextInt(4), 10, 1, 27);
        this.addNetherOreSpawn(ModBlocks.lapisNetherOre, world, random, x, z, 16, 16, 2 + random.nextInt(6), 29, 15, 100);
        this.addNetherOreSpawn(ModBlocks.redstoneNetherOre, world, random, x, z, 16, 16, 2 + random.nextInt(7), 29, 15, 100);
        this.addNetherOreSpawn(ModBlocks.crystalNetherOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 25, 7, 100);
        this.addNetherOreSpawn(ModBlocks.emeraldNetherOre, world, random, x, z, 16, 16, 1 + random.nextInt(4), 15, 1, 35);
        this.addNetherOreSpawn(ModBlocks.osmiumNetherOre, world, random, x, z, 16, 16, 1 + random.nextInt(3), 29, 1, 40);
    }

    private void generateEnd(World world, Random random, int x, int z) {
        // Test Value this.addEndOreSpawn(ModBlocks.crystalOre, world ,random, x, z, 16, 16, 1+random.nextInt(4),90,3,100);
        this.addEndOreSpawn(ModBlocks.enderEndOre, world ,random, x, z, 16, 16, 3+random.nextInt(7),90,3,100);
    }


    private void addOreSpawn(BlockGC block, World world, Random random, int xPos, int zPos, int x, int z, int vein, int chance, int y, int Y) {
        for(int i = 0; i < chance; ++i){
            int posX = xPos + random.nextInt(x);
            int posY = y + random.nextInt(Y - y);
            int posZ = zPos + random.nextInt(z);
            (new WorldGenMinable(block, vein)).generate(world, random, posX,posY,posZ);
        }
    }

    private void addNetherOreSpawn(BlockGC block, World world, Random random, int xPos, int zPos, int x, int z, int vein, int chance, int y, int Y) {
        for(int i = 0; i < chance; ++i){
            int posX = xPos + random.nextInt(x);
            int posY = y + random.nextInt(Y - y);
            int posZ = zPos + random.nextInt(z);
            (new WorldGenNetherMinable(block, vein)).generate(world, random, posX,posY,posZ);
        }
    }

    private void addEndOreSpawn(BlockGC block, World world, Random random, int xPos, int zPos, int x, int z, int vein, int chance, int y, int Y) {
        for(int i = 0; i < chance; ++i){
            int posX = xPos + random.nextInt(x);
            int posY = y + random.nextInt(Y - y);
            int posZ = zPos + random.nextInt(z);
            (new WorldGenEndMinable(block, vein)).generate(world, random, posX,posY,posZ);
        }
    }

}
