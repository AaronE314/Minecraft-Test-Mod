package com.Aaron.test1.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.testingot, 2), " i ", "ici", " i ", 'i', new ItemStack(Items.iron_ingot), 'c', new ItemStack(Items.coal));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.testingot), new ItemStack(ModBlocks.testore), new ItemStack(Items.coal));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testingot, 6), "gig", "ici", "gig", 'i', "ingotIron", 'g', "ingotGold", 'c', new ItemStack(Items.coal)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.testingot, 3), "ingotIron", new ItemStack(ModBlocks.testore), new ItemStack(Items.coal)));

        GameRegistry.addSmelting(ModBlocks.testore, new ItemStack(ModItems.testingot), 0.7f);
    }
}
