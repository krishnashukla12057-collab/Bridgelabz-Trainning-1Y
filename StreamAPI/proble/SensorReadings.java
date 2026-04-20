package com.gla.StreamAPI.proble;

import java.util.*;

public class SensorReadings {

    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(45, 60, 30, 80);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(System.out::println);
    }
}