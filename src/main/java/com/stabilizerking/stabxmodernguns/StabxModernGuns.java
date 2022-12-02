package com.stabilizerking.stabxmodernguns;

import com.stabilizerking.stabxmodernguns.client.ClientHandler;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModSoundRegisteration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StabxModernGuns.MOD_ID)
public class StabxModernGuns {
    public static final String MOD_ID = "stabxmodernguns";
    public static final CreativeModeTab GROUP = new StabxModernGunsTab(MOD_ID);

    public StabxModernGuns() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        ModItemRegisteration.ITEMS.register(bus);
        ModSoundRegisteration.SOUNDS.register(bus);

        bus.addListener(this::clientSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
            ClientHandler.registerModelOverrides();
        }
}
