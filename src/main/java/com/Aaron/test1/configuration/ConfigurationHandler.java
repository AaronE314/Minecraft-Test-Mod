package com.Aaron.test1.configuration;

import net.minecraftforge.common.config.Configuration;

import javax.security.auth.login.AppConfigurationEntry;
import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        Configuration configuration = new Configuration(configFile);

        try {
            configuration.load();
            Boolean configValue = configuration.get("Test Catagory", "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch(Exception e) {

        }
        finally {
            configuration.save();
        }
    }
}
