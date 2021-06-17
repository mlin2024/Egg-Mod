package com.cerebralvortex.egg.mod.registry;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class EggSword extends SwordItem {

	public EggSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
		super(toolMaterial, attackDamage, attackSpeed, settings);
	}
}
