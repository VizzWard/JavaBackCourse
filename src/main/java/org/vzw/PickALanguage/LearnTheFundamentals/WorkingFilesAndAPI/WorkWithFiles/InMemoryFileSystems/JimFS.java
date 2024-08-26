package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.InMemoryFileSystems;

//Agregar dependencia en pom
import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;

public class JimFS {
    public static void main(String[] args) throws IOException {

        // Crear un sistema de archivos en memoria simulado con semántica de Windows
        try (FileSystem fileSystem = Jimfs.newFileSystem(Configuration.windows())) {

            // Simulación de la ruta en un sistema de archivos en memoria
            Path inMemoryFile = fileSystem.getPath("C:\\Users\\thega\\SyncSistem\\OneDrive\\IdeaProjects\\JavaBackCourse\\src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\InMemoryFileSystems\\directorio\\file.txt");

            // Crear los directorios necesarios en memoria
            Files.createDirectories(inMemoryFile.getParent());

            // Escribir en el archivo simulado en memoria
            Files.writeString(inMemoryFile, "Hello World from JimFS!");

            // Leer y mostrar el contenido del archivo en memoria.
            System.out.println(Files.readString(inMemoryFile));
        }
    }
}
