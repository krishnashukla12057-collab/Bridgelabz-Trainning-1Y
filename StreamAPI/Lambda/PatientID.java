package com.gla.StreamAPI.Lambda;

import java.util.*;

public class PatientID {

    public static void main(String[] args) {

        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104);

        patientIds.forEach(System.out::println);
    }
}
