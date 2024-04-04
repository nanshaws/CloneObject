package com.nanshaws.fileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {

    public static Properties readProperties(String fileName) {
        Properties props = new Properties();
        try (InputStream input = new FileInputStream(fileName)) {
            props.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return props;
    }
    public static Properties readResourcesProperties(String fileName) {
        Properties props = new Properties();
        try (InputStream input = PropertiesUtils.class.getClassLoader().getResourceAsStream(fileName)) {
            props.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return props;
    }



}
