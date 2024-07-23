package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

/**
 * <title>Java Exception Propagation</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */
public class ExceptionPropagation {
    /**
     * <h1>Ejemplo de propagación</h1>
     */
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        } catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }

    /**
     * En el ejemplo anterior la excepción ocurre en el método m() donde no se maneja,
     * por lo que se propaga al método anterior n() donde no se maneja, de nuevo se
     * propaga al método p() donde se maneja la excepción.
     *
     * La excepción puede ser manejada en cualquier método de la pila de llamadas ya
     * sea en el método main(), método p(), método n() o método m().
     *
     * Nota: Por defecto, las Excepciones Comprobadas no se reenvían en la cadena de llamada (se propagan).
     */
}
