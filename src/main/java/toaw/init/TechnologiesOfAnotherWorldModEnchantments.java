
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package toaw.init;

import toaw.enchantment.SilcEnchantment;

import toaw.TechnologiesOfAnotherWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class TechnologiesOfAnotherWorldModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TechnologiesOfAnotherWorldMod.MODID);
	public static final RegistryObject<Enchantment> SILC = REGISTRY.register("silc", () -> new SilcEnchantment());
}
