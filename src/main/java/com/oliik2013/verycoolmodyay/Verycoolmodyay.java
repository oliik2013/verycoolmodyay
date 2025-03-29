package com.oliik2013.verycoolmodyay;

import com.oliik2013.verycoolmodyay.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Verycoolmodyay implements ModInitializer {
	public static final String MOD_ID = "verycoolmodyay";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		LOGGER.info("verycoolmod loaded");
	}
}