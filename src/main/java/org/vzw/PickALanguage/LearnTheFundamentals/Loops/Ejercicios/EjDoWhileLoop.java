package org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios;

import org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios.Extras.Usernames;

import java.util.ArrayList;
import java.util.Scanner;

public class EjDoWhileLoop {
    //Usar el metodo public para ejecutar los metodos de cada ejercicio
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejercicio6();
    }

    static void ejercicio1() {
        /** <h2>Do-while Loop</h2>
         * Implementa un programa que pida al usuario ingresar un número entero
         * positivo y que calcule y muestre la serie de Fibonacci hasta ese número.
         * El programa debe continuar solicitando números hasta que el usuario ingrese
         * un número negativo para terminar.
         *
         * Nota: la sucesión de Fibonacci se trata de una serie infinita de números naturales
         * que empieza con un 0 y un 1 y continúa añadiendo números que son la suma de los dos anteriores:
         * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.......
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();
        int num1 = 0, num2 = 1, num3 = 0;
        do{

            if(num1 == 0){
                num1 += 1;
            } else {
                num3 = num1 + num2;
            }

            if(num3 <= numero) {
                System.out.print(num3 + ", ");
            }

            num1 = num2;
            num2 = num3;

        }while(num3 <= numero);
        scanner.close();
    }

    static void ejercicio2() {
        /** <h2>Do-while Loop</h2>
         * Calcula la media de una serie de números positivos introducidos por el usuario.
         * El proceso continúa hasta que el usuario ingrese un número negativo. Luego,
         * muestra la media calculada.
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        double suma = 0;
        int contador = 0;

        do {
            System.out.println("Ingrese un numero: (El programa termina cuando ingrese un valor menor a 1)");
            numero = scanner.nextInt();
            if(numero > 0){
                suma += numero;
                numeros.add(numero);
                contador++;
            }
        } while (numero > 0);

        // Convertir ArrayList a array
        int[] numerosArray = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            numerosArray[i] = numeros.get(i);
        }

        if(contador > 0){
            double media = suma / contador;
            System.out.print("Números introducidos: ");

            for (int num : numerosArray) {
                System.out.print(num + " ");
            }

            System.out.println("");
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No hay valores a sumar");
        }
        scanner.close();
    }

    static void ejercicio3() {
        /** <h2>Do-while Loop</h2>
         * Crea un programa que permita al usuario ingresar un número entero positivo y que
         * imprima la tabla de multiplicar de ese número del 1 al 10. El programa debe seguir
         * solicitando números hasta que el usuario ingrese un número negativo.
         */
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un numero: (El programa termina cuando ingrese un valor menor a 1)");
            numero = scanner.nextInt();

            if (numero > 0){
                for(int i = 1; i <= 10; i++){
                    System.out.println(numero + " * " + i + " = " + (numero * i));
                }
            }
        } while (numero > 0);
        scanner.close();
    }

    static void ejercicio4() {
        /** <h2>Infinitive do-while Loop</h2>
         * Crea un programa que genere números aleatorios entre 1 y 100, y le pida al usuario
         * que adivine el número generado. El programa debe seguir pidiendo al usuario que
         * adivine hasta que lo haga correctamente.
         */
        Scanner scanner = new Scanner(System.in);
        int numero;
        int random;

        random:
        do {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();
            random = (int) (Math.random() * 100);
            if (numero == random){
                System.out.println("Correcto, adivinaste el numero");
                break random;
            } else {
                System.out.println("Sigue intentando");
            }
        } while (true);

        scanner.close();
    }

    static void ejercicio5() {
        /** <h2>Infinitive do-while Loop</h2>
         * Implementa un programa que permita al usuario ingresar una serie de nombres hasta
         * que el usuario ingrese "salir". Luego, muestra todos los nombres ingresados.
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listName = new ArrayList<>();
        String nombre;

        nombres:
        do {
            System.out.println("Ingrese el nombre: (para cerrar el programa escriba salir)");
            nombre = scanner.next();


            if (nombre.equals("Salir") || nombre.equals("salir")){
                System.out.println("Cerrando el programa......");
                break nombres;
            } else {
                listName.add(nombre);
                System.out.print("Agregado exitosamente | ");
            }
        } while(true);

        // Convertir ArrayList a array
        String[] nombresArray = new String[listName.size()];
        for (int i = 0; i < listName.size(); i++) {
            nombresArray[i] = listName.get(i);
        }
        if (nombresArray.length > 0){
            System.out.print("Datos ingresados " + nombresArray.length + ": ");
            for (String nomb : nombresArray) {
                System.out.print(nomb + " ");
            }
        }

        scanner.close();
    }

    static void ejercicio6() {
        /** <h2>Infinitive do-while Loop</h2>
         * Crea un programa que le pida al usuario que ingrese una contraseña hasta que la
         * contraseña ingresada sea correcta. Imprime un mensaje de éxito cuando la
         * contraseña sea correcta.
         */
        Scanner scanner = new Scanner(System.in);
        int size = Usernames.getSize();
        boolean acceso = false;
        String password;

        System.out.print("Ingrese la contraseña: ");
        validacion:
        do {
            password = scanner.next();

            for (int i = 0; i < size; i++) {
                String pass = Usernames.getPassword(i);
                if (pass.equals(password)) {
                    acceso = true;
                    break validacion;
                }
            }
            System.out.print("Contraseña incorrecta, Ingrese una contraseña valida: ");
        } while (true);

        if (acceso){
            System.out.print("Acceso exitoso");
        }

    }
}
