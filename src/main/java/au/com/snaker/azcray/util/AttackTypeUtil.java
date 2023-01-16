package au.com.snaker.azcray.util;

import au.com.snaker.azcray.data.Const;
import au.com.snaker.azcray.data.Maths;
import au.com.snaker.azcray.init.AzcrayEffectInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;

public class AttackTypeUtil {
    public static void attackAOE(PlayerEntity player) {
        World world = player.world;

        if (!world.isRemote()) {
            double posX = player.getPosX();
            double posY = player.getPosY();
            double posZ = player.getPosZ();

            AxisAlignedBB aabb = new AxisAlignedBB(posX, posY, posZ, posX, posY, posZ).grow(Const.AOE_RANGE);
            List<LivingEntity> toAttack = world.getEntitiesWithinAABB(MobEntity.class, aabb);
            DamageSource source = DamageSource.causePlayerDamage(player).setDamageBypassesArmor();

            // generate factorial number depending on the amount of mobs in range of player
            float damage = Maths.generateFactorial(toAttack.size());

            for (LivingEntity entity : toAttack) {
                entity.addPotionEffect(new EffectInstance(AzcrayEffectInit.TELEPORT.get(), 100, 1));
                entity.attackEntityFrom(source, damage);
            }
        }
    }
}
