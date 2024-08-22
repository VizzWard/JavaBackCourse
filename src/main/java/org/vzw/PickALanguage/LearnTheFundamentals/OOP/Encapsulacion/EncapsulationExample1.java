package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Encapsulacion;

/**
 * Ejemplo 1: Encapsulación con una Clase Person
 *
 * En este ejemplo, los atributos de la clase Person están encapsulados,
 * es decir, se declaran como privados y se accede a ellos a través de
 * métodos públicos (getters y setters).
 */

class Person {
    // Atributos privados
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos getters para acceder a los atributos
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Métodos setters para modificar los atributos
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // Validación básica
            this.age = age;
        }
    }

    // Método para mostrar la información de la persona
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class EncapsulationExample1 {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Person
        Person person = new Person("Alice", 30);

        // Acceso y modificación a través de los métodos getters y setters
        person.setName("Bob");
        person.setAge(25);

        // Mostrar la información de la persona
        person.displayInfo();
    }
}

/**
 * Los atributos name y age de la clase Person están encapsulados y
 * no son accesibles directamente desde fuera de la clase.
 *
 * Se proporciona acceso controlado a través de los métodos getName(),
 * setName(), getAge(), y setAge() que permiten leer y modificar los atributos.
 *
 * Esto permite agregar validaciones (como en setAge()) o realizar otras
 * operaciones antes de modificar los valores.
 */