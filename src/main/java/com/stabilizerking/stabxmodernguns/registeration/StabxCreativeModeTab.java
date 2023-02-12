package com.stabilizerking.stabxmodernguns.registeration;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StabxModernGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class StabxCreativeModeTab {

    public static CreativeModeTab STABX_MODERN_GUNS_GROUP;
    public static CreativeModeTab STABX_SMGS_GROUP;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        STABX_MODERN_GUNS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabxmodernguns"),
                builder -> builder.icon(() -> {
                    ItemStack itemStack = new ItemStack(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get());
                    itemStack.getOrCreateTag().putInt("AmmoCount", ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get().getGun().getGeneral().getMaxAmmo());
                    return itemStack;
                }).title(Component.literal("Stabx Modern Guns")).build());


        STABX_SMGS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_smgs"),
                builder -> builder.icon(() -> {
                    ItemStack itemStack = new ItemStack(ModItemRegisteration.MP5_CLASSIC.get());
                    itemStack.getOrCreateTag().putInt("AmmoCount", ModItemRegisteration.MP5_CLASSIC.get().getGun().getGeneral().getMaxAmmo());
                    return itemStack;
                }).title(Component.literal("Sub Machine Guns")).build());
    }

}
