package com.nigam.javaversionexplorer.java8.date_time;

import com.nigam.javaversionexplorer.utility.Util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Instant_ {
    public static void main(String[] args) {
        Instant currentInstant = Util.currentInstantSupplier.get();
        System.out.println("Current Instant Supplier : " +currentInstant);
        System.out.println("Local Date Time : " + LocalDateTime.ofInstant(currentInstant, ZoneId.of("Europe/London")));
        System.out.println("Local Time : " + LocalTime.ofInstant(currentInstant, ZoneId.of("Asia/Kolkata")));
    }
}
