// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010 sk89q <http://www.sk89q.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.sk89q.worldedit.blocks;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.sk89q.util.StringUtil;
import com.sk89q.worldedit.PlayerDirection;


/**
 * Block types.
 *
 * @author sk89q
 */
public enum BlockType
{
	AIR(BlockID.AIR, "Air", "air"),
	STONE(BlockID.STONE, "Stone", "stone", "rock"),
	GRASS(BlockID.GRASS, "Grass", "grass"),
	DIRT(BlockID.DIRT, "Dirt", "dirt"),
	COBBLESTONE(BlockID.COBBLESTONE, "Cobblestone", "cobblestone", "cobble"),
	WOOD(BlockID.WOOD, "Wood", "wood", "woodplank", "plank", "woodplanks", "planks"),
	SAPLING(BlockID.SAPLING, "Sapling", "sapling", "seedling"),
	BEDROCK(BlockID.BEDROCK, "Bedrock", "adminium", "bedrock"),
	WATER(BlockID.WATER, "Water", "watermoving", "movingwater", "flowingwater", "waterflowing"),
	STATIONARY_WATER(BlockID.STATIONARY_WATER, "Water (stationary)", "water", "waterstationary", "stationarywater", "stillwater"),
	LAVA(BlockID.LAVA, "Lava", "lavamoving", "movinglava", "flowinglava", "lavaflowing"),
	STATIONARY_LAVA(BlockID.STATIONARY_LAVA, "Lava (stationary)", "lava", "lavastationary", "stationarylava", "stilllava"),
	SAND(BlockID.SAND, "Sand", "sand"),
	GRAVEL(BlockID.GRAVEL, "Gravel", "gravel"),
	GOLD_ORE(BlockID.GOLD_ORE, "Gold ore", "goldore"),
	IRON_ORE(BlockID.IRON_ORE, "Iron ore", "ironore"),
	COAL_ORE(BlockID.COAL_ORE, "Coal ore", "coalore"),
	LOG(BlockID.LOG, "Log", "log", "tree", "pine", "oak", "birch", "redwood"),
	LEAVES(BlockID.LEAVES, "Leaves", "leaves", "leaf"),
	SPONGE(BlockID.SPONGE, "Sponge", "sponge"),
	GLASS(BlockID.GLASS, "Glass", "glass"),
	LAPIS_LAZULI_ORE(BlockID.LAPIS_LAZULI_ORE, "Lapis lazuli ore", "lapislazuliore", "blueore", "lapisore"),
	LAPIS_LAZULI(BlockID.LAPIS_LAZULI_BLOCK, "Lapis lazuli", "lapislazuli", "lapislazuliblock", "bluerock"),
	DISPENSER(BlockID.DISPENSER, "Dispenser", "dispenser"),
	SANDSTONE(BlockID.SANDSTONE, "Sandstone", "sandstone"),
	NOTE_BLOCK(BlockID.NOTE_BLOCK, "Note block", "musicblock", "noteblock", "note", "music", "instrument"),
	BED(BlockID.BED, "Bed", "bed"),
	POWERED_RAIL(BlockID.POWERED_RAIL, "Powered Rail", "poweredrail", "boosterrail", "poweredtrack", "boostertrack", "booster"),
	DETECTOR_RAIL(BlockID.DETECTOR_RAIL, "Detector Rail", "detectorrail", "detector"),
	PISTON_STICKY_BASE(BlockID.PISTON_STICKY_BASE, "Sticky Piston", "stickypiston"),
	WEB(BlockID.WEB, "Web", "web", "spiderweb"),
	LONG_GRASS(BlockID.LONG_GRASS, "Long grass", "longgrass", "tallgrass"),
	DEAD_BUSH(BlockID.DEAD_BUSH, "Shrub", "deadbush", "shrub", "deadshrub", "tumbleweed"),
	PISTON_BASE(BlockID.PISTON_BASE, "Piston", "piston"),
	PISTON_EXTENSION(BlockID.PISTON_EXTENSION, "Piston extension", "pistonextendsion", "pistonhead"),
	CLOTH(BlockID.CLOTH, "Wool", "cloth", "wool"),
	PISTON_MOVING_PIECE(BlockID.PISTON_MOVING_PIECE, "Piston moving piece", "movingpiston"),
	YELLOW_FLOWER(BlockID.YELLOW_FLOWER, "Yellow flower", "yellowflower", "flower"),
	RED_FLOWER(BlockID.RED_FLOWER, "Red rose", "redflower", "redrose", "rose"),
	BROWN_MUSHROOM(BlockID.BROWN_MUSHROOM, "Brown mushroom", "brownmushroom", "mushroom"),
	RED_MUSHROOM(BlockID.RED_MUSHROOM, "Red mushroom", "redmushroom"),
	GOLD_BLOCK(BlockID.GOLD_BLOCK, "Gold block", "gold", "goldblock"),
	IRON_BLOCK(BlockID.IRON_BLOCK, "Iron block", "iron", "ironblock"),
	DOUBLE_STEP(BlockID.DOUBLE_STEP, "Double step", "doubleslab", "doublestoneslab", "doublestep"),
	STEP(BlockID.STEP, "Step", "slab", "stoneslab", "step", "halfstep"),
	BRICK(BlockID.BRICK, "Brick", "brick", "brickblock"),
	TNT(BlockID.TNT, "TNT", "tnt", "c4", "explosive"),
	BOOKCASE(BlockID.BOOKCASE, "Bookcase", "bookshelf", "bookshelves", "bookcase", "bookcases"),
	MOSSY_COBBLESTONE(BlockID.MOSSY_COBBLESTONE, "Cobblestone (mossy)", "mossycobblestone", "mossstone", "mossystone", "mosscobble", "mossycobble", "moss", "mossy", "sossymobblecone"),
	OBSIDIAN(BlockID.OBSIDIAN, "Obsidian", "obsidian"),
	TORCH(BlockID.TORCH, "Torch", "torch", "light", "candle"),
	FIRE(BlockID.FIRE, "Fire", "fire", "flame", "flames"),
	MOB_SPAWNER(BlockID.MOB_SPAWNER, "Mob spawner", "mobspawner", "spawner"),
	WOODEN_STAIRS(BlockID.WOODEN_STAIRS, "Wooden stairs", "woodstair", "woodstairs", "woodenstair", "woodenstairs"),
	CHEST(BlockID.CHEST, "Chest", "chest", "storage", "storagechest"),
	REDSTONE_WIRE(BlockID.REDSTONE_WIRE, "Redstone wire", "redstone", "redstoneblock"),
	DIAMOND_ORE(BlockID.DIAMOND_ORE, "Diamond ore", "diamondore"),
	DIAMOND_BLOCK(BlockID.DIAMOND_BLOCK, "Diamond block", "diamond", "diamondblock"),
	WORKBENCH(BlockID.WORKBENCH, "Workbench", "workbench", "table", "craftingtable", "crafting"),
	CROPS(BlockID.CROPS, "Crops", "crops", "crop", "plant", "plants"),
	SOIL(BlockID.SOIL, "Soil", "soil", "farmland"),
	FURNACE(BlockID.FURNACE, "Furnace", "furnace"),
	BURNING_FURNACE(BlockID.BURNING_FURNACE, "Furnace (burning)", "burningfurnace", "litfurnace"),
	SIGN_POST(BlockID.SIGN_POST, "Sign post", "sign", "signpost"),
	WOODEN_DOOR(BlockID.WOODEN_DOOR, "Wooden door", "wooddoor", "woodendoor", "door"),
	LADDER(BlockID.LADDER, "Ladder", "ladder"),
	MINECART_TRACKS(BlockID.MINECART_TRACKS, "Minecart tracks", "track", "tracks", "minecrattrack", "minecarttracks", "rails", "rail"),
	COBBLESTONE_STAIRS(BlockID.COBBLESTONE_STAIRS, "Cobblestone stairs", "cobblestonestair", "cobblestonestairs", "cobblestair", "cobblestairs"),
	WALL_SIGN(BlockID.WALL_SIGN, "Wall sign", "wallsign"),
	LEVER(BlockID.LEVER, "Lever", "lever", "switch", "stonelever", "stoneswitch"),
	STONE_PRESSURE_PLATE(BlockID.STONE_PRESSURE_PLATE, "Stone pressure plate", "stonepressureplate", "stoneplate"),
	IRON_DOOR(BlockID.IRON_DOOR, "Iron Door", "irondoor"),
	WOODEN_PRESSURE_PLATE(BlockID.WOODEN_PRESSURE_PLATE, "Wooden pressure plate", "woodpressureplate", "woodplate", "woodenpressureplate", "woodenplate", "plate", "pressureplate"),
	REDSTONE_ORE(BlockID.REDSTONE_ORE, "Redstone ore", "redstoneore"),
	GLOWING_REDSTONE_ORE(BlockID.GLOWING_REDSTONE_ORE, "Glowing redstone ore", "glowingredstoneore"),
	REDSTONE_TORCH_OFF(BlockID.REDSTONE_TORCH_OFF, "Redstone torch (off)", "redstonetorchoff", "rstorchoff"),
	REDSTONE_TORCH_ON(BlockID.REDSTONE_TORCH_ON, "Redstone torch (on)", "redstonetorch", "redstonetorchon", "rstorchon", "redtorch"),
	STONE_BUTTON(BlockID.STONE_BUTTON, "Stone Button", "stonebutton", "button"),
	SNOW(BlockID.SNOW, "Snow", "snow"),
	ICE(BlockID.ICE, "Ice", "ice"),
	SNOW_BLOCK(BlockID.SNOW_BLOCK, "Snow block", "snowblock"),
	CACTUS(BlockID.CACTUS, "Cactus", "cactus", "cacti"),
	CLAY(BlockID.CLAY, "Clay", "clay"),
	SUGAR_CANE(BlockID.REED, "Reed", "reed", "cane", "sugarcane", "sugarcanes", "vine", "vines"),
	JUKEBOX(BlockID.JUKEBOX, "Jukebox", "jukebox", "stereo", "recordplayer"),
	FENCE(BlockID.FENCE, "Fence", "fence"),
	PUMPKIN(BlockID.PUMPKIN, "Pumpkin", "pumpkin"),
	NETHERRACK(BlockID.NETHERRACK, "Netherrack", "redmossycobblestone", "redcobblestone", "redmosstone", "redcobble", "netherstone", "netherrack", "nether", "hellstone"),
	SOUL_SAND(BlockID.SLOW_SAND, "Soul sand", "slowmud", "mud", "soulsand", "hellmud"),
	GLOWSTONE(BlockID.LIGHTSTONE, "Glowstone", "brittlegold", "glowstone", "lightstone", "brimstone", "australium"),
	PORTAL(BlockID.PORTAL, "Portal", "portal"),
	JACK_O_LANTERN(BlockID.JACKOLANTERN, "Pumpkin (on)", "pumpkinlighted", "pumpkinon", "litpumpkin", "jackolantern"),
	CAKE(BlockID.CAKE_BLOCK, "Cake", "cake", "cakeblock"),
	REDSTONE_REPEATER_OFF(BlockID.REDSTONE_REPEATER_OFF, "Redstone repeater (off)", "diodeoff", "redstonerepeater", "repeateroff", "delayeroff"),
	REDSTONE_REPEATER_ON(BlockID.REDSTONE_REPEATER_ON, "Redstone repeater (on)", "diodeon", "redstonerepeateron", "repeateron", "delayeron"),
	LOCKED_CHEST(BlockID.LOCKED_CHEST, "Locked chest", "lockedchest", "steveco", "supplycrate", "valveneedstoworkonep3nottf2kthx"),
	TRAP_DOOR(BlockID.TRAP_DOOR, "Trap door", "trapdoor", "hatch", "floordoor"),
	SILVERFISH_BLOCK(BlockID.SILVERFISH_BLOCK, "Silverfish block", "silverfish", "silver"),
	STONE_BRICK(BlockID.STONE_BRICK, "Stone brick", "stonebrick", "sbrick", "smoothstonebrick"),
	RED_MUSHROOM_CAP(BlockID.RED_MUSHROOM_CAP, "Red mushroom cap", "giantmushroomred", "redgiantmushroom", "redmushroomcap"),
	BROWN_MUSHROOM_CAP(BlockID.BROWN_MUSHROOM_CAP, "Brown mushroom cap", "giantmushroombrown", "browngiantmushoom", "brownmushroomcap"),
	IRON_BARS(BlockID.IRON_BARS, "Iron bars", "ironbars", "ironfence"),
	GLASS_PANE(BlockID.GLASS_PANE, "Glass pane", "window", "glasspane", "glasswindow"),
	MELON_BLOCK(BlockID.MELON_BLOCK, "Melon (block)", "melonblock"),
	PUMPKIN_STEM(BlockID.PUMPKIN_STEM, "Pumpkin stem", "pumpkinstem"),
	MELON_STEM(BlockID.MELON_STEM, "Melon stem", "melonstem"),
	VINE(BlockID.VINE, "Vine", "vine", "vines", "creepers"),
	FENCE_GATE(BlockID.FENCE_GATE, "Fence gate", "fencegate", "gate"),
	BRICK_STAIRS(BlockID.BRICK_STAIRS, "Brick stairs", "brickstairs", "bricksteps"),
	STONE_BRICK_STAIRS(BlockID.STONE_BRICK_STAIRS, "Stone brick stairs", "stonebrickstairs", "smoothstonebrickstairs"),
	MYCELIUM(BlockID.MYCELIUM, "Mycelium", "fungus", "mycel"),
	LILY_PAD(BlockID.LILY_PAD, "Lily pad", "lilypad", "waterlily"),
	NETHER_BRICK(BlockID.NETHER_BRICK, "Nether brick", "netherbrick"),
	NETHER_BRICK_FENCE(BlockID.NETHER_BRICK_FENCE, "Nether brick fence", "netherbrickfence", "netherfence"),
	NETHER_BRICK_STAIRS(BlockID.NETHER_BRICK_STAIRS, "Nether brick stairs", "netherbrickstairs", "netherbricksteps", "netherstairs", "nethersteps"),
	NETHER_WART(BlockID.NETHER_WART, "Nether wart", "netherwart", "netherstalk"),
	ENCHANTMENT_TABLE(BlockID.ENCHANTMENT_TABLE, "Enchantment table", "enchantmenttable", "enchanttable"),
	BREWING_STAND(BlockID.BREWING_STAND, "Brewing Stand", "brewingstand"),
	CAULDRON(BlockID.CAULDRON, "Cauldron"),
	END_PORTAL(BlockID.END_PORTAL, "End Portal", "endportal", "blackstuff", "airportal", "weirdblackstuff"),
	END_PORTAL_FRAME(BlockID.END_PORTAL_FRAME, "End Portal Frame", "endportalframe", "airportalframe", "crystalblock"),
	END_STONE(BlockID.END_STONE, "End Stone", "endstone", "enderstone", "endersand"),
	DRAGON_EGG(BlockID.DRAGON_EGG, "Dragon Egg", "dragonegg", "dragons"),
	REDSTONE_LAMP_OFF(BlockID.REDSTONE_LAMP_OFF, "Redstone lamp (off)", "redstonelamp", "redstonelampoff", "rslamp", "rslampoff", "rsglow", "rsglowoff"),
	REDSTONE_LAMP_ON(BlockID.REDSTONE_LAMP_ON, "Redstone lamp (on)", "redstonelampon", "rslampon", "rsglowon"),
	DOUBLE_WOODEN_STEP(BlockID.DOUBLE_WOODEN_STEP, "Double wood step", "doublewoodslab", "doublewoodstep"),
	WOODEN_STEP(BlockID.WOODEN_STEP, "Wood step", "woodenslab", "woodslab", "woodstep", "woodhalfstep"),
	COCOA_PLANT(BlockID.COCOA_PLANT, "Cocoa plant", "cocoplant", "cocoaplant"),
	SANDSTONE_STAIRS(BlockID.SANDSTONE_STAIRS, "Sandstone stairs", "sandstairs", "sandstonestairs"),
	EMERALD_ORE(BlockID.EMERALD_ORE, "Emerald ore", "emeraldore"),
	ENDER_CHEST(BlockID.ENDER_CHEST, "Ender chest", "enderchest"),
	TRIPWIRE_HOOK(BlockID.TRIPWIRE_HOOK, "Tripwire hook", "tripwirehook"),
	TRIPWIRE(BlockID.TRIPWIRE, "Tripwire", "tripwire", "string"),
	EMERALD_BLOCK(BlockID.EMERALD_BLOCK, "Emerald block", "emeraldblock", "emerald"),
	SPRUCE_WOOD_STAIRS(BlockID.SPRUCE_WOOD_STAIRS, "Spruce wood stairs", "sprucestairs", "sprucewoodstairs"),
	BIRCH_WOOD_STAIRS(BlockID.BIRCH_WOOD_STAIRS, "Birch wood stairs", "birchstairs", "birchwoodstairs"),
	JUNGLE_WOOD_STAIRS(BlockID.JUNGLE_WOOD_STAIRS, "Jungle wood stairs", "junglestairs", "junglewoodstairs"),
	COMMAND_BLOCK(BlockID.COMMAND_BLOCK, "Command block", "commandblock", "cmdblock", "command", "cmd"),
	BEACON(BlockID.BEACON, "Beacon", "beacon", "beaconblock"),
	COBBLESTONE_WALL(BlockID.COBBLESTONE_WALL, "Cobblestone wall", "cobblestonewall", "cobblewall"),
	FLOWER_POT(BlockID.FLOWER_POT, "Flower pot", "flowerpot", "plantpot", "pot"),
	CARROTS(BlockID.CARROTS, "Carrots", "carrots", "carrotsplant", "carrotsblock"),
	POTATOES(BlockID.POTATOES, "Potatoes", "patatoes", "potatoesblock"),
	WOODEN_BUTTON(BlockID.WOODEN_BUTTON, "Wooden button", "woodbutton", "woodenbutton"),
	HEAD(BlockID.HEAD, "Head", "head", "headmount", "mount"),
	ANVIL(BlockID.ANVIL, "Anvil", "anvil", "blacksmith");
	/**
	 * Stores a map of the IDs for fast access.
	 */
	private static final Map<Integer, BlockType> ids = new HashMap<Integer, BlockType>();
	/**
	 * Stores a map of the names for fast access.
	 */
	private static final Map<String, BlockType> lookup = new HashMap<String, BlockType>();
	private final int id;
	private final String name;
	private final String[] lookupKeys;

