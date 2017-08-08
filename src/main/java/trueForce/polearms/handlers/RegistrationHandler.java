package trueForce.polearms.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trueForce.polearms.item.ModItems;

/**
 * Created by Consular on 8/6/2017.
 */
@Mod.EventBusSubscriber
public class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());

        }
}
