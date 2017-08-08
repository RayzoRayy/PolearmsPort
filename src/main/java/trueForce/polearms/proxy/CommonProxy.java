package trueForce.polearms.proxy;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import trueForce.polearms.EventHandler;
import trueForce.polearms.Polearms;
import trueForce.polearms.handlers.RegistrationHandler;
import trueForce.polearms.network.MessageExtendedReachAttack;



public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {

	}
	
	public void init(FMLInitializationEvent e) {

		registerRenders();
		registerRegistrationHandler();
		registerNetworkChannel();
		registerEventListeners();
	
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}

	public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx) {
		return ctx.getServerHandler().player; // fingers crossed this works... It does. Probably not the best way of doing it, tho
	}


	private void registerEventListeners()
	{
		// DEBUG
		Polearms.logger.info("Registering event listeners");
		MinecraftForge.EVENT_BUS.register(new EventHandler());

		// some events, especially tick, are handled on FML bus
		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}
	
	private void registerNetworkChannel() {
		Polearms.network = NetworkRegistry.INSTANCE.newSimpleChannel(Polearms.NETWORK_CHANNEL_NAME);
		int packetId = 0;
		// register messages from client to server
		Polearms.network.registerMessage(MessageExtendedReachAttack.Handler.class, MessageExtendedReachAttack.class, packetId++, Side.SERVER);
	}

	private void registerRegistrationHandler() {
		MinecraftForge.EVENT_BUS.register(new RegistrationHandler());
	}

	public void registerRenders() {//Renders the models in game
	}

}
