# Moving, Deleting & Listing Files

## Cómo mover archivos

```java
Path utfFile = Files.createTempFile("some", ".txt");

try {
    Files.move(utfFile, Path.of("c:\\dev"));  // this is wrong!
} catch (FileAlreadyExistsException e) {
    // welp, that din't work!
}
```

Existe un método Files.move, pero no mueve un archivo a un directorio designado (lo que cabría esperar).

- test.jpg → c:\temp no funciona.
- test.jpg → c:\temp\test.jpg funciona.

```java
Files.move(utfFile, Path.of("c:\\dev").resolve(utfFile.getFileName().toString()));
```

Por tanto, no se mueven los archivos a carpetas, sino que se "mueven" a su nueva ruta completa, incluyendo el nombre del archivo y la extensión.

## Opciones de movimiento de archivos

```java
Path utfFile2 = Files.createTempFile("some", ".txt");
Files.move(utfFile2, Path.of("c:\\dev").resolve(utfFile.getFileName().toString()), StandardCopyOption.REPLACE_EXISTING);

Path utfFile3 = Files.createTempFile("some", ".txt");
Files.move(utfFile3, Path.of("c:\\dev").resolve(utfFile.getFileName().toString()), StandardCopyOption.ATOMIC_MOVE);
```

Al mover archivos, también puedes especificar cómo quieres que se realice el movimiento, en función de las capacidades del sistema de archivos subyacente.

- Por defecto, si el archivo de destino ya existe, se lanzará una FileAlreadyExistsException.
- Si especifica la opción StandardCopyOption.REPLACE_EXISTING, se sobrescribirá el archivo de destino.
- Si especifica la opción StandardCopyOption.ATOMIC_MOVE, puede mover un archivo a un directorio y tener la garantía de que cualquier proceso que observe el directorio acceda a un archivo completo y no sólo a un archivo parcial.

### StandardCopyOption.ATOMIC_MOVE

`StandardCopyOption.ATOMIC_MOVE` es una opción que puedes usar al mover archivos con el método `Files.move` en Java. Su propósito principal es garantizar que la operación de mover un archivo sea atómica.

#### Qué significa "atómica"?

Una operación atómica es aquella que se realiza completamente o no se realiza en absoluto. No hay un estado intermedio visible en caso de que ocurra un fallo durante la operación.

#### Qué hace StandardCopyOption.ATOMIC_MOVE?

Cuando usas StandardCopyOption.ATOMIC_MOVE con Files.move, intentas mover un archivo de una ubicación a otra de manera que sea:

- Indivisible: El sistema operativo intentará garantizar que la operación de mover el archivo sea instantánea desde la perspectiva del usuario y de otros procesos. Si algo sale mal (por ejemplo, si el sistema se apaga o hay un fallo del disco), no habrá un estado intermedio en el que el archivo se haya movido parcialmente.
- Segura: El archivo aparecerá en la nueva ubicación sólo si la operación de mover fue completamente exitosa. Si ocurre un error, el archivo debería permanecer en su ubicación original.

Tomando de ejemplo el codigo anterior:

- `Files.createTempFile("some", ".txt")`: Crea un archivo temporal con un nombre que comienza con `"some"` y termina con ".txt". La ubicación del archivo depende de la configuración del sistema.
- `Files.move(utfFile3, Path.of("c:\\dev").resolve(utfFile3.getFileName().toString()), StandardCopyOption.ATOMIC_MOVE);`:
    -  **Origen** (`utfFile3`): El archivo temporal que acabas de crear.
    - **Destino** (Path.of("c:\\dev").resolve(utfFile3.getFileName().toString())): Mueve el archivo a la carpeta c:\dev manteniendo el mismo nombre de archivo que tenía originalmente.
    - `StandardCopyOption.ATOMIC_MOVE`: Garantiza que la operación de mover sea atómica. Si se puede, el archivo se moverá de manera que sea completamente seguro, sin dejar un archivo parcial en el destino o en el origen si algo sale mal.

