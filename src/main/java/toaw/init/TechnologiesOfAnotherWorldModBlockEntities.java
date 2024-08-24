
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package toaw.init;

import toaw.block.entity.EnchBlockEntity;

import toaw.TechnologiesOfAnotherWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class TechnologiesOfAnotherWorldModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TechnologiesOfAnotherWorldMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ENCH = register("ench", TechnologiesOfAnotherWorldModBlocks.ENCH, EnchBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
