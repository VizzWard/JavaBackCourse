package org.vzw.PickALanguage.LearnTheFundamentals.OOP.ClasesYObjetos.Constructor;

public class ConstructorEjemplo {
    public static void main(String[] args) {
        // Llamar al constructor por defecto
        Rectangulo rect1 = new Rectangulo();
        rect1.mostrarDimensiones();  // Salida: Ancho: 0, Alto: 0

        // Llamar al constructor parametrizado
        Rectangulo rect2 = new Rectangulo(5, 10);
        rect2.mostrarDimensiones();  // Salida: Ancho: 5, Alto: 10

        // Llamar al constructor parametrizado con un parámetro (cuadrado)
        Rectangulo rect3 = new Rectangulo(7);
        rect3.mostrarDimensiones();  // Salida: Ancho: 7, Alto: 7

        // Llamar al constructor de copia
        Rectangulo rect4 = new Rectangulo(rect2);
        rect4.mostrarDimensiones();  // Salida: Ancho: 5, Alto: 10
    }
}

class Rectangulo {
    int ancho;
    int alto;

    // Constructor por defecto
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
        System.out.println("Constructor por defecto llamado.");
    }

    // Constructor parametrizado
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        System.out.println("Constructor parametrizado llamado.");
    }

    // Constructor parametrizado con un parámetro (cuadrado)
    public Rectangulo(int lado) {
        this.ancho = lado;
        this.alto = lado;
        System.out.println("Constructor con un parámetro llamado (cuadrado).");
    }

    // Constructor de copia
    public Rectangulo(Rectangulo otro) {
        this.ancho = otro.ancho;
        this.alto = otro.alto;
        System.out.println("Constructor de copia llamado.");
    }

    // Método para mostrar las dimensiones del rectángulo
    public void mostrarDimensiones() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }
}