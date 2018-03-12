package com.company;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class InfoClass {
    public static String getInfo(Class clazz) {
        StringBuilder info = new StringBuilder();
        info.append(clazz.getName()).append("\n");

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            if (Modifier.isPublic(m.getModifiers())) {
                if (m.isAnnotationPresent(MyAnnotation.class)) {
                    info.append("  * ");
                } else {
                    info.append("  - ");
                }
                info.append(m).append("\n");
            }
        }

        Class superclass = clazz.getSuperclass();
        if (superclass != null) info.append(getInfo(superclass));
        return info.toString();
    }
}
