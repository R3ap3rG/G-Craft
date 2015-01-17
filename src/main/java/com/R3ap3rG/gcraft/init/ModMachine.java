package com.R3ap3rG.gcraft.init;

import com.R3ap3rG.gcraft.handler.MachineGC;
import com.R3ap3rG.gcraft.machine.MachineCompressor;
import com.R3ap3rG.gcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
    public class ModMachine
    {
        public static final MachineGC compressorOn = new MachineCompressor(true);
        public static final MachineGC compressorOff = new MachineCompressor(false);

        public static void init() {
            GameRegistry.registerBlock(compressorOn, "compressor");
        }
    }
