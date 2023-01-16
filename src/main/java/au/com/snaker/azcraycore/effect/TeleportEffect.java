package au.com.snaker.azcraycore.effect;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class TeleportEffect extends Effect
{
    public TeleportEffect(EffectType category, int color)
    {
        super(category, color);
    }

    @Override
    public void performEffect(LivingEntity livingEntity, int amplifier)
    {
        if(livingEntity.ticksExisted%10==0)
        {
            if(!livingEntity.world.isRemote)
            {
                double posX = livingEntity.getPosX();
                double posY = livingEntity.getPosY();
                double posZ = livingEntity.getPosZ();
                double x_rand = posX+(livingEntity.getRNG().nextDouble()-0.5D)*16.0D;
                double y_rand = MathHelper.clamp(posY+
                                (livingEntity.getRNG().nextInt(16)-8), 0.0D,
                        (livingEntity.world.getHeight()-1));
                double z_rand = posZ+(livingEntity.getRNG().nextDouble()-0.5D)*16.0D;
                BlockPos finalPos = new BlockPos(x_rand, y_rand, z_rand);
                if(livingEntity.world.getBlockState(finalPos).getBlock()==Blocks.AIR)
                {
                    livingEntity.world.playSound(null, x_rand, y_rand, z_rand,
                            SoundEvents.ENTITY_FOX_TELEPORT, SoundCategory.PLAYERS, 1f, 1f);
                    livingEntity.attemptTeleport(x_rand, y_rand, z_rand, true);
                }
            }
            super.performEffect(livingEntity, amplifier);
        }
    }

    @Override
    public boolean isReady(int duration, int amplifier)
    {
        return true;
    }
}
