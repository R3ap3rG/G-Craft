package com.R3ap3rG.gcraft.init;

import com.R3ap3rG.gcraft.item.*;
import com.R3ap3rG.gcraft.handler.ItemGC;
import com.R3ap3rG.gcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems{

    public static final ItemGC crystal = new ItemCrystal();
    public static final ItemGC ingotCopper = new ItemIngotCopper();
    public static final ItemGC ingotTin = new ItemIngotTin();
    public static final ItemGC dustOsmium = new ItemDustOsmium();
    public static final ItemGC shardOsmium = new ItemShardOsmium();
    public static final ItemGC shardEnder = new ItemShardEnder();

    public static void init()
    {
        GameRegistry.registerItem(crystal, "crystal");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotTin, "ingotTin");
        GameRegistry.registerItem(dustOsmium, "dustOsmium");
        GameRegistry.registerItem(shardOsmium, "shardOsmium");
        GameRegistry.registerItem(shardEnder, "shardEnder");


        OreDictionary.registerOre("ingotCopper", ingotCopper);
        OreDictionary.registerOre("ingotTin", ingotTin);
    }
}
