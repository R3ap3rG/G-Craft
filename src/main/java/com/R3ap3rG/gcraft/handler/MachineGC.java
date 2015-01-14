package com.R3ap3rG.gcraft.handler;


import com.R3ap3rG.gcraft.reference.Reference;
import com.R3ap3rG.gcraft.utility.CreativeTabGC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class MachineGC extends Block
{
    public MachineGC(Material material){
        super(material);
        this.setHardness(4F);
        this.setCreativeTab(CreativeTabGC.GCRAFT_TAB);
    }

    public MachineGC(){
        this(Material.anvil);
    }

    public Item getItemDropped(int i, Random random, int x) {
        return null;
    }

    public int quantityDropped(Random random){
        return 1;
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
