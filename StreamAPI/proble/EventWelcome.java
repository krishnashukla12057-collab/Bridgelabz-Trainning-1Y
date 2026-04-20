package com.gla.StreamAPI.proble;

import java.util.*;

public class EventWelcome {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Rahul", "Aman", "Rohit");

        attendees.forEach(a ->
                System.out.println("Welcome " + a + "!"));
    }
}
