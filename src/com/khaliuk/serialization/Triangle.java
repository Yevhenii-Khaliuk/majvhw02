package com.khaliuk.serialization;

public class Triangle implements Shape {
    private final int SIDES_NUMBER = 3;
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

    @Override
    public String encodeToXml() {
        String xmlString = "<Triangle>\n";

        for (int i = 0; i < SIDES_NUMBER; i++) {
            xmlString = sideToXmlEntity(xmlString, i);
        }

        xmlString += "</Triangle>\n";

        return xmlString;
    }

    private String sideToXmlEntity(String xmlString, int index) {
        xmlString += "\t<side" + index + ">";
        xmlString += sides[index];
        xmlString += "</side" + index + ">\n";
        return xmlString;
    }

    @Override
    public String encodeToJson() {
        String jsonString = "\t\"Triangle\" : {\n";
        for (int i = 0; i < SIDES_NUMBER - 1; i++) {
            jsonString = sideToJsonEntity(jsonString, i);
            jsonString += ",\n";
        }
        jsonString = sideToJsonEntity(jsonString, SIDES_NUMBER - 1);
        jsonString += "\n\t}";
        return jsonString;
    }

    private String sideToJsonEntity(String jsonString, int index) {
        jsonString += "\t\t\"side\"" + index + " : ";
        jsonString += "\"" + sides[index] + "\"";
        return jsonString;
    }
}
