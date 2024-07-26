package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.TestCustomException1;
import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.TestCustomException2;

/**
 * <title>Java Custom Exception</title>
 */
public class CustomExceptions {
    public static void main(String[] args) {
        /** Ejemplo 1:
         * Veamos un ejemplo sencillo de excepción personalizada Java.
         * En el siguiente código, el constructor de InvalidAgeException toma una cadena como argumento.
         * Esta cadena se pasa al constructor de la clase padre Exception usando el método super().
         * También el constructor de la clase Exception puede ser llamado sin usar un parámetro y
         * llamar al método super() no es obligatorio.
         */
        TestCustomException1 test = new TestCustomException1();
        TestCustomException1.main();

        /** Ejemplo 2: */
        TestCustomException2 test2 = new TestCustomException2();
        TestCustomException2.main();
    }
}
