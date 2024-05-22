package io.github.azurejelly.volumefix.mixins;

import net.minecraft.client.audio.SoundManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(SoundManager.class)
public abstract class SoundManagerMixin {

    @ModifyVariable(method = "setSoundCategoryVolume", at = @At("HEAD"), argsOnly = true)
    private float modifyVolume(float volume) {
        return (float) Math.pow(volume, 2);
    }
}