package net.dovahkiinforged;

import net.dovahkiinforged.commons.ModItems;
import net.dovahkiinforged.commons.item.ModItem;
import net.dovahkiinforged.mapper.ItemMapper;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

import java.util.List;

public class Items {

    public static Item register(ModItem modItem) {
        // Map values from commons library
        RegistryKey<Item> key = ItemMapper.mapKey(modItem);
        // Register the item.
        return Registry.register(Registries.ITEM, key, new CustomItem(modItem));
    }

    public static void initialize() {
    }

    // WEAPONS
    public static final Item ELVEN_DAGGER = register(ModItems.ELVEN_DAGGER);
    public static final Item ELVEN_SWORD = register(ModItems.ELVEN_SWORD);
    public static final Item GLASS_DAGGER = register(ModItems.GLASS_DAGGER);
    public static final Item GLASS_SWORD = register(ModItems.GLASS_SWORD);

    // MATERIALS
    public static final Item AMETHYST = register(ModItems.AMETHYST);
    public static final Item GARNET = register(ModItems.GARNET);
    public static final Item RUBY = register(ModItems.RUBY);
    public static final Item SAPPHIRE = register(ModItems.SAPPHIRE);
    public static final Item MALACHITE_INGOT = register(ModItems.MALACHITE_INGOT);
    public static final Item MALACHITE_NUGGET = register(ModItems.MALACHITE_NUGGET);
    public static final Item MOONSTONE_INGOT = register(ModItems.MOONSTONE_INGOT);
    public static final Item MOONSTONE_NUGGET = register(ModItems.MOONSTONE_NUGGET);
    public static final Item STEEL_INGOT = register(ModItems.STEEL_INGOT);
    public static final Item STEEL_NUGGET = register(ModItems.STEEL_NUGGET);

    // BEVERAGE
    public static final Item ALE = register(ModItems.ALE);
    public static final Item ALTO_WINE_1 = register(ModItems.ALTO_WINE_1);
    public static final Item ALTO_WINE_2 = register(ModItems.ALTO_WINE_2);
    public static final Item ARGONIAN_BLOODWINE = register(ModItems.ARGONIAN_BLOODWINE);
    public static final Item ASHFIRE_MEAD = register(ModItems.ASHFIRE_MEAD);
    public static final Item BLACK_BRIAR_MEAD = register(ModItems.BLACK_BRIAR_MEAD);
    public static final Item BLACK_BRIAR_RESERVE = register(ModItems.BLACK_BRIAR_RESERVE);
    public static final Item COLOVIAN_BRANDY = register(ModItems.COLOVIAN_BRANDY);
    public static final Item DRAGONS_BREATH_MEAD = register(ModItems.DRAGONS_BREATH_MEAD);
    public static final Item EMBERBRAND_WINE = register(ModItems.EMBERBRAND_WINE);
    public static final Item FIREBRAND_WINE = register(ModItems.FIREBRAND_WINE);
    public static final Item FLIN = register(ModItems.FLIN);
    public static final Item HONNINGBREW_MEAD = register(ModItems.HONNINGBREW_MEAD);

    // FOOD
    public static final Item APPLE_CABBAGE_STEW = register(ModItems.APPLE_CABBAGE_STEW);
    public static final Item APPLE_DUMPLING = register(ModItems.APPLE_DUMPLING);
    public static final Item APPLE_PIE = register(ModItems.APPLE_PIE);
    public static final Item ASH_HOPPER_LEG = register(ModItems.ASH_HOPPER_LEG);
    public static final Item ASH_HOPPER_MEAT = register(ModItems.ASH_HOPPER_MEAT);
    public static final Item ASH_YAM = register(ModItems.ASH_YAM);
    public static final Item AZURAS_STAR = register(ModItems.AZURAS_STAR);
    public static final Item BEEF_STEW = register(ModItems.BEEF_STEW);
    public static final Item BOILED_CREME_TREAT = register(ModItems.BOILED_CREME_TREAT);
    public static final Item BUTTER = register(ModItems.BUTTER);
    public static final Item CABBAGE = register(ModItems.CABBAGE);
    public static final Item CABBAGE_POTATO_SOUP = register(ModItems.CABBAGE_POTATO_SOUP);
    public static final Item CABBAGE_SOUP = register(ModItems.CABBAGE_SOUP);