	static
	{
		for (BlockType type : EnumSet.allOf(BlockType.class))
		{
			ids.put(type.id, type);
			for (String key : type.lookupKeys)
			{
				lookup.put(key, type);
			}
		}
	}

	/**
	 * Construct the type.
	 *
	 * @param id
	 * @param name
	 */
	BlockType(int id, String name, String lookupKey)
	{
		this.id = id;
		this.name = name;
		this.lookupKeys = new String[]
		{
			lookupKey
		};
	}

	/**
	 * Construct the type.
	 *
	 * @param id
	 * @param name
	 */
	BlockType(int id, String name, String... lookupKeys)
	{
		this.id = id;
		this.name = name;
		this.lookupKeys = lookupKeys;
	}

	/**
	 * Return type from ID. May return null.
	 *
	 * @param id
	 * @return
	 */
	public static BlockType fromID(int id)
	{
		try
		{
			if (id > 0)
			{
				return ids.get(id);
			}
		}
		catch (Exception ex)
		{
		}
		
		return null;
	}

	/**
	 * Return type from name. May return null.
	 *
	 * @param name
	 * @return
	 */
	public static BlockType lookup(String name)
	{
		return lookup(name, true);
	}

	/**
	 * Return type from name. May return null.
	 *
	 * @param name
	 * @param fuzzy
	 * @return
	 */
	public static BlockType lookup(String name, boolean fuzzy)
	{
		try
		{
			return fromID(Integer.parseInt(name));
		}
		catch (NumberFormatException e)
		{
			return StringUtil.lookup(lookup, name, fuzzy);
		}
	}

