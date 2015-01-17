package com.R3ap3rG.gcraft.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityCompressor extends TileEntity {

    private String localizedName;

    public void setGuiDisplayName(String displayName) {
        this.localizedName = displayName;
    }

    public String getInventoryName(){
        return this.hasCustomInventoryName()? this.localizedName : "container.compressor";
    }

    public boolean hasCustomInventoryName() {
        return this.localizedName!= null && this.localizedName.length()>0;
    }
}
