package net.mrpup.createcooking.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CannedFood extends Item {
    public CannedFood(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack resultStack = super.finishUsing(stack, world, user);

        if (!world.isClient) {
            ItemStack emptyCan = new ItemStack(ModItems.CANNED_GOODS);
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
}
