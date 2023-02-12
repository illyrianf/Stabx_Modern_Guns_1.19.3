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

//This Class will be used to register every single piece of gun.
public class ModItemRegisteration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StabxModernGuns.MOD_ID);

    // In here Each Gun is Divided into Different Categories So We can easily Understand from Which Category the Gun belongs :).

    //-------------------------------------------------Pistols ---------------------------------------------------------------//
    public static final RegistryObject<GunItem> FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON = ITEMS.register("500magnum_smith_and_wesson",
            () -> new GunItem(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<GunItem> GLOCK_19_C = ITEMS.register("glock19c",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> DESERT_EAGLE_MARK_14= ITEMS.register("desert_eagle_mark14",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    //-------------------------------------------------Sub Machine Guns ----------------------------------------------//

    public static final RegistryObject<GunItem> MP5_CLASSIC= ITEMS.register("mp5_classic",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> STRIKER45= ITEMS.register("striker45",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> MP40= ITEMS.register("mp40",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> TEC9= ITEMS.register("tec9",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    //-------------------------------------------------Assault Rifles ---------------------------------------------------------------//

    public static final RegistryObject<GunItem> M4= ITEMS.register("m4",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> HK416= ITEMS.register("hk416",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> MK_MOD11= ITEMS.register("mkmod11",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> SCAR_17= ITEMS.register("scar17",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> AK_47= ITEMS.register("ak47",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> AKM_762= ITEMS.register("akm_762",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> AKS_74_UX= ITEMS.register("aks74ux",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> STG44= ITEMS.register("stg44",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> M16= ITEMS.register("m16",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> M4A1= ITEMS.register("m4a1",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> G36C_HD= ITEMS.register("g36chd",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> ACR_BUSHMASTER= ITEMS.register("acr_360_bushmaster",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    //-----------------------------------------------------ShotGuns ---------------------------------------------------------------//

    public static final RegistryObject<GunItem> AA_12= ITEMS.register("aa12",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> SPAS_12= ITEMS.register("spas12",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    //------------------------------------------------------Rifles---------------------------------------------------------------//

    public static final RegistryObject<GunItem> ARISAKA_TYPE_99= ITEMS.register("arisaka_type99",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<M1GrandeGunItem> M1_GRANDE = ITEMS.register("m1_grande",
            () -> new M1GrandeGunItem(new Item.Properties().stacksTo(1)));

    //----------------------------------------------------Sniper Rifles---------------------------------------------------------------//

    public static final RegistryObject<GunItem> ARTIC_WARFARE_MAGNUM= ITEMS.register("artic_warfare_magnum",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<GunItem> BARRETT_M82= ITEMS.register("barrett_m82_sniper",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    //--------------------------------------------------Light Machine Guns ---------------------------------------------------------------//

    public static final RegistryObject<GunItem> M60= ITEMS.register("m60",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    //----------------------------------------------------Miscellaneous---------------------------------------------------------------//

    public static final RegistryObject<GunItem> MK_170_CROSSBOW= ITEMS.register("mk_170_crossbow",
            () -> new GunItem(new Item.Properties().stacksTo(1)));

    //---------------------------------------Guns Attachments / Sight Scope Attachments ---------------------------------------------------------------//

    public static final RegistryObject<ScopeItem> ZA_MINI_RED_DOT_SIGHT = ITEMS.register("za_mini_red_dot_sight",
            () -> new ScopeItem(Scope.builder().modifiers(GunModifiers.SLOW_ADS).build(), new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ScopeItem> RED_DOT_SIGHT = ITEMS.register("red_dot_sight",
            () -> new ScopeItem(Scope.builder().modifiers(GunModifiers.SLOW_ADS).build(),new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ScopeItem> HOLOGRAPHIC_SIGHT = ITEMS.register("holographic_sight",
            () -> new ScopeItem(Scope.builder().modifiers(GunModifiers.REDUCED_RECOIL).build(),new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ScopeItem> ACOG_SIGHT = ITEMS.register("acog_sight",
            () -> new ScopeItem(Scope.builder().modifiers(GunModifiers.STABILISED).build(), new Item.Properties().stacksTo(1)));


    //---------------------------------------------------- Stock Attachments ---------------------------------------------------------------//

    public static final RegistryObject<StockItem> CUSTOM_STOCK = ITEMS.register("custom_stock",
            () -> new StockItem(Stock.create(GunModifiers.STABILISED),new Item.Properties().stacksTo(1)));


    //--------------------------------------------------- Barrel Attachments ---------------------------------------------------------------//

    public static final RegistryObject<BarrelItem> ADVANCED_SUPPRESSOR = ITEMS.register("advanced_suppressor",
            () -> new BarrelItem(Barrel.create(17.0f, GunModifiers.SILENCED),new Item.Properties().stacksTo(1)));

    public static final RegistryObject<BarrelItem> ADVANCED_MUZZLE_BRAKE = ITEMS.register("advanced_muzzle_brake",
            () -> new BarrelItem(Barrel.create(7.0f, GunModifiers.SUPER_STABILISED),new Item.Properties().stacksTo(1)));


    //-------------------------------------------------- UnderBarrel Attachments ---------------------------------------------------------------//

    public static final RegistryObject<UnderBarrelItem> ANGLED_FOREGRIP = ITEMS.register("angled_foregrip",
            () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.REDUCED_RECOIL),new Item.Properties().stacksTo(1)));

    public static final RegistryObject<UnderBarrelItem> VERTICAL_FOREGRIP = ITEMS.register("vertical_foregrip",
            () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.BETTER_CONTROL),new Item.Properties().stacksTo(1)));

    //-------------------------------------------------------Weapons Ammunition--------------------------------------------------------------//

    public static final RegistryObject<Item> NINE_MM = ITEMS.register("9mm",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> NINE_X_19MM_PARABELLUM = ITEMS.register("9x19mm_parabellum",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> SEVEN_62_MM = ITEMS.register("7.62mm",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL = ITEMS.register("12gauge_buckshot_slug_shell_360",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> FIVE_56_X_45_NATO =ITEMS.register("5.56x45_nato",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> SEVEN_7_X_58_MM = ITEMS.register("7.7x58mm",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> SEVEN_32_X_33_MM_KURZ = ITEMS.register("7.32x33mm_kurz",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> FIFTY_CALIBER =ITEMS.register("50_caliber",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> THREE_HUNDRED_WM = ITEMS.register("300wm",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> FIFTY_AE = ITEMS.register("50ae",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> FOURTY_FIVE_ACP =ITEMS.register("45acp",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> SEVEN_32_X_51_MM_NATO =ITEMS.register("7.62x51mm_nato",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> FIFTY_BMG = ITEMS.register("50bmg",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> THRITY_SIXTY_AMMO = ITEMS.register("30_60_springfield_cartridge",
            () -> new AmmoItem(new Item.Properties()));

    public static final RegistryObject<Item> MK_CROSSBOW_ARROW = ITEMS.register("mk_crossbow_arrow",
            () -> new AmmoItem(new Item.Properties()));


    private static RegistryObject<Item> registerAmmo(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties()));
    }

}
