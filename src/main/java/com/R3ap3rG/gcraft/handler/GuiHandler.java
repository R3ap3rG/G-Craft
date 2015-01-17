package com.R3ap3rG.gcraft.handler;

import com.R3ap3rG.gcraft.container.ContainerCompressor;
import com.R3ap3rG.gcraft.gui.CompressorGui;
import com.R3ap3rG.gcraft.reference.Reference;
import com.R3ap3rG.gcraft.tileentity.TileEntityCompressor;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x,y,z);

        if(entity != null){
            switch(ID){
                case Reference.guiIdCompressor:
                    if(entity instanceof TileEntityCompressor){
                        return new ContainerCompressor(player.inventory, (TileEntityCompressor)entity);
                    }
                    return null;
            }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x,y,z);

        if(entity != null){
            switch(ID){
                case Reference.guiIdCompressor:
                    if(entity instanceof TileEntityCompressor){
                        return new CompressorGui(player.inventory, (TileEntityCompressor)entity);
                    }
                    return null;
            }
        }
        return null;
    }
}
