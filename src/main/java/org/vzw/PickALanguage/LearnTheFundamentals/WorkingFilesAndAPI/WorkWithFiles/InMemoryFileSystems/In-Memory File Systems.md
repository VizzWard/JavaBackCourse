# In-Memory File Systems

Algunos desarrolladores asumen que trabajar con archivos siempre significa que realmente tendrás que escribirlos en tu disco.

Durante las pruebas, esto lleva a crear un montón de archivos y directorios temporales y luego tener que asegurarse de borrarlos de nuevo.

Pero, con la Path-API de Java, hay una forma mucho mejor: Sistemas de archivos en memoria.

Permiten escribir y leer archivos, completamente en memoria, sin necesidad de utilizar el disco. Son superrápidos y perfectos para realizar pruebas (siempre que no te quedes sin memoria).

Hay dos sistemas de archivos Java en memoria que merece la pena examinar.

## Memory File System

Una opción es Memory File System. Veamos cómo crear un sistema de archivos en memoria con él.

```java
package com.marcobehler.files;

import com.github.marschall.memoryfilesystem.MemoryFileSystemBuilder;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;

public class MemoryFileSystem {

    public static void main(String[] args) throws IOException {

        try (FileSystem fileSystem = MemoryFileSystemBuilder.newMacOs().build()) {

            Path inMemoryFile = fileSystem.getPath("/somefile.txt");
            Files.writeString(inMemoryFile, "Hello World");

            System.out.println(Files.readString(inMemoryFile));
        }
    }
}
```

Vamos a desglosarlo.

1. Crear un Sistema de Archivos en Memoria:
```java
try (FileSystem fileSystem = MemoryFileSystemBuilder.newMacOs().build()) {
```

Aquí se crea un sistema de archivos en memoria con semántica similar a macOS. Puedes usar `newLinux()`, `newWindows()`, o `newMacOs()` dependiendo del sistema operativo con el que quieras emular.

2. Crear un Archivo en Memoria y Escribir en él:

```java
Path inMemoryFile = fileSystem.getPath("/somefile.txt");
Files.writeString(inMemoryFile, "Hello World");
```

Se crea un archivo en el sistema de archivos en memoria y se escribe en él. En lugar de utilizar Path.of o Paths.get, se obtiene la ruta a través del sistema de archivos en memoria.

3. Leer el Archivo desde la Memoria:

```java
System.out.println(Files.readString(inMemoryFile));
```

Finalmente, se lee el contenido del archivo y se imprime en la consola.

## JimFS

Otra opción es JimFS, es una biblioteca de Java que permite crear un sistema de archivos en memoria. Esto es útil para pruebas y situaciones en las que no quieres o no puedes trabajar directamente con el sistema de archivos del sistema operativo.

Veamos cómo crear un sistema de ficheros en memoria con él.

```java
package com.marcobehler.files;

import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;

public class JimFSSystem {

    public static void main(String[] args) throws IOException {

        try (FileSystem fileSystem = Jimfs.newFileSystem(Configuration.unix());) {

            Path inMemoryFile = fileSystem.getPath("/tmp/somefile.txt");
            Files.writeString(inMemoryFile, "Hello World");

            System.out.println(Files.readString(inMemoryFile));
        }
    }
}
```

Vamos a desglosarlo:

1. Creación del FileSystem en Memoria:

```java
try (FileSystem fileSystem = Jimfs.newFileSystem(Configuration.unix());) {
```

- Jimfs.newFileSystem(Configuration.unix()): Crea un sistema de archivos en memoria con semántica de UNIX (es decir, estructura de directorios, permisos, etc.).

- try-with-resources: Esto asegura que el FileSystem en memoria se cierre correctamente después de su uso.

2. Operaciones con Archivos:

```java
Path inMemoryFile = fileSystem.getPath("/tmp/somefile.txt");
Files.writeString(inMemoryFile, "Hello World");
System.out.println(Files.readString(inMemoryFile));
```

- fileSystem.getPath("/tmp/somefile.txt"): Obtiene una Path en el sistema de archivos en memoria.
- Files.writeString(inMemoryFile, "Hello World"): Escribe la cadena "Hello World" en el archivo especificado.
- Files.readString(inMemoryFile): Lee el contenido del archivo y lo imprime.

## Sistemas de Archivos en Memoria: Uso de Anclajes

Cuando trabajas con sistemas de archivos en memoria, como `JimFS` o `MemoryFileSystem`, es crucial asegurarte de que tu aplicación no dependa inadvertidamente del sistema de archivos del sistema operativo en el que se está ejecutando la JVM. Esto se debe a que métodos comunes como `Path.of` o `Paths.get` están diseñados para trabajar con el sistema de archivos predeterminado de la JVM, que corresponde al sistema de archivos real del entorno (Windows, Unix, etc.).

```java
public static Path of(String first, String... more) {
    return FileSystems.getDefault().getPath(first, more);
}
```

- `FileSystems.getDefault()`: Este método devuelve el sistema de archivos predeterminado de la JVM, que es el sistema de archivos del sistema operativo en el que se ejecuta tu aplicación.
- `getPath(first, more)`: A partir del sistema de archivos predeterminado, crea una ruta (`Path`) basada en los argumentos proporcionados.

### Problema

Cuando utilizas métodos como `Path.of` o `Paths.get`, estás vinculando implícitamente tu código al sistema de archivos real del entorno. Esto significa que si quieres que tu aplicación funcione en un sistema de archivos en memoria, estos métodos no funcionarán como esperas, ya que continuarán interactuando con el sistema de archivos real en lugar del sistema de archivos en memoria.

### Solución: Uso de Anclajes

Para garantizar que tu aplicación funcione correctamente con sistemas de archivos en memoria, debes evitar el uso de `Path.of`, `Paths.get`, o cualquier método similar que esté anclado al sistema de archivos predeterminado de la JVM. En su lugar, debes utilizar el FileSystem específico que representa tu sistema de archivos en memoria.

### Cómo hacerlo

- Siempre que necesites crear una `Path`, usa el `FileSystem` en memoria para crear la ruta.
- Evita los métodos que dependen de `FileSystems.getDefault()` y en su lugar, trabaja directamente con el `FileSystem` en memoria.

### Ejemplo Comparativo

Incorrecto (vinculado al sistema de archivos real):

```java
Path realPath = Paths.get("/some/path");
```

- Este código siempre funcionará con el sistema de archivos real del sistema operativo.

Correcto (vinculado al sistema de archivos en memoria):

```java
FileSystem inMemoryFileSystem = Jimfs.newFileSystem(Configuration.unix());
Path inMemoryPath = inMemoryFileSystem.getPath("/some/path");
```

Este código asegura que `inMemoryPath` se refiere a una ruta dentro del sistema de archivos en memoria, no en el sistema de archivos real.

### Desafíos en Proyectos Legados

En proyectos más antiguos (legado), es posible que gran parte del código utilice `Path.of` o `Paths.get` porque estos métodos son convenientes y comunes. Cambiar todo el código para utilizar sistemas de archivos en memoria puede ser un desafío significativo, ya que implica reemplazar cada instancia de `Path.of` o `Paths.get` con código que trabaje directamente con el `FileSystem` en memoria..