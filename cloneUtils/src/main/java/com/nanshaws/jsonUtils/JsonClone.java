package com.nanshaws.jsonUtils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

public class JsonClone {
    public static String cloneObjectRetrunString(String preObject,String nextObject){
        Gson gson = new Gson();
        Map<String, Object> mappre = gson.fromJson(preObject, new TypeToken<HashMap<String, Object>>() {}.getType());
        Map<String, Object> mapnext = gson.fromJson(nextObject, new TypeToken<HashMap<String, Object>>() {}.getType());
        for (Map.Entry<String, Object> entrypre : mappre.entrySet()) {
            for (Map.Entry<String, Object> entrynext : mapnext.entrySet()) {
                if (entrypre.getKey().equals(entrynext.getKey())){
                    entrynext.setValue(entrypre.getValue());
                }
            }
        }
        nextObject = gson.toJson(mapnext);
        return nextObject;
    }

}
