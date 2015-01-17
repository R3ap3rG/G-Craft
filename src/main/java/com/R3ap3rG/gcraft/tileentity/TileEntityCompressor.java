package com.R3ap3rG.gcraft.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCompressor extends TileEntity implements ISidedInventory{

    private String localizedName;

    private ItemStack[] slots = new ItemStack[10];

    public void setGuiDisplayName(String displayName) {
        this.localizedName = displayName;
    }

    public String getInventoryName(){
        return this.hasCustomInventoryName()? this.localizedName : "container.compressor";
    }

    public boolean hasCustomInventoryName() {
        return this.localizedName!= null && this.localizedName.length()>0;
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return false;
    }


    public void openInventory() {}
    public void closeInventory() {}

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    public int getSizeInventory(){
       return this.slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int p_70301_1_) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {

    }

    @Override
    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int i, ItemStack itemStack, int p_102007_3_) {
        return this.isItemValidForSlot(i,itemStack);
    }

    @Override
    public boolean canExtractItem(int i, ItemStack itemStack, int j) {
        return false;
    }
}
