package org.example.functionalinterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = x -> System.out.println(x);
        c.accept("Annie"); // Annie

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b = (k, v) -> map.put(k, v);
        b.accept("chicken", 7);
        b.accept("chick", 1);
        System.out.println(map);
    }
}
