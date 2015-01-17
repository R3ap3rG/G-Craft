package com.R3ap3rG.gcraft.handler;


import com.R3ap3rG.gcraft.reference.Reference;
import com.R3ap3rG.gcraft.tileentity.TileEntityCompressor;
import com.R3ap3rG.gcraft.utility.CreativeTabGC;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

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
        return Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random random){
        return 1;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityPlayer, ItemStack itemStack)
    {
        int l = MathHelper.floor_double((double) (entityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (itemStack.hasDisplayName())
        {
            ((TileEntityCompressor)world.getTileEntity(x, y, z)).setGuiDisplayName(itemStack.getDisplayName());
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    public static void tileEntityInit(){
        GameRegistry.registerTileEntity(TileEntityCompressor.class, "compressor");
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
