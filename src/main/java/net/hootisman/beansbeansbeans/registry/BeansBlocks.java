package net.hootisman.beansbeansbeans.registry;

import net.hootisman.beansbeansbeans.block.BeanBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class BeansBlocks {
    public static final BeanBlock BEAN_BLOCK = new BeanBlock(FabricBlockSettings.of(Material.PLANT));
}
