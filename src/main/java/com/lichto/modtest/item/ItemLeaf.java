package com.lichto.modtest.item;

/**
 * Created by Noah Lichtenstein on 6/19/2016.
 */
public class ItemLeaf extends ItemMT
{
    public ItemLeaf()
    {
        super();
        // dont know how this name affects anything
        setRegisterName("leaf");
        this.setUnlocalizedName(getRegisterName());
    }


}
