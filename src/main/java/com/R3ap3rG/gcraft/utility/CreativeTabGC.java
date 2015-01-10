package com.R3ap3rG.gcraft.utility;

import com.R3ap3rG.gcraft.init.ModItems;
import com.R3ap3rG.gcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabGC {
    public static final CreativeTabs GCRAFT_TAB = new CreativeTabs(Reference.MOD_ID){
        @Override
        public Item getTabIconItem(){
            return ModItems.crystal;
        }

        @Override
        public String getTranslatedTabLabel(){
            return "G-Craft";
        }
    };
}
