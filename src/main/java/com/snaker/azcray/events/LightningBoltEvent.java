package com.snaker.azcray.events;

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

public class LightningBoltEvent {

    public static void executeEvent(Map<String, Object> dependencies) {

        Entity livingEntity = (Entity) dependencies.get("entity");

            // warn if lightning bolt entity does not exist

            if (dependencies.get("entity") == null) {
                if (!dependencies.containsKey("entity"))
                    Azcray.LOGGER.warn("com.snaker.azcray.events.LightningBoltEvent load failure!");
                return;
            }

            // do not the creature!

            ITextComponent iTextComponent = new TranslationTextComponent("gui.azcray.notification.do_not_the_creature");

            IWorld world = (IWorld) dependencies.get("world");

            double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
            double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
            double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");

            // forked from https://github.com/Y3Z0N/theabyss/blob/1.16.5/src/main/java/net/yezon/theabyss/events/ThunderFlowerEffectEvent.java

            if (livingEntity instanceof PlayerEntity) {
                if (world instanceof ServerWorld) {
                        ((PlayerEntity) livingEntity).sendStatusMessage(iTextComponent, true);

                        LightningBoltEntity lightningBoltEntity = EntityType.LIGHTNING_BOLT.create((World) world);

                        assert lightningBoltEntity != null;

                        lightningBoltEntity.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, y, z)));
                        lightningBoltEntity.setEffectOnly(true);

                        world.addEntity(lightningBoltEntity);

                        livingEntity.attackEntityFrom(DamageSource.MAGIC, 4f);

                        ((PlayerEntity) livingEntity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, 100, 10));
                        ((PlayerEntity) livingEntity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 10));
                }
            }
    }

}
