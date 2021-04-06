package com.xDGCSJdMC.enderai.items;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.init.ModItems;
import com.xDGCSJdMC.enderai.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemChaoticPearl extends ItemEnderPearl implements IHasModel {
	
	public ItemChaoticPearl(String string, CreativeTabs tab)
	{
		
		
        this.maxStackSize = 16;
        this.setCreativeTab(EnderAI.ENDER_AI);
        
		ModItems.ITEMS.add(this);
    }

    /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(0);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        playerIn.getCooldownTracker().setCooldown(this, 20);

        if (!worldIn.isRemote)
        {
            EntityEnderPearl entitychaoticpearl = new EntityEnderPearl(worldIn, playerIn);
            entitychaoticpearl.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(entitychaoticpearl);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
    
    	public void registerModels() {
		EnderAI.proxy.registerItemRenderer(this, 0, "inventory");
    	}
    
    

}
