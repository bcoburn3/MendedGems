package com.bcoburn3.mendedgems.client;

import com.bcoburn3.mendedgems.MendedGems;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;

public class ItemMeshGem implements ItemMeshDefinition {
        
    public static final ModelResourceLocation LESSER = new ModelResourceLocation(MendedGems.MOD_ID + ":lesser");
    public static final ModelResourceLocation GREATER = new ModelResourceLocation(MendedGems.MOD_ID + ":greater");
        
    @Override
    public ModelResourceLocation getModelLocation(ItemStack stack) {
        return stack.getMetadata() >= 2 ? GREATER : LESSER;
    }
}
