package net.hootisman.beansbeansbeans;

import net.fabricmc.api.ClientModInitializer;
import net.hootisman.beansbeansbeans.item.BeansAllItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;

import net.minecraft.util.Identifier;

public class BeansClientInit implements ClientModInitializer{

    @Override
    public void onInitializeClient(){
        ModelPredicateProviderRegistry.register(BeansAllItems.BEAN_ITEM, new Identifier("bean_count"), (stack, world, entity, seed)->{
            return ((float)stack.getCount())/((float)stack.getMaxCount());
        });
    }
}
