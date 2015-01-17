package com.R3ap3rG.gcraft;


import com.R3ap3rG.gcraft.handler.GuiHandler;
import com.R3ap3rG.gcraft.handler.*;
import com.R3ap3rG.gcraft.init.*;
import com.R3ap3rG.gcraft.proxy.IProxy;
import com.R3ap3rG.gcraft.reference.Reference;
import com.R3ap3rG.gcraft.utility.world.WorldGenGC;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class GCraft {

    WorldGenGC eventWorldGen = new WorldGenGC();

    @Mod.Instance("GCraft")
    public static GCraft instance;


    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());


        ModBlocks.init();
        ModItems.init();
        ModMachine.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        Recipes.init();
        MachineGC.tileEntityInit();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        GameRegistry.registerWorldGenerator(eventWorldGen, 0);
        GameRegistry.registerFuelHandler(new FuelHandler());


    }
}
