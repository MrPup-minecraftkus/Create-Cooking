package net.mrpup.createcooking.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.client.item.TooltipContext;
import net.mrpup.createcooking.client.ClientDrinkableItem;

import java.util.List;

public class DrinkableItem extends Item {
    public DrinkableItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack resultStack = super.finishUsing(stack, world, user);

        if (!world.isClient) {
            ItemStack emptyCan = new ItemStack(Items.GLASS_BOTTLE);
            if (user instanceof net.minecraft.entity.player.PlayerEntity player) {
                if (!player.getInventory().insertStack(emptyCan)) {
                    player.dropItem(emptyCan, false);
                }
            } else {
                user.dropStack(emptyCan);
            }
        }

        return resultStack;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        player.setCurrentHand(hand);
        return TypedActionResult.consume(player.getStackInHand(hand));
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        ClientDrinkableItem.addTooltip(stack, world, tooltip, context);
    }
}
