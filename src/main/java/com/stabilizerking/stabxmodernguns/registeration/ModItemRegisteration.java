package com.stabilizerking.stabxmodernguns.registeration;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.*;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.stabilizerking.stabxmodernguns.item.StabxModernGunsItem;

//This Class will be used to register every single piece of gun.
public class ModItemRegisteration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StabxModernGuns.MOD_ID);
    public static final Item.Properties genericProperties = new Item.Properties().stacksTo(1).tab(StabxModernGuns.GROUP);

    //Guns in the Modern Mod

    public static final RegistryObject<Item> FIVE_ZERO_ZERO_MAGNUM_SMITH_AND_WESSON = registerGun("500magnum_smith_and_wesson", false);

    public static final RegistryObject<Item> GLOCK_ONE_NINE_C= registerGun("glock19c", false);
    public static final RegistryObject<Item> HK_FOUR_ONE_SIX= registerGun("hk416", false);
    public static final RegistryObject<Item> MK_MOD_ONE_ONE= registerGun("mkmod11", false);
    public static final RegistryObject<Item> SCAR_ONE_SEVEN= registerGun("scar17", false);
    public static final RegistryObject<Item> AK_FOUR_SEVEN= registerGun("ak47", false);
    public static final RegistryObject<Item> AKS_SEVENTY_FOUR_UX= registerGun("aks74ux", false);
    public static final RegistryObject<Item> STG_FOUR_FOUR= registerGun("stg44", false);
    public static final RegistryObject<Item> MP_FIVE= registerGun("mp5_classic", false);
    public static final RegistryObject<Item> M_SIXTEEN= registerGun("m16", false);
    public static final RegistryObject<Item> M_FOUR= registerGun("m4", false);
    public static final RegistryObject<Item> G_THIRTYSIX_CHD= registerGun("g36chd", false);
    public static final RegistryObject<Item> M_FOUR_A_ONE= registerGun("m4a1", false);
    public static final RegistryObject<Item> SPAS_ONE_TWO= registerGun("spas12", false);
    public static final RegistryObject<Item> ARISAKA_TYPE_NINE_NINE= registerGun("arisaka_type99", false);
    public static final RegistryObject<Item> ARTIC_WARFARE_MAGNUM= registerGun("artic_warfare_magnum", false);
    public static final RegistryObject<Item> AA_TWELVE= registerGun("aa12", false);
    public static final RegistryObject<Item> STRIKER_FOURTY_FIVE= registerGun("striker45", false);
    public static final RegistryObject<Item> AKM_SEVEN_SIXTYTWO= registerGun("akm_762", false);
    public static final RegistryObject<Item> M_SIXTY= registerGun("m60", false);
    public static final RegistryObject<Item> DESERT_EAGLE_MARK_FOURTEEN= registerGun("desert_eagle_mark14", true);


    // Sights Attachments
    public static final RegistryObject<Item> ZA_MINI_RED_DOT_SIGHT = ITEMS.register("za_mini_red_dot_sight", () -> new ScopeItem(Scope.create(0.1F, 1.51F, GunModifiers.SLOW_ADS).viewFinderOffset(0.5), genericProperties, false));

   // Gun Stock
    public static final RegistryObject<Item> CUSTOM_STOCK = ITEMS.register("custom_stock", () -> new StockItem(Stock.create(GunModifiers.STABILISED), genericProperties, false));

    //Gun Barrel Attachments
    public static final RegistryObject<Item> ADVANCED_SUPPRESSOR = ITEMS.register("advanced_suppressor", () -> new BarrelItem(Barrel.create(17.0f, GunModifiers.SILENCED), genericProperties));

    //ForeGrips And Under barrel attachments
    public static final RegistryObject<Item> ANGLED_FOREGRIP = ITEMS.register("angled_foregrip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.BETTER_CONTROL), genericProperties));


    //Weaapons Ammo
    public static final RegistryObject<Item> NINE_MM = registerAmmo("9mm");
    public static final RegistryObject<Item> SEVEN_SIXTYTWO_MM = registerAmmo("7.62mm");
    public static final RegistryObject<Item> TOWEVLE_GUAGE_BUCKSHOT = registerAmmo("12gauge_buckshot_slug_shell_360");
    public static final RegistryObject<Item> FIVE_FIFTYSIX_X_FOURTY_FIVE_NATO = registerAmmo("5.56x45_nato");
    public static final RegistryObject<Item> SEVEN_SEVEN_X_FIFTY_EIGHT_MM = registerAmmo("7.7x58mm");
    public static final RegistryObject<Item> SEVEN_THIRTYTWO_MM_KURZ = registerAmmo("7.32x33mm_kurz");
    public static final RegistryObject<Item> FIFTY_CALIBER = registerAmmo("50_caliber");
    public static final RegistryObject<Item> THREE_HUNDRED_WM = registerAmmo("300wm");
    public static final RegistryObject<Item> FIFTY_AE = registerAmmo("50ae");
    public static final RegistryObject<Item> FOURTYFIVE_ACP = registerAmmo("45acp");


   //Just a helper Methid used here for gun coloring
    private static RegistryObject<Item> registerGun(String name, boolean canColor) {
        return ITEMS.register(name, () -> new StabxModernGunsItem(genericProperties, canColor));
    }

    private static RegistryObject<Item> registerAmmo(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(StabxModernGuns.GROUP)));
    }

}
