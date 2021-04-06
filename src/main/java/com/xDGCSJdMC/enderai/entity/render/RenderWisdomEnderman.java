package com.xDGCSJdMC.enderai.entity.render;

import java.util.Random;

import com.xDGCSJdMC.enderai.entity.EntityFlameEnderman;
import com.xDGCSJdMC.enderai.entity.EntityWisdomEnderman;
import com.xDGCSJdMC.enderai.entity.model.ModelFlameEnderman;
import com.xDGCSJdMC.enderai.entity.model.ModelWisdomEnderman;
import com.xDGCSJdMC.enderai.util.Reference;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWisdomEnderman extends RenderLiving<EntityWisdomEnderman>{

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/wisdom_enderman.png");

    public RenderWisdomEnderman(RenderManager manager) {
        super(manager, new ModelWisdomEnderman(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityWisdomEnderman entity) {
        return TEXTURES;
    }

}
