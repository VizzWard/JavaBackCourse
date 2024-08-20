# Constructores en Java

En Java, un constructor es un bloque de códigos similar al método. Se llama cuando se crea una instancia de la clase. En el momento de llamar al constructor, se asigna memoria para el objeto en la memoria.

Es un tipo especial de método que se utiliza para inicializar el objeto.

Cada vez que se crea un objeto utilizando la palabra clave new(), se llama al menos a un constructor.

Llama a un constructor por defecto si no hay ningún constructor disponible en la clase. En tal caso, el compilador de Java proporciona un constructor por defecto.

Existen dos tipos de constructores en Java: 

- constructor sin carga.
- constructor parametrizado.

***Nota***: Se llama constructor porque construye los valores en el momento de la creación del objeto. No es necesario escribir un constructor para una clase. Esto se debe a que el compilador de Java crea un constructor por defecto si la clase no tiene ninguno.

## Reglas para crear un constructor Java

Hay dos reglas definidas para el constructor.

1. El nombre del constructor debe ser el mismo que el de su clase
2. Un constructor no debe tener un tipo de retorno explícito
3. Un constructor Java no puede ser abstracto, estático, final y sincronizado

## Tipos de Constructores

### Default Constructor

Un constructor se llama "Constructor por defecto" cuando no tiene ningún parámetro.

#### Syntax

```java
<class_name>(){}
```

#### Ejemplo

Estamos creando el constructor no-arg en la clase Bike. Será invocado en el momento de la creación del objeto.

```java
//Programa Java para crear y llamar a un constructor por defecto  
class Bike1{
    //crear un constructor por defecto  
    Bike1(){
        System.out.println("Bike is created");
    }
    
    //metodo main
    public static void main(String args[]){
        //llamar a un constructor por defecto  
        Bike1 b=new Bike1();
    }
}
```
<mark>Regla: Si no hay constructor en una clase, el compilador crea automáticamente un constructor por defecto.</mark>

![](https://static.javatpoint.com/images/default-constructor1.png)

#### ¿Para qué sirve un constructor por defecto?

El constructor por defecto se utiliza para proporcionar los valores por defecto al objeto como 0, null, etc., dependiendo del tipo.

### Constructor parametrizado Java

Un constructor que tiene un número específico de parámetros se denomina constructor parametrizado.

#### ¿Por qué utilizar el constructor parametrizado?

El constructor parametrizado se utiliza para proporcionar valores diferentes a objetos distintos. Sin embargo, también puede proporcionar los mismos valores.

```java
class Persona {
    String nombre;
    int edad;
    String ciudad;

    // Constructor parametrizado
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
}
```

## Sobrecarga de constructores en Java

En Java, un constructor es como un método pero sin tipo de retorno. También se puede sobrecargar como los métodos de Java.

La sobrecarga de constructores en Java es una técnica que consiste en tener más de un constructor con diferentes listas de parámetros. Están dispuestos de tal manera que cada constructor realiza una tarea diferente. El compilador los diferencia por el número de parámetros de la lista y sus tipos.

```java
class Rectangulo {
    int ancho;
    int alto;

    // Constructor sin parámetros (por defecto)
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }

    // Constructor parametrizado con un parámetro
    public Rectangulo(int lado) {
        this.ancho = lado;
        this.alto = lado;
    }

    // Constructor parametrizado con dos parámetros
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para mostrar la información del rectángulo
    public void mostrarInfo() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }
}
```

## Diferencia entre constructor y método en Java

| Constructor en Java | Método en Java |
| ------------------- | -------------- |
| Un constructor se utiliza para inicializar el estado de un objeto. | Un método se utiliza para exponer el comportamiento de un objeto. |
| Un constructor no debe tener un tipo de retorno. | Un método debe tener un tipo de retorno. |
| El constructor se invoca de manera implícita. | El método se invoca de manera explícita. |
| El compilador de Java proporciona un constructor por defecto si no tienes ningún constructor en una clase. | El método no es proporcionado por el compilador en ningún caso. |
| El nombre del constructor debe ser el mismo que el nombre de la clase. | El nombre del método puede o no ser el mismo que el nombre de la clase. |

## Java Copy Constructor

No hay constructor de copia en Java. Sin embargo, podemos copiar los valores de un objeto a otro como constructor de copia en C ++.

Hay muchas formas de copiar los valores de un objeto en otro en Java. Éstas son:

- Por constructor.
- Asignando los valores de un objeto a otro.
- Mediante el método clone() de la clase Object.

```java
class Persona {
    String nombre;
    int edad;

    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Copy Constructor
    public Persona(Persona personaOriginal) {
        this.nombre = personaOriginal.nombre;
        this.edad = personaOriginal.edad;
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Ana", 25);
        persona1.mostrarInfo();

        // Crear un nuevo objeto copiando el primero utilizando el Copy Constructor
        Persona persona2 = new Persona(persona1);
        persona2.mostrarInfo();
    }
}
```

## Copiar valores sin constructor

Podemos copiar los valores de un objeto en otro asignando los valores del objeto a otro objeto. En este caso, no es necesario crear el constructor.

```java
class Persona {
    String nombre;
    int edad;

    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método para copiar los valores de otro objeto Persona
    public void copiarValores(Persona otraPersona) {
        this.nombre = otraPersona.nombre;
        this.edad = otraPersona.edad;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Carlos", 28);
        persona1.mostrarInfo();  // Salida: Nombre: Carlos, Edad: 28

        // Crear un segundo objeto de la clase Persona
        Persona persona2 = new Persona("Laura", 22);
        persona2.mostrarInfo();  // Salida: Nombre: Laura, Edad: 22

        // Copiar los valores de persona1 a persona2 sin usar un constructor
        persona2.copiarValores(persona1);
        persona2.mostrarInfo();  // Salida: Nombre: Carlos, Edad: 28
    }
}
```