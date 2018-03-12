package com.company;

public class Circle extends Shape {
    @Override
    @MyAnnotation(getDescription = "drawCircle")
    public void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
