package org.vzw.PickALanguage.LearnTheFundamentals.WorkingFilesAndAPI.FileClass;

import java.io.*;

public class FileExample2 {
    public static void main(String[] args) {
        File dir=new File("C:\\Users\\thega\\OneDrive\\Imágenes\\Capturas de pantalla");
        File files[]=dir.listFiles();
        for(File file:files){
            System.out.println(file.getName() + " Can Write: " + file.canWrite() + " Is Hidden: " + file.isHidden() + " Length: " + file.length() + " bytes");
        }
    }
}