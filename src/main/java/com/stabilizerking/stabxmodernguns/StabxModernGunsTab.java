package com.stabilizerking.stabxmodernguns;

import com.stabilizerking.stabxmodernguns.item.StabxModernGunsItem;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.mrcrayfish.guns.client.CustomGunManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;


public class StabxModernGunsTab extends CreativeModeTab {
    public StabxModernGunsTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        StabxModernGunsItem gunItem = (StabxModernGunsItem) ModItemRegisteration.M_FOUR.get();
        ItemStack stack = gunItem.getDefaultInstance();
        stack.getOrCreateTag().putInt("AmmoCount", gunItem.getGun().getGeneral().getMaxAmmo());
        return stack;
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
        CustomGunManager.fill(items);
    }
}
