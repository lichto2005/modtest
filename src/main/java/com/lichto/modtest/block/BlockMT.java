package com.lichto.modtest.block;

import com.lichto.modtest.creativetab.CreativeTab;
import com.lichto.modtest.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Noah Lichtenstein on 6/20/2016.
 */
public class BlockMT extends Block
{
    public BlockMT(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTab.MT_TAB);
    }

    public BlockMT()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTab.MT_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID_LOWERCASE + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
