package com.gla.AbstractlyInterfaces.MarkerInterfaces.Data;

class BackupProcessor {

    public static void processBackup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object...");
        } else {
            System.out.println("Object not marked for backup.");
        }
    }
}
