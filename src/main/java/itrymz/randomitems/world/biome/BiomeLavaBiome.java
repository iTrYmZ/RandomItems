
package itrymz.randomitems.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;

import java.util.Random;

import itrymz.randomitems.ElementsRandomItems;

@ElementsRandomItems.ModElement.Tag
public class BiomeLavaBiome extends ElementsRandomItems.ModElement {
	@GameRegistry.ObjectHolder("randomitems:lavabiome")
	public static final BiomeGenCustom biome = null;
	public BiomeLavaBiome(ElementsRandomItems instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Lava Biome").setRainfall(0.5F).setBaseHeight(0.1F).setHeightVariation(0.2F).setTemperature(0.5F));
			setRegistryName("lavabiome");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.OBSIDIAN.getDefaultState();
			decorator.generateFalls = true;
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 4;
			decorator.grassPerChunk = 4;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
