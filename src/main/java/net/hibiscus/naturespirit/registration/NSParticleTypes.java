package net.hibiscus.naturespirit.registration;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.hibiscus.naturespirit.NatureSpirit;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NSParticleTypes {

  public static final DefaultParticleType RED_MAPLE_LEAVES_PARTICLE = FabricParticleTypes.simple(false);
  public static final DefaultParticleType ORANGE_MAPLE_LEAVES_PARTICLE = FabricParticleTypes.simple(false);
  public static final DefaultParticleType YELLOW_MAPLE_LEAVES_PARTICLE = FabricParticleTypes.simple(false);
  public static final DefaultParticleType MILK_PARTICLE = FabricParticleTypes.simple(false);
  public static final DefaultParticleType CALCITE_BUBBLE_PARTICLE = FabricParticleTypes.simple(false);

  public static void registerParticleTypes() {
    Registry.register(Registries.PARTICLE_TYPE, new Identifier(NatureSpirit.MOD_ID, "red_maple_leaves"), RED_MAPLE_LEAVES_PARTICLE);
    Registry.register(Registries.PARTICLE_TYPE, new Identifier(NatureSpirit.MOD_ID, "orange_maple_leaves"), ORANGE_MAPLE_LEAVES_PARTICLE);
    Registry.register(Registries.PARTICLE_TYPE, new Identifier(NatureSpirit.MOD_ID, "yellow_maple_leaves"), YELLOW_MAPLE_LEAVES_PARTICLE);
    Registry.register(Registries.PARTICLE_TYPE, new Identifier(NatureSpirit.MOD_ID, "milk"), MILK_PARTICLE);
    Registry.register(Registries.PARTICLE_TYPE, new Identifier(NatureSpirit.MOD_ID, "calcite_bubble"), CALCITE_BUBBLE_PARTICLE);
  }
}
