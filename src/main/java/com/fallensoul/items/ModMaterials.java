
package com.fallensoul.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {

    public static final ToolMaterial MITHRIL =
            EnumHelper.addToolMaterial(
                    "MITHRIL",
                    3,
                    1800,
                    9.0F,
                    0.0F,
                    18
            );

    private ModMaterials() {
    }
}
