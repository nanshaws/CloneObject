package com.nanshaws;

import com.nanshaws.fileUtils.FileClone;
import com.nanshaws.fileUtils.PathUtils;
import com.nanshaws.fileUtils.PropertiesUtils;

import java.io.File;
import java.util.Properties;

public class MainTest {
    public static void main(String[] args) {
        Properties properties = PropertiesUtils.readResourcesProperties("t1.properties");
        String o = (String)properties.get("name");
        System.out.println(o);
    }
}