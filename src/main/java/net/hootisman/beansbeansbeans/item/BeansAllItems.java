package net.hootisman.beansbeansbeans.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class BeansAllItems {
    public static final BeanItem BEAN_ITEM = new BeanItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(41));
}
