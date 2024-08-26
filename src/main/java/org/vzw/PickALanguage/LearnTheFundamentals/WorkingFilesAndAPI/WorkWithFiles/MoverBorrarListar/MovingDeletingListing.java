package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.MoverBorrarListar;

import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class MovingDeletingListing {
    public static void main(String[] args) {

        /** Mover Ficheros */

        Path path = Path.of("C:\\Users\\thega\\OneDrive\\Escritorio\\packages\\archivo.txt");

        //comprobar si el fichero existe
        boolean exist = Files.exists(path);
        System.out.println(exist);

        //Mover archivos
        try {
            //Files.move(path, Path.of("C:\\Users\\thega\\OneDrive\\Escritorio\\packages\\org\\"));  // Esto no funciona!

            Files.move(path, Path.of("C:\\Users\\thega\\OneDrive\\Escritorio\\packages\\org\\archivo.txt"));  // Esto funciona!

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /** Borrar Ficheros */

        //Borrar un directorio vacio
        Path borrado = Path.of("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\MoverBorrarListar\\directorio");
        try {
            Files.delete(borrado);
        } catch (DirectoryNotEmptyException e) {
            System.out.println("El directoio no esta vacio");
        } catch (IOException e) {
            System.out.println("El directoio no existe");
        }

        //Borrar un directorio no vacio
        /*
        try (Stream<Path> walk = Files.walk(borrado)) {
            walk.sorted(Comparator.reverseOrder()).forEach(path2 -> {
                try {
                    Files.delete(path2);
                } catch (IOException e) {
                    // something could not be deleted..
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            System.out.println("El directoio no existe");
        } */

        /** Listar Ficheros */

        //Listar Ficheros. Metodo 1:
        System.out.println();
        try (Stream<Path> files = Files.list(borrado)) {
            // Imprimir la ruta de los archivos:
            //files.forEach(System.out::println);

            // Imprimir solo el nombre del archivo
            files.map(Path::getFileName).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Listar Ficheros. Metodo 2: (Filtrar por tipo de archivo)
        System.out.println();
        try (DirectoryStream<Path> files = Files.newDirectoryStream(borrado, "*.txt")) {
            files.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Listar recursivamente
        System.out.println();
        try (Stream<Path> files = Files.walk(borrado)) {
            // Imprimir la ruta de los archivos:
            //files.forEach(System.out::println);

            // Imprimir solo el nombre y si estan dentro de una carpeta, especificar en cual:
            files
                    .map(path3 -> borrado.relativize(path3))  // Obtener la ruta relativa desde el directorio base
                    .forEach(System.out::println);            // Imprimir la ruta relativa
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
