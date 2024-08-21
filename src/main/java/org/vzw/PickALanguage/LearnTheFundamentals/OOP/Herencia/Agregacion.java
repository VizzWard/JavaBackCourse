package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Herencia;

public class Agregacion {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan");
        Empleado emp2 = new Empleado("Ana");
        Empleado emp3 = new Empleado("Carlos");

        Empleado[] empleados = {emp1, emp2, emp3};

        Departamento dept = new Departamento("Desarrollo", empleados);
        dept.mostrarEmpleados();
    }
}

// Clase Empleado
class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Departamento
class Departamento {
    private String nombre;
    private Empleado[] empleados;

    public Departamento(String nombre, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public void mostrarEmpleados() {
        System.out.println("Departamento: " + nombre);
        for (Empleado emp : empleados) {
            System.out.println("Empleado: " + emp.getNombre());
        }
    }
}

/*
 * En este ejemplo, `Departamento` tiene una relación de agregación con `Empleado`.
 * Aunque los empleados están asociados a un departamento, pueden existir de manera independiente.
 * Si el objeto `Departamento` es destruido, los objetos `Empleado` siguen existiendo.
 */
