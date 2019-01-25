package com.khaliuk.serialization;

import java.util.List;

public class ShapeToXml {
    public static String encode(Shape shape) {
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        xmlString += encodeShape(shape);
        return xmlString;
    }

    private static String encodeShape(Shape shape) {
        String xmlString = "";
        if (shape instanceof Triangle) {
            xmlString += encodeTriangle((Triangle) shape);
        } else if (shape instanceof Square) {
            xmlString += encodeSquare((Square) shape);
        } else if (shape instanceof Circle) {
            xmlString += encodeCircle((Circle) shape);
        } else if (shape instanceof Group) {
            xmlString += encodeGroup((Group) shape);
        }
        return xmlString;
    }

    private static String encodeTriangle(Triangle triangle) {
        String xmlString = "<Triangle>\n";
        double[] triangleSides = triangle.getSides();
        for (int index = 0; index < 3; index++) {
            xmlString += "\t<side" + index + ">";
            xmlString += triangleSides[index];
            xmlString += "</side" + index + ">\n";
        }
        xmlString += "</Triangle>\n";
        return xmlString;
    }

    private static String encodeSquare(Square square) {
        String xmlString = "<Square>\n";
        xmlString += "\t<side>" + square.getSide() + "</side>\n";
        xmlString += "</Square>\n";
        return xmlString;
    }

    private static String encodeCircle(Circle circle) {
        String xmlString = "<Circle>\n";
        xmlString += "\t<radius>" + circle.getRadius() + "</radius>\n";
        xmlString += "</Circle>\n";
        return xmlString;
    }

    private static String encodeGroup(Group group) {
        StringBuilder xmlString = new StringBuilder();
        xmlString.append("<Group>\n\t<shapes>\n");
        List<Shape> shapes = group.getShapes();
        for (Shape shape : shapes) {
            String[] lines = encodeShape(shape).split("\n");
            for (String line : lines) {
                xmlString.append("\t\t").append(line).append("\n");
            }
        }
        xmlString.append("\t</shapes>\n</Group>\n");
        return xmlString.toString();
    }
}
