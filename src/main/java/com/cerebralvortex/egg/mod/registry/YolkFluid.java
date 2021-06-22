package com.cerebralvortex.egg.mod.registry;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public abstract class YolkFluid extends AbstractFluid {
	@Override
	public Fluid getStill() {
		return ModBlocks.STILL_YOLK;
	}
 
	@Override
	public Fluid getFlowing() {
		return ModBlocks.FLOWING_YOLK;
	}
 
	@Override
	public Item getBucketItem() {
		return ModItems.YOLK_BUCKET;
	}
 
	@Override
	protected BlockState toBlockState(FluidState fluidState) {
		// method_15741 converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
		return ModBlocks.YOLK.getDefaultState().with(Properties.LEVEL_15, method_15741(fluidState));
	}
	
	@Nullable
	@Environment(EnvType.CLIENT)
	public ParticleEffect getParticle() {
		return ParticleTypes.DRIPPING_HONEY;
	}
 
	public static class Flowing extends YolkFluid {
		@Override
		protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
			super.appendProperties(builder);
			builder.add(LEVEL);
		}
 
		@Override
		public int getLevel(FluidState fluidState) {
			return fluidState.get(LEVEL);
		}
 
		@Override
		public boolean isStill(FluidState fluidState) {
			return false;
		}
	}
 
	public static class Still extends YolkFluid {
		@Override
		public int getLevel(FluidState fluidState) {
			return 8;
		}
 
		@Override
		public boolean isStill(FluidState fluidState) {
			return true;
		}
	}
}