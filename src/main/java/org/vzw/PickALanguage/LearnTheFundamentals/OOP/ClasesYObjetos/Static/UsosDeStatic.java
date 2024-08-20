package org.vzw.PickALanguage.LearnTheFundamentals.OOP.ClasesYObjetos.Static;

/** 1. Variable static */

class ClaseStatic1 {
    // Variable estática, compartida por todas las instancias de la clase.
    static int contador = 0;

    public ClaseStatic1() {
        contador++; // Cada vez que se crea una instancia, se incrementa el contador.
    }

    public int getContador() {
        return contador; // Retorna el valor del contador.
    }

    public static void main(String[] args) {
        ClaseStatic1 obj1 = new ClaseStatic1();
        ClaseStatic1 obj2 = new ClaseStatic1();
        ClaseStatic1 obj3 = new ClaseStatic1();

        System.out.println(ClaseStatic1.contador); // Salida: 3
    }
}

/*
 * Sin el modificador `static`, cada instancia de la clase tendría su propio
 * `contador` independiente, por lo que el valor del contador no se compartiría
 * entre diferentes instancias de la clase.
 */


/** 2. Método static */

class ClaseStatic2 {
    static void metodoEstatico() {
        System.out.println("Método estático llamado.");
    }

    public static void main(String[] args) {
        ClaseStatic2.metodoEstatico(); // Llamada directa al método estático sin crear una instancia.
    }
}

/*
 * Si el método no fuera `static`, necesitarías crear una instancia de `ClaseStatic2`
 * para poder llamar al método. Los métodos `static` pueden ser llamados sin una instancia.
 */


/** 3. Bloque static */

class ClaseStatic3 {
    static int valor;

    // Bloque estático para inicialización
    static {
        valor = 10;
        System.out.println("Bloque estático ejecutado.");
    }

    public static void main(String[] args) {
        System.out.println("Valor: " + ClaseStatic3.valor); // Salida: Valor: 10
    }
}

/*
 * Un bloque `static` se ejecuta una sola vez cuando la clase es cargada en memoria,
 * antes de la creación de cualquier instancia. Sin el bloque `static`, la inicialización
 * debería realizarse en un constructor o en una variable estática directamente.
 */


/** 4. Clase anidada static */

class ClaseStatic4 {
    static class ClaseAnidadaEstatic {
        void mostrarMensaje() {
            System.out.println("Clase anidada estática llamada.");
        }
    }

    public static void main(String[] args) {
        ClaseStatic4.ClaseAnidadaEstatic anidada = new ClaseStatic4.ClaseAnidadaEstatic();
        anidada.mostrarMensaje();
    }
}

/*
 * Una clase anidada `static` puede ser instanciada sin necesidad de una instancia de la clase externa.
 * Sin `static`, la clase anidada sería una clase interna, y necesitarías una instancia de `ClaseStatic4`
 * para crear una instancia de `ClaseAnidadaEstatic`.
 */
