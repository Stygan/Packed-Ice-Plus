package com.stygan.packediceplus.init;

import com.stygan.packediceplus.PackedIce;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(PackedIce.MOD_ID)
@Mod.EventBusSubscriber(modid = PackedIce.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final Block ice_stairs = null;
	public static final Block ice_slab = null;
	public static final Block ice_wall = null;
	public static final Block blue_ice_stairs = null;
	public static final Block blue_ice_slab = null;
	public static final Block blue_ice_wall = null;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry()
				.register(new StairsBlock(Blocks.PACKED_ICE::getDefaultState, Block.Properties.from(Blocks.PACKED_ICE))
						.setRegistryName("ice_stairs"));
		event.getRegistry()
				.register(new SlabBlock(Block.Properties.from(Blocks.PACKED_ICE)).setRegistryName("ice_slab"));
		event.getRegistry()
				.register(new WallBlock(Block.Properties.from(Blocks.PACKED_ICE)).setRegistryName("ice_wall"));
		event.getRegistry()
				.register(new StairsBlock(Blocks.BLUE_ICE::getDefaultState, Block.Properties.from(Blocks.BLUE_ICE))
						.setRegistryName("blue_ice_stairs"));
		event.getRegistry()
				.register(new SlabBlock(Block.Properties.from(Blocks.BLUE_ICE)).setRegistryName("blue_ice_slab"));
		event.getRegistry()
				.register(new WallBlock(Block.Properties.from(Blocks.BLUE_ICE)).setRegistryName("blue_ice_wall"));
	}

	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(ice_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
				.setRegistryName("ice_stairs"));
		event.getRegistry().register(new BlockItem(ice_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
				.setRegistryName("ice_slab"));
		event.getRegistry().register(new BlockItem(ice_wall, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
				.setRegistryName("ice_wall"));
		event.getRegistry()
				.register(new BlockItem(blue_ice_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
						.setRegistryName("blue_ice_stairs"));
		event.getRegistry()
				.register(new BlockItem(blue_ice_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
						.setRegistryName("blue_ice_slab"));
		event.getRegistry()
				.register(new BlockItem(blue_ice_wall, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
						.setRegistryName("blue_ice_wall"));
	}
}
