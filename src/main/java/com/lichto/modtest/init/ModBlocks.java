package com.lichto.modtest.init;

import com.lichto.modtest.block.BlockFlag;
import com.lichto.modtest.block.BlockMT;
import com.lichto.modtest.reference.Names;
import com.lichto.modtest.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Noah Lichtenstein on 6/20/2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMT flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    }
}
