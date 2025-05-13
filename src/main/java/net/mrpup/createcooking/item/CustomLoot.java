package net.mrpup.createcooking.item;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.entity.EntityType;

public class CustomLoot {

    public static void register() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (id.equals(EntityType.PIG.getLootTableId())) {
                LootPool pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.INTESTINES)
                                .conditionally(RandomChanceLootCondition.builder(0.5f))
                        )
                        .build();

                supplier.pool(pool);
            }
        });
    }
}
