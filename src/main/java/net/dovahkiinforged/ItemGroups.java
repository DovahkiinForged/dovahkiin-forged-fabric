package net.dovahkiinforged;

import net.dovahkiinforged.commons.constant.ItemGroupConstant;
import net.dovahkiinforged.commons.constant.ModConstant;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ItemGroups {

    private static void register(final String name, final ItemGroup itemGroup) {
        Registry.register(Registries.ITEM_GROUP, name, itemGroup);
    }

    public static void initialize() {
        register("dovahkiin-forged", DOVAHKIIN_FORGED);
        register("dovahkiin-forged-food-and-beverage", DOVAHKIIN_FORGED_FOOD_AND_BEVERAGE);
        register("dovahkiin-forged-alchemy", DOVAHKIIN_FORGED_ALCHEMY);
    }

    public static final ItemGroup DOVAHKIIN_FORGED = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.ELVEN_DAGGER))
            .displayName(Text.translatable(ItemGroupConstant.MAIN_KEY))
            .entries((ctx, entries) -> {
                Items.ALL_ITEMS.forEach(item -> entries.add(new ItemStack(item)));
                Blocks.ALL_BLOCKS.forEach(block -> entries.add(new ItemStack(block)));
            })
            .build();

    public static final ItemGroup DOVAHKIIN_FORGED_FOOD_AND_BEVERAGE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.ALE))
            .displayName(Text.translatable(ItemGroupConstant.FOOD_AND_BEVERAGE_KEY))
            .entries((ctx, entries) -> Items.ALL_FOOD_AND_BEVERAGE
                    .forEach(item -> entries.add(new ItemStack(item))))
            .build();

    public static final ItemGroup DOVAHKIIN_FORGED_ALCHEMY = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.BOAR_TUSK))
            .displayName(Text.translatable(ItemGroupConstant.ALCHEMY_KEY))
            .entries((ctx, entries) -> Items.ALL_ALCHEMY_INGREDIENTS
                    .forEach(item -> entries.add(new ItemStack(item))))
            .build();

}
