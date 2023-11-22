package org.betonquest.betonquest.modules.config.patcher.migration.migrators;

import org.betonquest.betonquest.modules.config.patcher.migration.Migrator;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.Map;

/**
 * Handels the effect_lib migration.
 */
public class EffectLib implements Migrator {

    /**
     * The configs to migrate.
     */
    private final Map<File, YamlConfiguration> configs;

    /**
     * Creates a new effect_lib migrator.
     *
     * @param configs The configs to migrate.
     */
    public EffectLib(final Map<File, YamlConfiguration> configs) {
        this.configs = configs;
    }

    @Override
    public boolean needMigration() {
        return false;
    }

    @Override
    public void migrate() {

    }
}
