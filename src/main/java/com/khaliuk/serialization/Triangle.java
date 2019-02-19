package com.khaliuk.serialization;

public class Triangle implements Shape {
    private static final int SIDES_NUMBER = 3;
    private double[] sides;

    public Triangle(double[] sides) {
        this.sides = new double[SIDES_NUMBER];
        System.arraycopy(sides, 0, this.sides, 0, SIDES_NUMBER);
    }

    public double[] getSides() {
        double[] temp = new double[SIDES_NUMBER];
        System.arraycopy(sides, 0, temp, 0, SIDES_NUMBER);
        return temp;
    }

    public void setSides(double[] sides) {
        System.arraycopy(sides, 0, this.sides, 0, SIDES_NUMBER);
    }

    @Override
    public void print() {
        System.out.print("Triangle with sides: ");
        for (double side : sides) {
            System.out.print(side + " ");
        }
    }
}
