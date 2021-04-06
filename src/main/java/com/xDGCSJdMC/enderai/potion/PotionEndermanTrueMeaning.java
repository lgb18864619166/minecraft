package com.xDGCSJdMC.enderai.potion;

import com.ibm.icu.util.BytesTrie.Result;
import com.sun.prism.paint.Color;
import com.xDGCSJdMC.enderai.EnderAI;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PotionEndermanTrueMeaning extends Potion {
	
    public static final String POTION_ENDERMAN_TRUE_MEANING = "enderman_true_meaning";
	
	private static final int RANGE = 32;
	
	private static final ResourceLocation res = new ResourceLocation(EnderAI.MODID + ":" + "textures/gui/potion.png");

    public PotionEndermanTrueMeaning()
    {
        super(new ResourceLocation(EnderAI.MODID + ":" + "enderman_true_meaning"), false, 11993343);
        this.setPotionName("potion.endermanTrueMeaning");
        //this.setIconIndex(0, 0);
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @Override
    public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc)
    {
        mc.getTextureManager().bindTexture(PotionEndermanTrueMeaning.res);
        mc.currentScreen.drawTexturedModalRect(x + 6, y + 7, 0, 0, 18, 18);
    }
    
    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event)
    {
        if (event.source.getDamageType().equals("fall"))
        {
            PotionEffect effect = event.entityLiving.getActivePotionEffect(PotionLoader.potionEndermanTrueMeaning);
            if (effect != null)
            {
                if (effect.getAmplifier() == 0)
                {
                    event.ammount /= 2;
                }
                else
                {
                    event.ammount = 0;
                }
            }
        }
    }
    

}
