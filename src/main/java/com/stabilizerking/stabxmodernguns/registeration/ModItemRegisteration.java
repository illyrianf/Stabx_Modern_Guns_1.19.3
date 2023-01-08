package com.stabilizerking.stabxmodernguns.registeration;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.*;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import com.stabilizerking.stabxmodernguns.item.M1GrandeGunItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.stabilizerking.stabxmodernguns.item.StabxModernGunsItem;

//This Class will be used to register every single piece of gun.
public class ModItemRegisteration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StabxModernGuns.MOD_ID);
    public static final Item.Properties genericProperties = new Item.Properties().stacksTo(1).tab(StabxModernGuns.GROUP);

    //Guns and Everything

    //Pistols
    public static final RegistryObject<Item> FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON = registerGun("500magnum_smith_and_wesson", false);
    public static final RegistryObject<Item> GLOCK_19C= registerGun("glock19c", false);
    public static final RegistryObject<Item> DESERT_EAGLE_MARK_14= registerGun("desert_eagle_mark14", false);

    //SMGs
    public static final RegistryObject<Item> MP_5_CLASSIC= registerGun("mp5_classic", false);
    public static final RegistryObject<Item> STRIKER_45= registerGun("striker45", false);
    public static final RegistryObject<Item> TEC_9= registerGun("tec9", false);
    public static final RegistryObject<Item> MP40= registerGun("mp40", false);


    //Assault Rifles
    public static final RegistryObject<Item> M_FOUR= registerGun("m4", false);
    public static final RegistryObject<Item> HK_416= registerGun("hk416", false);
    public static final RegistryObject<Item> MK_MOD_11= registerGun("mkmod11", false);
    public static final RegistryObject<Item> SCAR_17= registerGun("scar17", false);
    public static final RegistryObject<Item> AK47= registerGun("ak47", false);
    public static final RegistryObject<Item> AKM_762= registerGun("akm_762", false);
    public static final RegistryObject<Item> AKS_74UX= registerGun("aks74ux", false);
    public static final RegistryObject<Item> STG_44= registerGun("stg44", false);
    public static final RegistryObject<Item> ACR_BUSHMASTER= registerGun("acr_360_bushmaster", false);
    public static final RegistryObject<Item> M16= registerGun("m16", false);
    public static final RegistryObject<Item> M4A1= registerGun("m4a1", false);
    public static final RegistryObject<Item> G_36C_HD= registerGun("g36chd", false);

    //Rifles
    public static final RegistryObject<Item> ARISAKA_TYPE99= registerGun("arisaka_type99", false);
    public static final RegistryObject<M1GrandeGunItem> M_ONE_GRANDE = ITEMS.register("m1_grande",
            () -> new M1GrandeGunItem(new Item.Properties().stacksTo(1).tab(StabxModernGuns.GROUP)));


    //Sniper Rifles
    public static final RegistryObject<Item> ARTIC_WARFARE_MAGNUM= registerGun("artic_warfare_magnum", false);
    public static final RegistryObject<Item> BARRET_M82_SNIPER= registerGun("barrett_m82_sniper", false);

    //Shotguns
    public static final RegistryObject<Item> SPAS_12= registerGun("spas12", false);
    public static final RegistryObject<Item> AA_12= registerGun("aa12", false);

    //Light Machine Guns
    public static final RegistryObject<Item> M_60= registerGun("m60", false);

    //Mics other Guns
    public static final RegistryObject<Item> MK_170_CROSSBOW= registerGun("mk_170_crossbow", false);

    // Sights Attachments
    public static final RegistryObject<Item> ZA_MINI_RED_DOT_SIGHT = ITEMS.register("za_mini_red_dot_sight", () -> new ScopeItem(Scope.create(0.1F, 1.51F, GunModifiers.SLOW_ADS).viewFinderOffset(0.5), genericProperties, false));

    // Gun Stock
    public static final RegistryObject<Item> CUSTOM_STOCK = ITEMS.register("custom_stock", () -> new StockItem(Stock.create(GunModifiers.STABILISED), genericProperties, false));

    //Gun Barrel Attachments
    public static final RegistryObject<Item> ADVANCED_SUPPRESSOR = ITEMS.register("advanced_suppressor", () -> new BarrelItem(Barrel.create(17.0f, GunModifiers.SILENCED), genericProperties));

    //Under barrel attachments
    public static final RegistryObject<Item> ANGLED_FOREGRIP = ITEMS.register("angled_foregrip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.BETTER_CONTROL), genericProperties));


    //Weaapons Ammo
    public static final RegistryObject<Item> NINE_MM = registerAmmo("9mm");
    public static final RegistryObject<Item> NINE_X_NINTEEN_MM_PARABELLUM = registerAmmo("9x19mm_parabellum");
    public static final RegistryObject<Item> SEVEN_SIXTYTWO_MM = registerAmmo("7.62mm");
    public static final RegistryObject<Item> SEVEN_SIXTY_TWO_X_FIFTYONE_MM_NATO= registerAmmo("7.62x51mm_nato");
    public static final RegistryObject<Item> TWEVLE_GAUGE_BUCKSHOT_SLUG = registerAmmo("12gauge_buckshot_slug_shell_360");
    public static final RegistryObject<Item> FIVE_FIFTYSIX_X_FOURTY_FIVE_NATO = registerAmmo("5.56x45_nato");
    public static final RegistryObject<Item> SEVEN_SEVEN_X_FIFTY_EIGHT_MM = registerAmmo("7.7x58mm");
    public static final RegistryObject<Item> SEVEN_THIRTYTWO_MM_KURZ = registerAmmo("7.32x33mm_kurz");
    public static final RegistryObject<Item> FIFTY_CALIBER = registerAmmo("50_caliber");
    public static final RegistryObject<Item> THREE_HUNDRED_WM = registerAmmo("300wm");
    public static final RegistryObject<Item> FIFTY_AE = registerAmmo("50ae");
    public static final RegistryObject<Item> FOURTY_FIVE_ACP = registerAmmo("45acp");
    public static final RegistryObject<Item> THIRTY_SIXTY_SPRINGFIELD_CARTRIDGE = registerAmmo("30_60_springfield_cartridge");
    public static final RegistryObject<Item> FIFTY_BMG = registerAmmo("50bmg");
    public static final RegistryObject<Item> MK_CROSSBOW_ARROW= registerAmmo("mk_crossbow_arrow");


   //Just a helper Methid used here for gun coloring
    private static RegistryObject<Item> registerGun(String name, boolean canColor) {
        return ITEMS.register(name, () -> new StabxModernGunsItem(genericProperties, canColor));
    }

    private static RegistryObject<Item> registerAmmo(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(StabxModernGuns.GROUP)));
    }

}
