package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;

import java.io.*;

/**
 * Ejercicio 7:
 * Crea un programa que lea datos de un archivo y maneje la excepción
 * usando la palabra clave throws en la declaración del método.
 *
 * Instrucciones:
 * Usa la palabra clave throws para manejar FileNotFoundException y
 * IOException en la declaración del método readFile.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try {
            readFile(fileName);
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }

    }

    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("Line: " + line);
        }
    }
}
