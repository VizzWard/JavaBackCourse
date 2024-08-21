package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.SuperKeyword;

// Clase de prueba para demostrar el uso de 'super'
class TestSuper {
    public static void main(String[] args) {
        // Creación de un objeto 'Emp' con valores específicos
        Emp e1 = new Emp(1, "ankit", 45000f);
        e1.display();  // Llamada al método display() para mostrar la información del empleado
    }
}

// Clase base 'Person' con atributos y un constructor
class Person {
    int id;
    String name;

    // Constructor de la clase 'Person' para inicializar id y name
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Clase derivada 'Emp' que extiende 'Person' e incluye un atributo adicional 'salary'
class Emp extends Person {
    float salary;

    // Constructor de la clase 'Emp' que inicializa los atributos id, name y salary
    Emp(int id, String name, float salary) {
        super(id, name);  // Uso de 'super' para reutilizar el constructor de la clase 'Person'
        this.salary = salary;
    }

    // Método para mostrar los detalles del empleado
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}