package net.quiver.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.quiver.tutorialmod.block.ModBlocks;
import net.quiver.tutorialmod.item.ModItemGroups;
import net.quiver.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//very important comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}