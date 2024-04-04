package com.nanshaws.fileUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileClone {
    public static void cloneFile(File preFile, File nextFile){
        try (InputStream in = new FileInputStream(preFile);
            OutputStream out = new FileOutputStream(nextFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
