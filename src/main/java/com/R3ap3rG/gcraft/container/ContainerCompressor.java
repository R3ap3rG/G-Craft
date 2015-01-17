package com.R3ap3rG.gcraft.container;

import com.R3ap3rG.gcraft.tileentity.TileEntityCompressor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerCompressor extends Container{

    private TileEntityCompressor compressor;

    public ContainerCompressor(InventoryPlayer inventory, TileEntityCompressor entity) {
        this.compressor = entity;
    }

    private static Container ContainerCompressor(InventoryPlayer inventoryPlayer, TileEntityCompressor entity) {
        return null;
    }

    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return false;
    }
}
