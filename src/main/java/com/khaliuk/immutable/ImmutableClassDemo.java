package com.khaliuk.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClassDemo {
    public static void main(String[] args) {
        int id = 5;
        String description = "Immutable class description";
        List<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");

        ImmutableClass immutableClassExample = new ImmutableClass(id, description, words);

        System.out.println("Local variables:");
        System.out.println("id = " + id);
        System.out.println("description = " + description);
        System.out.println("words = " + words);
        System.out.println("Immutable class fields:");
        System.out.println("id = " + immutableClassExample.getId());
        System.out.println("description = " + immutableClassExample.getDescription());
        System.out.println("words = " + immutableClassExample.getWords());

        id = 25;
        description = "I was changed";
        words.add("four");

        System.out.println("After local variables changing:");
        System.out.println("id = " + id);
        System.out.println("description = " + description);
        System.out.println("words = " + words);
        System.out.println("Immutable class fields:");
        System.out.println("id = " + immutableClassExample.getId());
        System.out.println("description = " + immutableClassExample.getDescription());
        System.out.println("words = " + immutableClassExample.getWords());
    }
}