	public static String getName(final int id)
	{
		final BlockType type = fromID(id);
		
		if (type == null)
		{
			return "Unknown";
		}
		return type.getName();
	}

	/**
	 * Get block numeric ID.
	 *
	 * @return
	 */
	public int getID()
	{
		return id;
	}

	/**
	 * Get user-friendly block name.
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * HashSet for shouldPlaceLast.
	 */
	private static final Set<Integer> shouldPlaceLast = new HashSet<Integer>();

	static
	{
		shouldPlaceLast.add(BlockID.SAPLING);
		shouldPlaceLast.add(BlockID.BED);
		shouldPlaceLast.add(BlockID.POWERED_RAIL);
		shouldPlaceLast.add(BlockID.DETECTOR_RAIL);
		shouldPlaceLast.add(BlockID.LONG_GRASS);
		shouldPlaceLast.add(BlockID.DEAD_BUSH);
		shouldPlaceLast.add(BlockID.PISTON_EXTENSION);
		shouldPlaceLast.add(BlockID.YELLOW_FLOWER);
		shouldPlaceLast.add(BlockID.RED_FLOWER);
		shouldPlaceLast.add(BlockID.BROWN_MUSHROOM);
		shouldPlaceLast.add(BlockID.RED_MUSHROOM);
		shouldPlaceLast.add(BlockID.TORCH);
		shouldPlaceLast.add(BlockID.FIRE);
		shouldPlaceLast.add(BlockID.REDSTONE_WIRE);
		shouldPlaceLast.add(BlockID.CROPS);
		shouldPlaceLast.add(BlockID.LADDER);
		shouldPlaceLast.add(BlockID.MINECART_TRACKS);
		shouldPlaceLast.add(BlockID.LEVER);
		shouldPlaceLast.add(BlockID.STONE_PRESSURE_PLATE);
		shouldPlaceLast.add(BlockID.WOODEN_PRESSURE_PLATE);
		shouldPlaceLast.add(BlockID.REDSTONE_TORCH_OFF);
		shouldPlaceLast.add(BlockID.REDSTONE_TORCH_ON);
		shouldPlaceLast.add(BlockID.STONE_BUTTON);
		shouldPlaceLast.add(BlockID.SNOW);
		shouldPlaceLast.add(BlockID.PORTAL);
		shouldPlaceLast.add(BlockID.REDSTONE_REPEATER_OFF);
		shouldPlaceLast.add(BlockID.REDSTONE_REPEATER_ON);
		shouldPlaceLast.add(BlockID.TRAP_DOOR);
		shouldPlaceLast.add(BlockID.VINE);
		shouldPlaceLast.add(BlockID.LILY_PAD);
		shouldPlaceLast.add(BlockID.NETHER_WART);
		shouldPlaceLast.add(BlockID.PISTON_BASE);
		shouldPlaceLast.add(BlockID.PISTON_STICKY_BASE);
		shouldPlaceLast.add(BlockID.PISTON_EXTENSION);
		shouldPlaceLast.add(BlockID.PISTON_MOVING_PIECE);
		shouldPlaceLast.add(BlockID.COCOA_PLANT);
		shouldPlaceLast.add(BlockID.TRIPWIRE_HOOK);
		shouldPlaceLast.add(BlockID.TRIPWIRE);
		shouldPlaceLast.add(BlockID.FLOWER_POT);
		shouldPlaceLast.add(BlockID.CARROTS);
		shouldPlaceLast.add(BlockID.POTATOES);
		shouldPlaceLast.add(BlockID.WOODEN_BUTTON);
		shouldPlaceLast.add(BlockID.HEAD);
	}

