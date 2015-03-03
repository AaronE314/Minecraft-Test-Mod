package com.Aaron.test1.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init(){
        //Ingot Recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.testingot, 2), " i ", "ici", " i ", 'i', new ItemStack(Items.iron_ingot), 'c', new ItemStack(Items.coal));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.testingot), new ItemStack(ModBlocks.testore), new ItemStack(Items.coal));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testingot, 6), "gig", "ici", "gig", 'i', "ingotIron", 'g', "ingotGold", 'c', new ItemStack(Items.coal)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.testingot, 3), "ingotIron", new ItemStack(ModBlocks.testore), new ItemStack(Items.coal)));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.testmetalblock), "ttt", "ttt", "ttt", 't', new ItemStack(ModItems.testingot));

        //Tool Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testpick, 1), "iii", " s ", " s ", 'i', new ItemStack(ModItems.testingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testaxe, 1), "ii ", "is ", " s ", 'i', new ItemStack(ModItems.testingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testaxe, 1), " ii", " si", " s ", 'i', new ItemStack(ModItems.testingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testhoe, 1), "ii ", " s ", " s ", 'i', new ItemStack(ModItems.testingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testhoe, 1), " ii", " s ", " s ", 'i', new ItemStack(ModItems.testingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testshovel, 1), "i", "s", "s", 'i', new ItemStack(ModItems.testingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testsword, 1), "i", "i", "s", 'i', new ItemStack(ModItems.testingot), 's', "stickWood"));


        //Smelting Recipes
        GameRegistry.addSmelting(ModBlocks.testore, new ItemStack(ModItems.testingot), 0.7f);
    }
}
