
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package toaw.init;

import toaw.block.EnchBlock;
import toaw.block.CrytalemptyBlock;
import toaw.block.CrystalspawnemptyBlock;

import toaw.TechnologiesOfAnotherWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class TechnologiesOfAnotherWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TechnologiesOfAnotherWorldMod.MODID);
	public static final RegistryObject<Block> CRYSTALSPAWNEMPTY = REGISTRY.register("crystalspawnempty", () -> new CrystalspawnemptyBlock());
	public static final RegistryObject<Block> CRYTALEMPTY = REGISTRY.register("crytalempty", () -> new CrytalemptyBlock());
	public static final RegistryObject<Block> ENCH = REGISTRY.register("ench", () -> new EnchBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