	/**
	 * Checks to see whether a block should be placed last.
	 *
	 * @param id
	 * @return
	 */
	public static boolean shouldPlaceLast(int id)
	{
		return shouldPlaceLast.contains(id);
	}

	/**
	 * Checks to see whether this block should be placed last.
	 *
	 * @return
	 */
	public boolean shouldPlaceLast()
	{
		return shouldPlaceLast.contains(id);
	}
	/**
	 * HashSet for shouldPlaceLast.
	 */
	private static final Set<Integer> shouldPlaceFinal = new HashSet<Integer>();

	static
	{
		shouldPlaceFinal.add(BlockID.SIGN_POST);
		shouldPlaceFinal.add(BlockID.WOODEN_DOOR);
		shouldPlaceFinal.add(BlockID.WALL_SIGN);
		shouldPlaceFinal.add(BlockID.IRON_DOOR);
		shouldPlaceFinal.add(BlockID.CACTUS);
		shouldPlaceFinal.add(BlockID.REED);
		shouldPlaceFinal.add(BlockID.CAKE_BLOCK);
		shouldPlaceFinal.add(BlockID.PISTON_EXTENSION);
		shouldPlaceFinal.add(BlockID.PISTON_MOVING_PIECE);
	}

	/**
	 * Checks to see whether a block should be placed in the final queue.
	 *
	 * This applies to blocks that can be attached to other blocks that have an
	 * attachment.
	 *
	 * @param id
	 * @return
	 */
	public static boolean shouldPlaceFinal(int id)
	{
		return shouldPlaceFinal.contains(id);
	}
	
