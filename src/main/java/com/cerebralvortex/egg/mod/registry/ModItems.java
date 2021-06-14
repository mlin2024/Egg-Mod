package com.cerebralvortex.egg.mod.registry;

import com.cerebralvortex.egg.mod.EggMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	
	public static final SpecialEgg SPECIAL_EGG = new SpecialEgg(new Item.Settings().group(ItemGroup.FOOD).maxCount(16));
	
	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(EggMod.MOD_ID, "special_egg"), SPECIAL_EGG);
	}
}