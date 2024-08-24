
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package toaw.init;

import toaw.TechnologiesOfAnotherWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TechnologiesOfAnotherWorldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TechnologiesOfAnotherWorldMod.MODID);
	public static final RegistryObject<CreativeModeTab> TAB = REGISTRY.register("tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.technologies_of_another_world.tab")).icon(() -> new ItemStack(TechnologiesOfAnotherWorldModItems.MATTER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TechnologiesOfAnotherWorldModBlocks.CRYSTALSPAWNEMPTY.get().asItem());
				tabData.accept(TechnologiesOfAnotherWorldModBlocks.CRYTALEMPTY.get().asItem());
				tabData.accept(TechnologiesOfAnotherWorldModBlocks.ENCH.get().asItem());
				tabData.accept(TechnologiesOfAnotherWorldModItems.BOTTLEINK.get());
				tabData.accept(TechnologiesOfAnotherWorldModItems.STUPKA.get());
				tabData.accept(TechnologiesOfAnotherWorldModItems.FLACON.get());
				tabData.accept(TechnologiesOfAnotherWorldModItems.FLAKON_2.get());
				tabData.accept(TechnologiesOfAnotherWorldModItems.FLAKON_3.get());
				tabData.accept(TechnologiesOfAnotherWorldModItems.FLAKON_4.get());
				tabData.accept(TechnologiesOfAnotherWorldModItems.FLAKON_5.get());
			})

					.build());
}
