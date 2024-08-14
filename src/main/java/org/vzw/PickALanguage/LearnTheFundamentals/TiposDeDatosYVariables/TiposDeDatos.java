package org.vzw.PickALanguage.LearnTheFundamentals.TiposDeDatosYVariables;

/**
 * Java es de tipado estático, lo que significa que todas las variables deben declararse antes de poder utilizarse.
 * Esto implica declarar el tipo y el nombre de la variable.
 * Ej: int gear = 1;
 *
 * El tipo de datos de una variable determina los valores que puede contener, así como las operaciones que pueden
 * realizarse con ella.
 *
 *  Hay 7 tipos de datos primitivos: byte, short, int, long, float, double, boolean y char.
 *
 */

public class TiposDeDatos {
    public static void main(String[] args) {

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 100000.0f;  /** Los valores flotantes llevan una f al final del valor */
        double d = 100000.0d; /** Al igual que el double y long */
        boolean result = true;
        char capitalC = 'C';

        /**
         *  Tambien se pueden separar digitos de un mismo valor usando ' _ '
         *  Esto para facilitar la lectura de los datos
         */
        long creditCardNumber = 4815_2345_2345_4567L;

    }
}
