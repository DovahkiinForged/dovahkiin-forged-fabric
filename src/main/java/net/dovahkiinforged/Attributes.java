package net.dovahkiinforged;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;

public class Attributes {
    public static final EntityAttribute WOODEN_ITEM_DURABILITY = new ClampedEntityAttribute(
            "attribute.item.durability.wooden", 59.0D, 0.0D, 59.0D);
    public static final EntityAttribute STONE_ITEM_DURABILITY = new ClampedEntityAttribute(
            "attribute.item.durability.stone", 131.0D, 0.0D, 131.0D);
    public static final EntityAttribute SILVER_ITEM_DURABILITY = new ClampedEntityAttribute(
            "attribute.item.durability.silver", 131.0D, 0.0D, 131.0D);
}
