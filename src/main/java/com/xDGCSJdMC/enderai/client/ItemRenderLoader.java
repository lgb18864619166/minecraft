package com.xDGCSJdMC.enderai.client;

import com.xDGCSJdMC.enderai.block.BlockLoader;
import com.xDGCSJdMC.enderai.item.ItemLoader;

public class ItemRenderLoader {
	
	public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }

}
