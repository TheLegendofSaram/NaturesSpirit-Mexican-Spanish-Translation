package net.hibiscus.naturespirit.entity;

import net.hibiscus.naturespirit.registration.NSEntityTypes;
import net.hibiscus.naturespirit.registration.NSMiscBlocks;
import net.hibiscus.naturespirit.registration.NSParticleTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CheeseArrowEntity extends PersistentProjectileEntity {


  public CheeseArrowEntity(EntityType<? extends CheeseArrowEntity> entityType, World world) {
    super(entityType, world);
  }

  public CheeseArrowEntity(World world, LivingEntity owner) {
    super(NSEntityTypes.CHEESE_ARROW, owner, world);
  }

  public CheeseArrowEntity(World world, double x, double y, double z) {
    super(NSEntityTypes.CHEESE_ARROW, x, y, z, world);
  }

  public void tick() {
    super.tick();
    if (this.getWorld().isClient && !this.inGround) {
      this.getWorld().addParticle(NSParticleTypes.MILK_PARTICLE, this.getX(), this.getY(), this.getZ(), 0D, 0D, 0D);
    }

  }

  @Override
  protected ItemStack asItemStack() {
    return new ItemStack(NSMiscBlocks.CHEESE_ARROW);
  }

  protected void onHit(LivingEntity target) {
    super.onHit(target);
    target.clearStatusEffects();
  }

  public void readCustomDataFromNbt(NbtCompound nbt) {
    super.readCustomDataFromNbt(nbt);
  }

  public void writeCustomDataToNbt(NbtCompound nbt) {
    super.writeCustomDataToNbt(nbt);
  }
}
