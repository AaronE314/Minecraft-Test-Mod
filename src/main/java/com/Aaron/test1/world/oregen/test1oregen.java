package com.Aaron.test1.world.oregen;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class test1oregen {
    public static void test1(){
        initWorldGen();
    }

    public static void initWorldGen() {
        registerWorldGen(new TestOreGen(), 1);
    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability) {
        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
    }

}
