
package itrymz.randomitems.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import itrymz.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class ItemEmeraldArmor extends ElementsRandomItems.ModElement {
	@GameRegistry.ObjectHolder("randomitems:emeraldarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("randomitems:emeraldarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("randomitems:emeraldarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("randomitems:emeraldarmorboots")
	public static final Item boots = null;
	public ItemEmeraldArmor(ElementsRandomItems instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALDARMOR", "randomitems:emerald", 150, new int[]{20, 60, 50, 20}, 90,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emeraldarmorhelmet")
				.setRegistryName("emeraldarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emeraldarmorbody")
				.setRegistryName("emeraldarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emeraldarmorlegs")
				.setRegistryName("emeraldarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emeraldarmorboots")
				.setRegistryName("emeraldarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("randomitems:emeraldarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("randomitems:emeraldarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("randomitems:emeraldarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("randomitems:emeraldarmorboots", "inventory"));
	}
}
