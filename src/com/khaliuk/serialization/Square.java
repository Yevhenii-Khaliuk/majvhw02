package com.khaliuk.serialization;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void print() {
        System.out.print("Square with side: " + getSide());
    }
}
