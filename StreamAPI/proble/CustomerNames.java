package com.gla.StreamAPI.proble;

import java.util.*;

public class CustomerNames {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "aman", "rohit");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}