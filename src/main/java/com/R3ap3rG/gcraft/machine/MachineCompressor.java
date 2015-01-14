package com.R3ap3rG.gcraft.machine;

import com.R3ap3rG.gcraft.handler.MachineGC;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class MachineCompressor extends MachineGC {
    public MachineCompressor(){
        super();
        this.setBlockName("compressor");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ)
    {
        return true;
    }
}
