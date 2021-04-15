
package ap1x.randomitems.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import ap1x.randomitems.procedure.ProcedureNightVisionEffect;
import ap1x.randomitems.creativetab.TabRandomItems;
import ap1x.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class ItemLavaObsidianArmor extends ElementsRandomItems.ModElement {
	@GameRegistry.ObjectHolder("randomitems:lavaobsidianarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("randomitems:lavaobsidianarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("randomitems:lavaobsidianarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("randomitems:lavaobsidianarmorboots")
	public static final Item boots = null;
	public ItemLavaObsidianArmor(ElementsRandomItems instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("LAVAOBSIDIANARMOR", "randomitems:lavaobsidianarmor", 500,
				new int[]{12, 15, 16, 12}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureNightVisionEffect.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("lavaobsidianarmorhelmet").setRegistryName("lavaobsidianarmorhelmet").setCreativeTab(TabRandomItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("lavaobsidianarmorbody")
				.setRegistryName("lavaobsidianarmorbody").setCreativeTab(TabRandomItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("lavaobsidianarmorlegs")
				.setRegistryName("lavaobsidianarmorlegs").setCreativeTab(TabRandomItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("lavaobsidianarmorboots")
				.setRegistryName("lavaobsidianarmorboots").setCreativeTab(TabRandomItems.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("randomitems:lavaobsidianarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("randomitems:lavaobsidianarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("randomitems:lavaobsidianarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("randomitems:lavaobsidianarmorboots", "inventory"));
	}
}
