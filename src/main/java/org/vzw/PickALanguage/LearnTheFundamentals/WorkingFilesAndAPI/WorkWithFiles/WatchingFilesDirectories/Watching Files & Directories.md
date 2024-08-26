# Watching Files & Directories

Algunos proyectos necesitan vigilar los directorios en busca de archivos recién creados y hacer algo con ellos. Usted tiene dos opciones populares, cuando se trata de ver los cambios en un directorio, en Java.

## Java’s WatchService

Con Java 7, Java incorpora WatchService. Se trata de una forma de bajo nivel de vigilar los cambios en un directorio especificado.

WatchService recibirá notificaciones de eventos de archivos nativos (Windows, Linux), con la notable excepción de MacOS, donde vuelve a sondear los directorios en busca de cambios - que es más o menos lo que todas las demás bibliotecas de vigilancia hacen por defecto (véase la siguiente sección).

Aquí tienes algo de código, que no deberías copiar y pegar a ciegas, pero que te dará una idea de cómo es un WatchService.

```java
public static void main(String[] args) throws IOException {

    WatchService watcher = FileSystems.getDefault().newWatchService();

    Path dir = Path.of("c:\\someDir\\");

    dir.register(watcher,
            ENTRY_CREATE,
            ENTRY_DELETE,
            ENTRY_MODIFY);

    for (;;) {

        WatchKey key;
        try {
            key = watcher.take();
        } catch (InterruptedException x) {
            return;
        }

        for (WatchEvent<?> event: key.pollEvents()) {
            WatchEvent.Kind<?> kind = event.kind();

            if (kind == OVERFLOW) {
                continue;
            }

            WatchEvent<Path> ev = (WatchEvent<Path>)event;
            Path filename = ev.context();

            Path changedFile = dir.resolve(filename);

            // do something with the file
        }

        boolean valid = key.reset();
        if (!valid) {
            break;
        }
    }
}
```

Hay un par de cosas a tener en cuenta cuando se utiliza WatchService:

- Se podría suponer que se obtiene un evento cada vez que, por ejemplo, se actualiza un archivo, pero esto puede dar lugar fácilmente a dos eventos: Uno para el contenido actualizado y otro para la actualización de la última fecha de modificación, que ocurren en un corto período de tiempo.
- IDEs complejos como IntelliJ o incluso editores de texto más pequeños como Notepad++ no guardan un archivo y su contenido de una sola vez. Copian el contenido en archivos tmp, los borran, luego guardan el contenido en el archivo real, etc. De nuevo, puede haber múltiples actualizaciones en el mismo archivo o incluso en varios, mientras que a ti, como usuario final, lo ideal sería tener un único evento actualizado.
- Por lo tanto, tendrá que aplicar algunas soluciones.

## Apache Commons-IO

Hay otra biblioteca que te permite vigilar los directorios en busca de cambios entrantes: Commons IO. Tiene la API más sencilla desde una perspectiva de uso, pero difiere en dos aspectos de WatchService:

- Sólo funciona con java.io.Files, no con java.nio.file.Paths.
- Utiliza el sondeo, es decir, llama al método listFiles() de la clase File y compara la salida con la salida de listFiles() de la iteración anterior para ver qué ha cambiado.

Apache Commons-IO es una biblioteca de utilidades que facilita diversas operaciones con archivos en Java. Entre sus características, ofrece una manera sencilla de monitorear directorios para detectar cambios, similar a lo que se puede hacer con WatchService, pero con algunas diferencias clave:

1. Uso de `java.io.File` en lugar de `java.nio.file.Paths`:
    - Mientras que `WatchService` utiliza la API de `java.nio.file`, la biblioteca de Commons-IO trabaja con la API más antigua basada en `java.io.File`.
2. Método de Monitoreo:
    - Commons-IO no utiliza eventos del sistema operativo para detectar cambios en los archivos. En su lugar, realiza un sondeo (polling): periódicamente llama al método `listFiles()` de la clase File y compara los resultados con los de la iteración anterior para detectar qué archivos han sido creados, modificados o eliminados.

Una vez más, una implementación completa está fuera del alcance de este artículo:

```java
public static void main(String[] args) throws IOException {
    FileAlterationObserver observer = new FileAlterationObserver(folder);
    FileAlterationMonitor monitor =
            new FileAlterationMonitor(pollingInterval);
    FileAlterationListener listener = new FileAlterationListenerAdaptor() {
        // Is triggered when a file is created in the monitored folder
        @Override
        public void onFileCreate(File file) {
            // do something
        }

        // Is triggered when a file is deleted from the monitored folder
        @Override
        public void onFileDelete(File file) {
           // do something
        }
    };
}
```

### Comparación con WatchService

- Flexibilidad: `WatchService` es más flexible porque trabaja directamente con la API moderna `java.nio.file` y puede manejar eventos más detallados.
- Simplicidad: Commons-IO ofrece una API más simple, pero no tiene la capacidad de monitoreo a nivel de sistema operativo (en su lugar, utiliza sondeo).
- Uso de Sondeo: Debido al uso de sondeo, Commons-IO puede tener una latencia en la detección de cambios (dependiendo del intervalo de sondeo).