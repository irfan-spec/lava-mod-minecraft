package bunnybl4de.crafty.ores;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialLava implements ToolMaterial {

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 2560;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 14.0f;
    }

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 14.0f;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 11;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(CraftyOres.LAVA_DIAMOND);
    }
    
}
