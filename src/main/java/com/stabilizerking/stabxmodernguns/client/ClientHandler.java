package com.stabilizerking.stabxmodernguns.client;

import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.mrcrayfish.guns.client.render.gun.model.ShortScopeModel;

public class ClientHandler {
    public static void registerModelOverrides() {
        ModelOverrides.register(ModItemRegisteration.ZA_MINI_RED_DOT_SIGHT.get(), new ShortScopeModel());
    }
}
