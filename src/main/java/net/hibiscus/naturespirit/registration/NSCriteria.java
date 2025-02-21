package net.hibiscus.naturespirit.registration;

import net.fabricmc.fabric.mixin.object.builder.CriteriaAccessor;
import net.hibiscus.naturespirit.NatureSpirit;
import net.hibiscus.naturespirit.advancements.CoconutHitCriterion;
import net.minecraft.advancement.criterion.Criterion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NSCriteria {

  public static final CoconutHitCriterion COCONUT_HIT_CRITERION = CriteriaAccessor.callRegister(new CoconutHitCriterion());

  public static void registerCriteria() {}
  }