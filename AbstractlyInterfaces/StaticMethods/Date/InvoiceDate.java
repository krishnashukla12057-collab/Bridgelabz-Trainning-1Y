package com.gla.AbstractlyInterfaces.StaticMethods.Date;

import java.time.LocalDate;

public class InvoiceDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String formattedDate = DateUtil.formatDate(today);

        System.out.println("Formatted Date: " + formattedDate);
    }
}
