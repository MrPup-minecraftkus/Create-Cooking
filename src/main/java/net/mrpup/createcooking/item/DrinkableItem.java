package net.mrpup.createcooking.item;

import com.mojang.datafixers.util.Pair;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
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
        if (user instanceof PlayerEntity player) {

            FoodComponent foodComponent = this.getFoodComponent();
            if (foodComponent != null) {
                for (Pair<StatusEffectInstance, Float> pair : foodComponent.getStatusEffects()) {
                    if (world.getRandom().nextFloat() < pair.getSecond()) {
                        user.addStatusEffect(new StatusEffectInstance(pair.getFirst()));
                    }
                }
            }

            if (!player.getAbilities().creativeMode) {
                player.giveItemStack(new ItemStack(Items.GLASS_BOTTLE));
            }
        }
        return super.finishUsing(stack, world, user);
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
