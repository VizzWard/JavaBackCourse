package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.io.*;

/**
 * <h1>Si el método de la superclase declara una excepción</h1>
 * <h2>Regla 1: Si el método de la superclase declara una excepción,
 * el método sobrescrito de la subclase puede declarar la misma excepción
 * de la subclase o ninguna excepción, pero no puede declarar la excepción padre.</h2>
 *
 * > Ejemplo de caso en que un método sobrescrito de una subclase declare una excepción de subclase
 */
class Parent4{
    void msg4()throws Exception {
        System.out.println("parent method");
    }
}

public class TestExceptionChild4 extends Parent4{
    void msg4()throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String args[]){
        Parent4 p = new TestExceptionChild4();

        try {
            p.msg4();
        }
        catch(Exception e) {}
    }
}
