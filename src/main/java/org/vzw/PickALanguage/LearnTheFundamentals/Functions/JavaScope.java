package org.vzw.PickALanguage.LearnTheFundamentals.Functions;

/**
 * <h1>Java Scope</h1>
 * En Java, las variables sólo son accesibles dentro de la región en la que se crean. Esto se denomina scope.
 */
public class JavaScope {
    /**
     * <h2>Method Scope</h2>
     * Las variables declaradas directamente dentro de un método están disponibles en cualquier
     * parte del método después de la línea de código en la que se declararon:
     */
    static void miMetod() {
        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
    }

    /**
     * <h2>Block Scope</h2>
     * Un bloque de código se refiere a todo el código entre llaves {}.
     * Las variables declaradas dentro de bloques de código sólo son
     * accesibles por el código entre llaves, que sigue a la línea en la que se declaró la variable:
     */
    public static void main(String[] args) {

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x

    }
    /**
     * Un bloque de código puede existir por sí solo o pertenecer a una sentencia if,
     * while o for. En el caso de las sentencias for, las variables declaradas en la
     * propia sentencia también están disponibles dentro del ámbito del bloque.
     */
}
