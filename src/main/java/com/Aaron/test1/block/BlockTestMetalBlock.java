package com.Aaron.test1.block;

import net.minecraft.block.material.Material;

public class BlockTestMetalBlock extends Blocktest1 {
    public BlockTestMetalBlock() {
        super(Material.iron);
        this.setStepSound(soundTypeMetal);
        this.setBlockName("testmetalblock");
        this.setHardness(5f);
    }
}
