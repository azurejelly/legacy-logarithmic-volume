package io.github.azurejelly.volumefix.mixins;

import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameSettings.class)
public abstract class GameSettingsMixin {

    @Inject(
            method = "getSoundLevel",
            at = @At("RETURN"),
            cancellable = true
    )
    private void updateSoundLevel(SoundCategory category, CallbackInfoReturnable<Float> callback) {
        float vol = callback.getReturnValue();
        callback.setReturnValue((float) Math.pow(vol, 2));
    }
}
