package trueForce.polearms.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import trueForce.polearms.item.ModItems;


public class ItemRenderRegister {
    public static void registerItemRenderer() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(ModItems.woodSpear.getItem(), 0, new ModelResourceLocation("polearms:wood_spear", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(ModItems.stoneSpear.getItem(), 0, new ModelResourceLocation("polearms:stone_spear", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(ModItems.ironSpear.getItem(), 0, new ModelResourceLocation("polearms:iron_spear", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(ModItems.goldSpear.getItem(), 0, new ModelResourceLocation("polearms:gold_spear", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(ModItems.diamondSpear.getItem(), 0, new ModelResourceLocation("polearms:diamond_spear", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(ModItems.pole.getItem(), 0, new ModelResourceLocation("polearms:pole", "inventory"));
    }
}
