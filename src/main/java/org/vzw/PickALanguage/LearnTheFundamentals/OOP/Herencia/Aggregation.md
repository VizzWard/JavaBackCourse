# Aggregation 

Si una clase tiene una referencia de entidad, se conoce como Agregación. La agregación representa una relación HAS-A.

Considere una situación, el objeto Empleado contiene mucha información como id, nombre, emailId etc. Contiene un objeto más llamado dirección, que contiene su propia información como ciudad, estado, país, código postal, etc.

```java
class Employee{
    int id;
    String name;
    Address address;//Address es una clase
    ...
}
```

En tal caso, Empleado tiene una dirección de referencia de entidad, por lo que la relación es Empleado Tiene-Una (Has-A) dirección.

#### Por que usar Agregación?

- Para la reutilización del código.

## Ejemplo de Agregación

![](https://static.javatpoint.com/images/aggregation.JPG)

En este ejemplo, hemos creado la referencia de la clase Operación en la clase Círculo.

```java
class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
    Operation op;//aggregation  
    double pi=3.14;

    double area(int radius){
        op=new Operation();
        int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
        return pi*rsquare;
    }
    
    public static void main(String args[]){
        Circle c=new Circle();
        double result=c.area(5);
        System.out.println(result);
    }
}
```

***Salida:***

```text
Output:78.5
```

## Cuándo utilizar la agregación?

- La reutilización del código también se consigue mejor mediante la agregación cuando no existe una relación is-a.
- La herencia sólo debe utilizarse si la relación es-a se mantiene durante toda la vida de los objetos implicados; en caso contrario, la agregación es la mejor opción.

## Agregación vs Herencia

La elección entre usar agregación o herencia depende de la naturaleza de la relación entre las clases y de la semántica que se quiera representar en el diseño de tu sistema.

### Casos para Usar Herencia

- Relación "es un" (is-a): Usa herencia cuando una clase es una versión más específica de otra. Por ejemplo, Perro es un Animal, por lo que Perro hereda de Animal.
- Comportamiento Compartido: Si varias clases comparten un comportamiento común y puede ser reutilizado a través de una superclase, es recomendable usar herencia.
- Polimorfismo: Si deseas que las clases derivadas puedan ser tratadas de manera uniforme a través de una referencia a la clase base, la herencia es la opción adecuada.

```java
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

public class EjemploHerencia {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.hacerSonido(); // Salida: El perro ladra
    }
}
```

### Casos para Usar Agregación

- Relación "tiene un" (has-a): Usa agregación cuando una clase necesita contener una referencia a otra clase, pero ambas clases pueden existir de manera independiente. Por ejemplo, una Casa tiene un Puerta, pero una Puerta puede existir sin estar en una Casa específica.
- Composición de Objetos: Cuando un objeto está compuesto de varios otros objetos que pueden existir de manera independiente. Por ejemplo, un Coche tiene un Motor, pero un Motor puede existir sin un Coche.
- Flexibilidad y Reutilización: La agregación permite más flexibilidad que la herencia, ya que no establece una relación tan fuerte como la herencia y permite cambiar la composición de los objetos en tiempo de ejecución.

### Ejemplo de Cuándo Usar Agregación o Herencia

Imagina que estás modelando un sistema para una universidad:

#### Herencia

Si tienes una clase Persona con atributos comunes como nombre y edad, y necesitas crear clases más específicas como Profesor y Estudiante, es lógico usar herencia, ya que Profesor y Estudiante son tipos específicos de Persona.

```java
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Asignatura: " + asignatura);
    }
}
```

#### Agregacion

Si tienes una clase Curso que contiene una lista de Estudiantes, deberías usar agregación. Los estudiantes existen de forma independiente del curso en el que están inscritos. Si el curso se cancela, los estudiantes siguen existiendo.

```java
class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Curso: " + nombre);
        for (Estudiante e : estudiantes) {
            System.out.println("Estudiante: " + e.getNombre());
        }
    }
}
```