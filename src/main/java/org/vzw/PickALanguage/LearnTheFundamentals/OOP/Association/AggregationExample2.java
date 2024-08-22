package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Association;

/**
 * Ejemplo de Agregación
 *
 * La agregación es un tipo de asociación "has-a" más débil,
 * donde una clase puede existir independientemente de la
 * clase que la contiene.
 */

// Clase Address que representa una dirección
class Address {
    private String city;
    private String country;

    Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    void displayAddress() {
        System.out.println("City: " + city + ", Country: " + country);
    }
}

// Clase Employee que tiene una Address (agregación)
class Employee {
    private String name;
    private Address address; // Employee "has-a" Address

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        address.displayAddress();
    }
}

public class AggregationExample2 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Address
        Address address = new Address("New York", "USA");

        // Crear un objeto de la clase Employee
        Employee employee = new Employee("John", address);

        // Aquí se aplica la relación "has-a" (agregación)
        // Un Employee "has-a" Address
        employee.displayEmployeeInfo();
    }
}


/**
 * Agregación: La clase Employee tiene una referencia a Address.
 * En este caso, Employee "has-a" Address, pero Address puede
 * existir independientemente de Employee. Esto es agregación,
 * donde la relación "has-a" es débil.
 */