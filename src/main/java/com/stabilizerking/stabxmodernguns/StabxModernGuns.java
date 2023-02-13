package com.stabilizerking.stabxmodernguns;

import com.mrcrayfish.guns.item.GunItem;
import com.stabilizerking.stabxmodernguns.client.ClientHandler;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModSoundRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.StabxCreativeModeTab;
import com.stabilizerking.stabxmodernguns.utils.StabxModUtils;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.List;

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


    //-----------------------In here we Are Registering creative tabs in 1.19.3 also adding items mannually for each tab----------------------//


    //----------------------------------------------------Pistols-------------------------------------------------------------------------------//

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get());
            gunItems.add(ModItemRegisteration.GLOCK_19_C.get());
            gunItems.add(ModItemRegisteration.DESERT_EAGLE_MARK_14.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //----------------------------------------------------Sub Machine Guns-------------------------------------------------------------------------------//


        if (event.getTab() == StabxCreativeModeTab.STABX_SMGS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.MP5_CLASSIC.get());
            gunItems.add(ModItemRegisteration.MP40.get());
            gunItems.add(ModItemRegisteration.TEC9.get());
            gunItems.add(ModItemRegisteration.STRIKER45.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }
        //----------------------------------------------------Assault Rifles-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_ASSAULT_RIFLES_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.M4.get());
            gunItems.add(ModItemRegisteration.M4A1.get());
            gunItems.add(ModItemRegisteration.M16.get());
            gunItems.add(ModItemRegisteration.MK_MOD11.get());
            gunItems.add(ModItemRegisteration.SCAR_17.get());
            gunItems.add(ModItemRegisteration.ACR_BUSHMASTER.get());
            gunItems.add(ModItemRegisteration.G36C_HD.get());
            gunItems.add(ModItemRegisteration.AK_47.get());
            gunItems.add(ModItemRegisteration.AKM_762.get());
            gunItems.add(ModItemRegisteration.AKS_74_UX.get());
            gunItems.add(ModItemRegisteration.STG44.get());
            gunItems.add(ModItemRegisteration.HK416.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //----------------------------------------------------Rifles-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_RIFLES_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.ARISAKA_TYPE_99.get());
            gunItems.add(ModItemRegisteration.M1_GRANDE.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }
        //-------------------------------------------------Sniper Rifles-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_SNIPER_RIFLES_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.BARRETT_M82.get());
            gunItems.add(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }
        //-------------------------------------------------Shotguns-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_SHOTGUNS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.AA_12.get());
            gunItems.add(ModItemRegisteration.SPAS_12.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //-------------------------------------------------Light Machine Guns-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_LMGS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.M60.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //----------------------------------------------Miscellaneous-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_MISCELLANEOUS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.MK_170_CROSSBOW.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }

        }
        //----------------------------------------------Attachmments-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_ATTACHMENTS_GROUP) {
            event.accept(ModItemRegisteration.RED_DOT_SIGHT);
            event.accept(ModItemRegisteration.HOLOGRAPHIC_SIGHT);
            event.accept(ModItemRegisteration.ACOG_SIGHT);
            event.accept(ModItemRegisteration.ZA_MINI_RED_DOT_SIGHT);
            event.accept(ModItemRegisteration.CUSTOM_STOCK);
            event.accept(ModItemRegisteration.ANGLED_FOREGRIP);
            event.accept(ModItemRegisteration.VERTICAL_FOREGRIP);
            event.accept(ModItemRegisteration.ADVANCED_MUZZLE_BRAKE);
            event.accept(ModItemRegisteration.ADVANCED_SUPPRESSOR);
        }

        //----------------------------------------------Ammuniation-------------------------------------------------------------------------------//


        if (event.getTab() == StabxCreativeModeTab.STABX_AMMUNITION_GROUP) {
            event.accept(ModItemRegisteration.NINE_MM);
            event.accept(ModItemRegisteration.NINE_X_19MM_PARABELLUM);
            event.accept(ModItemRegisteration.SEVEN_62_MM);
            event.accept(ModItemRegisteration.SEVEN_32_X_51_MM_NATO);
            event.accept(ModItemRegisteration.TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL);
            event.accept(ModItemRegisteration.FIVE_56_X_45_NATO);
            event.accept(ModItemRegisteration.SEVEN_7_X_58_MM);
            event.accept(ModItemRegisteration.SEVEN_32_X_33_MM_KURZ);
            event.accept(ModItemRegisteration.FIFTY_CALIBER);
            event.accept(ModItemRegisteration.FOURTY_FIVE_ACP);
            event.accept(ModItemRegisteration.THRITY_SIXTY_AMMO);
            event.accept(ModItemRegisteration.FIFTY_AE);
            event.accept(ModItemRegisteration.THREE_HUNDRED_WM);
            event.accept(ModItemRegisteration.FIFTY_BMG);
            event.accept(ModItemRegisteration.MK_CROSSBOW_ARROW);

        }
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientHandler::registerModelOverrides);
    }
}
