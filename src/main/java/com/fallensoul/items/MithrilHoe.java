
package com.fallensoul.items;

import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class MithrilHoe extends ItemHoe {

    public MithrilHoe() {
        super(ModMaterials.MITHRIL);

        setRegistryName("fallensoul", "mithril_hoe");
        setUnlocalizedName("fallensoul.mithril_hoe");
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(
            EntityEquipmentSlot slot, ItemStack stack) {

        return MithrilDamage.apply(
                super.getAttributeModifiers(slot, stack),
                slot,
                4.0D
        );
    }
}
