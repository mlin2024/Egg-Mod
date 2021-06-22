package com.cerebralvortex.egg.mod.registry;

import com.cerebralvortex.egg.mod.EggMod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.Material;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	public static FlowableFluid STILL_YOLK;
	public static FlowableFluid FLOWING_YOLK;
	public static Block YOLK;

	public static final EggBlock EGG_BLOCK = new EggBlock(FabricBlockSettings
			.of(Material.EGG) // Sound when placed/broken
			.strength(0f, 0f)
			.sounds(BlockSoundGroup.SNOW)); // Sound when walked on
	
	public static void registerBlocks() {
		Registry.register(Registry.BLOCK, new Identifier(EggMod.MOD_ID, "egg_block"), EGG_BLOCK);
		
		// Yolk
		STILL_YOLK = Registry.register(Registry.FLUID, new Identifier(EggMod.MOD_ID, "yolk_flow"), new YolkFluid.Still());
		FLOWING_YOLK = Registry.register(Registry.FLUID, new Identifier(EggMod.MOD_ID, "yolk_still"), new YolkFluid.Flowing());
		YOLK = Registry.register(Registry.BLOCK, new Identifier(EggMod.MOD_ID, "yolk"), new FluidBlock(STILL_YOLK, FabricBlockSettings.copy(Blocks.WATER)){});
	}
}
