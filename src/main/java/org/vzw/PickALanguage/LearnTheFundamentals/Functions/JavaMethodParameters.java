package org.vzw.PickALanguage.LearnTheFundamentals.Functions;

/** <h1>Parametros de un metodo</h1> */
public class JavaMethodParameters {
    /**
     * <h2>Parametros y argumentos</h2>
     * Se puede pasar información a los métodos como parámetro.
     * Los parámetros actúan como variables dentro del método.
     * Los parámetros se especifican después del nombre del método, dentro de los paréntesis.
     * Puede añadir tantos parámetros como desee, sólo tiene que separarlos con una coma.
     */

    static void miMetodo(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    /** <h2>Multiples Parametros</h2> */
    static void miSegundoMetodo(String nombre, int edad) {
        System.out.println(nombre + " tiene " + edad);
    }

    /** <h2>Uso de Condicionales en los metodos</h2> */
    static void revizarEdad(int edad) {
        if (edad < 18) {
            System.out.println("Acceso Denegado!");
        } else {
            System.out.println("Acceso Concedido!");
        }
    }

    /**
     * <h2>Retorno de valores</h2>
     * Si desea que el método devuelva un valor, puede utilizar un tipo de datos primitivo, en lugar de void,
     * y utilizar la palabra clave return dentro del método:
     */
    static int myMethod(int x, int y) {
        return x + y;
    }


    //Llamada a los metodos
    public static void main(String[] args) {
        miMetodo("vicente");
        miSegundoMetodo("Vicente", 22);
        revizarEdad(18);
        System.out.println(myMethod(5, 3));

        //También se puede almacenar el resultado en una variable
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
