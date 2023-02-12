package com.stabilizerking.stabxmodernguns;

import com.stabilizerking.stabxmodernguns.client.ClientHandler;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModSoundRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.StabxCreativeModeTab;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StabxModernGuns.MOD_ID)
public class StabxModernGuns {
    public static final String MOD_ID = "stabxmodernguns";

    public StabxModernGuns() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        ModItemRegisteration.ITEMS.register(bus);
        ModSoundRegisteration.SOUNDS.register(bus);

        bus.addListener(this::addCreative);
        bus.addListener(this::clientSetup);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP) {
            event.accept(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON);
            event.accept(ModItemRegisteration.GLOCK_19_C);
            event.accept(ModItemRegisteration.DESERT_EAGLE_MARK_14);
        }
        if(event.getTab() == StabxCreativeModeTab.STABX_SMGS_GROUP) {
            event.accept(ModItemRegisteration.MP5_CLASSIC);
            event.accept(ModItemRegisteration.MP40);
            event.accept(ModItemRegisteration.TEC9);
            event.accept(ModItemRegisteration.STRIKER45);
        }

    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientHandler::registerModelOverrides);
    }
}
