package com.xDGCSJdMC.enderai.entity.render;

import com.xDGCSJdMC.enderai.entity.EntityFlameEnderman;
import com.xDGCSJdMC.enderai.entity.model.ModelFlameEnderman;
import com.xDGCSJdMC.enderai.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlameEnderman extends RenderLiving<EntityFlameEnderman>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/flame_enderman.png");

	public RenderFlameEnderman(RenderManager manager) {
		super(manager, new ModelFlameEnderman(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityFlameEnderman entity) {
		return TEXTURES;
	}
	
	
}
