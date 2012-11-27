package keepcalm.mods.blockbreaksample;

import java.util.logging.Logger;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid="BlockBreakTutorial",name="Sample Block Break Mod",version="1.4.5")
public class BlockBreakMain {
	
	public static Logger logger;
	
	@PreInit
	public void preinit(FMLPreInitializationEvent ev) {
		logger = ev.getModLog();
	}
	
	@Init
	public void init(FMLInitializationEvent ev) {
		
		MinecraftForge.EVENT_BUS.register(new BlockBreakHandler());
	}
}
