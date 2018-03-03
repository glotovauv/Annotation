package com.company;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    public String toString() {
        return "Square";
    }
}
