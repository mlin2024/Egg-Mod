package com.cerebralvortex.egg.example.mod.registry;

import com.cerebralvortex.egg.example.mod.EggExampleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	
	public static final SpecialEgg SPECIAL_EGG = new SpecialEgg(new Item.Settings().group(ItemGroup.FOOD).maxCount(16));
	
	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(EggExampleMod.MOD_ID, "special_egg"), SPECIAL_EGG);
	}
}