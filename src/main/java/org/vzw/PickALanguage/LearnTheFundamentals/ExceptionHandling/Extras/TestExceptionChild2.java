package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.io.*;

/**
 * <h1>Si el método de la superclase declara una excepción</h1>
 * <h2>Regla 1: Si el método de la superclase declara una excepción,
 * el método sobrescrito de la subclase puede declarar la misma excepción
 * de la subclase o ninguna excepción, pero no puede declarar la excepción padre.</h2>
 *
 * > Ejemplo de caso en que un método anulado de una subclase declare una excepción padre
 */
class Parent2{
    void msg2()throws ArithmeticException {
        System.out.println("parent method");
    }
}

public class TestExceptionChild2 extends Parent2{
    void msg2()/*throws Exception*/ {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        Parent2 p = new TestExceptionChild2();

        try {
            p.msg2();
        }
        catch (Exception e){}

    }
}
