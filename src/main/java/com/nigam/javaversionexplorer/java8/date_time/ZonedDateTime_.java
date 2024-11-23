package com.nigam.javaversionexplorer.java8.date_time;

import com.nigam.javaversionexplorer.utility.Util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_ {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = Util.zonedDateTimeSupplier.get();

        System.out.println("---------------ZonedDateTime-----------------");
        System.out.println("Currenyt Zoned Date Time : " +ZonedDateTime.now());
        System.out.println("Currenyt Zoned Date Time : " +ZonedDateTime.now(ZoneId.of("America/New_York")));
        System.out.println(ZonedDateTime.of(2023, 12, 25, 10, 30, 0, 0, ZoneId.of("Asia/Kolkata")));
        System.out.println(ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Paris")));
        System.out.println("Year : " + zonedDateTime.getYear());
        System.out.println("Month : " + zonedDateTime.getMonth()); // Returns Month enum
        System.out.println("Month Value : " + zonedDateTime.getMonthValue()); // Returns int (1-12)
        System.out.println("Day of Month : " + zonedDateTime.getDayOfMonth());
        System.out.println("Day of Year : " + zonedDateTime.getDayOfYear());
        System.out.println("Day of Week : " + zonedDateTime.getDayOfWeek()); // Returns DayOfWeek enum
        System.out.println("Hour : " + zonedDateTime.getHour());
        System.out.println("Minute : " + zonedDateTime.getMinute());
        System.out.println("Second : " + zonedDateTime.getSecond());
        System.out.println("Nano-of-Second : " + zonedDateTime.getNano());
        System.out.println("Zone : " + zonedDateTime.getZone()); // Returns ZoneId
        System.out.println("Zone Offset : " + zonedDateTime.getOffset()); // Returns ZoneOffset
        System.out.println("Chronology : " + zonedDateTime.getChronology()); // Calendar system

    }
}
