package org.vzw.PickALanguage.LearnTheFundamentals.Functions;

/** <h1>Java Method Overloading</h1> */
public class JavaMethodOverloading {
    /**
     * <h2>Sobrecarga de métodos</h2>
     * Con la sobrecarga de métodos, varios métodos pueden tener el mismo nombre con diferentes parámetros:
     *
     * Considere el siguiente ejemplo, que tiene dos métodos que suman números de diferente tipo:
     */
    static int metodoSumaInt(int x, int y) {
        return x + y;
    }
    static double metodoSumaDouble(double x, double y) {
        return x + y;
    }

    /**
     * En lugar de definir dos métodos que deberían hacer lo mismo, es mejor sobrecargar uno.
     * En el siguiente ejemplo, sobrecargamos el método metodoSuma para que funcione tanto para int como para double:
     */
    static int metodoSuma(int x, int y) {
        return x + y;
    }
    static double metodoSuma(double x, double y) {
        return x + y;
    }

    /**Nota: Varios métodos pueden tener el mismo nombre siempre que el número y/o tipo de parámetros sean diferentes.*/

    public static void main(String[] args) {
        //Sin Sobrecarga
        int myNum1 = metodoSumaInt(8, 5);
        double myNum2 = metodoSumaDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        //Con Sobrecarga
        myNum1 = metodoSuma(8, 5);
        myNum2 = metodoSuma(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
