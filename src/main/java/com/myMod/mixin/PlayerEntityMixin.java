package com.myMod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.server.network.ServerPlayerEntity;

@Mixin(ServerPlayerEntity.class) 
public class PlayerEntityMixin {


    @Inject(method = "onSpawn", at = @At("HEAD"))
    private void onPlayerSpawn(CallbackInfo info) {
        System.out.println("Player " + ((ServerPlayerEntity) (Object) this).getName().getString() + " enter the game!");
    }
}