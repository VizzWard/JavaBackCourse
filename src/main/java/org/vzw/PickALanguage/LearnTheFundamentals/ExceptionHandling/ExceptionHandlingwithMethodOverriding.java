package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.TestExceptionChild;
import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.TestExceptionChild1;
import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.TestExceptionChild2;
import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.TestExceptionChild3;
import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.TestExceptionChild4;
import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras.TestExceptionChild5;


import java.io.*;

/**
 * <title>Manejo de excepciones con sustitución de métodos en Java</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */


public class ExceptionHandlingwithMethodOverriding{
    /**
     * <h1>Si el método de la superclase no declara una excepción</h1>
     */

    //Regla 1
    TestExceptionChild testExceptionChild = new TestExceptionChild();

    //Regla 2
    TestExceptionChild1 testExceptionChild1 = new TestExceptionChild1();

    /**
     * <h1>Si el método de la superclase declara una excepción</h1>
     */

    //Regla 1
            //Ejemplo en caso de que un método anulado de una subclase declare una excepción padre
    TestExceptionChild2 testExceptionChild2 = new TestExceptionChild2();

            //Ejemplo en caso de que el método anulado de una subclase declare la misma excepción
    TestExceptionChild3 testExceptionChild3 = new TestExceptionChild3();

            //Ejemplo en caso de que un método sobrescrito de una subclase declare una excepción de subclase
    TestExceptionChild4 testExceptionChild4 = new TestExceptionChild4();

            //Ejemplo en caso de que el método anulado de la subclase no declare ninguna excepción
    TestExceptionChild5 testExceptionChild5 = new TestExceptionChild5();
}
