package com.cerebralvortex.egg.mod;

import com.cerebralvortex.egg.mod.registry.ModBlocks;
import com.cerebralvortex.egg.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class EggMod implements ModInitializer{

	public static final String MOD_ID = "egg";
	
	public static final ItemGroup EGG_ITEMS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "egg_items"), () -> new ItemStack(ModItems.SPECIAL_EGG));
	
	@Override
	public void onInitialize() {
		// TODO Auto-generated method stub
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
