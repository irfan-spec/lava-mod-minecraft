package bunnybl4de.crafty.ores;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial material) {
        super(material, -1, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
