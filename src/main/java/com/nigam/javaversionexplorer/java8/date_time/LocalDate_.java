package com.nigam.javaversionexplorer.java8.date_time;

import com.nigam.javaversionexplorer.utility.Util;

import java.time.*;
public class LocalDate_ {

    public static void main(String[] args) {

        LocalDate localDate = Util.localDateSupplier.get();
        System.out.println("---------------LocalDate-----------------");
        System.out.println("Current Local Date : " +localDate);
        System.out.println("Day of Month : " +localDate.getDayOfMonth());
        System.out.println("Month : " +localDate.getMonthValue());
        System.out.println("Month In text : " +localDate.getMonth());
        System.out.println("Year : " +localDate.getYear());
        System.out.println("DayOfWeek : " +localDate.getDayOfWeek());
        System.out.println("Is Leap year : " +localDate.isLeapYear());
        System.out.println("Number Of Days In Month: " +localDate.lengthOfMonth());
        System.out.println("Number Of Days In Year: " +localDate.lengthOfYear());
        System.out.println("Now : " +localDate.now());
        System.out.println("A new Date : " + java.time.LocalDate.of(2024, 11, 10));
        System.out.println("A new Date From String : " + java.time.LocalDate.parse("2024-11-18"));

    }
}
