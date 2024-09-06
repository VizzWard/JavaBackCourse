package org.vzw.PickALanguage.LearnTheFundamentals.DateAndTime.JavaDateTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeUse {
    public static void main(String[] args) {
        //Instancia del tiempo actual
        LocalTime now = LocalTime.now();
        System.out.println("Hora actual: " + now);

        // Crear un formateador sin milésimas de segundo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Formatear la hora actual
        String formattedTime = now.format(formatter);

        //Crear una hora especifica
        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println("Hora especifica: " + sixThirty);

        //Otra forma de crear una hora especifica
        LocalTime elevenThirty = LocalTime.of(11, 30);
        System.out.println("Hora especifica: " + elevenThirty);

        //Añadir una hora al tiempo
        LocalTime plusHour = LocalTime.parse(formattedTime).plus(1, ChronoUnit.HOURS);
        System.out.println("Hora especifica: " + plusHour);

        //Obtener solo HH
        int six = LocalTime.parse("06:30").getHour();
        System.out.println("Hora: " + six);

        //Saber si una hora es antes que otra
        boolean isbefore = LocalTime.parse(formattedTime).isBefore(LocalTime.parse("07:30"));
        System.out.println("La hora actual es antes que las 7:30 am? " + isbefore);

        //Hora maxima
        LocalTime maxTime = LocalTime.MAX;
        System.out.println("Hora maxima: " + maxTime);
    }
}
