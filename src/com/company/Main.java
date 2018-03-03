package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> list = Arrays.asList(new Circle(), new Square());
        list.forEach(e-> System.out.println(InfoClass.getInfo(e.getClass())));
    }
}
