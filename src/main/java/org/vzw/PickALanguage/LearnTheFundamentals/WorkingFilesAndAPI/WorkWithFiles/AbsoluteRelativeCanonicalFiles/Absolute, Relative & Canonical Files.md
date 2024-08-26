# Absolute, Relative & Canonical Files

Hablemos rápidamente de los conceptos de rutas absolutas, relativas y canónicas. Es mejor demostrarlo con algunos ejemplos de código:

## Relative Paths

En Java, las rutas (`Path`) pueden ser absolutas o relativas. Una ruta absoluta es una que se especifica desde la raíz del sistema de archivos y, por lo tanto, es independiente del directorio de trabajo actual. Una ruta relativa, en cambio, se define en relación con el directorio actual en el que se está ejecutando el programa. Por ejemplo:

```java
Path p = Paths.get("./src/main/java/../resources/some.properties");
System.out.println("p.isAbsolute() = " + p.isAbsolute());
```

**Desglose:**

1. `Paths.get()`: El método `Paths.get()` se usa para crear un objeto `Path` a partir de una secuencia de cadenas o una ruta específica. En este caso, la ruta pasada es `./src/main/java/../resources/some.properties`.
    - `./src/main/java/../resources/some.properties`.
2. `./src/main/java/../resources/some.properties`:
    - `.` representa el directorio actual.
    - `src/main/java/../resources/some.properties`:
        -  `../` significa "subir un nivel en el árbol de directorios".
        - Por lo tanto, `java/../resources` indica que estamos retrocediendo desde el directorio java al directorio main, y luego bajando al directorio resources.
    - La ruta final es `./src/main/resources/some.properties`, que es una ruta relativa basada en el directorio actual.
3. `p.isAbsolute()`:
    - Este método comprueba si el objeto `Path` es una ruta absoluta.
    - Como la ruta `./src/main/java/../resources/some.properties` comienza con `.` (lo que indica que es relativa al directorio actual), `p.isAbsolute()` devolverá false.

```text
p.isAbsolute() = false
```

### Qué es una Ruta Relativa?

Una ruta relativa es una ruta que se define en relación con el directorio actual en el que se está ejecutando el programa. No comienza desde la raíz del sistema de archivos, sino que depende del contexto del directorio actual.

**Características de una Ruta Relativa:**

- No comienza con una raíz (`/` en Unix/Linux, `C:\` en Windows), sino con un directorio relativo como `.` o un nombre de directorio.
- Es sensible al contexto del directorio actual. Si el directorio actual cambia, la interpretación de la ruta también puede cambiar.

## Absolute Paths

```java
Path p2 = p.toAbsolutePath();
System.out.println("p2 = " + p2);
System.out.println("p2.isAbsolute() = " + p2.isAbsolute());
```
Cuando llames a `toAbsolutePath` sobre la ruta, se convertirá en una, bueno ruta absoluta, en mi caso conteniendo `C:\dev\java-files`. Tenga en cuenta que la ruta absoluta todavía contiene los puntos, para el directorio actual y el directorio superior.

```text
p2 = C:\dev\java-file-article\.\src\main\java\..\resources\some.properties
p2.isAbsolute() = true
```

### ¿Qué es una Ruta Absoluta?

Una ruta absoluta es una ruta completa desde la raíz del sistema de archivos, como `/home/user/file.txt` en Unix/Linux o `C:\Users\User\file.txt` en Windows. Una ruta absoluta es independiente del directorio actual y siempre se resuelve de la misma manera.

## Normalized Paths

Cuando trabajas con rutas en Java, es posible que estas rutas contengan partes que no son necesarias o que complican la ruta, como `.` (que representa el directorio actual) o `..` (que representa el directorio padre). Normalizar una ruta significa simplificarla, eliminando estas partes innecesarias.

```java
Path p = Paths.get("./src/main/java/../resources/some.properties");
Path p3 = p.normalize().toAbsolutePath();
System.out.println("p3 = " + p3);
System.out.println("p3.isAbsolute() = " + p3.isAbsolute());
```

**Paso a Paso:**

1. Ruta Original `p`:
    - La ruta `p` que se crea aquí es `./src/main/java/../resources/some.properties`.
    - Esta ruta contiene `.` (directorio actual) y `..` (directorio padre), lo que la hace un poco más compleja de lo necesario.
2. `normalize()`:
    - El método `normalize()` en Java simplifica la ruta eliminando las partes innecesarias, como `.` y resolviendo `..` con el directorio correspondiente.
    - Después de normalizar, la ruta se convierte en s`rc/main/resources/some.properties`.
        -  Paso a Paso:
            - `.` (directorio actual) se elimina.
            - `../` sube un nivel, eliminando `java/` y dejando `src/main/resources/some.properties`.
3. `toAbsolutePath()`:
    - Convierte la ruta normalizada en una ruta absoluta.
    - Si el directorio actual es, por ejemplo, `C:/Users/thega/IdeaProjects/MyProject`, entonces la ruta absoluta sería algo como `C:/Users/thega/IdeaProjects/MyProject/src/main/resources/some.properties`.
4. Impresión de la Ruta Normalizada y Absoluta:
    - `p3`: Es la versión simplificada y absoluta de la ruta original.
    - `p3.isAbsolute()`: Dado que `toAbsolutePath()` se ha aplicado, este método devolverá true, confirmando que la ruta es absoluta.

**Salida esperada:**

```text
p3 = C:/Users/thega/IdeaProjects/MyProject/src/main/resources/some.properties
p3.isAbsolute() = true
```

### Qué es una Ruta Normalizada?

Es una versión simplificada de la ruta original, donde se eliminan los segmentos innecesarios (`.`) y se resuelven los segmentos relativos (`..`). Esto hace que la ruta sea más directa y fácil de entender.

### Qué es una Ruta Canónica?

En algunos contextos, una ruta normalizada y absoluta también se denomina "ruta canónica". Es una ruta única y sin ambigüedades a un archivo o directorio, sin redundancias ni referencias relativas.

## Relativizing Paths

```text
p3 = C:\dev\java-file-article\src\main\resources\some.properties
p3.isAbsolute() = true
```

Por último, pero no por ello menos importante, también puede hacer lo contrario. En lugar de hacer que las rutas relativas sean absolutas, puede hacer que las rutas absolutas sean relativas.

```java
Path relativizedPath = Paths.get("C:\\dev\\java-file-article\\").relativize(p3);
System.out.println("relativizedPath = " + relativizedPath);
```

Básicamente estás diciendo, dada una determinada ruta base, cuál es la ruta relativa de mi ruta actual (absoluta). Obtendrá la siguiente salida:

```text
relativizedPath = src\main\resources\some.properties
```