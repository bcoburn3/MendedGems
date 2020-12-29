package com.bcoburn3.mendedgems.client;

import com.bcoburn3.mendedgems.common.misc.IProxy;
import net.minecraft.client.resources.I18n;

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

@EventBusSubscriber
public class ClientProxy implements IProxy {

    @Override
    public String localize(String text) {
        return I18n.format(text);
    }

    @Override
    public String format(String text, Object... args) {
        return I18n.format(text, args);
    }
}
