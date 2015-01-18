package com.R3ap3rG.gcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModBlocks.crystalBlock), "sss","sss","sss",'s',new ItemStack(ModItems.crystal));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.copperBlock, true, new Object[]{"sss","sss","sss",'s', ModItems.ingotCopper}));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.tinBlock, true, new Object[]{"sss","sss","sss", 's', ModItems.ingotTin}));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.crystal, 9), new ItemStack(ModBlocks.crystalBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCopper, 9) ,new ItemStack(ModBlocks.copperBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotTin, 9) ,new ItemStack(ModBlocks.tinBlock));

        GameRegistry.addRecipe(new ItemStack(ModItems.plateIron, 2)," s ", "sss", " s ", 's', Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(ModItems.plateCopper, 2)," s ", "sss", " s ", 's', ModItems.ingotCopper);
        GameRegistry.addRecipe(new ItemStack(ModItems.plateTin, 2)," s ", "sss", " s ", 's', ModItems.ingotTin);


        GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.ingotCopper), 5);
        GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack(ModItems.ingotTin),5);

        //Nether Ore Smelts
        GameRegistry.addSmelting(ModBlocks.coalNetherOre, new ItemStack(Blocks.coal_ore),5);
        GameRegistry.addSmelting(ModBlocks.ironNetherOre, new ItemStack(Blocks.iron_ore),5);
        GameRegistry.addSmelting(ModBlocks.copperNetherOre, new ItemStack(ModBlocks.copperOre),5);
        GameRegistry.addSmelting(ModBlocks.tinNetherOre, new ItemStack(ModBlocks.tinOre),5);
        GameRegistry.addSmelting(ModBlocks.crystalNetherOre, new ItemStack(ModBlocks.crystalOre),5);
        GameRegistry.addSmelting(ModBlocks.goldNetherOre, new ItemStack(Blocks.gold_ore),5);
        GameRegistry.addSmelting(ModBlocks.diamondNetherOre, new ItemStack(Blocks.diamond_ore),5);
        GameRegistry.addSmelting(ModBlocks.emeraldNetherOre, new ItemStack(Blocks.emerald_ore),5);
        GameRegistry.addSmelting(ModBlocks.lapisNetherOre, new ItemStack(Blocks.lapis_ore),5);
        GameRegistry.addSmelting(ModBlocks.redstoneNetherOre, new ItemStack(Blocks.redstone_ore),5);
    }
}
