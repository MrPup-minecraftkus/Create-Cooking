package net.mrpup.createcooking.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mrpup.createcooking.CreateCooking;
import net.mrpup.createcooking.block.ModBlocks;
import net.mrpup.createcooking.fluid.ModFluids;

public class ModItemGroups {
    public static final ItemGroup COOKING_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateCooking.MOD_ID, "cooking"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cooking"))
                    .icon(() -> new ItemStack(ModItems.CHOCOLATE_ROLL)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.CHEESE_BLOCK);
                        entries.add(ModItems.APPLE_PIE);
                        entries.add(ModItems.EXPERIENCE_PIE);
                        entries.add(ModItems.BAKED_APPLE);
                        entries.add(ModItems.CHOCOLATE_APPLE);
                        entries.add(ModItems.CHOCOLATE_ROLL);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.FRIED_EGG);
                        entries.add(ModItems.HONEY_ROLL);
                        entries.add(ModItems.UNCOOKED_MEATBALL);
                        entries.add(ModItems.MEAT_BALL);
                        entries.add(ModItems.MEATBALL_STICK_1);
                        entries.add(ModItems.MEATBALL_STICK_2);
                        entries.add(ModItems.MEATBALL_STICK_3);
                        entries.add(ModItems.SANDWICH);
                        entries.add(ModItems.SAUSAGE);
                        entries.add(ModItems.BEEF_SAUSAGE);
                        entries.add(ModItems.MUTTON_SAUSAGE);
                        entries.add(ModItems.PORK_SAUSAGE);
                        entries.add(ModItems.HOTDOG);
                        entries.add(ModItems.PORK_HOTDOG);
                        entries.add(ModItems.MUTTON_HOTDOG);
                        entries.add(ModItems.BEEF_HOTDOG);
                        entries.add(ModItems.SLICED_BREAD);
                        entries.add(ModItems.TOAST_WITH_CHOCOLATE);
                        entries.add(ModItems.TOAST_WITH_HONEY);
                        entries.add(ModItems.UNCOOKED_WAFFLE);
                        entries.add(ModItems.WAFFLE);
                        entries.add(ModItems.HONEY_WAFFLE);
                        entries.add(ModItems.CHOCOLATE_WAFFLE);
                        entries.add(ModItems.CARROT_JUICE);
                        entries.add(ModItems.WATERMELON_JUICE);
                        entries.add(ModItems.POISONOUS_DECOCTION);
                        entries.add(ModItems.SWEET_BERRIES_JUICE);
                        entries.add(ModItems.HONEYED_SWEET_BERRIES);
                        entries.add(ModItems.CANNED_MEAT);
                        entries.add(ModItems.CANNED_VEGETABLES);
                        entries.add(ModItems.CANNED_GOODS);
                        entries.add(ModItems.POTATO_STEW);
                        entries.add(ModItems.PUMPKIN_PORRIDGE);
                        entries.add(ModItems.INTESTINES);
                        entries.add(ModItems.SAUSAGE_CASINGS);
                        entries.add(ModItems.CONE);
                        entries.add(ModItems.ICE_CREAM_CONE);
                        entries.add(ModItems.CHOCOLATE_ICE_CREAM_CONE);
                        entries.add(ModItems.WATERMELON_ICE_CREAM_CONE);
                        entries.add(ModItems.CHOCOLATE_RABBIT);
                        entries.add(ModFluids.CARROT_JUICE_BUCKET);
                        entries.add(ModFluids.WATERMELON_JUICE_BUCKET);
                        entries.add(ModFluids.SWEET_BERRIES_JUICE_BUCKET);
                        entries.add(ModFluids.POISONOUS_DECOCTION_BUCKET);
                        entries.add(ModFluids.POTATO_STEW_BUCKET);
                        entries.add(ModFluids.STEWED_MEAT_BUCKET);
                        entries.add(ModFluids.PUMPKIN_PORRIDGE_BUCKET);
                        entries.add(ModFluids.ICE_CREAM_BUCKET);
                        entries.add(ModFluids.CHOCOLATE_ICE_CREAM_BUCKET);
                        entries.add(ModFluids.WATERMELON_ICE_CREAM_BUCKET);
                    }).build());


    public static void registerItemGroups() {
        CreateCooking.LOGGER.info("Registering Item Groups for " + CreateCooking.MOD_ID);
    }
}