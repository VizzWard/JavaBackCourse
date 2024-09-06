package org.vzw.PickALanguage.LearnTheFundamentals.DateAndTime.JavaDateTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeUse {
    public static void main(String[] args) {
        //Instanciar de localdatetime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Fecha actual: " + localDateTime);

        //Crear una instancia con una fecha especifica
        System.out.println("Fecha especifica: " + LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30) );
        System.out.println("Fecha especifica: " + LocalDateTime.parse("2015-02-20T06:30:00") );

        //Sumar dias
        System.out.println("Fecha actual con 12 dias mas: " + localDateTime.plusDays(12));

        //Restar horas
        System.out.println("Fecha actual con 12 horas menos: " + localDateTime.minusHours(12));

        //Obtener el mes
        System.out.println("Mes: " + localDateTime.getMonth() );
    }
}
