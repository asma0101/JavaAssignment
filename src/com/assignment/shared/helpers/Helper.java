package com.assignment.shared.helpers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Helper {
    public static int getMonthDays() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.lengthOfMonth();
    }

}
