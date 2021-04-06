package com.xDGCSJdMC.enderai.client.entity.render;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.client.entity.model.ModelFlameEnderman;
import com.xDGCSJdMC.enderai.client.entity.model.ModelWisdomEnderman;
import com.xDGCSJdMC.enderai.entity.EntityFlameEnderman;
import com.xDGCSJdMC.enderai.entity.EntityWisdomEnderman;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFlameEnderman extends RenderLiving<EntityFlameEnderman> {
	
	private static final ResourceLocation FLAME_ENDERMAN_TEXTURE = new ResourceLocation(
            EnderAI.MODID + ":" + "textures/entity/flame_enderman.png");

    public RenderFlameEnderman(RenderManager renderManager)
    {
        super(renderManager, new ModelFlameEnderman(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityFlameEnderman entity)
    {
        return RenderFlameEnderman.FLAME_ENDERMAN_TEXTURE;
    }

    @Override
    public void doRender(EntityFlameEnderman entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

}
