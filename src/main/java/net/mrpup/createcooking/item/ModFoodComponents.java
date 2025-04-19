package net.mrpup.createcooking.item;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    public static final FoodComponent BAKED_APPLE = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent CHOCOLATE_APPLE = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent CHOCOLATE_ROLL = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent CHOCOLATE_WAFFLE = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent EXPERIENCE_PIE = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).build();
    public static final FoodComponent HONEY_ROLL = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).build();
    public static final FoodComponent HONEY_WAFFLE = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).build();
    public static final FoodComponent HOTDOG = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).build();
    public static final FoodComponent MEAT_BALL = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent MEATBALL_STICK_1 = new FoodComponent.Builder().hunger(4).saturationModifier(1f).build();
    public static final FoodComponent MEATBALL_STICK_2 = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).build();
    public static final FoodComponent MEATBALL_STICK_3 = new FoodComponent.Builder().hunger(12).saturationModifier(1.4f).build();
    public static final FoodComponent SANDWICH = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).build();
    public static final FoodComponent SAUSAGE = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent SLICED_BREAD = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build();
    public static final FoodComponent TOAST_WITH_CHOCOLATE = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent TOAST_WITH_HONEY = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent UNCOOKED_MEATBALL = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent UNCOOKED_WAFFLE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent WAFFLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent HONEYED_SWEET_BERRIES = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent CANNED_MEAT = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent PUMPKIN_PORRIDGE = new FoodComponent.Builder().hunger(8).saturationModifier(1f).build();
    public static final FoodComponent POTATO_STEW = new FoodComponent.Builder().hunger(8).saturationModifier(1f).build();
    public static final FoodComponent CARROT_JUICE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600), 1f)
            .alwaysEdible()
            .build();
    public static final FoodComponent POISONOUS_DECOCTION = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 600), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1800), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 100), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 2400), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 2), 1f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SWEET_BERRIES_JUICE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 40), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 2), 1f)
            .alwaysEdible()
            .build();
    public static final FoodComponent WATERMELON_JUICE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600), 1f)
            .alwaysEdible()
            .build();
}
