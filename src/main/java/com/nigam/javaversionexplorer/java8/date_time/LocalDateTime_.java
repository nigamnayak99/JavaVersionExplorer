package com.nigam.javaversionexplorer.java8.date_time;

import com.nigam.javaversionexplorer.utility.Util;

import java.time.LocalDateTime;
import java.time.Year;

public class LocalDateTime_ {
    public static void main(String[] args) {

        LocalDateTime localDateTime = Util.localDateTimeSupplier.get();
        System.out.println("---------------localDateTime-----------------");
        System.out.println("Current Local Date : " +localDateTime);
        System.out.println("Day of Month : " +localDateTime.getDayOfMonth());
        System.out.println("Month : " +localDateTime.getMonthValue());
        System.out.println("Month In text : " +localDateTime.getMonth());
        System.out.println("Year : " +localDateTime.getYear());
        System.out.println("DayOfWeek : " +localDateTime.getDayOfWeek());
        System.out.println("Is Leap year : " + Year.isLeap(localDateTime.getYear()));
        System.out.println(LocalDateTime.of(2024, 11, 23, 07, 30, 30));
    }
}
