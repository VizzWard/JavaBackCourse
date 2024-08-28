# Date and Time APIs in Java

Cuando se trata de software es importante no perder de vista la fecha y la hora correctas, en ámbitos como la tecnología financiera y la medicina este es un elemento crítico. Al desarrollar aplicaciones, los desarrolladores siempre tienden a centrarse en el problema empresarial sin reinventar la rueda.

En Java para lidiar con estos problemas de Fecha y Hora a la preciosa, tiene pocas librerías pre-construidas que podemos usar antes de Java 8, esas son:

- `java.util.Date`
- `java.util.Calendar`
- `java.text.SimpleDateFormat`
- `java.util.TimeZone`

Esas dos API heredadas venían con pocos problemas.

1. La clase Date debe representar una fecha pero también representa los minutos horas y segundos. como ejemplo

```java
Date now = new Date();
```

***Salida:***

```text
Tue May 04 08:17:05 UTC 2021
```

- Y si se mira de cerca la fecha no tiene una zona horaria asociada que recoge la zona horaria por defecto del servidor / PC que se está ejecutando. Esto sería un problema si los usuarios residen en otro lugar geográfico pero el servidor está alojado en otra zona horaria.

2. Las clases han utilizado un enfoque basado en el índice cero para representar los meses, lo que puede dar lugar a confusiones en algunas ocasiones.

```java
Calendar calendar = Calendar.getInstance();
System.out.println(calendar.JANUARY);
```

***Salida:***

```text
0
```

3. Y otra clase que se utiliza en el tratamiento de la fecha tiene una zona horaria ya que esto se utiliza en JDBC y obtener datos de la base de datos y convertir a formato Java Fecha causando problemas.

Para hacer frente a esos problemas y solucionarlos de Java 8, llegó con el nuevo conjunto de API para Fecha y Hora esos son:

| | Descripcion |
|---|---|
| `java.time.LocalDate` | Representa sólo la hora según el calendario ISO.|
| `java.time.LocalTime` | Representa únicamente la hora de forma legible para el ser humano.|
| `java.time.LocalDateTime` | Aquí se manejarán tanto la Fecha como la Hora sin tener una zona horaria. Esta es una combinación de LocalDate y LocalTime.|
| `java.time.ZonedDateTime` | LocalDateTime se combina con la zona horaria proporcionada mediante la clase ZoneId.|
| `java.time.OffsetTime` | Maneja la hora con el correspondiente desfase de Greenwich/UTC, sin ID de zona horaria.|
| `java.time.OffsetDateTime` | Maneja una fecha y hora con el correspondiente desfase de Greenwich/UTC, sin ID de zona horaria.|
| `java.time.Clock` | Proporciona acceso al instante, fecha y hora actuales en cualquier zona horaria.|
| `java.time.Instant` | representa el inicio de un nanosegundo en la línea de tiempo y es útil para generar una marca de tiempo para representar el tiempo de máquina. |
| `java.time.Duration` | Diferencia entre dos instantes y se mide en segundos o nanosegundos y no utiliza construcciones basadas en fechas como años, meses y días, aunque la clase proporciona métodos que convierten a días, horas y minutos. |
| `java.time.Period` | Para definir la diferencia entre fechas en valores basados en fechas (años, meses, días).|
| `java.time.ZoneId` | especifica un identificador de zona horaria y proporciona reglas para la conversión entre Instant y LocalDateTime.|
| `java.time.ZoneOffset` |  Especifica un desfase horario con respecto a Greenwich/UTC.|

Veamos cómo funciona cada uno de ellos en la práctica. Hay varias formas de inicializar los objetos Fecha y Hora.

> Ejemplo: [`DateTimeExample`](DateTimeExample.java)

## Extracción y combinación de valores de fecha y hora

A veces hay requisitos para obtener sólo la fecha o la hora de la LocalDaeTime o combinar la fecha o la hora en el valor existente, hay algunas funciones listas que podemos utilizar funciones como `toLocalDate()`, `toLocalTime()` para extraer. También si sólo se necesita una porción de una fecha-hora, esto puede ser Mes o Año, entonces se puede extraer utilizando `getX()` esto puede ser `getYear()`, `getMonth()`, `getHour()` métodos. Y `atTime(LocalTime)`, `atDate(LocalDate)`, para combinar. He aquí un ejemplo a continuación.

> Ejemplo: [`ExtractAndCombineDateTime`](ExtractAndCombineDateTime.java)

## Operaciones en la API Fecha-Hora

Los objetos `LocalDateTime`, `LocalDate`, `LocalTime` son objetos inmutables, por lo que no podemos aplicar operadores, Pero es necesario sumar, restar, rangos, y cálculos para fecha y hora, Java ha proporcionado operaciones para los objetos. Como ejemplo, si queremos sumar podemos usar `plusX()`, si restamos `minusX()`, esta `X` puede ser reemplazada por `Años`, `Meses`, `Horas`, `Días`.

Además, a la hora de comparar existen métodos como `isBefore()` o `isAfter()` para contrastar con otra fecha.

> Ejemplo: [`DateTimeOperations`](DateTimeOperations.java)

