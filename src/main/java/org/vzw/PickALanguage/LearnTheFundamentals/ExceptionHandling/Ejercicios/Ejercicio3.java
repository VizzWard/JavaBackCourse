package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;

import java.io.*;

/**
 * Ejercicio 3:
 * Crea un programa que lea un archivo y procese su contenido.
 * El programa debe manejar excepciones relacionadas con la lectura
 * de archivos y la conversión de datos.
 *
 * Instrucciones:
 * Implementa un bloque try anidado para manejar tanto FileNotFoundException
 * como IOException, y asegura que el lector de archivos se cierre correctamente
 * en el bloque finally.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String fileName = "data.txt";
        processFile(fileName);
    }

    public static void processFile(String fileName) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                System.out.println("Number: " + number);
            }
        } catch (FileNotFoundException e) {
            // Maneja la excepción de archivo no encontrado
            System.out.println("File not found");
        } catch (IOException e) {
            // Maneja la excepción de E/S
            System.out.println("I/O Error");
        } finally {
            // Cierra el lector
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
