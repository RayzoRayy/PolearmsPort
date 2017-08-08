package trueForce.polearms.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import trueForce.polearms.Polearms;

public class ModItems {

	private static Item itemIronSpear = new Spear("iron_spear", ToolMaterial.IRON);
	private static Item itemWoodSpear = new Spear("wood_spear", ToolMaterial.WOOD);
	private static Item itemStoneSpear = new Spear("stone_spear", ToolMaterial.STONE);
	private static Item itemDiamondSpear = new Spear("diamond_spear", ToolMaterial.DIAMOND);
	private static Item itemGoldSpear = new Spear("gold_spear", ToolMaterial.GOLD);
	private static Item itemPole = new Pole("pole");

	public static ItemStack pole;
	public static ItemStack diamondSpear;
	public static ItemStack goldSpear;
	public static ItemStack ironSpear;
	public static ItemStack stoneSpear;
	public static ItemStack woodSpear;

	public static void registerItems() {
		//Items
		GameRegistry.register(itemPole);
		//Spears alphabetical order
		GameRegistry.register(itemDiamondSpear);
		GameRegistry.register(itemGoldSpear);
		GameRegistry.register(itemIronSpear);
		GameRegistry.register(itemStoneSpear);
		GameRegistry.register(itemWoodSpear);

		//Items
		pole = new ItemStack(itemPole);
		//Spears
		diamondSpear = new ItemStack(itemDiamondSpear);
		goldSpear = new ItemStack(itemGoldSpear);
		ironSpear = new ItemStack(itemIronSpear);
		stoneSpear = new ItemStack(itemStoneSpear);
		woodSpear = new ItemStack(itemWoodSpear);
	}
}

