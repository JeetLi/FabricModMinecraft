package com.myMod;

import net.fabricmc.api.ModInitializer;

public class MyFirstMod implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("Hello, Minecraft!");
    }
}