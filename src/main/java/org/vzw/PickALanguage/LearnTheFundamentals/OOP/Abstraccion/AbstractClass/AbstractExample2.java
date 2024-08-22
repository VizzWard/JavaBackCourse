package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.AbstractClass;

/**
 * Ejemplo 2: Clase Abstracta para Definir Comportamientos de Vehículos
 *
 * En este ejemplo, se utiliza una clase abstracta para definir
 * comportamientos comunes y específicos para diferentes tipos de vehículos.
 */

// Clase abstracta Vehicle que define un método abstracto move()
abstract class Vehicle {
    abstract void move(); // Método abstracto que las subclases deben implementar

    void fuel() { // Método no abstracto
        System.out.println("Filling up with fuel");
    }
}

// Clase Car que hereda de Vehicle e implementa el método move()
class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving on the road");
    }
}

// Clase Boat que hereda de Vehicle e implementa el método move()
class Boat extends Vehicle {
    void move() {
        System.out.println("Boat is sailing on water");
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBoat = new Boat();

        myCar.move();
        myCar.fuel();

        myBoat.move();
        myBoat.fuel();
    }
}

/**
 * La clase abstracta Vehicle define un método abstracto move()
 * que las subclases Car y Boat implementan de diferentes maneras, s
 * egún el tipo de vehículo.
 *
 * El método fuel() es común y no necesita ser sobrescrito por las subclases.
 */