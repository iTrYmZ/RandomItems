
package ap1x.randomitems.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import ap1x.randomitems.creativetab.TabRandomItems;
import ap1x.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class ItemLavaPickaxe extends ElementsRandomItems.ModElement {
	@GameRegistry.ObjectHolder("randomitems:lavapickaxe")
	public static final Item block = null;
	public ItemLavaPickaxe(ElementsRandomItems instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("LAVAPICKAXE", 10, 0, 500f, 0f, 2)) {
			{
				this.attackSpeed = -3.9f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 10);
				return ret.keySet();
			}
		}.setUnlocalizedName("lavapickaxe").setRegistryName("lavapickaxe").setCreativeTab(TabRandomItems.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("randomitems:lavapickaxe", "inventory"));
	}
}
