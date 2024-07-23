package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.Testthrows2;
import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.Testthrows3;
import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.Testthrows4;

import java.io.IOException;

/**
 * <title>Java Exception Propagation</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */
public class ThrowsKeyword {
    /**
     * <h1>throws Example</h1>
     * Veamos el ejemplo de la cláusula throws de Java que describe que las excepciones
     * comprobadas pueden propagarse mediante la palabra clave throws.
     */
    void m()throws IOException{
        throw new IOException("device error");//checked exception
    }
    void n()throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]) throws IOException {
        ThrowsKeyword obj=new ThrowsKeyword();
        obj.p();
        System.out.println("normal flow...");

        /**
         * Regla: Si estamos llamando a un método que declara una excepción, debemos capturar o declarar la excepción.
         *
         * Hay dos casos:
         * 1. Caso 1: Hemos capturado la excepción, es decir, hemos manejado la excepción utilizando el bloque try/catch.
         * 2. Caso 2: Hemos declarado la excepción, es decir, hemos especificado la palabra clave throws con el método.
         */


        /**
         * Caso 1: Manejar la excepción mediante el bloque try-catch
         * En caso de que manejemos la excepción, el código se ejecutará bien tanto si la excepción se
         * produce durante el programa como si no.
         */
        Testthrows2 ejemplo2 = new Testthrows2(); //clase instanciada - ver la clase para entender el ejemplo
        Testthrows2.main();


        /**
         * Caso 2: Declarar una excepción
         * > En caso de que declaremos la excepción, si ésta no se produce, el código se ejecutará correctamente.
         * > En caso de que declaremos la excepción y la excepción ocurra, será lanzada en tiempo de ejecución
         *   porque throws no maneja la excepción.
         */

        /** A) Si no se produce la excepción */
        Testthrows3 ejemplo3 = new Testthrows3();
        Testthrows3.main();

        /** B)  Si se produce una excepción */
        Testthrows4 ejemplo4 = new Testthrows4();
        Testthrows4.main();
    }
    /**
     * Notas:
     * throws - es para declarar que un metodo puede lanzar una excepcion
     * throw - es para lanzar una excepcion
     *
     * throws - se declara despues del nombre del metodo ( main() Exception ).
     */
}
