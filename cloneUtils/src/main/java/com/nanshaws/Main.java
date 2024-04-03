package com.nanshaws;

import com.nanshaws.jsonUtils.JsonClone;

public class Main {
    public static void main(String[] args) {
        String jsonpre = "{\"name\":\"cyl\", \"age\":18}";
        String jsonnext = "{\"beibei\":\"hu\", \"age\":20}";
        String s = JsonClone.cloneObjectRetrunString(jsonpre, jsonnext);
        System.out.println(s);
    }
}