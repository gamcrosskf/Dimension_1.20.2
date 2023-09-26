package net.gamcross.eko;

import net.fabricmc.api.ModInitializer;
import net.gamcross.eko.world.dimension.EkoDimensions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EkoMod implements ModInitializer {
	public static final String MOD_ID = "ekomod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		EkoDimensions.register();
	}
}
