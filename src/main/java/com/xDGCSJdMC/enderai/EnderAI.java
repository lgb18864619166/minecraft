package com.xDGCSJdMC.enderai;

import com.xDGCSJdMC.enderai.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EnderAI.MODID, name = EnderAI.NAME, version = EnderAI.VERSION, acceptedMinecraftVersions = "1.8.9")
public class EnderAI {
	
	public static final String MODID = "enderai";
    public static final String NAME = "Ender AI";
    public static final String VERSION = "1.0.0";

    @Instance(EnderAI.MODID)
    public static EnderAI instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
    
    @SidedProxy(clientSide = "com.xDGCSJdMC.enderai.client.ClientProxy", 
            serverSide = "com.xDGCSJdMC.enderai.common.CommonProxy")
    public static CommonProxy proxy;
}
