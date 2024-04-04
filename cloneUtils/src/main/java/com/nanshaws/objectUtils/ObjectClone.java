package com.nanshaws.objectUtils;

import sun.misc.Unsafe;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;

public class ObjectClone {

    public static Object cloneObjectReturnObject(Object preObject,Object nextObject){
        Field[] preField = preObject.getClass().getDeclaredFields();
        Field[] nextField = nextObject.getClass().getDeclaredFields();
        for (Field prefield : preField) {
            for (Field nextfield : nextField) {
                if (prefield.getName().equals(nextfield.getName())) {
                    try {
                        VarHandle pvarHandle = MethodHandles.lookup().findVarHandle(preObject.getClass(), prefield.getName(),  prefield.getType());
                        VarHandle nvarHandle = MethodHandles.lookup().findVarHandle(nextObject.getClass(), nextfield.getName(), nextfield.getType());
                        Object pvalue = pvarHandle.get(preObject);
                        nvarHandle.set(nextObject,pvalue);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (NoSuchFieldException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return nextObject;
    }
}
