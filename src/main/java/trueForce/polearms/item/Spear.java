package trueForce.polearms.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Spear extends ItemSword implements IExtendedReach {
	public Spear(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabs.COMBAT);

		setUnlocalizedName(name);
		setRegistryName(name);
	}
	@Override
	public float getReach() {
		return 7.0F;// Seven blocks of reach, up from the player's usual 5.
	}
}
