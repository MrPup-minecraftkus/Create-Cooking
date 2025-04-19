package net.mrpup.createcooking.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.StewItem;
import net.minecraft.world.World;

public class SupItem extends StewItem {
    public SupItem(Settings settings) {
        super(settings.food(ModFoodComponents.PUMPKIN_PORRIDGE));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);
        return new ItemStack(Items.BOWL);
    }
}
