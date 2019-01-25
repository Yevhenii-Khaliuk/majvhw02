package com.khaliuk.serialization;

public class ShapeToJson {
    public static String encode(Shape shape) {
        String jsonString = "{";
        jsonString += shape.encodeToJson();
        jsonString += "\n}";
        return jsonString;
    }
}
