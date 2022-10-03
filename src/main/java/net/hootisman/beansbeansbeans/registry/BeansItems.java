package net.hootisman.beansbeansbeans.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hootisman.beansbeansbeans.item.BeanItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class BeansItems {
    public static final BeanItem BEAN_ITEM = new BeanItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(41));
    public static final BlockItem BEAN_BLOCK_ITEM = new BlockItem(BeansBlocks.BEAN_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).maxCount(34));
}
