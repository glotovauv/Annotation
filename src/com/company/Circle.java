package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CircleAnnotation{
    String getDescription();
}

public class Circle extends Shape {
    @Override
    @CircleAnnotation(getDescription = "drawCircle")
    public void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
