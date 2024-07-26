package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

/**
 * <title>Diferencia entre throw y throws en Java</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */
public class FinalOrFinallyOrFinalize {
    public static void main(String args[]){
        Final();
        Finally();
        Finalize();
    }

    /** Final */
    //declaración de variable final
    final int age = 18;

    void display() {
        // reasignación del valor a la variable edad
        //age = 55;
        // da error en tiempo de compilación
    }

    static void Final(){
        FinalOrFinallyOrFinalize obj = new FinalOrFinallyOrFinalize();
        // da error en tiempo de compilación
        obj.display();
    }

    /** Finally */
    static void Finally(){
        try {
            System.out.println("Inside try block");
            //lanza una excepción de división por cero
            int data=25/0;
            System.out.println(data);
        }
        // gestiona la excepción aritmética / de división por cero
        catch (ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }
        // se ejecuta independientemente de que se haya producido o no una excepción
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }

    /** Finalize */
    static void Finalize() {
        FinalOrFinallyOrFinalize obj = new FinalOrFinallyOrFinalize();
        // printing the hashcode
        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;
        // llamar al recolector de basura mediante gc()
        System.gc();
        System.out.println("End of the garbage collection");
    }

    // defining the finalize method
    protected void finalize() {
        System.out.println("Called the finalize() method");
    }
}
