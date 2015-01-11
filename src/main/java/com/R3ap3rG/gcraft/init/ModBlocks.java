package com.R3ap3rG.gcraft.init;

import com.R3ap3rG.gcraft.block.*;
import com.R3ap3rG.gcraft.handler.BlockGC;
import com.R3ap3rG.gcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


    @GameRegistry.ObjectHolder(Reference.MOD_ID)
    public class ModBlocks
    {
        public static final BlockGC crystalBlock = new BlockCrystal();
        public static final BlockGC copperBlock = new BlockCopper();
        public static final BlockGC tinBlock = new BlockTin();

        public static final BlockGC crystalOre = new OreCrystal();
        public static final BlockGC copperOre = new OreCopper();
        public static final BlockGC tinOre = new OreTin();

        public static final BlockGC tinNetherOre = new OreNetherTin();
        public static final BlockGC copperNetherOre = new OreNetherCopper();
        public static final BlockGC ironNetherOre = new OreNetherIron();
        public static final BlockGC goldNetherOre = new OreNetherGold();
        public static final BlockGC coalNetherOre = new OreNetherCoal();
        public static final BlockGC diamondNetherOre = new OreNetherDiamond();
        public static final BlockGC crystalNetherOre = new OreNetherCrystal();
        public static final BlockGC emeraldNetherOre = new OreNetherEmerald();
        public static final BlockGC lapisNetherOre = new OreNetherLapis();
        public static final BlockGC redstoneNetherOre = new OreNetherRedstone();
        public static final BlockGC osmiumNetherOre = new OreNetherOsmium();

        public static final BlockGC enderEndOre = new OreEndEnder();

        public static void init()
        {
            GameRegistry.registerBlock(crystalBlock,"crystalBlock");
            GameRegistry.registerBlock(copperBlock,"copperBlock");
            GameRegistry.registerBlock(tinBlock,"tinBlock");

            GameRegistry.registerBlock(crystalOre,"crystalOre");
            GameRegistry.registerBlock(copperOre,"copperOre");
            GameRegistry.registerBlock(tinOre,"tinOre");

            GameRegistry.registerBlock(tinNetherOre,"tinNetherOre");
            GameRegistry.registerBlock(copperNetherOre,"copperNetherOre");
            GameRegistry.registerBlock(coalNetherOre,"coalNetherOre");
            GameRegistry.registerBlock(ironNetherOre,"ironNetherOre");
            GameRegistry.registerBlock(goldNetherOre,"goldNetherOre");
            GameRegistry.registerBlock(diamondNetherOre,"diamondNetherOre");
            GameRegistry.registerBlock(crystalNetherOre,"crystalNetherOre");
            GameRegistry.registerBlock(emeraldNetherOre, "emeraldNetherOre");
            GameRegistry.registerBlock(lapisNetherOre, "lapisNetherOre");
            GameRegistry.registerBlock(redstoneNetherOre, "redstoneNetherOre");
            GameRegistry.registerBlock(osmiumNetherOre, "osmiumNetherOre");

            GameRegistry.registerBlock(enderEndOre, "enderEndOre");
        }
    }

