package com.gla.StreamAPI.proble;

import java.util.*;

public class EmailNotification {

    public static void main(String[] args) {

        List<String> emails =
                Arrays.asList("a@gmail.com", "b@gmail.com");

        emails.forEach(email -> sendEmailNotification(email));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Email sent to: " + email);
    }
}
