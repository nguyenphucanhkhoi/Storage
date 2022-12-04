package net.danh.storage.api.Files;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.Serializable;
import java.util.List;

/**
 * This class use to manager data from yaml config
 */
@SuppressWarnings("unused")
public interface ConfigManager {
    /**
     * Get custom type value from config by class
     * @param <T> Type of value store in config
     * @param path Path to get value
     * @param clazz Class of value to get
     * @return Value store in config
     */
    <T> T get(Class<T> clazz, String path);

    /**
     * Get custom type value from config by class
     * Get the nearest path if the path not found
     * @param <T> Type of value store in config
     * @param clazz Class of value to get
     * @param path Path to get value
     * @return Value store in config
     */
    <T> T getMatch(Class<T> clazz, String path);

    /**
     * Get the path nearest this path exist in config file
     * @param path Path to compare nearest
     * @return Another path
     */
    String getNearPath(String path);

    /**
     * Encode and save object as a byte array
     * @param object Object to save
     * @param path Path to save object
     * @throws IllegalArgumentException Object
     * need to implement serializable
     */
    void encode(Class<? extends Serializable> object, String path) throws IllegalArgumentException;

    /**
     * Decode and return value store in this path if
     * path is encoding object
     * @param path Path to decode
     * @return The object after decode
     */
    Object decode(String path);

    /**
     * Check if value store in this path is encoding
     * or not
     * @param path Path to check
     * @return True or false
     */
    boolean isEncode(String path);

    /**
     * Get the default type that bukkit config
     * support
     * @return List contains class types
     */
    List<Class<?>> getDefaultTypes();

    /**
     * Get the config file this class represent
     * @return Bukkit yaml config
     */
    YamlConfiguration getConfigFile();

    /**
     * Reload the config file
     */
    void reload();
}
