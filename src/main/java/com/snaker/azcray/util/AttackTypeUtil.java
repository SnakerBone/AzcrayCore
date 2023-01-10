package com.snaker.azcray.util;

import com.snaker.azcray.data.Const;
import com.snaker.azcray.data.Maths;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;

public class AttackTypeUtil {
    public static void attackAOE(ItemStack item, LivingEntity target, LivingEntity attacker) {
        PlayerEntity player = (PlayerEntity) attacker;
        World world = player.world;

        if (!world.isRemote()) {
            double posX = attacker.getPosX();
            double posY = attacker.getPosY();
            double posZ = attacker.getPosZ();

            AxisAlignedBB aabb = new AxisAlignedBB(posX, posY, posZ, posX, posY, posZ).grow(Const.AOE_RANGE);
            List<Entity> toAttack = world.getEntitiesWithinAABB(MobEntity.class, aabb);
            DamageSource source = DamageSource.causePlayerDamage(player).setDamageBypassesArmor();

            // generate factorial depending on the amount of mobs in range of AOE
            float damage = Maths.generateFactorial(toAttack.size());

            for (Entity entity : toAttack) {
                entity.attackEntityFrom(source, damage);
            }
        }
    }
}
