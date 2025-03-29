package com.oliik2013.verycoolmodyay.item;

import com.oliik2013.verycoolmodyay.Verycoolmodyay;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item FRIEDEGG = registerItem("friedegg", new Item(new FabricItemSettings().food(ModFoodComponents.FRIEDEGG)));

    private static void addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(FRIEDEGG);
    }



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Verycoolmodyay.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Verycoolmodyay.LOGGER.info("loading/registering items for " + Verycoolmodyay.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
    }
}
