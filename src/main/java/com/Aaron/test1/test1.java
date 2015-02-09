package com.Aaron.test1;

import com.Aaron.test1.client.handler.KeyInputEventHandler;
import com.Aaron.test1.handler.ConfigurationHandler;
import com.Aaron.test1.init.ModBlocks;
import com.Aaron.test1.init.ModItems;
import com.Aaron.test1.init.Recipes;
import com.Aaron.test1.proxy.IProxy;
import com.Aaron.test1.reference.Reference;
import com.Aaron.test1.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class test1 {

    @Mod.Instance(Reference.MOD_ID)
    public static test1 instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInt(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();
        ModItems.init();
        ModBlocks.init();

        LogHelper.info("PreInitialization Complete");
    }

    @Mod.EventHandler
    public void Int(FMLInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        Recipes.init();

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void PostInt(FMLPostInitializationEvent event) {
        LogHelper.info("PostInitialization Complete");
    }
}