    // ALCHEMY INGREDIENTS
    public static final Item ANCESTOR_MOTH_WING = register(ModItems.ANCESTOR_MOTH_WING);
    public static final Item ASH_CREEP_CLUSTER = register(ModItems.ASH_CREEP_CLUSTER);
    public static final Item ASH_HOPPER_JELLY = register(ModItems.ASH_HOPPER_JELLY);
    public static final Item ASHEN_GRASS_POD = register(ModItems.ASHEN_GRASS_POD);
    public static final Item BEAR_CLAWS = register(ModItems.BEAR_CLAWS);
    public static final Item BEE = register(ModItems.BEE);
    public static final Item BEEHIVE_HUSK = register(ModItems.BEEHIVE_HUSK);
    public static final Item BLEEDING_CROWN = register(ModItems.BLEEDING_CROWN);
    public static final Item BLISTERWORT = register(ModItems.BLISTERWORT);
    public static final Item BLUE_BUTTERFLY_WING = register(ModItems.BLUE_BUTTERFLY_WING);
    public static final Item BLUE_DARTWING = register(ModItems.BLUE_DARTWING);
    public static final Item BLUE_MOUNTAIN_FLOWER = register(ModItems.BLUE_MOUNTAIN_FLOWER);
    public static final Item BOAR_TUSK = register(ModItems.BOAR_TUSK);
    public static final Item BONE_MEAL = register(ModItems.BONE_MEAL);
    public static final Item BRIAR_HEART = register(ModItems.BRIAR_HEART);
    public static final Item BURNT_SPRIGGAN_WOOD = register(ModItems.BURNT_SPRIGGAN_WOOD);
    public static final Item BUTTERFLY_WING = register(ModItems.BUTTERFLY_WING);
    public static final Item CANIS_ROOT = register(ModItems.CANIS_ROOT);
    public static final Item CHARRED_SKEEVER_HIDE = register(ModItems.CHARRED_SKEEVER_HIDE);
    public static final Item CHAURUS_EGGES = register(ModItems.CHAURUS_EGGES);
    public static final Item CHAURUS_HUNTER_ANTENNAE = register(ModItems.CHAURUS_HUNTER_ANTENNAE);
    public static final Item CHICKENS_EGG = register(ModItems.CHICKENS_EGG);
    public static final Item CREEP_CLUSTER = register(ModItems.CREEP_CLUSTER);
    public static final Item CRIMSON_NIRNROOT = register(ModItems.CRIMSON_NIRNROOT);
    public static final Item CYRODILIC_SPADETAIL = register(ModItems.CYRODILIC_SPADETAIL);
    public static final Item DAEDRA_HEART = register(ModItems.DAEDRA_HEART);
    public static final Item DEATHBELL = register(ModItems.DEATHBELL);
    public static final Item DRAGONS_TONGUE = register(ModItems.DRAGONS_TONGUE);
    public static final Item DWARVEN_OIL = register(ModItems.DWARVEN_OIL);
    public static final Item ECTOPLASM = register(ModItems.ECTOPLASM);
    public static final Item ELVES_EAR = register(ModItems.ELVES_EAR);
    public static final Item EMPEROR_PARASOL_MOSS = register(ModItems.EMPEROR_PARASOL_MOSS);
    public static final Item EYE_OF_SABRE_CAT = register(ModItems.EYE_OF_SABRE_CAT);
    public static final Item FALMER_EAR = register(ModItems.FALMER_EAR);
    public static final Item FELSAAD_TERN_FEATHERS = register(ModItems.FELSAAD_TERN_FEATHERS);
    public static final Item FIRE_SALTS = register(ModItems.FIRE_SALTS);
    public static final Item FLY_AMANITA = register(ModItems.FLY_AMANITA);
    public static final Item FROST_MIRRIAM = register(ModItems.FROST_MIRRIAM);
    public static final Item FROST_SALTS = register(ModItems.FROST_SALTS);
    public static final Item GARLIC = register(ModItems.GARLIC);
    public static final Item GIANT_LICHEN = register(ModItems.GIANT_LICHEN);
    public static final Item GIANTS_TOE = register(ModItems.GIANTS_TOE);
    public static final Item GLEAMBLOSSOM = register(ModItems.GLEAMBLOSSOM);
    public static final Item GLOW_DUST = register(ModItems.GLOW_DUST);
    public static final Item GLOWING_MUSHROOM = register(ModItems.GLOWING_MUSHROOM);
    public static final Item GRASS_POD = register(ModItems.GRASS_POD);
    public static final Item HAGRAVEN_CLAW = register(ModItems.HAGRAVEN_CLAW);
    public static final Item HAGRAVEN_FEATHERS = register(ModItems.HAGRAVEN_FEATHERS);
    public static final Item HANGING_MOSS = register(ModItems.HANGING_MOSS);
    public static final Item HAWK_BEAK = register(ModItems.HAWK_BEAK);
    public static final Item HAWK_FEATHERS = register(ModItems.HAWK_FEATHERS);
    public static final Item HAWK_EGG = register(ModItems.HAWK_EGG);
    public static final Item HISTCARP = register(ModItems.HISTCARP);
    public static final Item HUMAN_FLESH = register(ModItems.HUMAN_FLESH);
    public static final Item HUMAN_HEART = register(ModItems.HUMAN_HEART);
    public static final Item ICE_WRAITH_TEETH = register(ModItems.ICE_WRAITH_TEETH);
    public static final Item IMP_STOOL = register(ModItems.IMP_STOOL);
    public static final Item JUNIPER_BERRIES = register(ModItems.JUNIPER_BERRIES);
    public static final Item JAZBAY_GRAPES = register(ModItems.JAZBAY_GRAPES);
    public static final Item LARGE_ANTLERS = register(ModItems.LARGE_ANTLERS);
    public static final Item LAVENDER = register(ModItems.LAVENDER);
    public static final Item LUNA_MOTH_WING = register(ModItems.LUNA_MOTH_WING);

