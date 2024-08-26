package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.FileClass;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {

        File f=new File("C:\\Users\\thega\\OneDrive\\Imágenes\\Capturas de pantalla");
        String filenames[]=f.list();

        for(String filename:filenames){
            System.out.println(filename);
        }
    }
}