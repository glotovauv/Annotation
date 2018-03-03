package com.company;

import java.lang.reflect.Method;

public class InfoClass {
    public static String getInfo(Class clazz) {
        StringBuilder info = new StringBuilder();
        info.append(clazz.getName()).append("\n");

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            if (m.getDeclaredAnnotations().length > 0) {
                info.append("  * ");
            } else {
                info.append("  - ");
            }
            info.append(m).append("\n");
        }

        Class superclass = clazz.getSuperclass();
        if (superclass != null) info.append(getInfo(superclass));
        return info.toString();
    }
}
