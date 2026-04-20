package com.gla.StreamAPI.Lambda;

import java.util.*;
import java.util.stream.*;

class Invoice {

    int id;

    Invoice(int id) {
        this.id = id;
    }

    public String toString() {
        return "Invoice ID: " + id;
    }
}

public class InvoiceCreation {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

        List<Invoice> invoices =
                transactionIds.stream()
                        .map(Invoice::new)
                        .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
