package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

/**
 * <h1>Si el método de la superclase declara una excepción</h1>
 * <h2>Regla 1: Si el método de la superclase declara una excepción,
 * el método sobrescrito de la subclase puede declarar la misma excepción
 * de la subclase o ninguna excepción, pero no puede declarar la excepción padre.</h2>
 *
 * > Ejemplo en caso de que el método anulado de la subclase no declare ninguna excepción
 */
class Parent5 {
    void msg5()throws Exception{
        System.out.println("parent method");
    }
}

public class TestExceptionChild5 extends Parent5{
    void msg5() {
        System.out.println("child method");
    }

    public static void main(String args[]){
        Parent5 p = new TestExceptionChild5();

        try {
            p.msg5();
        }
        catch(Exception e) {}

    }
}