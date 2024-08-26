# Escritura y lectura de archivos

## Cómo escribir cadenas en ficheros

Aún no hemos hablado del núcleo de la gestión de archivos: Escribir y leer archivos

Veamos cómo hacerlo:

```java
Path utfFile = Files.createTempFile("some", ".txt");
Files.writeString(utfFile, "this is my string ää öö üü"); // UTF 8
System.out.println("utfFile = " + utfFile);

Path iso88591File = Files.createTempFile("some", ".txt");
Files.writeString(iso88591File, "this is my string ää öö üü", StandardCharsets.ISO_8859_1); // otherwise == utf8
System.out.println("iso88591File = " + iso88591File);
```

A partir de Java 11 (más concretamente 11.0.2/12.0, ya que había un error en las versiones anteriores), debería utilizar el método Files.writeString para escribir contenido de cadena en un archivo. Por defecto, se escribirá un archivo UTF-8, que puede, sin embargo, anular especificando una codificación diferente.

### Files.writeString

- Este método está diseñado específicamente para escribir cadenas de texto (String) en un archivo.
- Es ideal cuando se necesita escribir texto en un archivo de manera sencilla y directa.
- Por defecto, Files.writeString utiliza la codificación UTF-8 para escribir el texto, pero puedes especificar una codificación diferente si lo necesitas.
- Este método fue introducido en Java 11, por lo que es relativamente nuevo.
- Syntax:

```java
Path path = Path.of("archivo.txt");
Files.writeString(path, "Este es un texto de ejemplo.");

```

## Cómo escribir bytes en ficheros

```java
Path anotherIso88591File = Files.createTempFile("some", ".txt");
Files.write(anotherIso88591File, "this is my string ää öö üü".getBytes(StandardCharsets.ISO_8859_1));
System.out.println("anotherIso88591File = " + anotherIso88591File);
```

Si quieres escribir bytes en un archivo (y en versiones antiguas de Java < 11 tendrías que usar la misma API para escribir cadenas), tienes que llamar a Files.write.

### Files.write

- Este método es más general y puede manejar una variedad de tipos de datos, como un arreglo de bytes (byte[]), una lista de cadenas (List<String>), o un String convertido a bytes. Se utiliza para escribir datos binarios o texto en un archivo.
- Es más flexible que `Files.writeString` y se utiliza cuando necesitas escribir datos binarios o cuando trabajas con formatos de texto no compatibles con `Files.writeString`.
- Si estás escribiendo texto, necesitas gestionar manualmente la conversión de texto a bytes si no estás utilizando una lista de cadenas. Esto te permite controlar la codificación, pero también requiere más trabajo.
- Syntax:

1. Para escribir un arreglo de bytes: 

```java
Path path = Path.of("archivo.bin");
byte[] datos = {65, 66, 67}; // Representa "ABC" en ASCII
Files.write(path, datos);
```

2. Para escribir una lista de cadenas:

```java
Path path = Path.of("archivo.txt");
List<String> lineas = Arrays.asList("Primera línea", "Segunda línea");
Files.write(path, lineas);
```

## Opciones de escritura de archivos

```java
Path anotherUtf8File = Files.createTempFile("some", ".txt");
Files.writeString(anotherUtf8File, "this is my string ää öö üü", StandardCharsets.UTF_8,
        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
System.out.println("anotherUtf8File = " + anotherUtf8File);

Path oneMoreUtf8File = Files.createTempFile("some", ".txt");
Files.write(oneMoreUtf8File, "this is my string ää öö üü".getBytes(StandardCharsets.UTF_8),
        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
System.out.println("oneMoreUtf8File = " + oneMoreUtf8File);
```

Al llamar a cualquiera de los métodos de escritura, el fichero se creará automáticamente (y se truncará si ya existe). Lo que significa, que no habríamos tenido que crear archivos temporales explícitos, como lo hicimos anteriormente.

Si no desea ese comportamiento (es decir, que falle si el archivo ya existe) y obtener una excepción correspondiente, tendrá que pasar otro OpenOption.

## Uso de Writers y OutputStreams

```java
try (BufferedWriter bufferedWriter = Files.newBufferedWriter(utfFile)) {
    // handle reader
}

try (OutputStream os = Files.newOutputStream(utfFile)) {
    // handle outputstream
}
```

Por último, si desea trabajar directamente con escritores o flujos de salida, asegúrese de llamar a los métodos Files correspondientes y no construir los escritores o flujos a mano.

## Cómo leer cadenas de archivos

La lectura de archivos es muy similar a la escritura:

```java
String s = Files.readString(utfFile);// UTF 8
System.out.println("s = " + s);

s = Files.readString(utfFile, StandardCharsets.ISO_8859_1); // otherwise == utf8
System.out.println("s = " + s);
```

En Java11+, debería utilizar el método Files.readString para leer una cadena de un archivo. Asegúrese de pasar la codificación apropiada del archivo; por defecto, Java utilizará la codificación UTF-8 para leer archivos.

## Cómo leer bytes de archivos

```java
s = new String(Files.readAllBytes(utfFile), StandardCharsets.UTF_8);
System.out.println("s = " + s);
```

Si quieres leer bytes de un archivo (y en versiones antiguas de Java < 11 tendrías que usar la misma API para leer cadenas), tienes que llamar a Files.readAllBytes.

En caso de que el resultado final sea una cadena, tendrás que construirla tú mismo con la codificación adecuada.

## Lectores y flujos de entrada

```java
try (BufferedReader bufferedReader = Files.newBufferedReader(utfFile)) {
    // handle reader
}

try (InputStream is = Files.newInputStream(utfFile)) {
    // handle inputstream
}
```

Como siempre, puede volver a utilizar lectores o flujos de entrada directamente. Para ello, utilice los métodos Files correspondientes.

> Es absolutamente necesario utilizar una codificación explícita, siempre que se creen, escriban o lean archivos, aunque es de gran ayuda que los nuevos métodos de Java 11 utilicen por defecto UTF-8, y no la codificación específica de la plataforma.