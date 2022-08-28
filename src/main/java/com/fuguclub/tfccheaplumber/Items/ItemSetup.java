package com.fuguclub.tfccheaplumber.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.dunk.tfc.api.Constant.Global;
import com.dunk.tfc.api.Crafting.CraftingManagerTFC;
import com.dunk.tfc.api.Crafting.ShapelessRecipesTFC;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import com.dunk.tfc.api.TFCBlocks;
import com.dunk.tfc.api.TFCItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

public class ItemSetup {

    public static Item NPPlank;

    public static Item[] doors;

    public static void loadItems(){
        NPPlank = new ItemNPLumber().setUnlocalizedName("NPPlank");
    }

    public static void registerItems(){
        GameRegistry.registerItem(NPPlank, "NPPlank");
    }

    public static void removeExistingRecipes() {
        for(int i = 0; i < 32; i++) {
        removeRecipe(GameRegistry.findItem("terrafirmacraftplus", "Chest TFC"), 1, i, "terrafirmacraftplus");
        }
    }
    public static void registerRecipes() {

        for(int i = 0; i < Global.WOOD_ALL.length; i++){
        {

            //GameRegistry.addRecipe(new ItemStack(doors[i]), "WW", "WW", "WW", 'W', new ItemStack(ItemSetup.NPPlank, 1, i));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TFCBlocks.chest, 1, i), "###", "# #", "###", '#', new ItemStack(ItemSetup.NPPlank, 1, i)));
            GameRegistry.addRecipe(new ItemStack(TFCBlocks.toolRack, 1, i), "###", "   ", "###", '#', new ItemStack(ItemSetup.NPPlank, 1, i));

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemSetup.NPPlank, 8, i), new ItemStack(TFCItems.logs, 1, 2 * i), "itemSaw"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemSetup.NPPlank, 8, i), new ItemStack(TFCItems.logs, 1, 2 * i + 1), "itemSaw"));
            GameRegistry.addRecipe(new ItemStack(TFCBlocks.barrel, 1, i), "# #", "# #", "###", '#', new ItemStack(ItemSetup.NPPlank, 1, i));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TFCBlocks.loom, 1, i), "LLL", "LSL", "L L", 'L', new ItemStack(ItemSetup.NPPlank, 1, i), 'S', "stickWood"));

            if(i>=0 & i<=15){
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemSetup.NPPlank, 4, i), new ItemStack(TFCBlocks.planks, 1, i), "itemSaw"));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.planks, 1, i), "11", "11", '1', new ItemStack(ItemSetup.NPPlank, 1, i));

                GameRegistry.addRecipe(new ItemStack(TFCBlocks.fence, 6, i), "LPL", "LPL", 'L', new ItemStack(TFCItems.logs, 1, 2 * i), 'P',
                        new ItemStack(ItemSetup.NPPlank, 1, i));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.fence, 6, i), "LPL", "LPL", 'L', new ItemStack(TFCItems.logs, 1, 2 * i + 1), 'P',
                        new ItemStack(ItemSetup.NPPlank, 1, i));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.fenceGate, 2, i), "LPL", "LPL", 'L', new ItemStack(ItemSetup.NPPlank, 1, i), 'P',
                        new ItemStack(TFCBlocks.planks, 1, i));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.armorStand, 1, i), "###", " # ", "%%%", '#', new ItemStack(ItemSetup.NPPlank, 1, i), '%',
                        new ItemStack(TFCBlocks.planks, 1, i));
            } else if(i>15 & i<=31){
                int i2 = i-16;
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemSetup.NPPlank, 4, i), new ItemStack(TFCBlocks.planks2, 1, i2), "itemSaw"));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.planks2, 1, i2), "11", "11", '1', new ItemStack(ItemSetup.NPPlank, 1, i));

                if(i2+16<32 & i2>15) {
                    GameRegistry.addRecipe(new ItemStack(TFCBlocks.fence2, 6, i2), "LPL", "LPL", 'L', new ItemStack(TFCItems.logs, 1, 2 * i), 'P',
                            new ItemStack(ItemSetup.NPPlank, 1, i2 + 16));
                    GameRegistry.addRecipe(new ItemStack(TFCBlocks.fence2, 6, i2), "LPL", "LPL", 'L', new ItemStack(TFCItems.logs, 1, 2 * i + 1), 'P',
                            new ItemStack(ItemSetup.NPPlank, 1, i2 + 16));
                }
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.fenceGate2, 2, i2), "LPL", "LPL", 'L', new ItemStack(ItemSetup.NPPlank, 1, i), 'P',
                        new ItemStack(TFCBlocks.planks2, 1, i2));

                GameRegistry.addRecipe(new ItemStack(TFCBlocks.armorStand2, 1, i2), "###", " # ", "%%%", '#', new ItemStack(ItemSetup.NPPlank, 1, i), '%',
                        new ItemStack(TFCBlocks.planks2, 1, i2));
            } else if(i == 32){
                int i3 = i-32;
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemSetup.NPPlank, 4, i), new ItemStack(TFCBlocks.planks3, 1, i3), "itemSaw"));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.planks3, 1, i3), "11", "11", '1', new ItemStack(ItemSetup.NPPlank, 1, i));

                GameRegistry.addRecipe(new ItemStack(TFCBlocks.fence3, 6, i3), "LPL", "LPL", 'L', new ItemStack(TFCItems.logs, 1, 2 * i), 'P',
                        new ItemStack(ItemSetup.NPPlank, 1, i));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.fence3, 6, i3), "LPL", "LPL", 'L', new ItemStack(TFCItems.logs, 1, 2 * i + 1), 'P',
                        new ItemStack(ItemSetup.NPPlank, 1, i));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.fenceGate3, 2, i3), "LPL", "LPL", 'L', new ItemStack(ItemSetup.NPPlank, 1, i), 'P',
                        new ItemStack(TFCBlocks.planks2, 1, i3));
                GameRegistry.addRecipe(new ItemStack(TFCBlocks.armorStand3, 1, i3), "###", " # ", "%%%", '#', new ItemStack(ItemSetup.NPPlank, 1, i), '%',
                        new ItemStack(TFCBlocks.planks3, 1, i3));

            }

        }


        }


    }

    public static void removeRecipe(Item resultItem, int stacksize, int meta, String modID) {
        ItemStack resultStack = new ItemStack(resultItem, stacksize, meta);
        ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
        for (int scan = 0; scan < recipes.size(); scan++) {
            IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
            if (tmpRecipe instanceof ShapedRecipes) {
                ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }
            if (tmpRecipe instanceof ShapelessRecipes) {
                ShapelessRecipes recipe = (ShapelessRecipes)tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }
            if (ItemStack.areItemStacksEqual(resultStack, recipeResult)) {
                System.out.println(modID + " Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }
        }
    }

}