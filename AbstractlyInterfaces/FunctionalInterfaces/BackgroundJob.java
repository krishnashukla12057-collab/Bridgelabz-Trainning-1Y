package com.gla.AbstractlyInterfaces.FunctionalInterfaces;

public class BackgroundJob {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Background job is running...");
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
