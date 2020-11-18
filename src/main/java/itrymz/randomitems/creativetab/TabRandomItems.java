
package itrymz.randomitems.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import itrymz.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class TabRandomItems extends ElementsRandomItems.ModElement {
	public TabRandomItems(ElementsRandomItems instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabrandomitems") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.MAGMA, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
