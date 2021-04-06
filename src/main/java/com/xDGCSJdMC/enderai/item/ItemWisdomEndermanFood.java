package com.xDGCSJdMC.enderai.item;

import com.xDGCSJdMC.enderai.creativetab.CreativeTabsLoader;
import com.xDGCSJdMC.enderai.potion.PotionLoader;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemWisdomEndermanFood extends ItemFood{
	
	public ItemWisdomEndermanFood()
    {
        super(20, 400.0F, false);
        this.setAlwaysEdible();
        this.setUnlocalizedName("wisdomEndermanFood");
        this.setCreativeTab(CreativeTabsLoader.tabEnderAI);
    }
	
	@Override
    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.healthBoost.id, 2400, 2));
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 2400, 2));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2400, 1));
            player.addPotionEffect(new PotionEffect(Potion.wither.id, 200, 4));
            player.addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 1));
            player.addPotionEffect(new PotionEffect(Potion.absorption.id, 2400, 2));
            player.addPotionEffect(new PotionEffect(Potion.harm.id, 2400, 4));
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2400, 4));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 2400, 4));
            player.addPotionEffect(new PotionEffect(PotionLoader.potionEndermanTrueMeaning.id, 200, 1));
        }
        super.onFoodEaten(stack, worldIn, player);
    }

}
