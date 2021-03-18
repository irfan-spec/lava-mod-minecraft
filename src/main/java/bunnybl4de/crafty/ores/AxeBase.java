package bunnybl4de.crafty.ores;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {

    protected AxeBase(ToolMaterial material) {
        super(material, 5, -10.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
