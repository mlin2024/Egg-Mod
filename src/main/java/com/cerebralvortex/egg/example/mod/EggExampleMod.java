package com.cerebralvortex.egg.example.mod;

import com.cerebralvortex.egg.example.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class EggExampleMod implements ModInitializer{

	public static final String MOD_ID = "egg";
	
	@Override
	public void onInitialize() {
		// TODO Auto-generated method stub
		ModItems.registerItems();
	}
}
