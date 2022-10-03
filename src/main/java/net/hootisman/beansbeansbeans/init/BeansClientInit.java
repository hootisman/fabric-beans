package net.hootisman.beansbeansbeans.init;

import net.fabricmc.api.ClientModInitializer;
import net.hootisman.beansbeansbeans.registry.BeansItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;

import net.minecraft.util.Identifier;

public class BeansClientInit implements ClientModInitializer{

    @Override
    public void onInitializeClient(){
        ModelPredicateProviderRegistry.register(BeansItems.BEAN_ITEM, new Identifier("bean_count"), (stack, world, entity, seed)->{
            return ((float)stack.getCount())/((float)stack.getMaxCount());
        });
    }
}
