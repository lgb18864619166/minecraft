package com.xDGCSJdMC.enderai.item;

import com.xDGCSJdMC.enderai.creativetab.CreativeTabsLoader;

import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class ItemChaoticPearl extends Item {
	
	public ItemChaoticPearl()
    {
        super();
        this.maxStackSize = 2;
        this.setUnlocalizedName("chaoticPearl");
        this.setCreativeTab(CreativeTabsLoader.tabEnderAI);
    }
	
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if (playerIn.capabilities.isCreativeMode)
        {
            return itemStackIn;
        }
        else
        {
            --itemStackIn.stackSize;
            worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!worldIn.isRemote)
            {
                worldIn.spawnEntityInWorld(new EntityEnderPearl(worldIn, playerIn));
            }

            playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
            return itemStackIn;
        }
    }

}
