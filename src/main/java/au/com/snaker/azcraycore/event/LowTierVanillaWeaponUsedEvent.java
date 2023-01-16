package au.com.snaker.azcraycore.event;

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
import net.minecraft.world.World;

public class LowTierVanillaWeaponUsedEvent {
    public static void executeEvent(PlayerEntity player, World world) {
        if(!world.isRemote) {
            ITextComponent lowTierToolStatus = new TranslationTextComponent("status.azcraycore.low_tier_vanilla_weapon");

            player.sendStatusMessage(lowTierToolStatus, true);

            player.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 100, 10));
            player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 10));

            LightningBoltEntity lightningBolt = EntityType.LIGHTNING_BOLT.create(world);

            assert lightningBolt!=null;

            lightningBolt.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(player.getPosX(), player.getPosY(), player.getPosZ())));
            lightningBolt.setEffectOnly(true);

            world.addEntity(lightningBolt);

            player.attackEntityFrom(DamageSource.MAGIC, 4f);
        }
    }
}