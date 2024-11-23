package com.nigam.javaversionexplorer.java8.date_time;

import java.time.ZoneId;

public class ZoneId_ {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/New_York");

        System.out.println("Current Zone ID : " + zoneId);

        // Accessor and utility methods
        System.out.println("Zone ID as String : " + zoneId.getId());
        System.out.println("Available Zone IDs : " + ZoneId.getAvailableZoneIds());
        System.out.println("Normalized Zone ID : " + zoneId.normalized());
        System.out.println("System Default Zone ID : " + ZoneId.systemDefault());
    }
}
