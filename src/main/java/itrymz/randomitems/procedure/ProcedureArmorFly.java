package itrymz.randomitems.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import itrymz.randomitems.item.ItemLavaObsidianArmor;
import itrymz.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class ProcedureArmorFly extends ElementsRandomItems.ModElement {
	public ProcedureArmorFly(ElementsRandomItems instance) {
		super(instance, 53);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ArmorFly!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemLavaObsidianArmor.boots, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).capabilities.allowFlying = (true);
				((EntityPlayer) entity).sendPlayerAbilities();
			}
		} else if ((!(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemLavaObsidianArmor.boots, (int) (1)).getItem()))) {
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).capabilities.allowFlying = (false);
				((EntityPlayer) entity).sendPlayerAbilities();
			}
		}
	}
}