    public static final List<Item> ALL_FOOD_AND_BEVERAGE = List.of(
            // BEVERAGE
            ALE, ALTO_WINE_1, ALTO_WINE_2, ARGONIAN_BLOODWINE, BLACK_BRIAR_MEAD, BLACK_BRIAR_RESERVE, COLOVIAN_BRANDY,
            DRAGONS_BREATH_MEAD, EMBERBRAND_WINE, FIREBRAND_WINE, FLIN, HONNINGBREW_MEAD,
            // FOOD
            APPLE_CABBAGE_STEW, APPLE_DUMPLING, APPLE_PIE, ASH_HOPPER_LEG, ASH_HOPPER_MEAT, ASH_YAM, ASHFIRE_MEAD,
            AZURAS_STAR, BEEF_STEW, BOILED_CREME_TREAT, BUTTER, CABBAGE, CABBAGE_POTATO_SOUP, CABBAGE_SOUP);

    public static final List<Item> ALL_ALCHEMY_INGREDIENTS = List.of(
            ANCESTOR_MOTH_WING, ASH_CREEP_CLUSTER, ASH_HOPPER_JELLY, ASHEN_GRASS_POD, BEAR_CLAWS, BEE,
            BEEHIVE_HUSK, BLEEDING_CROWN, BLISTERWORT, BLUE_BUTTERFLY_WING, BLUE_DARTWING, BLUE_MOUNTAIN_FLOWER,
            BOAR_TUSK, BONE_MEAL, BRIAR_HEART, BURNT_SPRIGGAN_WOOD, BUTTERFLY_WING, CANIS_ROOT, CHARRED_SKEEVER_HIDE,
            CHAURUS_EGGES, CHAURUS_HUNTER_ANTENNAE, CHICKENS_EGG, CREEP_CLUSTER, CRIMSON_NIRNROOT, CYRODILIC_SPADETAIL,
            DAEDRA_HEART, DEATHBELL, DRAGONS_TONGUE, DWARVEN_OIL, ECTOPLASM, ELVES_EAR, EMPEROR_PARASOL_MOSS,
            EYE_OF_SABRE_CAT, FALMER_EAR, FELSAAD_TERN_FEATHERS, FIRE_SALTS, FLY_AMANITA, FROST_MIRRIAM, FROST_SALTS,
            GARLIC, GIANT_LICHEN, GIANTS_TOE, GLEAMBLOSSOM, GLOW_DUST, GLOWING_MUSHROOM, GRASS_POD, HAGRAVEN_CLAW,
            HAGRAVEN_FEATHERS, HANGING_MOSS, HAWK_BEAK, HAWK_FEATHERS, HAWK_EGG, HISTCARP, HUMAN_FLESH, HUMAN_HEART,
            ICE_WRAITH_TEETH, IMP_STOOL, JUNIPER_BERRIES, JAZBAY_GRAPES, LARGE_ANTLERS, LAVENDER, LUNA_MOTH_WING
    );

    // ALL OTHER ITEMS
    public static final List<Item> ALL_ITEMS = List.of(
            ELVEN_DAGGER, ELVEN_SWORD, GLASS_SWORD, GLASS_DAGGER, AMETHYST, GARNET, RUBY, SAPPHIRE, MALACHITE_INGOT,
            MALACHITE_NUGGET, MOONSTONE_INGOT, MOONSTONE_NUGGET, STEEL_INGOT, STEEL_NUGGET);

}
