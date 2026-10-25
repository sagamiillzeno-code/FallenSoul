package com.fallensoul.items;

import java.util.Map;
import java.util.UUID;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;

public final class MithrilDamage {

private static final UUID MITHRIL_DAMAGE_UUID =
        UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");

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
                        MITHRIL_DAMAGE_UUID,
                        "Mithril weapon damage",
                        totalDamage - 1.0D,
                        0
                )
        );
    }

    return result;
}

}
