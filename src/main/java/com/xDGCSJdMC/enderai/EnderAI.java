package com.xDGCSJdMC.enderai;

import com.xDGCSJdMC.enderai.init.ModRecipes;
import com.xDGCSJdMC.enderai.proxy.CommonProxy;
import com.xDGCSJdMC.enderai.tabs.EnderAllTab;
import com.xDGCSJdMC.enderai.util.Reference;
import com.xDGCSJdMC.enderai.util.handlers.RegistryHandler;

import com.xDGCSJdMC.enderai.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFTVERSIONS)
public class EnderAI {

    @Instance
    public static EnderAI instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){

        RegistryHandler.preInitRegisttries();
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public void Init(FMLInitializationEvent event){

        ModRecipes.init();
    	
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event){
 
    }
    
    public static CreativeTabs ENDER_AI = new EnderAllTab();
    
}
