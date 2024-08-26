package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.EscrituraLecturaDeArchivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Escribir {
    public static void main(String[] args)  throws IOException {
        Path path = Path.of("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\EscrituraLecturaDeArchivos\\test,txt");
        System.out.println("Ruta absoluta: " + path.toAbsolutePath());
        
        Path newDirectory = null;
        
        try {
            //Crear Carpeta
            newDirectory = Files.createDirectories(path.getParent().resolve("directorio"));
            System.out.println("newDirectory = " + newDirectory);
        } catch (Exception e) {
            System.out.println("Directorio ya creado");
        }

        try {
            //Crear Archivo
            Path newFile = Files.createFile(newDirectory.resolve("writeString.txt"));
            System.out.println("newFile = " + newFile);
        } catch (IOException e) {
            System.out.println("Archivo ya creado");
        }

        try {
            //Crear Archivo
            Path newFile = Files.createFile(newDirectory.resolve("writeBytes.txt"));
            System.out.println("newFile = " + newFile);
        } catch (IOException e) {
            System.out.println("Archivo ya creado");
        }

        //Escribir un String en el fichero writeString.txt
        Path path2 = Path.of("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\EscrituraLecturaDeArchivos\\directorio\\writeString.txt");
        Files.writeString(path2, "Primer String" + System.lineSeparator(), StandardOpenOption.APPEND); // UTF 8
        System.out.println("utfFile = " + path2.getFileName());


        //Escribir bytes en el fichero writeBytes
        Path path3 = Path.of("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\EscrituraLecturaDeArchivos\\directorio\\writeBytes.txt");
        Files.write(path3, " this is my string ää öö üü".getBytes(StandardCharsets.ISO_8859_1));
        System.out.println("anotherIso88591File = " + path3.getFileName());

        //Escritura de String
        Files.writeString(
                path2,
                "Escritura de Cadenas",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);
        System.out.println("anotherUtf8File = " + path2.getFileName());

        //Escritura de Bytes
        Files.write(
                path3,
                "Escritura de Bytes".getBytes(StandardCharsets.UTF_8) ,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);
        System.out.println("oneMoreUtf8File = " + path3.getFileName());

        //Leer Strings del archivo
        String s = Files.readString(path2);// UTF 8
        System.out.println("String = " + s);

        //Leer bytes del archivo
        byte[] bytes = Files.readAllBytes(path3);
        System.out.println("Bytes = " + bytes);


    }
}