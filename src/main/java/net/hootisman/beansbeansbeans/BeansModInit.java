package net.hootisman.beansbeansbeans;

import net.fabricmc.api.ModInitializer;
import net.hootisman.beansbeansbeans.registry.BeansBlocks;
import net.hootisman.beansbeansbeans.registry.BeansItems;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeansModInit implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("beansbeansbeans");
	

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("beansbeansbeans","bean_item"), BeansItems.BEAN_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("beansbeansbeans","bean_block"), BeansBlocks.BEAN_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("beansbeansbeans", "bean_block_item"), BeansItems.BEAN_BLOCK_ITEM);
		LOGGER.info("Hello Fabric world!");
	}
}
