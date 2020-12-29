package com.bcoburn3.mendedgems;

import java.util.ArrayList;
import java.util.List;

import com.bcoburn3.mendedgems.client.ItemMeshGem;
import com.bcoburn3.mendedgems.common.item.ItemGem;
import com.bcoburn3.mendedgems.common.misc.IProxy;
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
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.common.DimensionManager;
import net.minecraft.world.WorldServer;

@Mod(modid = MendedGems.MOD_ID, name = MendedGems.MOD_NAME, version = MendedGems.VERSION)
public class MendedGems {
        
    public static final String MOD_ID = "mendedgems";
    public static final String MOD_NAME = "Mended Gem";
    public static final String VERSION = "1.0.0";
        
    @Instance
    public static MendedGems instance;
    
    @SidedProxy(
        clientSide = "com.bcoburn3.mendedgems.client.ClientProxy",
        serverSide = "com.bcoburn3.mendedgems.common.ServerProxy"
    )
    public static IProxy proxy;
}
