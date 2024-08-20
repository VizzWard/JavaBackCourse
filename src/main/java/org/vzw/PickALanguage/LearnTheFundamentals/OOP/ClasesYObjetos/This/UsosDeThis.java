package org.vzw.PickALanguage.LearnTheFundamentals.OOP.ClasesYObjetos.This;

/** 1. Para referirse a la variable de instancia de la clase actual */
class Clase1 {
    private int numero;

    public Clase1(int numero) {
        this.numero = numero;
        // Aquí `this.numero` se refiere a la variable de instancia,
        // mientras que `numero` es el parámetro del constructor.
    }

    public int getNumero() {
        return this.numero;
        // `this.numero` se refiere a la variable de instancia.
    }
}

/** 2. Para invocar el método actual de la clase */
class Clase2 {
    public void metodoA() {
        System.out.println("Método A");
    }

    public void metodoB() {
        this.metodoA(); // Invoca el método actual `metodoA` usando `this`.
    }
}

/** 3. Para invocar el constructor de la clase actual */
class Clase3 {
    private int x;
    private int y;

    public Clase3(int x) {
        this(x, 0); // Invoca el otro constructor con `this`.
    }

    public Clase3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/** 4. Para pasarlo como argumento en el método */
class Clase4 {
    public void metodo(Clase4 obj) {
        System.out.println("Método llamado con: " + obj);
    }

    public void invocarMetodo() {
        this.metodo(this); // Pasa la instancia actual como argumento.
    }
}

/** 5. Para pasar como argumento en la llamada al constructor */
class Clase5 {
    public Clase5(Clase6 obj) {
        obj.metodo(this); // Pasa la instancia actual al constructor de otra clase.
    }
}

class Clase6 {
    public void metodo(Clase5 obj) {
        System.out.println("Instancia de Clase5 pasada: " + obj);
    }
}

/** 6. Puede utilizarse para devolver la instancia de clase actual */
class Clase7 {
    public Clase7 obtenerInstancia() {
        return this; // Devuelve la instancia actual de la clase.
    }
}