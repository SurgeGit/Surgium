package com.gcole.surgium.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SURGIUM_TAB = new CreativeModeTab("surgiumtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SURGIUMINGOT.get());
        }
    };
}
