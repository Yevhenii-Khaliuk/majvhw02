package com.khaliuk.serialization;

import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {
    public static void main(String[] args) {
        List<Shape> list1 = new ArrayList<>();
        list1.add(new Triangle(new double[]{3.0, 4.0, 5.0}));
        list1.add(new Square(3.3));
        list1.add(new Circle(2.5));
        Shape group1 = new Group(list1);

        List<Shape> list2 = new ArrayList<>();
        list2.add(new Triangle(new double[]{6.0, 8.0, 10.0}));
        list2.add(new Square(3.7));
        list2.add(new Circle(2.8));
        list2.add(group1);
        Shape group2 = new Group(list2);

        List<Shape> list3 = new ArrayList<>();
        list3.add(new Triangle(new double[]{9.0, 5.0, 12.0}));
        list3.add(new Square(5.3));
        list3.add(new Circle(7.5));
        Shape group3 = new Group(list3);

        List<Shape> list4 = new ArrayList<>();
        list4.add(new Triangle(new double[]{1.5, 2.0, 2.5}));
        list4.add(new Square(0.3));
        list4.add(new Circle(2.25));
        list4.add(group3);
        list4.add(group2);
        Shape mainGroup = new Group(list4);

        System.out.println("XML string");
        System.out.println();
        System.out.println(ShapeToXml.encode(mainGroup));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("JSON string");
        System.out.println();
        System.out.println(ShapeToJson.encode(mainGroup));
    }
}
