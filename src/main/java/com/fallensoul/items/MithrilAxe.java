
package com.fallensoul.items;

import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class MithrilAxe extends ItemAxe {

    public MithrilAxe() {
        super(ModMaterials.MITHRIL, 17.0F, -3.1F);

        setRegistryName("fallensoul", "mithril_axe");
        setUnlocalizedName("fallensoul.mithril_axe");
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(
            EntityEquipmentSlot slot, ItemStack stack) {

        return MithrilDamage.apply(
                super.getAttributeModifiers(slot, stack),
                slot,
                18.0D
        );
    }
}
