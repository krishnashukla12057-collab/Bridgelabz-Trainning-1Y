package com.gla.StreamAPI.Lambda;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " Price:" + price + " Rating:" + rating + " Discount:" + discount;
    }
}

public class EcommerceSort {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 50000, 4.5, 10));
        products.add(new Product("Mobile", 20000, 4.8, 20));
        products.add(new Product("Tablet", 30000, 4.2, 15));

        // Sort by Price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sort by Price");
        products.forEach(System.out::println);

        // Sort by Rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSort by Rating");
        products.forEach(System.out::println);

        // Sort by Discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSort by Discount");
        products.forEach(System.out::println);
    }
}
