package bunnybl4de.crafty.ores;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    protected PickaxeBase(ToolMaterial material) {
        super(material, -2, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
