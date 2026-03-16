package com.gla.AbstractlyInterfaces.MarkerInterfaces.Data;

public class BackupTest {
    public static void main(String[] args) {

        UserData user = new UserData("Rahul");
        String text = "Sample Data";

        BackupProcessor.processBackup(user);
        BackupProcessor.processBackup(text);
    }
}
