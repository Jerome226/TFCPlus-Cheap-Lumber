package com.fuguclub.tfccheaplumber.Items;

import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.Constant.Global;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import com.fuguclub.tfccheaplumber.Tags;
import com.dunk.tfc.Core.TFCTabs;

import java.util.List;

public class ItemNPLumber extends ItemTerra {

    private final IIcon[] icons = new IIcon[Global.WOOD_ALL.length];

    ItemNPLumber(){
        super();
        this.hasSubtypes = true;
        this.setMaxDamage(0);
        setCreativeTab(TFCTabs.TFC_MISC);
        this.metaNames = Global.WOOD_ALL.clone();
        this.setWeight(EnumWeight.LIGHT);
        this.setSize(EnumSize.MEDIUM);
    }

    @Override
    public IIcon getIconFromDamage(int meta)
    {
        return icons[meta];
    }

    @Override
    public void registerIcons(IIconRegister registerer)
    {
        for(int i = 0; i < Global.WOOD_ALL.length; i++) {
            icons[i] = registerer.registerIcon(Tags.MODID + ":" + "wood/"+Global.WOOD_ALL[i]+"NPPlank");
        }
    }

    @Override
    public void getSubItems(Item par1, net.minecraft.creativetab.CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < Global.WOOD_ALL.length; i++) {
            list.add(new ItemStack(this,1,i));
        }
    }
}