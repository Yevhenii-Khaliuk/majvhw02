package com.khaliuk.serialization;

public class ShapeToXml {
    public static String encode(Shape shape) {
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        xmlString += shape.encodeToXml();
        return xmlString;
    }
}
