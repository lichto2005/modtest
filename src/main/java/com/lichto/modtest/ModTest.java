package com.lichto.modtest;

import com.lichto.modtest.client.handler.KeyInputEventHandler;
import com.lichto.modtest.handler.ConfigurationHandler;
import com.lichto.modtest.init.ModBlocks;
import com.lichto.modtest.init.ModItems;
import com.lichto.modtest.init.Recipes;
import com.lichto.modtest.proxy.IProxy;
import com.lichto.modtest.reference.Reference;
import com.lichto.modtest.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Noah Lichtenstein on 6/5/2016.
 */

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ModTest
{
    @Mod.Instance(Reference.MOD_ID)
    public static ModTest instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
