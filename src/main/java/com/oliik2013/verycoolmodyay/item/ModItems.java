package com.oliik2013.verycoolmodyay.item;

import com.oliik2013.verycoolmodyay.Verycoolmodyay;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.Objects;

public class ModItems {

    public static final Identifier FRIEDEGG_ID = Identifier.of("verycoolmodyay", "friedegg");

    public static void registerModItems() {
        Item FRIEDEGG = Registry.register(Registries.ITEM, Identifier.of("verycoolmodyay", "friedegg"), new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("verycoolmodyay", "friedegg"))).food(Objects.requireNonNull(ModFoodComponents.FRIEDEGG, "ModFoodComponents.FRIEDEGG is null!"))));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.add(FRIEDEGG));
        Verycoolmodyay.LOGGER.info("Registered item: " + FRIEDEGG_ID);
    }

}