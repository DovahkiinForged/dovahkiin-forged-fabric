package net.dovahkiinforged.combat;

import lombok.AllArgsConstructor;
import net.dovahkiinforged.commons.item.ModItem;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

@AllArgsConstructor
public class DamageHandler implements CustomDamageHandler {
    ModItem item;

    @Override
    public int damage(ItemStack stack, int originalAmount, LivingEntity entity, EquipmentSlot slot, Runnable breakCallback) {
        return originalAmount;
    }
}
