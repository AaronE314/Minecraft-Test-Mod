package com.Aaron.test1.creativetab;

import com.Aaron.test1.init.ModItems;
import com.Aaron.test1.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabtest1 {
    public static final CreativeTabs test1tab = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.testingot;
        }
    };
}
