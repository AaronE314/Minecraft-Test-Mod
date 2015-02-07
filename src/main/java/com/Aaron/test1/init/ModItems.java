package com.Aaron.test1.init;

import com.Aaron.test1.item.ItemTestIngot;
import com.Aaron.test1.item.Itemtest1;
import com.Aaron.test1.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final Itemtest1 testingot = new ItemTestIngot();

    public static void init() {
        GameRegistry.registerItem(testingot, "tsetingot");
    }
}
