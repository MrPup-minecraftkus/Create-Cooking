package net.mrpup.createcooking;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.mrpup.createcooking.fluid.ModFluids;

public class CreateCookingClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CARROT_JUICE, ModFluids.FLOWING_CARROT_JUICE,
				new SimpleFluidRenderHandler(
						new Identifier("minecraft:block/water_still"),
						new Identifier("minecraft:block/water_flow"),
						0xFFFFA500
				));
		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_POISONOUS_DECOCTION, ModFluids.FLOWING_POISONOUS_DECOCTION,
				new SimpleFluidRenderHandler(
						new Identifier("minecraft:block/water_still"),
						new Identifier("minecraft:block/water_flow"),
						0xFF00FF00
				));
		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WATERMELON_JUICE, ModFluids.FLOWING_WATERMELON_JUICE,
				new SimpleFluidRenderHandler(
						new Identifier("minecraft:block/water_still"),
						new Identifier("minecraft:block/water_flow"),
						0xFFFF5555
				));
		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SWEET_BERRIES_JUICE, ModFluids.FLOWING_SWEET_BERRIES_JUICE,
				new SimpleFluidRenderHandler(
						new Identifier("minecraft:block/water_still"),
						new Identifier("minecraft:block/water_flow"),
						0xFFFF0000
				));

		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_STEWED_MEAT, ModFluids.FLOWING_STEWED_MEAT,
				new SimpleFluidRenderHandler(
						new Identifier("create_cooking:block/stewed_meat"),
						new Identifier("create_cooking:block/stewed_meat")
				));

		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PUMPKIN_PORRIDGE, ModFluids.FLOWING_PUMPKIN_PORRIDGE,
				new SimpleFluidRenderHandler(
						new Identifier("create_cooking:block/pumpkin_porridge_still"),
						new Identifier("create_cooking:block/pumpkin_porridge_still")
				));

		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_POTATO_STEW, ModFluids.FLOWING_POTATO_STEW,
				new SimpleFluidRenderHandler(
						new Identifier("create_cooking:block/potato_stew_still"),
						new Identifier("create_cooking:block/potato_stew_still")
				));

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_CARROT_JUICE, ModFluids.FLOWING_CARROT_JUICE);

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_POISONOUS_DECOCTION, ModFluids.FLOWING_POISONOUS_DECOCTION);

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_WATERMELON_JUICE, ModFluids.FLOWING_WATERMELON_JUICE);

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_SWEET_BERRIES_JUICE, ModFluids.FLOWING_SWEET_BERRIES_JUICE);

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_STEWED_MEAT, ModFluids.FLOWING_STEWED_MEAT);

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_PUMPKIN_PORRIDGE, ModFluids.FLOWING_PUMPKIN_PORRIDGE);

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_POTATO_STEW, ModFluids.FLOWING_POTATO_STEW);
	}
}