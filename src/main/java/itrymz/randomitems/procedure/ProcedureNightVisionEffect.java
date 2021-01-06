package itrymz.randomitems.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import itrymz.randomitems.item.ItemLavaObsidianArmor;
import itrymz.randomitems.item.ItemEmeraldArmor;
import itrymz.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class ProcedureNightVisionEffect extends ElementsRandomItems.ModElement {
	public ProcedureNightVisionEffect(ElementsRandomItems instance) {
		super(instance, 51);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NightVisionEffect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemLavaObsidianArmor.helmet, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 999999, (int) 1, (false), (false)));
		}
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemEmeraldArmor.helmet, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 999999, (int) 1, (false), (false)));
		}
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 1, (int) 1, (false), (false)));
		}
	}
}
