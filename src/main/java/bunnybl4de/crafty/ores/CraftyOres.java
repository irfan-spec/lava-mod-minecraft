package bunnybl4de.crafty.ores;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftyOres implements ModInitializer {


	public static final Item NETHERITE_STICK = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Item LAVA_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Item MAGNOLIA = new Item(new Item.Settings().group(ItemGroup.DECORATIONS));

	public static final Item MAGNOLIA_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD));

	public static final Item SALT = new Item(new Item.Settings().group(ItemGroup.FOOD));

	public static final ArmorMaterial LAVA_ARMOR = new LavaArmorMaterial();

    public static final Block SALT_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0F, 1.0F).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.PICKAXES));



	
	@Override
	public void onInitialize() {

	Registry.register(Registry.ITEM, new Identifier("craftyores", "netherite_stick"), NETHERITE_STICK);
	Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_diamond"), LAVA_DIAMOND);
	Registry.register(Registry.ITEM, new Identifier("craftyores", "magnolia"), MAGNOLIA);
	Registry.register(Registry.ITEM, new Identifier("craftyores", "magnolia_milk"), MAGNOLIA_MILK);
	Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_pickaxe"), new PickaxeBase(new ToolMaterialLava()));
	Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_axe"), new AxeBase(new ToolMaterialLava()));
	Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_sword"), new SwordBase(new ToolMaterialLava()));
	Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_shovel"), new ShovelBase(new ToolMaterialLava()));



    Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_helmet"), new BaseArmor(LAVA_ARMOR, EquipmentSlot.HEAD));
	Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_chestplate"), new BaseArmor(LAVA_ARMOR, EquipmentSlot.CHEST));
	Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_leggings"), new BaseArmor(LAVA_ARMOR, EquipmentSlot.LEGS));
	Registry.register(Registry.ITEM, new Identifier("craftyores", "lava_boots"), new BaseArmor(LAVA_ARMOR, EquipmentSlot.FEET));

    Registry.register(Registry.BLOCK, new Identifier("craftyores","salt_block"), SALT_BLOCK); 
    Registry.register(Registry.ITEM, new Identifier("craftyores","salt_block"), new BlockItem(SALT_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))); 


	Registry.register(Registry.ITEM, new Identifier("craftyores", "knife"), new SwordBase(new ToolMaterialKnife()));

	}
}
 