package com.khaliuk.serialization;

public class ShapeToXml {
    public static String encode(Shape shape) {
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        if (shape instanceof Triangle) {
            xmlString += shape.encodeToXml();
        }
        return xmlString;
    }
}
