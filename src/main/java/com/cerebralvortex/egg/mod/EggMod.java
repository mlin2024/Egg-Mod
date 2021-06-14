package com.cerebralvortex.egg.mod;

import com.cerebralvortex.egg.mod.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class EggMod implements ModInitializer{

	public static final String MOD_ID = "egg";
	
	@Override
	public void onInitialize() {
		// TODO Auto-generated method stub
		ModItems.registerItems();
	}
}
