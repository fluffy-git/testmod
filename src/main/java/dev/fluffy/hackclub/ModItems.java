package dev.fluffy.hackclub;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of("hackclub", id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE));
    }

    public static final Item SUSPICIOUS_SUBSTANCE = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new Item.Settings().maxCount(12)),
            "suspicious_substance"
    );}