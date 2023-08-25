package org.example.functionalinterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<LocalDate> s = () -> LocalDate.now();
        LocalDate d1 = s.get();

        System.out.println(d1);  // 2022-02-20
    }
}
