package net.mrpup.createcooking.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrpup.createcooking.CreateCooking;

public class ModFluids {
    public static FlowableFluid STILL_CARROT_JUICE;
    public static FlowableFluid FLOWING_CARROT_JUICE;
    public static Block CARROT_JUICE_BLOCK;
    public static Item CARROT_JUICE_BUCKET;

    public static FlowableFluid STILL_POISONOUS_DECOCTION;
    public static FlowableFluid FLOWING_POISONOUS_DECOCTION;
    public static Block POISONOUS_DECOCTION_BLOCK;
    public static Item POISONOUS_DECOCTION_BUCKET;

    public static FlowableFluid STILL_WATERMELON_JUICE;
    public static FlowableFluid FLOWING_WATERMELON_JUICE;
    public static Block WATERMELON_JUICE_BLOCK;
    public static Item WATERMELON_JUICE_BUCKET;

    public static FlowableFluid STILL_SWEET_BERRIES_JUICE;
    public static FlowableFluid FLOWING_SWEET_BERRIES_JUICE;
    public static Block SWEET_BERRIES_JUICE_BLOCK;
    public static Item SWEET_BERRIES_JUICE_BUCKET;

    public static FlowableFluid STILL_STEWED_MEAT;
    public static FlowableFluid FLOWING_STEWED_MEAT;
    public static Block STEWED_MEAT_BLOCK;
    public static Item STEWED_MEAT_BUCKET;

    public static FlowableFluid STILL_POTATO_STEW;
    public static FlowableFluid FLOWING_POTATO_STEW;
    public static Block POTATO_STEW_BLOCK;
    public static Item POTATO_STEW_BUCKET;

    public static FlowableFluid STILL_PUMPKIN_PORRIDGE;
    public static FlowableFluid FLOWING_PUMPKIN_PORRIDGE;
    public static Block PUMPKIN_PORRIDGE_BLOCK;
    public static Item PUMPKIN_PORRIDGE_BUCKET;

    public static void register() {
        STILL_CARROT_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "carrot_juice_fluid"), new CarrotJuiceFluid.Still());
        FLOWING_CARROT_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "flowing_carrot_juice"), new CarrotJuiceFluid.Flowing());

        CARROT_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateCooking.MOD_ID, "carrot_juice_block"),
                new FluidBlock(ModFluids.STILL_CARROT_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        CARROT_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateCooking.MOD_ID, "carrot_juice_bucket"),
                new BucketItem(ModFluids.STILL_CARROT_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_POISONOUS_DECOCTION = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "poisonous_decoction_fluid"), new PoisonousDecoctionFluid.Still());
        FLOWING_POISONOUS_DECOCTION = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "flowing_poisonous_decoctione"), new PoisonousDecoctionFluid.Flowing());

        POISONOUS_DECOCTION_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateCooking.MOD_ID, "poisonous_decoction_block"),
                new FluidBlock(ModFluids.STILL_POISONOUS_DECOCTION, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        POISONOUS_DECOCTION_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateCooking.MOD_ID, "poisonous_decoction_bucket"),
                new BucketItem(ModFluids.STILL_POISONOUS_DECOCTION, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_WATERMELON_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "watermelon_juice_fluid"), new WatermelonJuiceFluid.Still());
        FLOWING_WATERMELON_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "flowing_watermelon_juice"), new WatermelonJuiceFluid.Flowing());

        WATERMELON_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateCooking.MOD_ID, "watermelon_juice_block"),
                new FluidBlock(ModFluids.STILL_WATERMELON_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        WATERMELON_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateCooking.MOD_ID, "watermelon_juice_bucket"),
                new BucketItem(ModFluids.STILL_WATERMELON_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_SWEET_BERRIES_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "sweet_berries_juice_fluid"), new SweetBerriesJuiceFluid.Still());
        FLOWING_SWEET_BERRIES_JUICE = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "flowing_sweet_berries_juice"), new SweetBerriesJuiceFluid.Flowing());

        SWEET_BERRIES_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateCooking.MOD_ID, "sweet_berries_juice_block"),
                new FluidBlock(ModFluids.STILL_SWEET_BERRIES_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        SWEET_BERRIES_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateCooking.MOD_ID, "sweet_berries_juice_bucket"),
                new BucketItem(ModFluids.STILL_SWEET_BERRIES_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_STEWED_MEAT = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "stewed_meat_fluid"), new StewedMeatFluid.Still());
        FLOWING_STEWED_MEAT = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "flowing_stewed_meat"), new StewedMeatFluid.Flowing());

        STEWED_MEAT_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateCooking.MOD_ID, "stewed_meat_block"),
                new FluidBlock(ModFluids.STILL_STEWED_MEAT, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        STEWED_MEAT_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateCooking.MOD_ID, "stewed_meat_bucket"),
                new BucketItem(ModFluids.STILL_STEWED_MEAT, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_POTATO_STEW = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "potato_stew_fluid"), new PotatoStewFluid.Still());
        FLOWING_POTATO_STEW = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "flowing_potato_stew"), new PotatoStewFluid.Flowing());

        POTATO_STEW_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateCooking.MOD_ID, "potato_stew_block"),
                new FluidBlock(ModFluids.STILL_POTATO_STEW, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        POTATO_STEW_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateCooking.MOD_ID, "potato_stew_bucket"),
                new BucketItem(ModFluids.STILL_POTATO_STEW, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_PUMPKIN_PORRIDGE = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "pumpkin_porridge_fluid"), new PumpkinPorridgeFluid.Still());
        FLOWING_PUMPKIN_PORRIDGE = Registry.register(Registries.FLUID,
                new Identifier(CreateCooking.MOD_ID, "flowing_pumpkin_porridge"), new PumpkinPorridgeFluid.Flowing());

        PUMPKIN_PORRIDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateCooking.MOD_ID, "pumpkin_porridge_block"),
                new FluidBlock(ModFluids.STILL_PUMPKIN_PORRIDGE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        PUMPKIN_PORRIDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateCooking.MOD_ID, "pumpkin_porridge_bucket"),
                new BucketItem(ModFluids.STILL_PUMPKIN_PORRIDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
