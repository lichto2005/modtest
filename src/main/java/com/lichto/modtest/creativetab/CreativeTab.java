package com.lichto.modtest.creativetab;

import com.lichto.modtest.reference.Reference;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import net.minecraft.creativetab.CreativeTabs;
import com.lichto.modtest.init.ModItems;
import net.minecraft.item.Item;

/**
 * Created by Noah Lichtenstein on 6/19/2016.
 */
public class CreativeTab
{
    public static final CreativeTabs MT_TAB = new CreativeTabs(Reference.MOD_ID_LOWERCASE)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.leaf;
        }

        public String getTabLabel()
        {
            return Reference.MOD_ID;
        }

        public String getTranslatedTabLabel()
        {
            return getTabLabel();
        }
    };

}
