package net.dovahkiinforged;

import net.dovahkiinforged.commons.constant.ItemConstant;
import net.dovahkiinforged.commons.item.ModItem;
import net.dovahkiinforged.mapper.ItemMapper;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.List;

public class CustomItem extends Item {
    private final ModItem item;
    private Item.Settings settings;

    public CustomItem(ModItem item) {
        super(ItemMapper.map(item));
        this.item = item;
        this.settings = ItemMapper.map(item);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        ConsumableComponent consumableComponent = itemStack.get(DataComponentTypes.CONSUMABLE);
        if (consumableComponent != null) {
            return consumableComponent.consume(user, itemStack, hand);
        } else {
            EquippableComponent equippableComponent = itemStack.get(DataComponentTypes.EQUIPPABLE);
            return (equippableComponent != null && equippableComponent.swappable() ? equippableComponent.equip(itemStack, user) : ActionResult.PASS);
        }

        // @TODO Figure out where to place sound effects for item usage

//        if (item.getType().equals(ItemConstant.BEVERAGE)) {
//            user.playSound(SoundEvents.ENTITY_GENERIC_DRINK.value());
//        }
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        // Play sound effect when drinking beverages or soups
        List<String> drinkTypes = List.of(ItemConstant.BEVERAGE, ItemConstant.SOUP);

        if (drinkTypes.contains(item.getType())) {
            user.playSound(SoundEvents.ENTITY_GENERIC_DRINK.value());
        }
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        // Play sound effect when drinking beverages or soups
        List<String> consumableTypes = List.of(ItemConstant.BEVERAGE, ItemConstant.SOUP, ItemConstant.FOOD);
        if (consumableTypes.contains(item.getType())) {
            user.playSound(SoundEvents.ENTITY_PLAYER_BURP);
        }
        return super.finishUsing(stack, world, user);
    }
}
