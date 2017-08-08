package trueForce.polearms;

import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import trueForce.polearms.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = Polearms.MODID, name = Polearms.MODNAME, version = Polearms.VERSION, acceptedMinecraftVersions = Polearms.MC_VERSION)
public class Polearms {
	
	public static final String MODID = "polearms";
	public static final String MODNAME = "Polearms";
	public static final String VERSION = "2.1";
	public static final String MC_VERSION = "1.12";
	public static final String NETWORK_CHANNEL_NAME = "polearms";

	@Instance
	public static Polearms instance = new Polearms();
	
	@SidedProxy(clientSide = "trueForce.polearms.proxy.ClientProxy", serverSide = "trueForce.polearms.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static Logger logger = LogManager.getLogger(MODID);
	
	public static SimpleNetworkWrapper network;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	    MinecraftForge.EVENT_BUS.register(instance);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
