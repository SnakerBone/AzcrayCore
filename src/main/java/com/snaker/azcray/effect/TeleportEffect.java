package com.snaker.azcray.effect;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class TeleportEffect extends Effect {
    public TeleportEffect(EffectType category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if(livingEntity.tickCount % 20 == 0) {
            if (!livingEntity.level.isClientSide()) {

                int posX = livingEntity.blockPosition().getX();
                int posZ = livingEntity.blockPosition().getZ();

                Double x_rand = posX + (livingEntity.getRandom().nextDouble() - 0.5D) * 16.0D;
                Double y_rand = MathHelper.clamp(livingEntity.getY() +
                                (double)(livingEntity.getRandom().nextInt(16) - 8), 0.0D,
                                    (livingEntity.level.getHeight() - 1)); // do not teleport player out of world boundaries
                Double z_rand = posZ + (livingEntity.getRandom().nextDouble() - 0.5D) * 16.0D;

                BlockPos finalPos = new BlockPos(x_rand, y_rand, z_rand);

                // only teleport player if block is minecraft:air. if block is not minecraft:air wait until next run

                if (livingEntity.level.getBlockState(finalPos).getBlock() == Blocks.AIR) {
                    livingEntity.level.playSound(null, x_rand, y_rand, z_rand,
                            SoundEvents.FOX_TELEPORT, SoundCategory.PLAYERS, 1f, 1f);
                    livingEntity.setDeltaMovement(0, 0, 0);
                    livingEntity.teleportTo(x_rand, y_rand, z_rand);
                }
            }
            super.applyEffectTick(livingEntity, amplifier);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
