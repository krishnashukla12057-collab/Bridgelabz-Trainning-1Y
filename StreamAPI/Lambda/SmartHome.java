package com.gla.StreamAPI.Lambda;

import java.util.*;

interface LightAction {
    void activate();
}

public class SmartHome {

    public static void main(String[] args) {

        // Motion detected
        LightAction motion = () -> System.out.println("Lights ON - Motion detected");

        // Night mode
        LightAction night = () -> System.out.println("Dim Lights - Night Mode");

        // Voice command
        LightAction voice = () -> System.out.println("Party Lights Activated");

        motion.activate();
        night.activate();
        voice.activate();
    }
}
