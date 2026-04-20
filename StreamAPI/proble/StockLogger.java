package com.gla.StreamAPI.proble;

import java.util.*;

public class StockLogger {

    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(120.5, 130.2, 128.9);

        prices.forEach(p -> System.out.println("Stock Price: " + p));
    }
}
