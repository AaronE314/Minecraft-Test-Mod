package com.Aaron.test1.init;

import com.Aaron.test1.item.*;
import com.Aaron.test1.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static Item.ToolMaterial TEST = EnumHelper.addToolMaterial("TEST", 3, 4000, 16.0F, 6.0F, 30);

    public static final Itemtest1 testingot = new ItemTestIngot();
    public static final TestPick testpick = new TestPick("testpick", TEST);
    public static final TestAxe testaxe = new TestAxe("testaxe", TEST);
    public static final TestHoe testhoe = new TestHoe("testhoe", TEST);
    public static final TestShovel testshovel = new TestShovel("testshovel", TEST);
    public static final TestSword testsword = new TestSword("testsword", TEST);


    public static void init() {
        GameRegistry.registerItem(testingot, "testingot");
        GameRegistry.registerItem(testpick, "test1:testpick");
        GameRegistry.registerItem(testaxe, "test1:testaxe");
        GameRegistry.registerItem(testhoe, "test1:testhoe");
        GameRegistry.registerItem(testshovel, "test1:testshovel");
        GameRegistry.registerItem(testsword, "test1:testsword");

    }


}