	/**
	 * HashMap for getBlockBagItem.
	 */
	private static final Map<Integer, BaseItem> dataBlockBagItems = new HashMap<Integer, BaseItem>();
	private static final Map<Integer, BaseItem> nonDataBlockBagItems = new HashMap<Integer, BaseItem>();
	private static final BaseItem doNotDestroy = new BaseItemStack(BlockID.AIR, 0);

	/**
	 * Get the block or item that this block can be constructed from. If nothing
	 * is dropped, a block with a BaseItemStack of type AIR and size 0 will be
	 * returned. If the block should not be destroyed (i.e. bedrock), null will
	 * be returned.
	 *
	 * @param type
	 * @param data
	 * @return
	 */
	public static BaseItem getBlockBagItem(int type, int data)
	{
		BaseItem dropped = nonDataBlockBagItems.get(type);
		if (dropped != null)
		{
			return dropped;
		}

		dropped = dataBlockBagItems.get(typeDataKey(type, data));

		if (dropped == null)
		{
			return new BaseItemStack(BlockID.AIR, 0);
		}

		if (dropped == doNotDestroy)
		{
			return null;
		}

		return dropped;
	}

	private static void addIdentity(int type)
	{
		nonDataBlockBagItems.put(type, new BaseItem(type));
	}

