package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.io.*;

/**
 * <h1>Si el método de la superclase no declara una excepción</h1>
 * <h2>Regla 1: Si el método de la superclase no declara una excepción,
 * el método sobrescrito de la subclase no puede declarar la excepción comprobada.</h2>
 */

class Parent{

    // definir el método
    void msg() {
        System.out.println("parent method");
    }
}

public class TestExceptionChild extends Parent{

    // sobrescribir el método en la clase hijo, da error en tiempo de compilación
    void msg() /*throws IOException*/ {
        System.out.println("TestExceptionChild");
    }

    public static void main(String args[]) {
        Parent p = new TestExceptionChild();
        p.msg();
    }
}
