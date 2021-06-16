package com.cerebralvortex.egg.mod.registry;

import com.cerebralvortex.egg.mod.EggMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	
	// Items
	public static final SpecialEgg SPECIAL_EGG = new SpecialEgg(new Item.Settings().group(EggMod.EGG_ITEMS).maxCount(16));
	public static final EggPickaxe EGG_PICKAXE = new EggPickaxe(EggToolMaterial.INSTANCE, 1, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
	
	// Blocks
	public static final BlockItem EGG_BLOCK = new BlockItem(ModBlocks.EGG_BLOCK, new Item.Settings().group(EggMod.EGG_ITEMS));
	
	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(EggMod.MOD_ID, "special_egg"), SPECIAL_EGG);
		Registry.register(Registry.ITEM, new Identifier(EggMod.MOD_ID, "egg_block"), EGG_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(EggMod.MOD_ID, "egg_pickaxe"), EGG_PICKAXE);
	}
}