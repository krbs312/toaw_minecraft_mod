package toaw.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PowerProcedure {
	public static void execute(ItemStack itemstack) {
		double a = 0;
		if (a <= 30) {
			a = Mth.nextInt(RandomSource.create(), 40, 250);
			itemstack.getOrCreateTag().putDouble("power", a);
		}
	}
}
