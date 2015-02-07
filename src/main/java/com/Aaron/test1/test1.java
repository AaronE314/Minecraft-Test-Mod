package com.Aaron.test1;

import com.Aaron.test1.configuration.ConfigurationHandler;
import com.Aaron.test1.proxy.IProxy;
import com.Aaron.test1.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class test1 {

    @Mod.Instance(Reference.MOD_ID)
    public static test1 instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void Preint(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void Int(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void Postint(FMLPostInitializationEvent event) {

    }
}
