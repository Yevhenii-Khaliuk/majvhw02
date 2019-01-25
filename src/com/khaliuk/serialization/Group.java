package com.khaliuk.serialization;

import java.util.ArrayList;
import java.util.List;

public class Group implements Shape {
    private List<Shape> shapes;

    public Group(List<Shape> shapes) {
        this.shapes = new ArrayList<>(shapes);
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void print() {
        System.out.println("Group with elements:");
        for (Shape shape : shapes) {
            System.out.print("\t");
            shape.print();
            System.out.println();
        }
    }

    @Override
    public String encodeToXML() {
        StringBuilder xmlString = new StringBuilder();
        xmlString.append("<Group>\n\t<shapes>\n");
        for (Shape shape : shapes) {
            String[] shapeXml = shape.encodeToXML().split("\n");
            processXmlLines(shapeXml, xmlString);
        }
        xmlString.append("\t</shapes>\n</Group>\n");
        return xmlString.toString();
    }

    private void processXmlLines(String[] lines, StringBuilder sb) {
        for (String line : lines) {
            sb.append("\t\t").append(line).append("\n");
        }
    }

    @Override
    public String encodeToJSON() {
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("\t\"Group\" : {\n");
        for (Shape shape : shapes) {
            String[] shapeJson = shape.encodeToJSON().split("\n");
            processJsonLines(shapeJson, jsonString);
            jsonString.setCharAt(jsonString.length() - 1, ',');
            jsonString.append("\n");
        }
        jsonString.deleteCharAt(jsonString.length() - 2); // Removing last comma
        jsonString.append("\t}");
        return jsonString.toString();
    }

    private void processJsonLines(String[] lines, StringBuilder sb) {
        for (String line : lines) {
            sb.append("\t").append(line).append("\n");
        }
    }
}
