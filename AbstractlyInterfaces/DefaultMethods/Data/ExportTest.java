package com.gla.AbstractlyInterfaces.DefaultMethods.Data;

public class ExportTest {
    public static void main(String[] args) {

        ReportExporter report = new ReportExporter();

        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}