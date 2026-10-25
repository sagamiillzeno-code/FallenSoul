
package com.fallensoul.items;

import java.util.Map;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class MithrilDamage {

    private MithrilDamage() {
    }

    public static Multimap<String, AttributeModifier> apply(
            Multimap<String, AttributeModifier> original,
            EntityEquipmentSlot slot,
            double totalDamage) {

        Multimap<String, AttributeModifier> result =
                HashMultimap.create();

        for (Map.Entry<String, AttributeModifier> entry
                : original.entries()) {

            if (!"generic.attackDamage".equals(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        if (slot == EntityEquipmentSlot.MAINHAND) {
            result.put(
                    "generic.attackDamage",
                    new AttributeModifier(
                            Item.ATTACK_DAMAGE_MODIFIER,
                            "Mithril weapon damage",
                            totalDamage - 1.0D,
                            0
                    )
            );
        }

        return result;
    }
}

