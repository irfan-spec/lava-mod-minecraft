package bunnybl4de.crafty.ores;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialKnife implements ToolMaterial {

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 300;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 12.0f;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
