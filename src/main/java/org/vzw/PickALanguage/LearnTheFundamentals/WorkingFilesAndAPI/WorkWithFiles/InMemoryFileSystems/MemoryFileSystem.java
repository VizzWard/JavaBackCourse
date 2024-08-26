package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.InMemoryFileSystems;

//Agregar dependencia en pom
import com.github.marschall.memoryfilesystem.MemoryFileSystemBuilder;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;

public class MemoryFileSystem {
    public static void main(String[] args) throws IOException {

        // Crear un sistema de archivos en memoria con semántica de Windows
        try (FileSystem fileSystem = MemoryFileSystemBuilder.newWindows().build()) {

            // Crear una estructura de directorios en memoria
            Path directory = fileSystem.getPath("C:/Users/thega/SyncSistem/OneDrive/IdeaProjects/JavaBackCourse/src/main/java/org/vzw/PickALanguage/LearnTheFundamentals/WorkingFilesAndAPI/WorkWithFiles/InMemoryFileSystems/directorio");
            Files.createDirectories(directory);

            // Crear un archivo en memoria dentro del directorio
            Path inMemoryFile = directory.resolve("file.txt");
            Files.writeString(inMemoryFile, "Hello World");

            // Leer el contenido del archivo y mostrarlo en consola.
            System.out.println(Files.readString(inMemoryFile));
        }
    }
}
