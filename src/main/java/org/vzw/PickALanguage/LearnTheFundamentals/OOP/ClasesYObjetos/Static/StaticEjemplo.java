package org.vzw.PickALanguage.LearnTheFundamentals.OOP.ClasesYObjetos.Static;

public class StaticEjemplo {
    public static void main(String[] args) {
        // Llamar al método estático antes de crear cualquier objeto
        Contador.mostrarConteoTotal(); // Salida: Bloque estático ejecutado. Inicialización de variables estáticas. Conteo total (desde método estático): 100

        // Crear un primer objeto de la clase Contador
        Contador obj1 = new Contador(); // Salida: Constructor llamado. Conteo total: 101

        // Crear un segundo objeto de la clase Contador
        Contador obj2 = new Contador(); // Salida: Constructor llamado. Conteo total: 102

        // Usar el método de instancia para incrementar el conteo del objeto
        obj1.incrementarConteoObjeto();
        obj1.mostrarConteoObjeto(); // Salida: Conteo del objeto actual: 1

        // Usar el método estático de nuevo para mostrar el conteo total
        Contador.mostrarConteoTotal(); // Salida: Conteo total (desde método estático): 102
    }
}

class Contador {
    // Variable estática (object)
    static int conteoTotal = 0;

    // Variable de instancia
    int conteoObjeto;

    // Bloque estático
    static {
        System.out.println("Bloque estático ejecutado. Inicialización de variables estáticas.");
        conteoTotal = 100; // Inicializa la variable estática al valor 100
    }

    // Constructor
    public Contador() {
        conteoObjeto = 0;
        conteoTotal++; // Incrementa la variable estática cada vez que se crea un nuevo objeto
        System.out.println("Constructor llamado. Conteo total: " + conteoTotal);
    }

    // Método estático
    public static void mostrarConteoTotal() {
        System.out.println("Conteo total (desde método estático): " + conteoTotal);
    }

    // Método de instancia
    public void incrementarConteoObjeto() {
        conteoObjeto++;
    }

    public void mostrarConteoObjeto() {
        System.out.println("Conteo del objeto actual: " + conteoObjeto);
    }
}