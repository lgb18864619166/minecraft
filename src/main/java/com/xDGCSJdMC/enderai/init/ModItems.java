package com.xDGCSJdMC.enderai.init;

import java.util.ArrayList;
import java.util.List;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.items.ItemBase;
import com.xDGCSJdMC.enderai.items.armor.ArmorBase;
import com.xDGCSJdMC.enderai.items.food.FoodWisdomEndermanFood;
import com.xDGCSJdMC.enderai.items.tools.ToolPickaxe;
import com.xDGCSJdMC.enderai.items.tools.ToolSword;

import com.xDGCSJdMC.enderai.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial MATERIAL_CHAOTIC_PEARL = EnumHelper.addToolMaterial("material_chaotic_pearl", 10, 2000, 30.0F, 396.0F, 20);
	public static final ArmorMaterial ARMOR_MATERIAL_CHAOTIC = EnumHelper.addArmorMaterial("armor_material_chaotic", Reference.MOD_ID + ":chaotic", 40, new int[]{6, 16, 10, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);


	//items
	public static final Item WISDOM_PEARL = new ItemBase("wisdom_pearl", EnderAI.ENDER_AI);
	public static final Item FLAME_PEARL = new ItemBase("flame_pearl", EnderAI.ENDER_AI);
	public static final Item CHAOTIC_PEARL = new ItemBase("chaotic_pearl", EnderAI.ENDER_AI);
	public static final Item CHAOTIC_PEARL_PELLET = new ItemBase("chaotic_pearl_pellet", EnderAI.ENDER_AI);
	public static final ItemSword CHAOTIC_PEARL_SWORD = new ToolSword("chaotic_pearl_sword", EnderAI.ENDER_AI, MATERIAL_CHAOTIC_PEARL);
	public static final ItemPickaxe CHAOTIC_PEARL_PICKAXE = new ToolPickaxe("chaotic_pearl_pickaxe", EnderAI.ENDER_AI, MATERIAL_CHAOTIC_PEARL);
	
	//food
	public static final ItemFood WISDOM_ENDERMAN_FOOD = new FoodWisdomEndermanFood("wisdom_enderman_food", 20, 400.0F, false, EnderAI.ENDER_AI);

	//armors
	public static final Item ENDERMAN_HEAD = new ArmorBase("enderman_head", ARMOR_MATERIAL_CHAOTIC, 1, EntityEquipmentSlot.HEAD, EnderAI.ENDER_AI);
	public static final Item ENDERMAN_TRIPE = new ArmorBase("enderman_tripe", ARMOR_MATERIAL_CHAOTIC, 1, EntityEquipmentSlot.CHEST, EnderAI.ENDER_AI);
	public static final Item ENDERMAN_KNEE = new ArmorBase("enderman_knee", ARMOR_MATERIAL_CHAOTIC, 2, EntityEquipmentSlot.LEGS, EnderAI.ENDER_AI);
	public static final Item ENDERMAN_FEET = new ArmorBase("enderman_feet", ARMOR_MATERIAL_CHAOTIC, 1, EntityEquipmentSlot.FEET, EnderAI.ENDER_AI);
	
	
}
