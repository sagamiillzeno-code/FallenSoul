
package com.fallensoul.items;

import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class MithrilPickaxe extends ItemPickaxe {

    public MithrilPickaxe() {
        super(ModMaterials.MITHRIL);

        setRegistryName("fallensoul", "mithril_pickaxe");
        setUnlocalizedName("fallensoul.mithril_pickaxe");
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(
            EntityEquipmentSlot slot, ItemStack stack) {

        return MithrilDamage.apply(
                super.getAttributeModifiers(slot, stack),
                slot,
                11.0D
        );
    }
}
