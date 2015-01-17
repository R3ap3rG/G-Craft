package com.R3ap3rG.gcraft.machine;

import com.R3ap3rG.gcraft.GCraft;
import com.R3ap3rG.gcraft.handler.MachineGC;
import com.R3ap3rG.gcraft.reference.Reference;
import com.R3ap3rG.gcraft.tileentity.TileEntityCompressor;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MachineCompressor extends MachineGC {

    private final boolean isActive;
    @SideOnly(Side.CLIENT)
    private       IIcon   iconFront;
    @SideOnly(Side.CLIENT)
    private       IIcon   iconTop;


    public MachineCompressor(boolean isActive) {
        super(Material.iron);
        this.setBlockName("compressor");

        this.isActive = isActive;
    }


    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int other) {
        return side == 1 ? this.iconTop : (side == 0 ? this.iconTop : (side != other ? this.blockIcon : this.iconFront));
    }


    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon("furnace_side");
        iconFront = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isActive ? "compressorFrontOff":"compressorFrontOn"));
        iconTop  = iconRegister.registerIcon("furnace_top");
    }



    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ)
    {
        if (!world.isRemote){
            FMLNetworkHandler.openGui(entityPlayer, GCraft.instance,Reference.guiIdCompressor,world,x,y,z);
        }
        return true;
    }







    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityCompressor();

    }
}
