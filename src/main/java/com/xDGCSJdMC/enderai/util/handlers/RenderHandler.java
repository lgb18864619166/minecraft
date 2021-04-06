package com.xDGCSJdMC.enderai.util.handlers;

import com.xDGCSJdMC.enderai.entity.EntityFlameEnderman;
import com.xDGCSJdMC.enderai.entity.EntityWisdomEnderman;
import com.xDGCSJdMC.enderai.entity.render.RenderFlameEnderman;
import com.xDGCSJdMC.enderai.entity.render.RenderWisdomEnderman;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWisdomEnderman.class, new IRenderFactory<EntityWisdomEnderman>()
				{
					@Override
					public Render<? super EntityWisdomEnderman> createRenderFor(RenderManager manager){
						return new RenderWisdomEnderman(manager);
					}
			
				});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFlameEnderman.class, new IRenderFactory<EntityFlameEnderman>()
		{
			@Override
			public Render<? super EntityFlameEnderman> createRenderFor(RenderManager manager){
				return new RenderFlameEnderman(manager);
			}
	
		});
	}

}
