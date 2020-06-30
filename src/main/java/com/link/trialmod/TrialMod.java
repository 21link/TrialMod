package com.link.trialmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = TrialMod.MODID, name = TrialMod.NAME, version = TrialMod.VERSION)
public class TrialMod
{
    public static final String MODID = "trialmod";
    public static final String NAME = "Trial Mod";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(TrialMod.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	LOGGER.info(TrialMod.NAME + " says hi!");
    }
    
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
        
	}
}
