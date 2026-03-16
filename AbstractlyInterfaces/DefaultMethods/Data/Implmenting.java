package com.gla.AbstractlyInterfaces.DefaultMethods.Data;

class ReportExporter implements DataExporter {

    public void exportToCSV() {
        System.out.println("Data exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Data exported to PDF");
    }
}
