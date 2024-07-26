package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.io.*;

/**
 * <h1>Si el método de la superclase declara una excepción</h1>
 * <h2>Regla 1: Si el método de la superclase declara una excepción,
 * el método sobrescrito de la subclase puede declarar la misma excepción
 * de la subclase o ninguna excepción, pero no puede declarar la excepción padre.</h2>
 *
 * > Ejemplo de caso en que el método anulado de una subclase declare la misma excepción
 */
class Parent3{
    void msg3() throws Exception {
        System.out.println("parent method");
    }
}

public class TestExceptionChild3 extends Parent3 {
    void msg3()throws Exception {
        System.out.println("child method");
    }

    public static void main(String args[]){
        Parent3 p = new TestExceptionChild3();

        try {
            p.msg3();
        }
        catch(Exception e) {}
    }
}
