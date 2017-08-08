package trueForce.polearms.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trueForce.polearms.item.ModItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {

		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);

	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {

		super.postInit(e);
	}


	public void registerRenders() {
	ModItems.registerRenders(); //Renders the models in game
	}

}
