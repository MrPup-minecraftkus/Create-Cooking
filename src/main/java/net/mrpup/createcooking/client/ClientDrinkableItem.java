package net.mrpup.createcooking.client;


import com.simibubi.create.Create;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.mrpup.createcooking.item.ModItems;

import java.util.List;

@Environment(EnvType.CLIENT)
public class ClientDrinkableItem {
    public static void addTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        Item item = stack.getItem();


        if (item == ModItems.CARROT_JUICE) {
            tooltip.add(Text.translatable("item.create_cooking.carrot_juice.tooltip").formatted(Formatting.GOLD));
        } else if (item == ModItems.POISONOUS_DECOCTION) {
            tooltip.add(Text.translatable("item.create_cooking.poisonous_decoction.tooltip").formatted(Formatting.GREEN));
        } else if (item == ModItems.SWEET_BERRIES_JUICE) {
            tooltip.add(Text.translatable("item.create_cooking.sweet_berries_juice.tooltip").formatted(Formatting.RED));
        } else if (item == ModItems.WATERMELON_JUICE) {
             tooltip.add(Text.translatable("item.create_cooking.watermelon_juice.tooltip").formatted(Formatting.DARK_RED));
        }
    }
}
