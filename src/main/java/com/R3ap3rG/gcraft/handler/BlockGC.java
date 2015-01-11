package com.R3ap3rG.gcraft.handler;


import com.R3ap3rG.gcraft.init.ModBlocks;
import com.R3ap3rG.gcraft.init.ModItems;
import com.R3ap3rG.gcraft.utility.CreativeTabGC;
import com.R3ap3rG.gcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGC extends Block
{
    public BlockGC(Material material){
        super(material);
        this.setHardness(4F);
        this.setCreativeTab(CreativeTabGC.GCRAFT_TAB);
    }

    public BlockGC(){
        this(Material.rock);
    }

    public Item getItemDropped(int i, Random random, int x) {
        return this == ModBlocks.crystalOre ? ModItems.crystal : (this == ModBlocks.osmiumNetherOre ? ModItems.dustOsmium : (this == ModBlocks.enderEndOre ? ModItems.shardEnder : Item.getItemFromBlock(this)));
    }

    public int quantityDropped(Random random){
        return this == ModBlocks.crystalOre ? random.nextInt(4) : (this == ModBlocks.osmiumNetherOre ? random.nextInt(5): (this == ModBlocks.enderEndOre ? 1 + random.nextInt(3) : 1));
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
