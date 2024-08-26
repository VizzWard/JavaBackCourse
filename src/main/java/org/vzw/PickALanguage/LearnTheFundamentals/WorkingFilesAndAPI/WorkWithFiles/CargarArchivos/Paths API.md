# Paths API

Para trabajar con archivos en Java, primero necesitas una referencia a un archivo. Como acabamos de mencionar, a partir de Java 7, se utiliza la API de rutas para hacer referencia a los archivos, por lo que todo comienza con la construcción de objetos Path.

Veamos un ejemplo en código:

```java
public static void main(String[] args) throws URISyntaxException {

    // Java11+  : Path.of()

    Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
    System.out.println(path);

    path = Path.of("c:/dev/licenses/windows/readme.txt");
    System.out.println(path);

    path = Path.of("c:" , "dev", "licenses", "windows", "readme.txt");
    System.out.println(path);

    path = Path.of("c:" , "dev", "licenses", "windows").resolve("readme.txt"); // resolve == getChild()
    System.out.println(path);

    path = Path.of(new URI("file:///c:/dev/licenses/windows/readme.txt"));
    System.out.println(path);

    // Java < 11 equivalent: Paths.get()
    path = Paths.get("c:/dev/licenses/windows/readme.txt");
    System.out.println(path);

    // etc...
}
```

Vamos a desglosarlo:

```java
Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
System.out.println(path);

path = Path.of("c:/dev/licenses/windows/readme.txt");
System.out.println(path);
```

A partir de Java 11, debe utilizar el método estático Path.of para construir rutas.

No importa si está utilizando barras inclinadas, por ejemplo, en Windows, ya que la API de rutas es lo suficientemente inteligente como para construir la ruta correcta, independientemente del sistema operativo y de cualquier problema de barras inclinadas.

Así, las dos líneas anteriores devolverán el siguiente resultado, al ejecutar el método main.

```text
c:\dev\licenses\windows\readme.txt
c:\dev\licenses\windows\readme.txt
```

Hay más opciones a la hora de construir rutas: No tienes que especificar la ruta completa como una cadena larga:

```java
path = Path.of("c:" , "dev", "licenses", "windows", "readme.txt");
System.out.println(path);

path = Path.of("c:" , "dev", "licenses", "windows").resolve("readme.txt"); // resolve == getChild()
System.out.println(path);
```

En su lugar, puede pasar una secuencia de cadenas al método Path.of, o construir el directorio padre y utilizarlo para obtener un archivo hijo (.resolve(child)).

De nuevo, el resultado será el mismo que antes.

```text
c:\dev\licenses\windows\readme.txt
c:\dev\licenses\windows\readme.txt
```

Por último, también puede pasar URIs a la llamada Path.of.

```java
path = Path.of(new URI("file:///c:/dev/licenses/windows/readme.txt"));
System.out.println(path);
```

Suena a disco rayado, pero el resultado.... será el mismo.

```text
c:\dev\licenses\windows\readme.txt
```

Por tanto, tienes varias opciones para construir tus objetos Path.

Sin embargo, hay dos puntos importantes:

1. Construir un objeto path o resolver un hijo, no significa que el fichero o directorio exista realmente. La ruta es simplemente una referencia a un archivo potencial. Por lo tanto, tendrás que verificar por separado su existencia.
2. Antes de Java-11, Path.of se llamaba Paths.get, que tendrá que utilizar si está atascado en versiones anteriores de Java o si está creando una biblioteca que necesita compatibilidad con versiones anteriores. A partir de Java 11, Paths.get redirige internamente a Path.of.

```java
// Java < 11 equivalent: Paths.get()
path = Paths.get("c:/dev/licenses/windows/readme.txt");
System.out.println(path);
```

Una vez que tienes un objeto trayectoria, por fin puedes hacer algo con él -> [`Common File Operations`](Common%20File%20Operations.md)