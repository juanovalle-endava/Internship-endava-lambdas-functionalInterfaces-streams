package org.example.functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> p = x -> x.isEmpty();
        System.out.println(p.test("")); // true

        BiPredicate<String, String> b = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b.test("chicken", "chick")); // true
    }

}
