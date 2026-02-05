package ActitimeLoginPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExeclReadData {
    private static final String CONFIG_FILE_PATH = "src/test/resources/config.properties";

    /**
     * Reads a value from the config.properties file by key.
     * @param key the property key
     * @return the property value, or null if not found
     */
    public static String getProperty(String key) {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(CONFIG_FILE_PATH)) {
            prop.load(input);
            String value = prop.getProperty(key);
            if (value == null) {
                System.err.println("Property key '" + key + "' not found in config.properties.");
            }
            return value;
        } catch (IOException ex) {
            System.err.println("Error reading config.properties: " + ex.getMessage());
            return null;
        }
    }
}