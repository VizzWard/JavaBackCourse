# Introduction to the Java Date/Time API

## Visión general

Java 8 introdujo nuevas API para Fecha y Hora con el fin de solventar las deficiencias de las antiguas java.util.Date y java.util.Calendar.

##  Problemas con las actuales API de fecha y hora

- Seguridad de subprocesos: las clases Date y Calendar no son seguras para subprocesos, lo que obliga a los desarrolladores a lidiar con problemas de concurrencia difíciles de depurar y a escribir código adicional para gestionar la seguridad de los subprocesos. Por el contrario, las nuevas API de fecha y hora introducidas en Java 8 son inmutables y seguras para los subprocesos, por lo que los desarrolladores no tienen que preocuparse por la concurrencia.
- Diseño de la API y facilidad de comprensión - Las API de fecha y calendario están mal diseñadas y presentan métodos inadecuados para realizar operaciones cotidianas. La nueva API Fecha/Hora está centrada en ISO y sigue modelos de dominio coherentes para fecha, hora, duración y periodos. Existe una amplia variedad de métodos de utilidad que soportan las operaciones más comunes.
- ZonedDate y Time - Los desarrolladores tenían que escribir lógica adicional para manejar la lógica de la zona horaria con las antiguas APIs, mientras que con las nuevas APIs, el manejo de la zona horaria se puede hacer con las APIs Local y ZonedDate/Time.

## Uso de LocalDate, LocalTime y LocalDateTime

Las clases más utilizadas son LocalDate, LocalTime y LocalDateTime. Como sus nombres indican, representan la fecha/hora local desde el contexto del observador.

Principalmente utilizamos estas clases cuando no es necesario especificar explícitamente las zonas horarias en el contexto. Como parte de esta sección, cubriremos las API más utilizadas.

### Trabajar con LocalDate

LocalDate representa una fecha en formato ISO (aaaa-MM-dd) sin hora. Podemos utilizarla para almacenar fechas como cumpleaños y días de pago.

Se puede crear una instancia de fecha actual a partir del reloj del sistema:

```java
LocalDate localDate = LocalDate.now();
```

Y podemos obtener el LocalDate que representa un día, mes y año específico utilizando el método of o el método parse.

Por ejemplo, estos fragmentos de código representan la LocalDate del 20 de febrero de 2015:

```java
LocalDate.of(2015, 02, 20);

LocalDate.parse("2015-02-20");
```

LocalDate proporciona varios métodos de utilidad para obtener información variada. Echemos un vistazo rápido a algunos de estos métodos de la API.

El siguiente fragmento de código obtiene la fecha local actual y le añade un día:

```java
LocalDate tomorrow = LocalDate.now().plusDays(1);
```

Este ejemplo obtiene la fecha actual y le resta un mes. Observe cómo acepta un enum como unidad de tiempo:

```java
LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
```

En los dos ejemplos de código siguientes, analizamos la fecha "2016-06-12" y obtenemos el día de la semana y el día del mes, respectivamente. Observe los valores devueltos: el primero es un objeto que representa el DayOfWeek, mientras que el segundo es un int que representa el valor ordinal del mes:

```java
DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();

int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
```

Podemos comprobar si una fecha se produce en un año bisiesto, por ejemplo la fecha actual:

```java
boolean leapYear = LocalDate.now().isLeapYear();
```

Además, se puede determinar la relación de una fecha con otra para que ocurra antes o después de otra fecha:

```java
boolean notBefore = LocalDate.parse("2016-06-12")
  .isBefore(LocalDate.parse("2016-06-11"));

boolean isAfter = LocalDate.parse("2016-06-12")
  .isAfter(LocalDate.parse("2016-06-11"));
```

Por último, los límites de fecha pueden obtenerse a partir de una fecha determinada.

En los dos ejemplos siguientes, obtenemos la LocalDateTime que representa el principio del día (2016-06-12T00:00) de la fecha dada y la LocalDate que representa el principio del mes (2016-06-01) respectivamente:

```java
LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
  .with(TemporalAdjusters.firstDayOfMonth());
```

### Trabajar con LocalTime

LocalTime representa la hora sin fecha.

De forma similar a LocalDate, podemos crear una instancia de LocalTime a partir del reloj del sistema o utilizando los métodos parse y of.

A continuación echaremos un rápido vistazo a algunas de las API más utilizadas.

Se puede crear una instancia de LocalTime actual a partir del reloj del sistema:

```java
LocalTime now = LocalTime.now();
```

Podemos crear una LocalTime que represente las 6:30 a.m. analizando una representación de cadena:

```java
LocalTime sixThirty = LocalTime.parse("06:30");
```

El método de fábrica de también se puede utilizar para crear un LocalTime. Este código crea LocalTime representando 6:30 a.m. usando el método factory:

```java
LocalTime sixThirty = LocalTime.of(6, 30);
```

