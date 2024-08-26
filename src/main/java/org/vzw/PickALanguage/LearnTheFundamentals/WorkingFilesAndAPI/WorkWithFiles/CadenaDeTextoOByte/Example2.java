package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.CadenaDeTextoOByte;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        Path path = Path.of("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\CadenaDeTextoOByte\\archivo.txt");

        try {
            // Leer todo el contenido del archivo como un array de bytes
            byte[] bytes = Files.readAllBytes(path);
            System.out.println("Contenido del archivo (como bytes):");
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}