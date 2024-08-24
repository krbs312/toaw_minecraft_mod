
package toaw.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FlaconItem extends Item {
	public FlaconItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
