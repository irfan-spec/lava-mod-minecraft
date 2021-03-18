package bunnybl4de.crafty.ores;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class LavaArmorMaterial implements ArmorMaterial {

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 60;
    }
    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        // TODO Auto-generated method stub
        return 6;
    }
    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 11;
    }
    @Override
    public SoundEvent getEquipSound() {
        // TODO Auto-generated method stub
        return SoundEvents.ITEM_BUCKET_FILL_LAVA;
    }
    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(CraftyOres.LAVA_DIAMOND);
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "lava";
    }
    @Override
    public float getToughness() {
        // TODO Auto-generated method stub
        return 90;
    }
    @Override
    public float getKnockbackResistance() {
        // TODO Auto-generated method stub
        return 50;
    }
}
