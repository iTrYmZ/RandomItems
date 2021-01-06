package itrymz.randomitems.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import itrymz.randomitems.item.ItemModdedObsidianRemover;
import itrymz.randomitems.block.BlockMegaObsidian;
import itrymz.randomitems.block.BlockLavaObsidian;
import itrymz.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class ProcedureModdedObsidianRemoverEffect extends ElementsRandomItems.ModElement {
	public ProcedureModdedObsidianRemoverEffect(ElementsRandomItems instance) {
		super(instance, 51);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ModdedObsidianRemoverEffect!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ModdedObsidianRemoverEffect!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ModdedObsidianRemoverEffect!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ModdedObsidianRemoverEffect!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ModdedObsidianRemoverEffect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockMegaObsidian.block.getDefaultState().getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemModdedObsidianRemover.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLavaObsidian.block.getDefaultState().getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemModdedObsidianRemover.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		}
	}
}
