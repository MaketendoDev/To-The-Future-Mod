package net.maketendo.to_the_future_mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToTheFutureMod implements ModInitializer {
	public static final String MOD_ID = "ttf";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Loaded " + MOD_ID + " Successfully!");
	}
}