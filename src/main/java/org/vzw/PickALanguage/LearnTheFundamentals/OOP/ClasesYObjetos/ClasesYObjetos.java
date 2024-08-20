package org.vzw.PickALanguage.LearnTheFundamentals.OOP.ClasesYObjetos;

import java.io.*;

// Clase externa
public class ClasesYObjetos {
    // Variable de instancia
    int valor;

    // Bloque estático
    static {
        System.out.println("Bloque estático ejecutado.");
    }

    // Constructor por defecto
    public ClasesYObjetos() {
        this.valor = 0;
        System.out.println("Constructor por defecto llamado.");
    }

    // Constructor parametrizado
    public ClasesYObjetos(int valor) {
        this.valor = valor;
        System.out.println("Constructor parametrizado llamado.");
    }

    // Método de instancia
    public void mostrarValor() {
        System.out.println("Valor: " + valor);
    }

    // Método estático
    public static void mensajeEstático() {
        System.out.println("Método estático llamado.");
    }

    // Método de instancia
    public void inicializarPorMetodo() {
        valor = 10;
        System.out.println("Inicialización por método.");
    }

    // Método factory
    public static ClasesYObjetos crearEjemplo(int valor) {
        return new ClasesYObjetos(valor);
    }

    // Clase anidada
    class ClaseAnidada {
        public void mostrarDesdeAnidada() {
            System.out.println("Desde la clase anidada. Valor: " + valor);
        }
    }

    // Clase anidada estática
    static class ClaseAnidadaEstatica {
        public void mostrarDesdeAnidadaEstatica() {
            System.out.println("Desde la clase anidada estática.");
        }
    }

    // Método principal
    public static void main(String[] args) {
        // 1. Creación de objetos usando el operador new
        ClasesYObjetos obj1 = new ClasesYObjetos(); // Usando constructor por defecto
        ClasesYObjetos obj2 = new ClasesYObjetos(20); // Usando constructor parametrizado

        // 2. Inicialización por método
        obj1.inicializarPorMetodo();
        obj1.mostrarValor(); // Salida: Valor: 10

        // 3. Creación de un objeto usando método factory
        ClasesYObjetos obj3 = ClasesYObjetos.crearEjemplo(30);
        obj3.mostrarValor(); // Salida: Valor: 30

        // 4. Creación de un objeto anónimo usando interfaz
        Imprimible imp = new Imprimible() {
            @Override
            public void imprimir() {
                System.out.println("Impresión desde objeto anónimo.");
            }
        };
        imp.imprimir(); // Salida: Impresión desde objeto anónimo.

        // 5. Creación de varios objetos en una sola declaración
        ClasesYObjetos obj4 = new ClasesYObjetos(40), obj5 = new ClasesYObjetos(50);

        // 6. Uso de newInstance (reflejo) - Nota: puede lanzar excepción
        try {
            ClasesYObjetos obj6 = ClasesYObjetos.class.getDeclaredConstructor().newInstance();
            obj6.mostrarValor(); // Salida: Valor: 0
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 7. Uso de método clone - Nota: necesita implementación de Cloneable
        try {
            ClasesYObjetos obj7 = new ClasesYObjetos(60);
            ClasesYObjetos obj8 = (ClasesYObjetos) obj7.clone();
            obj8.mostrarValor(); // Salida: Valor: 60
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // 8. Uso de deserialización - Nota: requiere serialización de clase
        try {
            // Serializar
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.ser"));
            oos.writeObject(new ClasesYObjetos(70));
            oos.close();

            // Deserializar
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.ser"));
            ClasesYObjetos obj9 = (ClasesYObjetos) ois.readObject();
            ois.close();
            obj9.mostrarValor(); // Salida: Valor: 70
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 9. Uso de método factory (repetido aquí para ilustrar)
        ClasesYObjetos obj10 = ClasesYObjetos.crearEjemplo(80);
        obj10.mostrarValor(); // Salida: Valor: 80

        // 10. Uso de clase anidada
        ClasesYObjetos.ClaseAnidada anidada = obj1.new ClaseAnidada();
        anidada.mostrarDesdeAnidada(); // Salida: Desde la clase anidada. Valor: 10

        // 11. Uso de clase anidada estática
        ClasesYObjetos.ClaseAnidadaEstatica anidadaEstatica = new ClasesYObjetos.ClaseAnidadaEstatica();
        anidadaEstatica.mostrarDesdeAnidadaEstatica(); // Salida: Desde la clase anidada estática.
    }
}
