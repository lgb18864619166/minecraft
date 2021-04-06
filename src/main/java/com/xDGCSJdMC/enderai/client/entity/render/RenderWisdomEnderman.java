package com.xDGCSJdMC.enderai.client.entity.render;

import com.xDGCSJdMC.enderai.EnderAI;
import com.xDGCSJdMC.enderai.client.entity.model.ModelWisdomEnderman;
import com.xDGCSJdMC.enderai.entity.EntityWisdomEnderman;

import net.minecraft.client.model.ModelEnderman;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class RenderWisdomEnderman extends RenderLiving<EntityWisdomEnderman> {
	
	private static final ResourceLocation WISDOM_ENDERMAN_TEXTURE = new ResourceLocation(
            EnderAI.MODID + ":" + "textures/entity/wisdom_enderman.png");

    public RenderWisdomEnderman(RenderManager renderManager)
    {
        super(renderManager, new ModelWisdomEnderman(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityWisdomEnderman entity)
    {
        return RenderWisdomEnderman.WISDOM_ENDERMAN_TEXTURE;
    }

    @Override
    public void doRender(EntityWisdomEnderman entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

}
