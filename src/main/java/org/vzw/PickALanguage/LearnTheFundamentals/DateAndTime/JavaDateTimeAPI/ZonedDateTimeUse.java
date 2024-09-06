package org.vzw.PickALanguage.LearnTheFundamentals.DateAndTime.JavaDateTimeAPI;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeUse {
    public static void main(String[] args) {
        //Instanciar de localdatetime
        LocalDateTime localDateTime = LocalDateTime.now();

        // creamos una Zona
        ZoneId zoneId = ZoneId.of("Europe/Paris");

        //obtener un conjunto de todos los identificadores de zona
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        //convertir a una zona específica
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);

        //obtener la fecha-hora específica de la zona horaria
        ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
        System.out.println(zonedDateTime);

        //creamos una LocalDateTime que representa las 6:30 a.m. del 20 de febrero de 2015.
        LocalDateTime localDateTime2 = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        System.out.println(localDateTime2);

        //añadimos dos horas a la hora mediante la creación de un ZoneOffset
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offSetByTwo);
    }
}
