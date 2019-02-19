package com.khaliuk.immutable;

import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
    private final int id;
    private final String description;
    private final List<String> words;

    public ImmutableClass(int id, String description, List<String> words) {
        this.id = id;
        this.description = description;
        this.words = words;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getWords() {
        return Collections.unmodifiableList(words);
    }
}