	private static void addIdentities(int type, int maxData)
	{
		for (int data = 0; data < maxData; ++data)
		{
			dataBlockBagItems.put(typeDataKey(type, data), new BaseItem(type, (short)data));
		}
	}

	/**
	 * Get the block or item that would have been dropped. If nothing is
	 * dropped, 0 will be returned. If the block should not be destroyed (i.e.
	 * bedrock), -1 will be returned.
	 *
	 * @param id
	 * @return
	 * @deprecated This function ignores the data value.
	 */
	@Deprecated
	public static int getDroppedBlock(int id)
	{
		BaseItem dropped = nonDataBlockBagItems.get(id);
		if (dropped == null)
		{
			return BlockID.AIR;
		}
		return dropped.getType();
	}

	public BaseItemStack getBlockDrop(short data)
	{
		return getBlockDrop(id, data);
	}
	private static final Random random = new Random();

	public static BaseItemStack getBlockDrop(int id, short data)
	{
		int store;
		switch (id)
		{
			case BlockID.STONE:
				return new BaseItemStack(BlockID.COBBLESTONE);

			case BlockID.GRASS:
				return new BaseItemStack(BlockID.DIRT);

			case BlockID.GRAVEL:
				if (random.nextInt(10) == 0)
				{
					return new BaseItemStack(ItemID.FLINT);
				}
				else
				{
					return new BaseItemStack(BlockID.GRAVEL);
				}

			case BlockID.COAL_ORE:
				return new BaseItemStack(ItemID.COAL);

			case BlockID.LEAVES:
				if (random.nextDouble() > 0.95)
				{
					return new BaseItemStack(BlockID.SAPLING, 1, data);
				}
				else
				{
					return null;
				}

			case BlockID.LAPIS_LAZULI_ORE:
				return new BaseItemStack(ItemID.INK_SACK, random.nextInt(5) + 4, (short)4);

			case BlockID.BED:
				return new BaseItemStack(ItemID.BED_ITEM);

			case BlockID.LONG_GRASS:
				if (random.nextInt(8) == 0)
				{
					return new BaseItemStack(ItemID.SEEDS);
				}
				else
				{
					return null;
				}

			case BlockID.DOUBLE_STEP:
				return new BaseItemStack(BlockID.STEP, 2, data);

			case BlockID.WOODEN_STAIRS:
				return new BaseItemStack(BlockID.WOOD);

			case BlockID.REDSTONE_WIRE:
				return new BaseItemStack(ItemID.REDSTONE_DUST);

			case BlockID.DIAMOND_ORE:
				return new BaseItemStack(ItemID.DIAMOND);

			case BlockID.CROPS:
				if (data == 7)
				{
					return new BaseItemStack(ItemID.WHEAT);
				}
				return new BaseItemStack(ItemID.SEEDS);

			case BlockID.SOIL:
				return new BaseItemStack(BlockID.DIRT);

			case BlockID.BURNING_FURNACE:
				return new BaseItemStack(BlockID.FURNACE);

			case BlockID.SIGN_POST:
				return new BaseItemStack(ItemID.SIGN);

			case BlockID.WOODEN_DOOR:
				return new BaseItemStack(ItemID.WOODEN_DOOR_ITEM);

			case BlockID.COBBLESTONE_STAIRS:
				return new BaseItemStack(BlockID.COBBLESTONE);

			case BlockID.WALL_SIGN:
				return new BaseItemStack(ItemID.SIGN);

			case BlockID.IRON_DOOR:
				return new BaseItemStack(ItemID.IRON_DOOR_ITEM);

			case BlockID.REDSTONE_ORE:
			case BlockID.GLOWING_REDSTONE_ORE:
				return new BaseItemStack(ItemID.REDSTONE_DUST, (random.nextInt(2) + 4));

			case BlockID.REDSTONE_TORCH_OFF:
				return new BaseItemStack(BlockID.REDSTONE_TORCH_ON);

			case BlockID.CLAY:
				return new BaseItemStack(ItemID.CLAY_BALL, 4);

			case BlockID.REED:
				return new BaseItemStack(ItemID.SUGAR_CANE_ITEM);

			case BlockID.LIGHTSTONE:
				return new BaseItemStack(ItemID.LIGHTSTONE_DUST, (random.nextInt(3) + 2));

			case BlockID.REDSTONE_REPEATER_OFF:
			case BlockID.REDSTONE_REPEATER_ON:
				return new BaseItemStack(ItemID.REDSTONE_REPEATER);

			case BlockID.BROWN_MUSHROOM_CAP:
				store = random.nextInt(10);
				if (store == 0)
				{
					return new BaseItemStack(BlockID.BROWN_MUSHROOM, 2);
				}
				else if (store == 1)
				{
					return new BaseItemStack(BlockID.BROWN_MUSHROOM);
				}
				else
				{
					return null;
				}

			case BlockID.RED_MUSHROOM_CAP:
				store = random.nextInt(10);
				if (store == 0)
				{
					return new BaseItemStack(BlockID.RED_MUSHROOM, 2);
				}
				else if (store == 1)
				{
					return new BaseItemStack(BlockID.RED_MUSHROOM);
				}
				else
				{
					return null;
				}

			case BlockID.MELON_BLOCK:
				return new BaseItemStack(ItemID.MELON, (random.nextInt(5) + 3));

			case BlockID.PUMPKIN_STEM:
				return new BaseItemStack(ItemID.PUMPKIN_SEEDS);

			case BlockID.MELON_STEM:
				return new BaseItemStack(ItemID.MELON_SEEDS);

			case BlockID.BRICK_STAIRS:
				return new BaseItemStack(BlockID.BRICK);

			case BlockID.STONE_BRICK_STAIRS:
				return new BaseItemStack(BlockID.STONE_BRICK);

			case BlockID.MYCELIUM:
				return new BaseItemStack(BlockID.DIRT);

			case BlockID.LILY_PAD:
				return new BaseItemStack(BlockID.LILY_PAD);

			case BlockID.NETHER_BRICK_STAIRS:
				return new BaseItemStack(BlockID.NETHER_BRICK);

			case BlockID.NETHER_WART:
				return new BaseItemStack(ItemID.NETHER_WART_SEED, random.nextInt(3) + 1);

			case BlockID.BREWING_STAND:
				return new BaseItemStack(ItemID.BREWING_STAND);

			case BlockID.CAULDRON:
				return new BaseItemStack(ItemID.CAULDRON);

			case BlockID.BEDROCK:
			case BlockID.WATER:
			case BlockID.STATIONARY_WATER:
			case BlockID.LAVA:
			case BlockID.STATIONARY_LAVA:
			case BlockID.GLASS:
			case BlockID.PISTON_EXTENSION:
			case BlockID.BOOKCASE:
			case BlockID.FIRE:
			case BlockID.MOB_SPAWNER:
			case BlockID.SNOW:
			case BlockID.ICE:
			case BlockID.PORTAL:
			case BlockID.AIR:
			case BlockID.LOCKED_CHEST:
			case BlockID.SILVERFISH_BLOCK:
			case BlockID.VINE:
			case BlockID.END_PORTAL:
			case BlockID.END_PORTAL_FRAME:
				return null;
		}

		return new BaseItemStack(id, 1, data);
	}
	private static final Map<Integer, PlayerDirection> dataAttachments = new HashMap<Integer, PlayerDirection>();
	private static final Map<Integer, PlayerDirection> nonDataAttachments = new HashMap<Integer, PlayerDirection>();

