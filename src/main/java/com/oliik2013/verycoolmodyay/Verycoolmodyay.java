package com.oliik2013.verycoolmodyay;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Verycoolmodyay implements ModInitializer {
	public static final String MOD_ID = "verycoolmodyay";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}