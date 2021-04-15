
package ap1x.randomitems.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import ap1x.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class ItemEmeraldShovel extends ElementsRandomItems.ModElement {
	@GameRegistry.ObjectHolder("randomitems:emeraldshovel")
	public static final Item block = null;
	public ItemEmeraldShovel(ElementsRandomItems instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("EMERALDSHOVEL", 20, 6280, 24f, 16f, 140)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 20);
				return ret.keySet();
			}
		}.setUnlocalizedName("emeraldshovel").setRegistryName("emeraldshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("randomitems:emeraldshovel", "inventory"));
	}
}
