package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.CadenaDeTextoOByte;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

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