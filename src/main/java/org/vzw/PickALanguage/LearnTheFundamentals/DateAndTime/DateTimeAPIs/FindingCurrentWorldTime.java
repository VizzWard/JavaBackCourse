package org.vzw.PickALanguage.LearnTheFundamentals.DateAndTime.DateTimeAPIs;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FindingCurrentWorldTime {

    public static void main(String[] args){

        ZoneId myTimeZone = ZoneId.systemDefault();
        ZoneId surich = ZoneId.of("Europe/Zurich");
        ZoneId madrid = ZoneId.of("GMT+9");
        ZoneId taipei = ZoneId.of("UTC+8");

        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentDateTimeInMyZone = ZonedDateTime.of(currentDateTime, myTimeZone);

        ZonedDateTime currentTimeInZurich = currentDateTimeInMyZone.withZoneSameInstant(surich);
        ZonedDateTime currentTimeInseoul  = currentDateTimeInMyZone.withZoneSameInstant(madrid);
        ZonedDateTime currentTimeInSeattle = currentDateTimeInMyZone.withZoneSameInstant(taipei);

        System.out.println("Your Currrent Date Time        : " + currentDateTimeInMyZone);
        System.out.println("Current Date & Time in Zurich  : " + currentTimeInZurich);
        System.out.println("Current Date & Time in Madrid   : " + currentTimeInseoul);
        System.out.println("Current Date & Time in Taipei : " + currentTimeInSeattle);
    }
}