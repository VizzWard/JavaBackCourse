package org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios;

import org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios.Extras.Calculadora;
import org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios.Extras.Productos;
import org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios.Extras.Usernames;

import java.util.Scanner;

public class EjWhileLoop {
    //Usar el metodo public para ejecutar los metodos de cada ejercicio
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();

    }

    static void ejercicio1() {
        /** <h2>While Loop</h2>
         *  Encuentra y muestra todos los números primos entre 1 y 100.
         */
        int numero = 1;

        while (numero < 101) {
            int contador = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                System.out.println("El numero " + numero + " es primo");
            }

            numero++;
        }
    }

    static void ejercicio2() {
        /** <h2>While Loop</h2>
         * Suma los dígitos de un número entero dado por el usuario
         * hasta que la suma sea un solo dígito.
         *
         * x/10 se elimina el ultimo digito de x.
         * x%10 se obtiene el ultimo digito de x.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        int resultado = 0;
        int modulo = numero;

        while (numero >= 10) {
            int suma = 0;

            while (numero > 0){
                suma += numero % 10;
                numero /= 10;
            }
            resultado = suma;
        }

        System.out.println("La suma de los dígitos  de " + modulo + " es: " + resultado);
        scanner.close();
    }

    static void ejercicio3() {
        /** <h2>While Loop</h2>
         *  Implementa un sistema de autenticación básico donde el
         *  usuario tiene 3 intentos para ingresar su usuario y contraseña correcta.
         */
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int size = Usernames.getSize();
        boolean acceso = false;

        validacion:
        while (intentos <= 3){
            System.out.print("Ingrese su nombre de usuario: ");
            String user = scanner.next();
            System.out.print("Ingrese su contraseña: ");
            String password = scanner.next();

            for (int i = 0; i < size; i++) {
                String username = Usernames.getUsername(i);
                String pass = Usernames.getPassword(i);
                if (username.equals(user) && pass.equals(password)) {
                    acceso = true;
                    break validacion;
                }
            }
            if (!acceso) {
                System.out.println("Usuario y/o contraseña incorrectos");
            }
            intentos++;
            System.out.println("");
            System.out.println("Te quedan " + (3 - intentos) + " intentos");
        }

        if (intentos == 3){
            System.out.println("Vuelve a intertar mas tarde");
        } else if (acceso) {
            System.out.println("Acceso autorizado");
        }
        scanner.close();
    }

    static void ejercicio4() {
        /** <h2>Infinitive While Loop</h2>
         * Implementa una calculadora simple que permita al usuario realizar
         * operaciones básicas hasta que elija salir.
         */
        Scanner scanner = new Scanner(System.in);

        calculadora:
        while (true){
            System.out.print("Accion a realizar: ");
            System.out.println("1. Suma ; 2. Resta ; 3. Multiplicacion ; 4. Division ; 5. Salir");
            int operacion = scanner.nextInt();

            if (operacion == 5){
                break calculadora;
            } else {
                System.out.print("Ingrese el primer valor: ");
                String input1 = scanner.next();
                System.out.print("Ingrese el segundo valor: ");
                String input2 = scanner.next();

                Object[] valores = Calculadora.convertirDatos(input1, input2);

                if (valores[0] instanceof Integer) {
                    int num1 = (Integer) valores[0];
                    int num2 = (Integer) valores[1];
                    Calculadora.ejecutarOperacion(operacion, num1, num2);
                } else if (valores[0] instanceof Float) {
                    float num1 = (Float) valores[0];
                    float num2 = (Float) valores[1];
                    Calculadora.ejecutarOperacion(operacion, num1, num2);
                } else if (valores[0] instanceof Double) {
                    double num1 = (Double) valores[0];
                    double num2 = (Double) valores[1];
                    Calculadora.ejecutarOperacion(operacion, num1, num2);
                } else {
                    System.out.println("Tipo de dato no válido.");
                }
            }
        }
        scanner.close();
    }

    static void ejercicio5() {
        /** <h2>Infinitive While Loop</h2>
         * Simula un sistema de caja registradora que acepta múltiples
         * artículos y calcula el total hasta que el usuario ingrese "fin".
         */
        Scanner scanner = new Scanner(System.in);
        int sizePRODUCTS = Productos.getSize();
        float sumaPRODUCTS = 0;

        lista:
        while (true){
            System.out.println("Que producto desea agregar?");
            for (int i = 0 ; i < sizePRODUCTS ; i++){
                System.out.print(i + "." + Productos.getProduct(i) + " ");
                if(i % 10 == 0 && i != 0){
                    System.out.println("");
                }
            }
            System.out.println(sizePRODUCTS + ".Terminar");

            int index = scanner.nextInt();
            if (index == sizePRODUCTS){
                System.out.println("Su total es de: " + sumaPRODUCTS);
                break lista;
            } else if (index > sizePRODUCTS) {
                System.out.println("Ingrese un numero de la lista");
            } else {
                sumaPRODUCTS += Float.parseFloat(Productos.getPrice(index));
                System.out.println(
                        "Agrego " +
                        Productos.getProduct(index) +
                        " - " +
                        Productos.getPrice(index) +
                        ". Total Actual:" +
                        sumaPRODUCTS)
                ;
            }
        }
        scanner.close();
    }
}