## Instants, Durations, y Periods en Java

Cuando se trata de las horas y las fechas, no es lo único que se requiere para utilizar la fecha y horas que podríamos necesitar para expresar la cantidad de tiempo para estos escenarios ha traído algunas clases como

|  | Descripcion |
|---|---|
|`java.time.Duration`|para representar el tiempo en nanosegundos.|
|`java.time.Period`|utilizado para expresar el tiempo en unidades como el año, incluyendo la distancia entre dos tiempos o días, utilizado sobre todo para escribir funciones comerciales.|
|`java.time.Instant`|utilizado para representar la instancia de un tiempo(timestamp), y mejor para usar en APIs de registro y tareas del sistema.|

De forma similar a LocalDate y LocalDateTime existen métodos similares para realizar las operaciones como `now()`, `ofX()`, `plusX()`, `minusX()`, `withX()`, y `getX()`. y funciones como `between()` y `isNegative()` para manejar la distancia entre el punto de tiempo.

> Ejemplo: [`CalculateTimePeriod`](CalculateTimePeriod.java)

Veamos ahora cómo podemos utilizar Instant y Duration proporcionados por Java 8+:

> Ejemplo: [`DurationsAndInstants`](DurationsAndInstants.java)

Usando el instante podemos recuperar el timestamp actual esto incluye la fecha hora actual y los nanosegundos, También el timestamp proporciona `getNano()` para extraer sólo los nanosegundos del último segundo en el timestamp registrado.

Usando la Duración podemos establecer un cierto periodo de tiempo usando `ofHours()`, `ofDays()` y aplicar las operaciones aritméticas también. y convirtiéndolos de nuevo a los valores apropiados como segundos, minutos según sea necesario.

## El horario de verano y las distintas zonas horarias

La mayoría de las aplicaciones de tiempo no se limitan a los usuarios en un área geográfica con las mismas zonas horarias en ese momento debe haber un mecanismo para manejar la fecha y la hora de acuerdo a la forma en que se ajusta a otras partes del mundo. Java tiene una clase especial prevista para ello que es `java.time.ZonedDateTime`.

La clase ZoneDateTime consiste en las mismas capacidades de la clase LocalDateTime pero proporciona los valores de fecha y hora de acuerdo a las reglas de la zona horaria, esto incluye el tema del horario de verano para tratar con la función `withZoneSameInstant()`. Pero para definir la zona horaria debe haber la ayuda de otra clase que es la clase `java.time.ZoneId`. Hay algunas maneras en que podemos inicializar un `ZoneId`.

Vamos a ver el código desde una perspectiva detallada para ver cómo hacer las cosas. Primero tomemos un escenario donde tenemos una fecha-hora pasada, Queremos saber cual era la hora en una zona horaria diferente en ese momento:

> Ejemplo: [`FindingPastDateTime`](FindingPastDateTime.java)

En el ejemplo anterior lo que hace es primero inicializar una hora, y luego crear dos zonas horarias, Berlin, y Denver, USA. Mapeamos la fecha definida con la zona horaria de Berlín, Lo que significa que le decimos al programa que esta es la hora y fecha en Berlín en la línea 18.

Y usando el `withZonedSameInstant()` encuentra cual era la fecha y hora en Denver, cuando era en 2021 21 de Febrero a las 6.30 PM Java `ZonedDateTime` resolverá esto para nosotros y devuelve la salida.

Ahora vamos a encontrar la fecha y la hora actual basada en nuestra región:

> Ejemplo: [`FindingCurrentWorldTime`](FindingCurrentWorldTime.java)

En el programa anterior lo que hace es obtener la hora actual y la zona actual en la que se encuentra tu pc/servidor y mapear la fecha y la hora con la zona horaria, basándose en nuestra hora calcula la hora actual de otras ciudades en diferentes zonas horarias. Si podemos extraer sólo la fecha o la hora también es posible por el `toLocalDate()` o `toLocalTime()`.

## Formateo y análisis de fecha y hora

No sólo basta con representar la fecha y la hora en distintas zonas horarias, sino que puede ser necesario representarlas de forma estándar según la zona horaria.

Para la forma estándar de formato en primer lugar, la aplicación debe ser ajustable para representar en el idioma local y el formato, `java.util.Locale` es la clase soportada en el entorno Java para representar los idiomas y países.

Después de establecer el Locale para formatear la hora en el formato local Java viene con el `java.time.format.DateTimeFormatter`, que proporciona la capacidad de presentar el valor fecha-hora de una manera estándar o preferiblemente personalizada.

Veamos un ejemplo de formateo de la Fecha y Hora según diferentes países e idiomas:

> Ejemplo: [`DateAndTimeFormatter`](DateAndTimeFormatter.java)

En el código anterior, lo que hace es como primer paso, se establecerá Locale a algunos países con diferentes formatos de fecha y los idiomas, y se utilizará `DateTimeFormatter` para establecer cómo el formato de fecha diferente debe mostrar manualmente y también de forma automática de acuerdo a la configuración regional. Por último, formatea la fecha dada y la asigna a un objeto String para su representación. Y la salida es así (al 06 de Mayo de 2021),