package com.xDGCSJdMC.enderai.effect;

import javax.annotation.Nonnull;

import com.xDGCSJdMC.enderai.init.ModItems;
import com.xDGCSJdMC.enderai.init.ModPotions;
import com.xDGCSJdMC.enderai.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PotionEndermanTrueMeaning extends PotionMod {
	
	private static final int RANGE = 32;

	public PotionEndermanTrueMeaning() {
		super(Reference.ENDERMAN_TRUE_MEANING, false, 16975);
		MinecraftForge.EVENT_BUS.register(this);
		setBeneficial();
	}

	@SubscribeEvent
	public void onSpawn(LivingSpawnEvent.CheckSpawn event) {
		if(event.getResult() != Result.ALLOW && event.getEntityLiving() instanceof IMob) {
			AxisAlignedBB aabb = new AxisAlignedBB(event.getX() - RANGE, event.getY() - RANGE, event.getZ() - RANGE, event.getX() + RANGE, event.getY() + RANGE, event.getZ() + RANGE);
			for(EntityPlayer player : event.getWorld().playerEntities) {
				if(hasEffect(player) && !hasEffect(player, ModPotions.ENDERMAN_TRUE_MEANING) && player.getEntityBoundingBox().intersects(aabb)) {
					event.setResult(Result.ALLOW);
					return;
				}
			}
		}
	}
	

}
