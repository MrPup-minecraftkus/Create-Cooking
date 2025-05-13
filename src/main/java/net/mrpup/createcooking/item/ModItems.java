package net.mrpup.createcooking.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrpup.createcooking.CreateCooking;

public class ModItems {

    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_PIE)));
    public static final Item BAKED_APPLE = registerItem("baked_apple", new Item(new FabricItemSettings().food(ModFoodComponents.BAKED_APPLE)));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item CHOCOLATE_APPLE = registerItem("chocolate_apple", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_APPLE)));
    public static final Item CHOCOLATE_ROLL = registerItem("chocolate_roll", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_ROLL)));
    public static final Item CHOCOLATE_WAFFLE = registerItem("chocolate_waffle", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_WAFFLE)));
    public static final Item EXPERIENCE_PIE = registerItem("experience_pie", new Item(new FabricItemSettings().food(ModFoodComponents.EXPERIENCE_PIE)));
    public static final Item FRIED_EGG = registerItem("fried_egg", new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG)));
    public static final Item HONEY_ROLL = registerItem("honey_roll", new Item(new FabricItemSettings().food(ModFoodComponents.HONEY_ROLL)));
    public static final Item HONEY_WAFFLE = registerItem("honey_waffle", new Item(new FabricItemSettings().food(ModFoodComponents.HONEY_WAFFLE)));
    public static final Item HOTDOG = registerItem("hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.HOTDOG)));
    public static final Item PORK_HOTDOG = registerItem("pork_hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.PORK_HOTDOG)));
    public static final Item MUTTON_HOTDOG = registerItem("mutton_hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.MUTTON_HOTDOG)));
    public static final Item BEEF_HOTDOG = registerItem("beef_hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.BEEF_HOTDOG)));
    public static final Item MEAT_BALL = registerItem("meat_ball", new Item(new FabricItemSettings().food(ModFoodComponents.MEAT_BALL)));
    public static final Item MEATBALL_STICK_1 = registerItem("meatball_stick_1", new Item(new FabricItemSettings().food(ModFoodComponents.MEATBALL_STICK_1)));
    public static final Item MEATBALL_STICK_2 = registerItem("meatball_stick_2", new Item(new FabricItemSettings().food(ModFoodComponents.MEATBALL_STICK_2)));
    public static final Item MEATBALL_STICK_3 = registerItem("meatball_stick_3", new Item(new FabricItemSettings().food(ModFoodComponents.MEATBALL_STICK_3)));
    public static final Item SANDWICH = registerItem("sandwich", new Item(new FabricItemSettings().food(ModFoodComponents.SANDWICH)));
    public static final Item SAUSAGE = registerItem("sausage", new Item(new FabricItemSettings().food(ModFoodComponents.SAUSAGE)));
    public static final Item BEEF_SAUSAGE = registerItem("beef_sausage", new Item(new FabricItemSettings().food(ModFoodComponents.BEEF_SAUSAGE)));
    public static final Item MUTTON_SAUSAGE = registerItem("mutton_sausage", new Item(new FabricItemSettings().food(ModFoodComponents.MUTTON_SAUSAGE)));
    public static final Item PORK_SAUSAGE = registerItem("pork_sausage", new Item(new FabricItemSettings().food(ModFoodComponents.PORK_SAUSAGE)));
    public static final Item SLICED_BREAD = registerItem("sliced_bread", new Item(new FabricItemSettings().food(ModFoodComponents.SLICED_BREAD)));
    public static final Item TOAST_WITH_CHOCOLATE = registerItem("toast_with_chocolate", new Item(new FabricItemSettings().food(ModFoodComponents.TOAST_WITH_CHOCOLATE)));
    public static final Item TOAST_WITH_HONEY = registerItem("toast_with_honey", new Item(new FabricItemSettings().food(ModFoodComponents.TOAST_WITH_HONEY)));
    public static final Item UNCOOKED_MEATBALL = registerItem("uncooked_meatball", new Item(new FabricItemSettings().food(ModFoodComponents.UNCOOKED_MEATBALL)));
    public static final Item UNCOOKED_WAFFLE = registerItem("uncooked_waffle", new Item(new FabricItemSettings().food(ModFoodComponents.UNCOOKED_WAFFLE)));
    public static final Item WAFFLE = registerItem("waffle", new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE)));
    public static final Item CONE = registerItem("cone", new Item(new FabricItemSettings().food(ModFoodComponents.CONE)));
    public static final Item ICE_CREAM_CONE = registerItem("ice_cream_cone", new Item(new FabricItemSettings().food(ModFoodComponents.ICE_CREAM_CONE)));
    public static final Item CHOCOLATE_ICE_CREAM_CONE = registerItem("chocolate_ice_cream_cone", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_ICE_CREAM_CONE)));
    public static final Item WATERMELON_ICE_CREAM_CONE = registerItem("watermelon_ice_cream_cone", new Item(new FabricItemSettings().food(ModFoodComponents.WATERMELON_ICE_CREAM_CONE)));
    public static final Item HONEYED_SWEET_BERRIES = registerItem("honeyed_sweet_berries", new Item(new FabricItemSettings().food(ModFoodComponents.HONEYED_SWEET_BERRIES)));
    public static final Item CANNED_GOODS = registerItem("canned_goods", new Item(new Item.Settings()));
    public static final Item INTESTINES = registerItem("intestines", new Item(new Item.Settings()));
    public static final Item SAUSAGE_CASINGS = registerItem("sausage_casings", new SausageMakerItem(new Item.Settings()));
    public static final Item CHOCOLATE_RABBIT = registerItem("chocolate_rabbit", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_RABBIT)));
    public static final Item CANNED_MEAT = registerItem("canned_meat",
            new CannedFood(new FabricItemSettings()
                    .food(ModFoodComponents.CANNED_MEAT)));
    public static final Item CANNED_VEGETABLES = registerItem("canned_vegetables",
            new CannedFood(new FabricItemSettings()
                    .food(ModFoodComponents.CANNED_VEGETABLES)));
    public static final Item CARROT_JUICE = registerItem("carrot_juice",
            new DrinkableItem(new FabricItemSettings()
                    .food(ModFoodComponents.CARROT_JUICE)
                    .maxCount(16)));
    public static final Item POISONOUS_DECOCTION = registerItem("poisonous_decoction",
            new DrinkableItem(new FabricItemSettings()
                    .food(ModFoodComponents.POISONOUS_DECOCTION)
                    .maxCount(16)));
    public static final Item WATERMELON_JUICE = registerItem("watermelon_juice",
            new DrinkableItem(new FabricItemSettings()
                    .food(ModFoodComponents.WATERMELON_JUICE)
                    .maxCount(16)));
    public static final Item SWEET_BERRIES_JUICE = registerItem("sweet_berries_juice",
            new DrinkableItem(new FabricItemSettings()
                    .food(ModFoodComponents.SWEET_BERRIES_JUICE)
                    .maxCount(16)));
    public static final Item PUMPKIN_PORRIDGE = Registry.register(
            Registries.ITEM,
            new Identifier("create_cooking", "pumpkin_porridge"),
            new SupItem(new Item.Settings().maxCount(1).food(ModFoodComponents.PUMPKIN_PORRIDGE))
    );
    public static final Item POTATO_STEW = Registry.register(
            Registries.ITEM,
            new Identifier("create_cooking", "potato_stew"),
            new SupItem(new Item.Settings().maxCount(1).food(ModFoodComponents.POTATO_STEW))
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCooking.MOD_ID, name), item);
    }


    public static void registerModItems() {
        CreateCooking.LOGGER.info("Registering Mod Items for " + CreateCooking.MOD_ID);
    }
}