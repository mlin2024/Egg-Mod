package com.cerebralvortex.egg.mod.registry;

import com.cerebralvortex.egg.mod.EggMod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

	public static final Block EGG_BLOCK = new Block(FabricBlockSettings
			.of(Material.EGG) // Sound when placed/broken
			.strength(0f, 0f)
			.sounds(BlockSoundGroup.SNOW)); // Sound when walked on
	
	public static void registerBlocks() {
		Registry.register(Registry.BLOCK, new Identifier(EggMod.MOD_ID, "egg_block"), EGG_BLOCK);
	}
}