	static
	{
		nonDataAttachments.put(BlockID.SAPLING, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.POWERED_RAIL, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.DETECTOR_RAIL, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.LONG_GRASS, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.DEAD_BUSH, PlayerDirection.DOWN);
		for (int offset = 0; offset <= 8; offset += 8)
		{
			dataAttachments.put(typeDataKey(BlockID.PISTON_EXTENSION, offset + 0), PlayerDirection.UP);
			dataAttachments.put(typeDataKey(BlockID.PISTON_EXTENSION, offset + 1), PlayerDirection.DOWN);
			addCardinals(BlockID.PISTON_EXTENSION, offset + 2, offset + 5, offset + 3, offset + 4);
		}
		nonDataAttachments.put(BlockID.YELLOW_FLOWER, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.RED_FLOWER, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.BROWN_MUSHROOM, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.RED_MUSHROOM, PlayerDirection.DOWN);
		for (int blockId : new int[]
			{
				BlockID.TORCH, BlockID.REDSTONE_TORCH_ON,
				BlockID.REDSTONE_TORCH_OFF
			})
		{
			dataAttachments.put(typeDataKey(blockId, 5), PlayerDirection.DOWN);
			addCardinals(blockId, 4, 1, 3, 2);
		}
		nonDataAttachments.put(BlockID.REDSTONE_WIRE, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.CROPS, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.SIGN_POST, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.WOODEN_DOOR, PlayerDirection.DOWN);
		addCardinals(BlockID.LADDER, 2, 5, 3, 4);
		nonDataAttachments.put(BlockID.MINECART_TRACKS, PlayerDirection.DOWN);
		addCardinals(BlockID.WALL_SIGN, 2, 5, 3, 4);
		for (int offset = 0; offset <= 8; offset += 8)
		{
			addCardinals(BlockID.LEVER, offset + 4, offset + 1, offset + 3, offset + 2);
			dataAttachments.put(typeDataKey(BlockID.LEVER, offset + 5), PlayerDirection.DOWN);
			dataAttachments.put(typeDataKey(BlockID.LEVER, offset + 6), PlayerDirection.DOWN);
		}
		nonDataAttachments.put(BlockID.STONE_PRESSURE_PLATE, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.IRON_DOOR, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.WOODEN_PRESSURE_PLATE, PlayerDirection.DOWN);
		// redstone torches: see torches
		for (int offset = 0; offset <= 8; offset += 8)
		{
			addCardinals(BlockID.STONE_BUTTON, offset + 4, offset + 1, offset + 3, offset + 2);
		}
		nonDataAttachments.put(BlockID.CACTUS, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.REED, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.CAKE_BLOCK, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.REDSTONE_REPEATER_OFF, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.REDSTONE_REPEATER_ON, PlayerDirection.DOWN);
		for (int offset = 0; offset <= 4; offset += 4)
		{
			addCardinals(BlockID.TRAP_DOOR, offset + 0, offset + 3, offset + 1, offset + 2);
		}
		nonDataAttachments.put(BlockID.PUMPKIN_STEM, PlayerDirection.DOWN);
		nonDataAttachments.put(BlockID.MELON_STEM, PlayerDirection.DOWN);
		// vines are complicated, but I'll list the single-attachment variants anyway
		dataAttachments.put(typeDataKey(BlockID.VINE, 0), PlayerDirection.UP);
		addCardinals(BlockID.VINE, 1, 2, 4, 8);
		nonDataAttachments.put(BlockID.NETHER_WART, PlayerDirection.DOWN);
		for (int offset = 0; offset <= 4; offset += 4)
		{
			addCardinals(BlockID.COCOA_PLANT, offset + 0, offset + 1, offset + 2, offset + 3);
		}
		for (int offset = 0; offset <= 4; offset += 4)
		{
			addCardinals(BlockID.TRIPWIRE_HOOK, offset + 2, offset + 3, offset + 0, offset + 1);
		}
		nonDataAttachments.put(BlockID.TRIPWIRE, PlayerDirection.DOWN);
	}

	/**
	 * Returns the direction to the block(B) this block(A) is attached to.
	 * Attached means that if block B is destroyed, block A will pop off.
	 *
	 * @param type The block id of block A
	 * @param data The data value of block A
	 * @return direction to block B
	 */
	public static PlayerDirection getAttachment(int type, int data)
	{
		PlayerDirection direction = nonDataAttachments.get(type);
		if (direction != null)
		{
			return direction;
		}

		return dataAttachments.get(typeDataKey(type, data));
	}

	private static int typeDataKey(int type, int data)
	{
		return (type << 4) | (data & 0xf);
	}

	private static void addCardinals(int type, int west, int north, int east, int south)
	{
		dataAttachments.put(typeDataKey(type, west), PlayerDirection.WEST);
		dataAttachments.put(typeDataKey(type, north), PlayerDirection.NORTH);
		dataAttachments.put(typeDataKey(type, east), PlayerDirection.EAST);
		dataAttachments.put(typeDataKey(type, south), PlayerDirection.SOUTH);
	}
	
	// WorldGuard needs this.
	public static boolean isRailBlock(int type)
	{
		return type == BlockID.MINECART_TRACKS || type == BlockID.POWERED_RAIL;
	}
}
