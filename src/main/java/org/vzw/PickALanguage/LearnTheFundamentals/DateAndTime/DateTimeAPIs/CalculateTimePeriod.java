package org.vzw.PickALanguage.LearnTheFundamentals.DateAndTime.DateTimeAPIs;

import java.time.*;

public class CalculateTimePeriod{
    public static void main(String[] args){
        //Get the current date
        LocalDate today = LocalDate.now();

        //Christmas Date of 2021
        LocalDate christmasDayofThisYear = LocalDate.of(today.getYear(), Month.DECEMBER, 25);

        //Calculate period left from current date to christmas
        Period howLongForChirstmas = Period.between(today, christmasDayofThisYear);

        //Extracting the elements years, months and Dates
        int years = howLongForChirstmas.getYears();
        int months = howLongForChirstmas.getMonths();
        int days = howLongForChirstmas.getDays();

        System.out.println("Years  : " + years);
        System.out.println("Months : " + months);
        System.out.println("Days   : " + days);
    }
}