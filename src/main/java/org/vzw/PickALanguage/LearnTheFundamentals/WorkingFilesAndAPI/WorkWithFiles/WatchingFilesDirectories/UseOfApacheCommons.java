package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.WatchingFilesDirectories;

// Por usar maven, se tiene que agregar la dependencia en el archivo pom.xml
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public class UseOfApacheCommons {
    public static void main(String[] args) throws Exception {
        // Ruta del directorio a monitorear
        String directoryPath = "src/main/java/org/vzw/PickALanguage/LearnTheFundamentals/WorkingFilesAndAPI/WorkWithFiles/WatchingFilesDirectories/directorio";

        // Crear un observador para el directorio
        FileAlterationObserver observer = new FileAlterationObserver(new File(directoryPath));

        // Crear un monitor con un intervalo de sondeo (por ejemplo, 5 segundos)
        FileAlterationMonitor monitor = new FileAlterationMonitor(5000);

        // Crear un listener para manejar los eventos de archivo
        FileAlterationListenerAdaptor listener = new FileAlterationListenerAdaptor() {
            // Se activa cuando se crea un archivo en el directorio monitorizado
            @Override
            public void onFileCreate(File file) {
                System.out.println("File created: " + file.getName());
            }

            // Se activa cuando se elimina un archivo del directorio monitorizado
            @Override
            public void onFileDelete(File file) {
                System.out.println("File deleted: " + file.getName());
            }

            // Se activa cuando se modifica un archivo en el directorio monitorizado
            @Override
            public void onFileChange(File file) {
                System.out.println("File changed: " + file.getName());
            }
        };

        // Añadir el listener al observador
        observer.addListener(listener);

        // Añadir el observador al monitor
        monitor.addObserver(observer);

        // Iniciar el monitor
        monitor.start();
        System.out.println("Monitoring started for directory: " + directoryPath);

        // Mantener el monitor activo
        Thread.sleep(Long.MAX_VALUE);

        // Parar el monitor cuando ya no sea necesario
        // monitor.stop();
    }
}


/**
 * Explicación del Código:
 *
 * 1. FileAlterationObserver:
 *      - Observa un directorio específico (directoryPath) para detectar cambios en
 *      los archivos.
 *
 * 2. FileAlterationMonitor:
 *      - Este monitor controla el observador a intervalos regulares (cada 5000 ms en
 *      el ejemplo, es decir, cada 5 segundos).
 *
 * 3. FileAlterationListenerAdaptor:
 *      - Es un adaptador que te permite implementar solo los métodos que necesitas.
 *      En este ejemplo, hemos sobreescrito los métodos onFileCreate, onFileDelete, y
 *      onFileChange para realizar acciones cuando se detecten estos eventos.
 *
 * 4. Iniciar el Monitor:
 *      - monitor.start(); comienza a monitorear el directorio.
 *      - Thread.sleep(Long.MAX_VALUE); mantiene el monitor en ejecución indefinidamente,
 *      hasta que lo detengas manualmente.
 */