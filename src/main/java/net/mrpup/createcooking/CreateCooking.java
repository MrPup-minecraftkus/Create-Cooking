package net.mrpup.createcooking;

import net.fabricmc.api.ModInitializer;

import net.mrpup.createcooking.block.ModBlocks;
import net.mrpup.createcooking.fluid.ModFluids;
import net.mrpup.createcooking.item.CustomLoot;
import net.mrpup.createcooking.item.ModItemGroups;
import net.mrpup.createcooking.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCooking implements ModInitializer {
	public static final String MOD_ID = "create_cooking";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModFluids.register();
		CustomLoot.register();
	}
}