Creemos una HoraLocal analizando una cadena y añadiéndole una hora mediante la API "más". El resultado sería LocalTime representando las 7:30 a.m.:

```java
LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
```

Existen varios métodos getter que se pueden utilizar para obtener unidades de tiempo específicas como hora, min y seg:

```java
int six = LocalTime.parse("06:30").getHour();
```

También podemos comprobar si una hora concreta es anterior o posterior a otra hora concreta. Este ejemplo de código compara dos LocalTime para los que el resultado sería verdadero:

```java
boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
```

Por último, la hora máxima, mínima y del mediodía de un día pueden obtenerse mediante constantes en la clase LocalTime. Esto es muy útil cuando se realizan consultas a bases de datos para encontrar registros dentro de un intervalo de tiempo determinado.

Por ejemplo, el código siguiente representa 23:59:59.99:

```java
LocalTime maxTime = LocalTime.MAX;
```

### Trabajar con LocalDateTime

LocalDateTime se utiliza para representar una combinación de fecha y hora. Es la clase más utilizada cuando necesitamos una combinación de fecha y hora.

La clase ofrece diversas API. Aquí veremos algunas de las más utilizadas.

Una instancia de LocalDateTime puede obtenerse del reloj del sistema de forma similar a LocalDate y LocalTime:

```java
LocalDateTime.now();
```

Los siguientes ejemplos de código explican cómo crear una instancia utilizando los métodos de fábrica "of" y "parse". El resultado sería una instancia de LocalDateTime que representaría el 20 de febrero de 2015, 6:30 a.m.:

```java
LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
```

```java
LocalDateTime.parse("2015-02-20T06:30:00");
```

Existen APIs para sumar y restar unidades de tiempo específicas como días, meses, años y minutos.

El siguiente código muestra los métodos "más" y "menos". Estas API se comportan exactamente igual que sus homólogas en LocalDate y LocalTime:

```java
localDateTime.plusDays(1);
```

```java
localDateTime.minusHours(2);
```

Los métodos Getter también están disponibles para extraer unidades específicas similares a las clases de fecha y hora. Dada la instancia anterior de LocalDateTime, este ejemplo de código devolverá el mes de febrero:

```java
localDateTime.getMonth();
```

##  Uso de la API ZonedDateTime

Java 8 proporciona ZonedDateTime cuando necesitamos tratar con fecha y hora específicas de una zona horaria. El ZoneId es un identificador utilizado para representar diferentes zonas. Hay unas 40 zonas horarias diferentes, y el ZoneId las representa de la siguiente manera.

Aquí creamos una Zona para París:

```java
ZoneId zoneId = ZoneId.of("Europe/Paris");
```

Y podemos obtener un conjunto de todos los identificadores de zona:

```java
Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
```

La LocalDateTime se puede convertir a una zona específica:

```java
ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
```

ZonedDateTime proporciona el método parse para obtener la fecha-hora específica de la zona horaria:

```java
ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
```

Otra forma de trabajar con la zona horaria es utilizando OffsetDateTime. OffsetDateTime es una representación inmutable de una fecha-hora con un desfase. Esta clase almacena todos los campos de fecha y hora, con una precisión de nanosegundos, así como el desplazamiento respecto a UTC/Greenwich.

La instancia OffSetDateTime puede crearse utilizando ZoneOffset. Aquí, creamos una LocalDateTime que representa las 6:30 a.m. del 20 de febrero de 2015:

```java
LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
```

A continuación, añadimos dos horas a la hora mediante la creación de un ZoneOffset y la configuración de la instancia localDateTime:

```java
ZoneOffset offset = ZoneOffset.of("+02:00");

OffsetDateTime offSetByTwo = OffsetDateTime
  .of(localDateTime, offset);
```

Ahora tenemos un localDateTime de 2015-02-20 06:30 +02:00.

## Uso del periodo y la duración

La clase Período representa una cantidad de tiempo en términos de años, meses y días, y la clase Duración representa una cantidad de tiempo en términos de segundos y nanosegundos.

### Trabajar con Period

La clase Período se utiliza ampliamente para modificar valores de una fecha dada o para obtener la diferencia entre dos fechas:

```java
LocalDate initialDate = LocalDate.parse("2007-05-10");
```

Podemos manipular la Fecha utilizando el Periodo:

```java
LocalDate finalDate = initialDate.plus(Period.ofDays(5));
```

La clase Period tiene varios métodos getter como getYears, getMonths y getDays para obtener valores de un objeto Period.

Por ejemplo, esto devuelve un valor int de 5 ya que intentamos obtener la diferencia en términos de días:

```java
int five = Period.between(initialDate, finalDate).getDays();
```

Podemos obtener el Periodo entre dos fechas en una unidad específica como días o meses o años, utilizando ChronoUnit.between:

```java
long five = ChronoUnit.DAYS.between(initialDate, finalDate);
```

Este ejemplo de código devuelve cinco días.

### Trabajar con la duración

