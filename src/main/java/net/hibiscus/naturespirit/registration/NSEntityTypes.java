package net.hibiscus.naturespirit.registration;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.hibiscus.naturespirit.entity.CheeseArrowEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.hibiscus.naturespirit.NatureSpirit.MOD_ID;

public class NSEntityTypes {

  private static final FabricEntityTypeBuilder<CheeseArrowEntity> CHEESE_ARROW_ENTITY_BUILDER = FabricEntityTypeBuilder.create(SpawnGroup.MISC).entityFactory(CheeseArrowEntity::new);
  public static final EntityType<CheeseArrowEntity> CHEESE_ARROW = registerEntityType("cheese_arrow", CHEESE_ARROW_ENTITY_BUILDER.dimensions(EntityDimensions.changing(0.5F, 0.5F)).trackRangeChunks(4).trackedUpdateRate(20).build());


  public static void registerEntityTypes() {}
  public static <T extends EntityType<?>> T registerEntityType(String id, T type) {
    return Registry.register(Registries.ENTITY_TYPE, new Identifier(MOD_ID, id), type);
  }

}