#### Cuándo es útil ATOMIC_MOVE?

`ATOMIC_MOVE` es particularmente útil en escenarios donde la integridad de los datos es crítica. Por ejemplo:

- Sistemas de archivos sensibles: Como bases de datos, donde un archivo no puede quedar en un estado incompleto.
- Actualización de archivos críticos: Cuando reemplazas un archivo importante y no puedes permitir que quede en un estado inconsistente.

#### Consideraciones

- Compatibilidad del sistema de archivos: No todos los sistemas de archivos soportan operaciones atómicas. Si el sistema de archivos no lo soporta, la operación puede fallar, lanzando una excepción.
- Rendimiento: Dependiendo del sistema, las operaciones atómicas pueden tener un impacto en el rendimiento.

## Cómo eliminar archivos

La eliminación de archivos y carpetas es un área en la que la API Java Path se queda un poco corta. Veamos por qué:

```java
try {
        Files.delete(tmpDir);
} catch (DirectoryNotEmptyException e) {
        e.printStackTrace();
}
```

Existe el método Files.delete, que permite borrar ficheros y directorios, pero los directorios sólo si están vacíos.

Desafortunadamente, no existe una bandera para purgar un directorio no vacío, y simplemente obtendrá una DirectoryNotEmptyException.

## Cómo eliminar directorios no vacíos

Existen algunas bibliotecas de ayuda de terceros para solucionar este problema, pero si desea utilizar una versión Java simple para eliminar un árbol de directorios no vacío, esto es lo que tendrá que hacer:

```java
try (Stream<Path> walk = Files.walk(tmpDir)) {
    walk.sorted(Comparator.reverseOrder()).forEach(path -> {
        try {
            Files.delete(path);
        } catch (IOException e) {
            // something could not be deleted..
            e.printStackTrace();
        }
    });
}
```

Files.walk recorrerá un árbol de archivos en profundidad, empezando por el directorio que especifiques. El comparador reverseOrder se asegurará de borrar todos los hijos, antes de borrar el directorio actual.

Desafortunadamente, también necesitarás atrapar la IOException, cuando uses Files.delete dentro del consumidor forEach. Un montón de código para borrar un directorio no vacío, ¿no?

Lo que nos lleva al tema de la lista de archivos:

## Cómo listar ficheros en el mismo directorio

Hay varias formas de listar todos los ficheros de un directorio determinado. Si sólo desea listar los archivos en los mismos niveles que el directorio (no recursivamente más profundo), puede utilizar estos dos métodos:

```java
try (var files = Files.list(tmpDirectory)) {
    files.forEach(System.out::println);
}

try (var files = Files.newDirectoryStream(tmpDirectory, "*.txt")) {
    files.forEach(System.out::println);
}
```

Tenga en cuenta que newDirectoryStream (a diferencia de Files.list) no devuelve un java.util.stream.Stream. En su lugar, devuelve un DirectoryStream, que es una clase que se introdujo en Java 1.7, antes del lanzamiento de la API Streams en Java 8.

Sin embargo, permite especificar un patrón glob (como *.txt), que funciona para listados sencillos, y es quizá un poco más fácil de leer que lidiar con Streams reales y los métodos de filtrado correspondientes.

Tenga en cuenta también que los flujos devueltos por ambos métodos deben cerrarse (por ejemplo, con una sentencia try-with-resources), de lo contrario la JVM mantendrá abierto el gestor de archivos del directorio, lo que (en Windows) lo bloquea.

## Cómo listar ficheros de forma recursiva

Si quieres listar recursivamente todos los ficheros de un árbol de ficheros, tendrás que emplear el método que usamos para borrar directorios: Files.walk.

```java
try (var files = Files.walk(tmpDirectory)) {
    files.forEach(System.out::println);
}
```

Tenga en cuenta que el flujo devuelto por Files.walk también debe cerrarse (por ejemplo, con una sentencia try-with-resources), de lo contrario la JVM mantendrá abierto el gestor de archivos del directorio, lo que (en Windows) lo bloquea.