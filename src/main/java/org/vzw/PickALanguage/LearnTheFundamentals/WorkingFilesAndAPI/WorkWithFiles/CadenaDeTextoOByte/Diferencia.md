La diferencia clave entre leer una cadena de texto y leer bytes de un archivo radica en cómo se interpreta el contenido del archivo.

## 1. Leyendo una Cadena de Texto

Cuando lees una cadena de texto desde un archivo, el contenido se interpreta como caracteres de texto (usando una codificación específica, como UTF-8). Esto es común cuando trabajas con archivos de texto (archivos .txt, .csv, .json, etc.).

[`Ejemplo`](Example1.java):

```java
public class Example1 {
    public static void main(String[] args) {
        Path path = Path.of("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\CadenaDeTextoOByte\\archivo.txt");

        try {
            // Leer todo el contenido del archivo como una cadena de texto
            String contenido = Files.readString(path);
            System.out.println("Contenido del archivo (como texto):");
            System.out.println(contenido);
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
```

***Salida:***

```text
Hola Mundo
```

- `Files.readString(path)`: Lee el contenido del archivo completo como una cadena de texto. Se asume que el archivo está codificado en UTF-8 (que es la codificación por defecto en muchos sistemas).

## 2. Leyendo Bytes

Cuando lees bytes desde un archivo, obtienes el contenido en bruto sin interpretarlo como texto. Esto es útil cuando trabajas con archivos binarios (como imágenes, videos, archivos .zip, etc.), o cuando necesitas manipular el archivo a un nivel más bajo.

[`Ejemplo`](Example1.java):

```java
public class Example2 {
    public static void main(String[] args) {
        Path path = Path.of("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\CadenaDeTextoOByte\\archivo.txt");

        try {
            // Leer todo el contenido del archivo como un array de bytes
            byte[] bytes = Files.readAllBytes(path);
            System.out.println("Contenido del archivo (como bytes):");
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
```

***Salida:***

```text
[72, 111, 108, 97, 32, 77, 117, 110, 100, 111]
```

- `Files.readAllBytes(path)`: Lee todo el contenido del archivo como un array de bytes (`byte[]`). No se hace ninguna interpretación de los datos; simplemente obtienes los bytes en su forma original.
- `Arrays.toString(bytes)`: Muestra la representación del array de bytes para que puedas ver los valores binarios.

## Diferencias Clave

- `Files.readString(path)`: Interpreta los bytes del archivo como texto (según la codificación, como UTF-8) y devuelve una cadena de texto (`String`). Es útil cuando el archivo es un archivo de texto y quieres trabajar con el contenido como texto legible.
- `Files.readAllBytes(path)`: Devuelve el contenido del archivo como un array de bytes (`byte[]`) sin hacer ninguna interpretación. Es útil cuando el archivo es binario o cuando necesitas manipular los datos en su forma cruda.