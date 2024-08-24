
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package toaw.init;

import toaw.item.StupkaItem;
import toaw.item.PressedmetterItem;
import toaw.item.MatterItem;
import toaw.item.Flakon5Item;
import toaw.item.Flakon4Item;
import toaw.item.Flakon3Item;
import toaw.item.Flakon2Item;
import toaw.item.FlaconItem;
import toaw.item.BottleinkItem;

import toaw.TechnologiesOfAnotherWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class TechnologiesOfAnotherWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TechnologiesOfAnotherWorldMod.MODID);
	public static final RegistryObject<Item> MATTER = REGISTRY.register("matter", () -> new MatterItem());
	public static final RegistryObject<Item> CRYSTALSPAWNEMPTY = block(TechnologiesOfAnotherWorldModBlocks.CRYSTALSPAWNEMPTY);
	public static final RegistryObject<Item> CRYTALEMPTY = block(TechnologiesOfAnotherWorldModBlocks.CRYTALEMPTY);
	public static final RegistryObject<Item> PRESSEDMETTER = REGISTRY.register("pressedmetter", () -> new PressedmetterItem());
	public static final RegistryObject<Item> ENCH = block(TechnologiesOfAnotherWorldModBlocks.ENCH);
	public static final RegistryObject<Item> BOTTLEINK = REGISTRY.register("bottleink", () -> new BottleinkItem());
	public static final RegistryObject<Item> STUPKA = REGISTRY.register("stupka", () -> new StupkaItem());
	public static final RegistryObject<Item> FLACON = REGISTRY.register("flacon", () -> new FlaconItem());
	public static final RegistryObject<Item> FLAKON_2 = REGISTRY.register("flakon_2", () -> new Flakon2Item());
	public static final RegistryObject<Item> FLAKON_3 = REGISTRY.register("flakon_3", () -> new Flakon3Item());
	public static final RegistryObject<Item> FLAKON_4 = REGISTRY.register("flakon_4", () -> new Flakon4Item());
	public static final RegistryObject<Item> FLAKON_5 = REGISTRY.register("flakon_5", () -> new Flakon5Item());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
