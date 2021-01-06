package org.wbl.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
    public static final Properties prop = new Properties();

    public ConfigUtil(String filename){
        try {
            prop.load(new FileInputStream(filename));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getProperty(String key){
        return prop.getProperty(key);
    }
}
