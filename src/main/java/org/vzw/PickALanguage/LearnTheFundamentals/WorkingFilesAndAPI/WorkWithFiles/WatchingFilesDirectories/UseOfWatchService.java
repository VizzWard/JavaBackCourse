package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.WatchingFilesDirectories;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;

public class UseOfWatchService {
    public static void main(String[] args) throws IOException {

        // Crear el WatchService
        WatchService watcher = FileSystems.getDefault().newWatchService();

        // Ruta del directorio a monitorear
        Path dir = Paths.get("src/main/java/org/vzw/PickALanguage/LearnTheFundamentals/WorkingFilesAndAPI/WorkWithFiles/WatchingFilesDirectories/directorio");

        // Registrar el directorio con el WatchService para los eventos de creación, modificación y eliminación
        dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

        System.out.println("Monitoring directory: " + dir.toString());

        for (;;) {

            WatchKey key;
            try {
                // Esperar hasta que un evento esté disponible
                key = watcher.take();
            } catch (InterruptedException x) {
                return;
            }

            // Procesar los eventos que ocurrieron
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();

                if (kind == OVERFLOW) {
                    continue; // Saltar eventos de desbordamiento
                }

                // Obtener la información del archivo afectado
                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path filename = ev.context();

                Path changedFile = dir.resolve(filename);

                // Hacer algo con el archivo modificado
                System.out.println("Event kind: " + kind + ". File affected: " + changedFile);
            }

            // Resetear la clave para recibir futuros eventos
            boolean valid = key.reset();
            if (!valid) {
                break;
            }
        }
    }
}

/**
 * Desglose del Código:
 *
 * 1. Crear el WatchService
 *      - Esto crea un WatchService que se encargará de recibir eventos
 *      de cambios en el sistema de archivos.
 *
 * 2. Registrar el Directorio:
 *      - En este caso, se registra el directorio en el que quieres
 *      monitorear cambios (dir), y se especifican los tipos de eventos
 *      que se desean monitorear: ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY.
 *
 * 3. Esperar Eventos:
 *      - El método take() bloquea el hilo hasta que ocurra un evento.
 *      Una vez que ocurre, se procesa dentro de un bucle que maneja todos
 *      los eventos capturados.
 *
 * 4. Manejar los Eventos:
 *      - Aquí se identifican los tipos de eventos que han ocurrido
 *      (creación, modificación, eliminación) y se maneja cada evento según
 *      sea necesario.
 *
 * 5. Resetear la Clave:
 *      - Después de procesar los eventos, la clave se resetea para recibir
 *      futuros eventos. Si el directorio ya no es accesible, el bucle termina.
 */