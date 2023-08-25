package org.example.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> f = x -> x.length();
        System.out.println(f.apply("cluck")); // 5

        BiFunction<String, String, String> b = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b.apply("baby ", "chick")); // baby chick
    }
}
