package com.nanshaws.fileUtils;

import java.io.File;

public class PathUtils {

    public static File findByNameReturnFile(String name){
        File currentDir = new File(System.getProperty("user.dir"));
        return search(currentDir, name);
    }
    private static File search(File dir, String name) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    File result = search(file, name);
                    if (result != null) {
                        return result;
                    }
                } else if (file.getName().equals(name)) {
                    return file;
                }
            }
        }
        return null;
    }

    public static File getResourceFile(String name){
        File file=new File(name);
        return file;
    }

}
