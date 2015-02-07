package com.Aaron.test1.init;

import com.Aaron.test1.block.BlockTestOre;
import com.Aaron.test1.block.Blocktest1;
import com.Aaron.test1.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final Blocktest1 testore = new BlockTestOre();

    public static void init() {
        GameRegistry.registerBlock(testore, "testore");
    }
}
