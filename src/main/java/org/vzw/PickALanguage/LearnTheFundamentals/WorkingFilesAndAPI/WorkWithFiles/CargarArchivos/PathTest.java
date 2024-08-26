package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.CargarArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class PathTest {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\CargarArchivos\\directorio\\test.txt");
        System.out.println("Ruta absoluta: " + path.toAbsolutePath());


        //comprobar si el fichero existe
        boolean exist = Files.exists(path);
        System.out.println(exist);

        //ver la ultima vez que se modifico el archivo
        FileTime lastModifiedTime = Files.getLastModifiedTime(path);
        System.out.println("Modificado por ultima vez:" + lastModifiedTime);

        //Comparar dos archivos -> Devuelve posicion de discrepancia, si no, devuelve -1.
        long mismatchIndex = Files.mismatch(path, Paths.get("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\CargarArchivos\\directorio\\test2.txt"));
        System.out.println("mismatch = " + mismatchIndex);

        //Comprobar Autor del archivo
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner = " + owner);

        //Crear archivo temporal en la carpeta temp del sistema
        //Path tempFile1 = Files.createTempFile("somePrefixOrNull", ".jpg");
        //System.out.println("tempFile1 = " + tempFile1);

        //Crear archivo temporal en la carpeta del proyecto
        Path tempFile2 = Files.createTempFile(path.getParent(), "somePrefixOrNull", ".jpg");
        System.out.println("tempFile2 = " + tempFile2);

        //Crear archivo temporal en la carpeta temp del sistema
        //Path tmpDirectory = Files.createTempDirectory("prefix");
        //System.out.println("tmpDirectory = " + tmpDirectory);

        //Crear Carpeta
        Path newDirectory = Files.createDirectories(path.getParent().resolve("directorio2"));
        System.out.println("newDirectory = " + newDirectory);

        try {
            //Crear Archivo
            Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
            System.out.println("newFile = " + newFile);
        } catch (Exception e) {
            System.out.println("Archivo o Directorio ya creado");
        }
    }
}
