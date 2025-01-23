package com.myMod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MyFirstMod implements ModInitializer {

    // Экземпляр нового предмета
    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings());

    @Override
    public void onInitialize() {
        // Сообщение при запуске в консоль
        System.out.println("Hello, Minecraft!");

        // Регистрация предмета
        Registry.register(Registries.ITEM, new Identifier("myfirstmod", "fabric_item"), FABRIC_ITEM);

        // Добавление предмета в группу
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> {
            content.add(FABRIC_ITEM);
        });
    }
}
