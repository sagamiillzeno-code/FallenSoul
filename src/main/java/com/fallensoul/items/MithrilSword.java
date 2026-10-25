
package com.fallensoul.items;

import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class MithrilSword extends ItemSword {

    public MithrilSword() {
        super(ModMaterials.MITHRIL);

        setRegistryName("fallensoul", "mithril_sword");
        setUnlocalizedName("fallensoul.mithril_sword");
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(
            EntityEquipmentSlot slot, ItemStack stack) {

        return MithrilDamage.apply(
                super.getAttributeModifiers(slot, stack),
                slot,
                15.0D
        );
    }
}
