package com.bcoburn3.mendedgems.handler;

import java.util.ArrayList;
import java.util.List;

import com.bcoburn3.mendedgems.client.ItemMeshGem;
import com.bcoburn3.mendedgems.common.item.ItemGem;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@EventBusSubscriber
public class RegistryHandler {
    
    public static Item gem;

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(gem = new ItemGem());
    }
                
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        ModelBakery.registerItemVariants(gem, ItemMeshGem.LESSER);
        ModelBakery.registerItemVariants(gem, ItemMeshGem.GREATER);
        ModelLoader.setCustomMeshDefinition(gem, new ItemMeshGem());
    } 
}
