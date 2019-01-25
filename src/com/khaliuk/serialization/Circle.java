package com.khaliuk.serialization;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.print("Square with radius: " + getRadius());
    }

    @Override
    public String encodeToXML() {
        String xmlString = "<Circle>\n";
        xmlString += "\t<radius>" + getRadius() + "</radius>\n";
        xmlString += "</Circle>\n";
        return xmlString;
    }

    @Override
    public String encodeToJSON() {
        String jsonString = "\t\"Circle\" : {\n";
        jsonString += "\t\t\"radius\" : \"" + getRadius() + "\"\n";
        jsonString += "\t}";
        return jsonString;
    }
}
