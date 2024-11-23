package com.nigam.javaversionexplorer.java8.date_time;

import com.nigam.javaversionexplorer.utility.Util;

import java.time.OffsetDateTime;

public class OffSetDateTime_ {
    public static void main(String[] args) {

        OffsetDateTime offsetDateTime = Util.offsetDateTimeSupplier.get();
        System.out.println("Current Offset Date Time : " + offsetDateTime);

        // Accessor methods
        System.out.println("Year : " + offsetDateTime.getYear());
        System.out.println("Month : " + offsetDateTime.getMonth()); // Returns Month enum
        System.out.println("Month Value : " + offsetDateTime.getMonthValue()); // Returns int (1-12)
        System.out.println("Day of Month : " + offsetDateTime.getDayOfMonth());
        System.out.println("Day of Year : " + offsetDateTime.getDayOfYear());
        System.out.println("Day of Week : " + offsetDateTime.getDayOfWeek()); // Returns DayOfWeek enum
        System.out.println("Hour : " + offsetDateTime.getHour());
        System.out.println("Minute : " + offsetDateTime.getMinute());
        System.out.println("Second : " + offsetDateTime.getSecond());
        System.out.println("Nano-of-Second : " + offsetDateTime.getNano());
        System.out.println("Offset : " + offsetDateTime.getOffset()); // Returns ZoneOffset

    }
}
