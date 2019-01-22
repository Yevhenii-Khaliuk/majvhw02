package com.khaliuk.immutable;

import java.util.ArrayList;

public class ImmutableClass {
    private final int id;
    private final String description;
    private final ArrayList<String> words;

    public ImmutableClass(int id, String description, ArrayList<String> words) {
        this.id = id;
        this.description = description;
        this.words = new ArrayList<>(words);
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getWords() {
        return new ArrayList<>(words);
    }
}
