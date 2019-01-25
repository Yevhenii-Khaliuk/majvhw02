package com.khaliuk.serialization;

public interface Shape {
    void print();

    String encodeToXML();

    String encodeToJSON();
}
