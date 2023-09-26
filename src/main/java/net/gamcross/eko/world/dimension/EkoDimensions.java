package net.gamcross.eko.world.dimension;

import net.gamcross.eko.EkoMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;


public class EkoDimensions {
    private static final RegistryKey<DimensionOptions> DIMENSION_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(EkoMod.MOD_ID, "dimension"));
    public static RegistryKey<World> OPAL_KEY = RegistryKey.of(RegistryKeys.WORLD, DIMENSION_KEY.getValue());
    private static final RegistryKey<DimensionType> DIMENSION_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(EkoMod.MOD_ID, "dimension_type"));


    public static void register() {
        EkoMod.LOGGER.debug("Registering ModDimensions for " + EkoMod.MOD_ID);
    }
}
