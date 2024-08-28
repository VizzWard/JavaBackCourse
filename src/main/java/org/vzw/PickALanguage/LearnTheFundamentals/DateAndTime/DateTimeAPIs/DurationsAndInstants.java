package org.vzw.PickALanguage.LearnTheFundamentals.DateAndTime.DateTimeAPIs;

import java.time.*;

public class DurationsAndInstants {

    public static void main(String[] args){

        //Getting the current timestamp
        Instant timestamp = Instant.now();
        System.out.println("Timestamp : " + timestamp);

        //Get the nan seconds from the last second
        int nanoSecondFromLastSecond = timestamp.getNano();
        System.out.println(nanoSecondFromLastSecond);

        //Set the duration to three hours
        Duration threeHours = Duration.ofHours(3);

        //Substract 15 minutes from 3 hours and get the remaining as seconds
        long seconds = threeHours.minusMinutes(15).getSeconds();

        //Convert the remaining of seconds to minutes
        long minutes = Duration.ofSeconds(seconds).toMinutes();

        System.out.println("3 Hours - 15 Minutes = " + seconds + " seconds"); // 3 Hours - 15 Minutes = 9900 seconds
        System.out.println("3 Hours - 15 Minutes = " + minutes + " Minutes"); // 3 Hours - 15 Minutes = 165 Minutes
    }
}