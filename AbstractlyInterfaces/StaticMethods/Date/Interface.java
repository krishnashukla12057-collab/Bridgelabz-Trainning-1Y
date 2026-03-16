package com.gla.AbstractlyInterfaces.StaticMethods.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtil {

    static String formatDate(LocalDate date) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}
