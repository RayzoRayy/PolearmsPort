package trueForce.polearms.item;


import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.registries.IForgeRegistry;
import trueForce.polearms.Polearms;

public class ModItems {

	private static Item itemIronSpear = new Spear("iron_spear", ToolMaterial.IRON);
	private static Item itemWoodenSpear = new Spear("wooden_spear", ToolMaterial.WOOD);
	private static Item itemStoneSpear = new Spear("stone_spear", ToolMaterial.STONE);
	private static Item itemDiamondSpear = new Spear("diamond_spear", ToolMaterial.DIAMOND);
	private static Item itemGoldenSpear = new Spear("golden_spear", ToolMaterial.GOLD);
	private static Item itemPole = new Pole("pole");


	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(


				itemPole,
				itemDiamondSpear,
				itemGoldenSpear,
				itemIronSpear,
				itemStoneSpear,
				itemWoodenSpear

				);

	}

	public static void registerRenders() {
		registerRender(itemPole);
		registerRender(itemDiamondSpear);
		registerRender(itemGoldenSpear);
		registerRender(itemIronSpear);
		registerRender(itemStoneSpear);
		registerRender(itemWoodenSpear);
	}


    public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Polearms.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

}

