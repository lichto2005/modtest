package com.lichto.modtest.init;

import com.lichto.modtest.item.ItemLeaf;
import com.lichto.modtest.item.ItemMT;
import com.lichto.modtest.reference.Names;
import com.lichto.modtest.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Noah Lichtenstein on 6/19/2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemMT leaf = new ItemLeaf();

    public static void init()
    {
        // this registery is how the item is referenced
        GameRegistry.registerItem(leaf, Names.Items.LEAF);
    }
}
