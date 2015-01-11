package com.R3ap3rG.gcraft.handler;

import com.R3ap3rG.gcraft.init.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        if(fuel.getItem() == ModItems.crystal) return 2400; //Temporary
        return 0;
    }
}
