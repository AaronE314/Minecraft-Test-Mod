package com.Aaron.test1.item;

import com.Aaron.test1.creativetab.CreativeTabtest1;
import com.Aaron.test1.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class TestPick extends ItemPickaxe {
    public TestPick(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Reference.MOD_ID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabtest1.test1tab);
    }
}
