package net.dovahkiinforged.mapper;

import net.dovahkiinforged.combat.DamageHandler;
import net.dovahkiinforged.commons.constant.ModConstant;
import net.dovahkiinforged.commons.item.ModItem;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public final class ItemMapper {

    public static Identifier mapId(final ModItem item) {
        return Identifier.of(ModConstant.MOD_ID, item.getName());
    }

    public static RegistryKey<Item> mapKey(final ModItem item) {
        Identifier id = mapId(item);
        return RegistryKey.of(RegistryKeys.ITEM, id);
    }

    public static Item.Settings map(final ModItem item) {
        ModItem.Traits traits = item.getTraits();
        Item.Settings settings = getSettings(item, traits);
        if (traits.getFoodTraits() != null) {
            ModItem.FoodTraits foodTraits = traits.getFoodTraits();
            settings.food(new FoodComponent(
                    foodTraits.getNutrition(),
                    foodTraits.getSaturation(),
                    foodTraits.isAlwaysEdible())
            );
        }

        // IMPORTANT
        // We need to add the registration key explicitly to avoid warnings/errors from fabric
        settings.registryKey(mapKey(item));

        return settings;
    }

    private static Item.@NotNull Settings getSettings(ModItem item, ModItem.Traits traits) {
        Item.Settings settings = new Item.Settings();

        settings.maxCount(traits.getMaxStackSize());

        // max damage is how much the item can take before breaking... very intuitive...
        if (traits.getDurability() != null) settings.maxDamage(traits.getDurability());
        if (traits.getCooldown() != null) settings.useCooldown(traits.getCooldown());
        if (traits.getDamage() != null) {
            DamageHandler handler = new DamageHandler(item);
            settings.customDamage(handler);
        }
        if (traits.isFireproof()) settings.fireproof();
        return settings;
    }

}
