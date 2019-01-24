package com.khaliuk.serialization;

public class Triangle implements Shape {
    private double[] sides;

    public Triangle(double[] sides) {
        this.sides = new double[3];
        System.arraycopy(sides, 0, this.sides, 0, 3);
    }

    public double[] getSides() {
        double[] temp = new double[3];
        System.arraycopy(sides, 0, temp, 0, 3);
        return temp;
    }

    public void setSides(double[] sides) {
        System.arraycopy(sides, 0, this.sides, 0, 3);
    }

    @Override
    public void print() {
        System.out.print("Triangle with sides: ");
        for (double side : sides) {
            System.out.print(side + " ");
        }
    }
}
