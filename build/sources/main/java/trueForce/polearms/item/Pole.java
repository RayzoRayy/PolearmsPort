package trueForce.polearms.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Pole extends Item {
    Pole(String name) {
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName(name);
        setRegistryName(name);
    }


}
