package org.vzw.PickALanguage.LearnTheFundamentals.Loops;

/**
 * <h1>Java Simple for Loop</h1>
 */
public class ForLoop {
    public static void main(String[] args) {
        /**
         * 1. Inicialización: Es la condición inicial que se ejecuta una vez al iniciar el bucle.
         *    Aquí, podemos inicializar la variable, o podemos utilizar una variable ya inicializada.
         *    Es una condición opcional.
         * 2. Condición: Es la segunda condición que se ejecuta cada vez para probar la condición del bucle.
         *    Continúa la ejecución hasta que la condición es falsa. Debe devolver el valor booleano verdadero
         *    o falso. Es una condición opcional.
         * 3. Incremento/Decremento: Incrementa o decrementa el valor de la variable. Es una condición opcional.
         * 4. Sentencia: La sentencia del bucle se ejecuta cada vez hasta que la segunda condición es falsa.
         *
         *          for(inicializacion; condicion; incremento/decremento){
         *              //Codigo a ejecutar
         *          }
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        /**
         * <h2>Java Nested for Loop</h2>
         * Si tenemos un bucle for dentro de otro bucle, se conoce como bucle for anidado.
         * El bucle interno se ejecuta completamente cada vez que se ejecuta el bucle externo.
         */
        //loop i
        for(int i=1;i<=3;i++){
            //loop j
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }//fin loop j
        }//fin loop i


        /**
         * <h2>For Each Loop</h2>
         * El bucle for-each se utiliza para recorrer matrices o colecciones en Java.
         * Es más fácil de usar que el simple bucle for porque no necesitamos incrementar el
         * valor y utilizar la notación de subíndice.
         *
         * Funciona en base a elementos y no al índice. Devuelve elemento por elemento en la variable definida.
         *
         *              for(data_type variable : array_name){
         *                  //Codigo a ejecutar
         *              }
         */
        //Array
        int arr[]={12,23,44,56,78};

        //Imprimir el array por medio de for each
        for(int i:arr){
            System.out.println(i);
        }


        /**
         * <h2>Labeled For Loop</h2>
         * Podemos tener un nombre de cada bucle for de Java. Para ello, utilizamos la etiqueta
         * antes del bucle for. Es útil al utilizar el bucle for anidado ya que podemos romper/continuar
         * el bucle for específico.
         *
         *              labelname:
         *              for(inicializacion; condicion; incremento/decremento){
         *                  //Codigo a ejecutar
         *              }
         */
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }


        /**
         * <h2>Infinitive for Loop</h2>
         * Si utiliza dos puntos y coma ;; en el bucle for, será un bucle for infinitivo.
         *
         *                  for(;;){
         *                      //Codigo a ejecutar
         *                  }
         */
        //Using no condition in for loop
        for(;;){
            System.out.println("infinitive loop");
        }

    }
}
