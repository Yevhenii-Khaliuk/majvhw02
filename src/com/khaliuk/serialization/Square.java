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

    @Override
    public String encodeToXml() {
        String xmlString = "<Square>\n";
        xmlString += "\t<side>" + getSide() + "</side>\n";
        xmlString += "</Square>\n";
        return xmlString;
    }

    @Override
    public String encodeToJson() {
        String jsonString = "\t\"Square\" : {\n";
        jsonString += "\t\t\"side\" : \"" + getSide() + "\"\n";
        jsonString += "\t}";
        return jsonString;
    }
}
