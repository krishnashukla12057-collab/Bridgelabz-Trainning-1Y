package com.gla.StreamAPI.Lambda;

import java.util.*;
import java.util.stream.*;

public class EmployeeNames {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "aman", "rohit");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
