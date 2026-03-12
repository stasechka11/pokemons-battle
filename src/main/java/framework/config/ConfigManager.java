package framework.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static final Properties PROPERTIES = new Properties();

    static {
        try (InputStream input = ConfigManager.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                throw new RuntimeException("config.properties not found");
            }

            PROPERTIES.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String getBaseUrl() {
        return PROPERTIES.getProperty("base.url");
    }

    public static String getLoginEndpoint() {
        return PROPERTIES.getProperty("login.endpoint");
    }

    public static String getPokemonEndpoint() {
        return PROPERTIES.getProperty("pokemon.endpoint");
    }

    public static String getApiLogin() {
        String value = System.getenv("API_LOGIN");
        if (value == null || value.isBlank()) {
            throw new RuntimeException("API_LOGIN environment variable is not set");
        }
        return value;
    }

    public static String getApiPassword() {
        String value = System.getenv("API_PASSWORD");
        if (value == null || value.isBlank()) {
            throw new RuntimeException("API_PASSWORD environment variable is not set");
        }
        return value;
    }

    public static String getAuthHeaderName() {
        return PROPERTIES.getProperty("auth.header.name");
    }

    public static String getTrainerToken() {
        String value = System.getenv("TRAINER_TOKEN");
        if (value == null || value.isBlank()) {
            throw new RuntimeException("TRAINER_TOKEN environment variable is not set");
        }
        return value;
    }
}