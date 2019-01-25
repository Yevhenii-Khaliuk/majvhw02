package com.khaliuk.serialization;

public interface Shape {
    void print();

    String encodeToXml();

    String encodeToJson();
}
