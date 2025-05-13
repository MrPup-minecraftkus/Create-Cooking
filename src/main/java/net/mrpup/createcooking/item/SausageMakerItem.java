package net.mrpup.createcooking.item;

import com.simibubi.create.foundation.utility.VecHelper;
import net.fabricmc.fabric.api.entity.FakePlayer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SausageMakerItem extends Item {

    public SausageMakerItem(Settings settings) {
        super(settings.maxDamage(4));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack sausageTool = player.getStackInHand(hand);
        Hand otherHand = hand == Hand.MAIN_HAND ? Hand.OFF_HAND : Hand.MAIN_HAND;
        ItemStack meatStack = player.getStackInHand(otherHand);

        if (!canSausage(meatStack)) {
            return new TypedActionResult<>(ActionResult.FAIL, sausageTool);
        }

        ItemStack meatToProcess = meatStack.copy();
        meatToProcess.setCount(1);

        player.setCurrentHand(hand);
        NbtCompound sausageTag = sausageTool.getOrCreateNbt();
        NbtCompound meatTag = new NbtCompound();
        meatToProcess.writeNbt(meatTag);
        sausageTag.put("Sausaging", meatTag);
        meatStack.decrement(1);

        return new TypedActionResult<>(ActionResult.SUCCESS, sausageTool);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity entity) {
        if (!(entity instanceof PlayerEntity player)) return stack;

        NbtCompound tag = stack.getOrCreateNbt();
        if (!tag.contains("Sausaging")) return stack;

        ItemStack meat = ItemStack.fromNbt(tag.getCompound("Sausaging"));
        Item sausageItem;

        if (meat.isOf(Items.BEEF)) {
            sausageItem = ModItems.BEEF_SAUSAGE;
        } else if (meat.isOf(Items.PORKCHOP)) {
            sausageItem = ModItems.PORK_SAUSAGE;
        } else if (meat.isOf(Items.MUTTON)) {
            sausageItem = ModItems.MUTTON_SAUSAGE;
        } else {
            return stack;
        }

        ItemStack sausage = new ItemStack(sausageItem);

        if (world.isClient) {
            spawnParticles(entity.getPos(), meat, world);
            return stack;
        }

        if (player instanceof FakePlayer) {
            player.dropItem(sausage, false);
        } else {
            player.getInventory().offerOrDrop(sausage);
        }

        tag.remove("Sausaging");
        stack.damage(1, player, p -> p.sendToolBreakStatus(p.getActiveHand()));
        return stack;
    }

    private void spawnParticles(Vec3d location, ItemStack input, World world) {
        for (int i = 0; i < 10; i++) {
            Vec3d motion = VecHelper.offsetRandomly(Vec3d.ZERO, world.random, 0.1f);
            world.addParticle(new ItemStackParticleEffect(ParticleTypes.ITEM, input),
                    location.x, location.y + 1.0, location.z, motion.x, motion.y, motion.z);
        }
    }

    private boolean canSausage(ItemStack stack) {
        return stack.isOf(net.minecraft.item.Items.BEEF)
                || stack.isOf(net.minecraft.item.Items.PORKCHOP)
                || stack.isOf(Items.MUTTON);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!(user instanceof PlayerEntity player)) return;

        NbtCompound tag = stack.getOrCreateNbt();
        if (!tag.contains("Sausaging")) return;

        ItemStack meat = ItemStack.fromNbt(tag.getCompound("Sausaging"));

        if (!world.isClient) {
            player.getInventory().offerOrDrop(meat);
        }

        tag.remove("Sausaging");
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_EAT;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return false;
    }

}