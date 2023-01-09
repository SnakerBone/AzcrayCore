package com.snaker.azcray.event;

import com.snaker.azcray.Azcray;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Map;

public class LowTierVanillaWeaponUsedEvent
{
    public static void executeEvent(Map<String, Object> dependencies)
    {
        Entity livingEntity = (Entity) dependencies.get("entity");
        if(dependencies.get("entity")==null)
        {
            if(!dependencies.containsKey("entity"))
                Azcray.LOGGER.warn("com.snaker.azcray.events.LowTierVanillaWeaponUsedEvent load error!");
            return;
        }
        IWorld world = (IWorld) dependencies.get("world");
        double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x"):(double) dependencies.get("x");
        double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y"):(double) dependencies.get("y");
        double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z"):(double) dependencies.get("z");
        if(livingEntity instanceof PlayerEntity)
        {
            if(world instanceof ServerWorld)
            {
                ITextComponent lowTierWeaponStatus = new TranslationTextComponent("status.azcray.low_tier_vanilla_weapon");
                ((PlayerEntity) livingEntity).sendStatusMessage(lowTierWeaponStatus, true);
                ((PlayerEntity) livingEntity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, 100, 10));
                ((PlayerEntity) livingEntity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 10));
                LightningBoltEntity lightningBoltEntity = EntityType.LIGHTNING_BOLT.create((World) world);
                assert lightningBoltEntity!=null;
                lightningBoltEntity.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, y, z)));
                lightningBoltEntity.setEffectOnly(true);
                world.addEntity(lightningBoltEntity);
                livingEntity.attackEntityFrom(DamageSource.MAGIC, 4f);
            }
        }
    }
}

