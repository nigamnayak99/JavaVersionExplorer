package com.nigam.javaversionexplorer.java8.date_time;

import com.nigam.javaversionexplorer.utility.Util;

import java.time.LocalTime;

public class LocalTime_ {
    public static void main(String[] args) {

        LocalTime localTime = Util.localTimeSupplier.get();
        System.out.println("---------------LocalTime-----------------");
        System.out.println("Current Local Date : " +localTime);
        System.out.println("hour : " +localTime.getHour());
        System.out.println("munite : " +localTime.getMinute());
        System.out.println("second : " +localTime.getSecond());
        System.out.println("nano-second : " +localTime.getNano());
        System.out.println("Now : " +localTime.now());
        System.out.println("A new DateTime by of: " + LocalTime.of(10,5));
        System.out.println("parsed local time from text : " +LocalTime.parse("10:15:20"));

    }
}
