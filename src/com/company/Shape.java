package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ShapeAnnotation{
}

public abstract class Shape {
    @ShapeAnnotation()
    public abstract void draw();

    @Override
    public abstract String toString();
}
