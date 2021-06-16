package com.cerebralvortex.egg.mod.registry;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EggToolMaterial implements ToolMaterial {
	
    public static final EggToolMaterial INSTANCE = new EggToolMaterial();

	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		// TODO Auto-generated method stub
		return 2.0F;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return 0.0F;
	}

	@Override
	public int getMiningLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.ofItems(Items.EGG);
	}

}
