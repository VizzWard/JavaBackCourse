package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.io.*;

/**
 * <h1>Si el método de la superclase no declara una excepción</h1>
 * <h2>Regla 2: Si el método de la superclase no declara una excepción, el método
 *  * sobrescrito de la subclase no puede declarar la excepción comprobada, pero puede
 *  * declarar la excepción no comprobada.</h2>
 */

class Parent1{
    void msg1() {
        System.out.println("parent method");
    }
}

public class TestExceptionChild1 extends Parent1{
    void msg1()throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        Parent1 p = new TestExceptionChild1();
        p.msg1();
    }
}
