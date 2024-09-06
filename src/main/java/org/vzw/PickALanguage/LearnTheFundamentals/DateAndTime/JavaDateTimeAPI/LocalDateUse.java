package org.vzw.PickALanguage.LearnTheFundamentals.DateAndTime.JavaDateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateUse {
    public static void main(String[] args) {

        //Obtener la fecha actual
        LocalDate localDate = LocalDate.now();
        String date = localDate.toString();
        System.out.println("Fecha actual: " + localDate);

        //Fecha especifica
        System.out.println( LocalDate.of(2024, 8, 01));
        System.out.println( LocalDate.parse("2023-10-22") );

        //Obtener el dia siguiente al actual
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Mañana sera: " + tomorrow);

        //Obtener el mes pasado
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Hace un mes fue: " + previousMonthSameDay);

        //Obtener el dia de la semana de una fecha
        DayOfWeek day = LocalDate.parse(date).getDayOfWeek();
        System.out.println("Hoy es " + day);

        //Obtener que dia del mes es una fecha
        int days = LocalDate.parse(date).getDayOfMonth();
        System.out.println("Estamos a " + days);

        //Obtener si un año es biciesto
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("El año es biciesto? " + leapYear);

        //Saber si una fecha es antes o despues
        boolean notBefore = LocalDate.parse(date).isBefore(LocalDate.parse("2024-08-24"));
        System.out.println("La fecha es despues? " + notBefore);

        boolean isAfter = LocalDate.parse(date).isAfter(LocalDate.parse("2024-08-24"));
        System.out.println("La fecha ya paso? " + isAfter);

        //Obtener el inicio del dia
        LocalDateTime beginningOfDay = LocalDate.parse(date).atStartOfDay();
        System.out.println(beginningOfDay);

        //Obtener el primer dia del mes
        LocalDate firstDayOfMonth = LocalDate.parse(date).with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);
    }
}
