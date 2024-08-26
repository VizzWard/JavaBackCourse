package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.WorkWithFiles.AbsoluteRelativeCanonicalFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsoluteRelativeCanonicalFiles {
    public static void main(String[] args) {

        //Es una ruta relativa por se enruta desde el proyecto
        Path rutaRelativa = Paths.get("src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\AbsoluteRelativeCanonicalFiles\\relativo\\");
        System.out.println("rutaRelativa.isAbsolute() = " + rutaRelativa.isAbsolute());

        //Esta es una ruta absoluta por que se enruta desde el sistema
        Path rutaAbsoluta = rutaRelativa.toAbsolutePath(); //Obtener la ruta desde el sistema
        System.out.println("rutaAbsoluta = " + rutaAbsoluta);
        System.out.println("rutaAbsoluta.isAbsolute() = " + rutaAbsoluta.isAbsolute());

        //Ruta Normalizada
        Path rutaNormalizada = rutaRelativa.normalize().toAbsolutePath();
        System.out.println("rutaNormalizada = " + rutaNormalizada);
        System.out.println("rutaNormalizada.isAbsolute() = " + rutaNormalizada.isAbsolute());

        //Volver una ruta absoluta a relativa
        Path absoluto = Paths.get("C:\\Users\\thega\\SyncSistem\\OneDrive\\IdeaProjects\\JavaBackCourse\\src\\main\\java\\org\\vzw\\PickALanguage\\LearnTheFundamentals\\WorkingFilesAndAPI\\WorkWithFiles\\AbsoluteRelativeCanonicalFiles\\relativo\\");
        Path relativizedPath = Paths.get("C:\\Users\\thega\\SyncSistem\\OneDrive\\IdeaProjects\\JavaBackCourse\\").relativize(rutaAbsoluta);
        System.out.println("relativizedPath = " + relativizedPath);
    }
}
