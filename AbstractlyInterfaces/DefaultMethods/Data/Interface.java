package com.gla.AbstractlyInterfaces.DefaultMethods.Data;

interface DataExporter {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON format...");
    }
}