package com.gla.AbstractlyInterfaces.MarkerInterfaces.Clone;

public class CloneTest {
    public static void main(String[] args) {

        try {
            Product p1 = new Product(101, "Laptop");
            Product p2 = (Product) p1.clone();

            System.out.println("Original: " + p1.name);
            System.out.println("Cloned: " + p2.name);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}
