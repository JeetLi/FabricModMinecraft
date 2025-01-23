package com.clientMod;

import net.minecraft.client.network.ClientPlayerEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.text.Text;

public class GetHello implements ClientModInitializer {

    private boolean messageSent = false;

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (!messageSent) { 
                ClientPlayerEntity player = client.player;
                if (player != null) {
                    player.sendMessage(Text.of("Hello world!"), false);
                    messageSent = true; 
                }
            }
        });
    }
}