package com.stabilizerking.stabxmodernguns.registeration;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundRegisteration {

    //Now this CLass will be use for every Single Gun Sounds
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StabxModernGuns.MOD_ID);

    // Gun Sounds

    //Pistols Gun Sounds
    public static final RegistryObject<SoundEvent> GLOCK_NINTEEN_C_FIRE = register("item.glock19c.fire");
    public static final RegistryObject<SoundEvent> GLOCK_NINTEEN_C_SUPPRESSED = register("item.glock19c.suppressed");
    public static final RegistryObject<SoundEvent> MAGNUM_FIVE_HUNDREDED_FIRE = register("item.magnum500.fire");
    public static final RegistryObject<SoundEvent> MAGNUM_FIVE_HUNDREDED_SUPPRESSED = register("item.magnum500.suppressed");
    public static final RegistryObject<SoundEvent> DESERT_EAGLE_MARK_FOURTEEN_FIRE = register("item.desert_eagle_mark14.fire");

    //SMGs Gun sounds
    public static final RegistryObject<SoundEvent> MP_FIVE_CLASSIC_FIRE = register("item.mp5_classic.fire");
    public static final RegistryObject<SoundEvent> MP_FIVE_CLASSIC_COCK = register("item.mp5_classic.cock");
    public static final RegistryObject<SoundEvent> STRIKER_FOURTY_FIVE_FIRE = register("item.striker45.fire");
    public static final RegistryObject<SoundEvent> STRIKER_FOURTY_FIVE_COCK = register("item.striker45.cock");

    //Assault Rifles Gun Sounds
    public static final RegistryObject<SoundEvent> AK_FOURTY_SEVEN_FIRE = register("item.ak47.fire");
    public static final RegistryObject<SoundEvent> AK_FOURTY_SEVEN_COCK = register("item.ak47.cock");
    public static final RegistryObject<SoundEvent> AK_FOURTY_SEVEN_SUPPRESSED = register("item.ak47.suppressed");
    public static final RegistryObject<SoundEvent> HK_FOUR_ONE_SIX_FIRE  = register("item.hk416.fire");
    public static final RegistryObject<SoundEvent> STG_FOURTY_FOUR_FIRE = register("item.stg44.fire");
    public static final RegistryObject<SoundEvent> STG_FOURTY_FOUR_SUPPRESSED = register("item.stg44.suppressed");
    public static final RegistryObject<SoundEvent> SCAR_SEVENTEEN_FIRE = register("item.scar17.fire");
    public static final RegistryObject<SoundEvent> SCAR_SEVENTEEN_SUPPRESSED = register("item.scar17.suppressed");
    public static final RegistryObject<SoundEvent> MK_MOD_ELEVEN_FIRE = register("item.mkmod11.fire");
    public static final RegistryObject<SoundEvent> MK_MOD_ELEVEN_SUPPRESSED = register("item.mkmod11.suppressed");
    public static final RegistryObject<SoundEvent> MK_MOD_ELEVEN_RELOAD = register("item.mkmod11.reload");
    public static final RegistryObject<SoundEvent> MK_MOD_ELEVEN_COCK = register("item.mkmod11.cock");
    public static final RegistryObject<SoundEvent> G_THIRTY_SIX_C_FIRE = register("item.g36c.fire");
    public static final RegistryObject<SoundEvent> G_THIRTY_SIX_C_SUPPRESSED = register("item.g36c.suppressed");
    public static final RegistryObject<SoundEvent> G_THIRTY_SIX_C_COCK = register("item.g36c.cock");
    public static final RegistryObject<SoundEvent> M_FOUR_FIRE = register("item.m4.fire");
    public static final RegistryObject<SoundEvent> M_FOUR_COCK = register("item.m4.cock");
    public static final RegistryObject<SoundEvent> M_SIXTEEN_FIRE = register("item.m16.fire");
    public static final RegistryObject<SoundEvent> M_SIXTEEN_SUPPRESSED = register("item.m16.suppressed");
    public static final RegistryObject<SoundEvent> M_SIXTEEN_COCK = register("item.m16.cock");
    public static final RegistryObject<SoundEvent> M_FOUR_A_ONE_FIRE = register("item.m4a1.fire");
    public static final RegistryObject<SoundEvent> M_FOUR_A_ONE_SUPPRESSED = register("item.m4a1.suppressed");
    public static final RegistryObject<SoundEvent> M_FOUR_A_ONE_COCK = register("item.m4a1.cock");

    //LMG Gun sounds
    public static final RegistryObject<SoundEvent> M_SIXTY_FIRE = register("item.m60.fire");
    public static final RegistryObject<SoundEvent> M_SIXTY_SUPPRESSED = register("item.m60.suppressed");


    //Rifles Gun Sounds
    public static final RegistryObject<SoundEvent> ARISAKA_TYPE_NINETY_NINE_FIRE = register("item.arisaka_type99.fire");
    public static final RegistryObject<SoundEvent> ARISAKA_TYPE_NINETY_NINE_COCK = register("item.arisaka_type99.cock");
    //Sniper Rifles Gun Sounds
    public static final RegistryObject<SoundEvent> ARTIC_WARFARE_MAGNUM_FIRE = register("item.artic_warfare_magnum.fire");
    public static final RegistryObject<SoundEvent> ARTIC_WARFARE_MAGNUM_COCK = register("item.artic_warfare_magnum.cock");

    //Shotgun Gun Sounds
    public static final RegistryObject<SoundEvent> SPAS_TWELVE_FIRE = register("item.spas12.fire");
    public static final RegistryObject<SoundEvent> SPAS_TWELVE_COCK = register("item.spas12.cock");
    public static final RegistryObject<SoundEvent> SPAS_TWELVE_RELOAD = register("item.spas12.reload");
    public static final RegistryObject<SoundEvent> AA_TWELVE_FIRE = register("item.aa12.fire");
    public static final RegistryObject<SoundEvent> AA_TWELVE_COCK = register("item.aa12.cock");
    public static final RegistryObject<SoundEvent> AA_TWELVE_SUPPRESSED = register("item.aa12.suppressed");
    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(StabxModernGuns.MOD_ID, name)));
    }
}
