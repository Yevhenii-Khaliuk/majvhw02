package com.khaliuk.serialization;

public class ShapeToJSON {
    public static String encode(Shape shape) {
        String jsonString = "{";
        jsonString += shape.encodeToJSON();
        jsonString += "\n}";
        return jsonString;
    }
}
