package com.gcole.surgium.item;

import com.gcole.surgium.Surgium;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Surgium.MOD_ID);

    public static final RegistryObject<Item> SURGIUMINGOT = ITEMS.register("surgium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SURGIUM_TAB)));
    public static final RegistryObject<Item> RAWSURGIUM = ITEMS.register("raw_surgium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SURGIUM_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



}
