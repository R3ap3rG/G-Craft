package com.R3ap3rG.gcraft.init;

import com.R3ap3rG.gcraft.item.ItemCrystal;
import com.R3ap3rG.gcraft.handler.ItemGC;
import com.R3ap3rG.gcraft.item.ItemIngotCopper;
import com.R3ap3rG.gcraft.item.ItemIngotTin;
import com.R3ap3rG.gcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems{

    public static final ItemGC crystal = new ItemCrystal();
    public static final ItemGC ingotCopper = new ItemIngotCopper();
    public static final ItemGC ingotTin = new ItemIngotTin();

    public static void init()
    {
        GameRegistry.registerItem(crystal, "crystal");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotTin, "ingotTin");
    }
}
