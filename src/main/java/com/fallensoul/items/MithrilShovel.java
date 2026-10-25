
package com.fallensoul.items;

import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class MithrilShovel extends ItemSpade {

    public MithrilShovel() {
        super(ModMaterials.MITHRIL);

        setRegistryName("fallensoul", "mithril_shovel");
        setUnlocalizedName("fallensoul.mithril_shovel");
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(
            EntityEquipmentSlot slot, ItemStack stack) {

        return MithrilDamage.apply(
                super.getAttributeModifiers(slot, stack),
                slot,
                8.0D
        );
    }
}
