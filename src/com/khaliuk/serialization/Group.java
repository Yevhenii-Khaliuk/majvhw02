package com.khaliuk.serialization;

import java.util.ArrayList;
import java.util.List;

public class Group implements Shape {
    private List<Shape> shapes;

    public Group(List<Shape> shapes) {
        this.shapes = new ArrayList<>(shapes);
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    @Override
    public void print() {
        System.out.println("Group with elements:");
        for (Shape shape : shapes) {
            System.out.print("\t");
            shape.print();
            System.out.println();
        }
    }
}
