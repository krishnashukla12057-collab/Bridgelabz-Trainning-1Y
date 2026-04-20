package com.gla.StreamAPI.proble;

import java.time.*;
import java.util.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }

    public String toString() {
        return name + " Expiry: " + expiry;
    }
}

public class GymMembership {

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Rahul", LocalDate.now().plusDays(10)),
                new Member("Aman", LocalDate.now().plusDays(40)),
                new Member("Rohit", LocalDate.now().plusDays(20))
        );

        members.stream()
                .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
                .forEach(System.out::println);
    }
}
