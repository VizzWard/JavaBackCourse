# Qué es un objeto en Java?

Una entidad que tiene estado y comportamiento se conoce como objeto, por ejemplo, una silla, una bicicleta, un rotulador, un bolígrafo, una mesa, un coche, etc. Puede ser físico o lógico (tangible e intangible). El ejemplo de un objeto intangible es el sistema bancario

![](https://static.javatpoint.com/images/objects.jpg)

Un objeto tiene tres características:

- Estado: representa los datos (valor) de un objeto.
- Comportamiento: representa el comportamiento (funcionalidad) de un objeto, como depositar, retirar, etc.
- Identidad: La identidad de un objeto se implementa normalmente a través de un ID único. El valor del ID no es visible para el usuario externo. Sin embargo, es utilizado internamente por la JVM para identificar cada objeto de forma única

Por ejemplo, Lapiz es un objeto. Su nombre es Reynolds; su color es blanco, conocido como su estado. Se utiliza para escribir, por lo que la escritura es su comportamiento.

***Un objeto es una instancia de una clase***. Una clase es una plantilla a partir de la cual se crean objetos. Por lo tanto, un objeto es la instancia(resultado) de una clase.

## Definiciones de objetos:

- Un objeto es una entidad del mundo real.
- Un objeto es una entidad en tiempo de ejecución.
- El objeto es una entidad que tiene estado y comportamiento.
- El objeto es una instancia de una clase.

## 3 Formas de inicializar un objeto

### Por variable de referencia

```java
// Clase ejemplo
class Persona {
    String nombre;
    int edad;
}

// Inicialización por variable de referencia
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Crear objeto de la clase Persona
        persona1.nombre = "Juan";         // Asignar valor al atributo nombre
        persona1.edad = 30;               // Asignar valor al atributo edad

        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
    }
}
```

### Por método

```java
// Clase ejemplo
class Persona {
    String nombre;
    int edad;

    // Método para inicializar los atributos
    void setDatos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

// Inicialización por método
public class Main {
    public static void main(String[] args) {
        Persona persona2 = new Persona(); // Crear objeto de la clase Persona
        persona2.setDatos("María", 25);   // Llamar al método para inicializar

        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Edad: " + persona2.edad);
    }
}
```

### Por constructor

```java
// Clase ejemplo
class Persona {
    String nombre;
    int edad;

    // Constructor para inicializar los atributos
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

// Inicialización por constructor
public class Main {
    public static void main(String[] args) {
        Persona persona3 = new Persona("Carlos", 40); // Crear e inicializar objeto con constructor

        System.out.println("Nombre: " + persona3.nombre);
        System.out.println("Edad: " + persona3.edad);
    }
}
```

## ¿Cuáles son las diferentes formas de crear un objeto en Java?

Hay muchas maneras de crear un objeto en java. Son: 

- Por la palabra clave new.
- Por el método newInstance().
- Por el método clone().
- Por deserialización.
- Por el método factory etc.

## Objeto anónimo

Anónimo significa simplemente sin nombre. Un objeto que no tiene referencia se conoce como objeto anónimo. Sólo puede utilizarse en el momento de la creación del objeto.

Si tiene que utilizar un objeto una sola vez, un objeto anónimo es un buen enfoque. Por ejemplo:

```java
new Calculation();// Objeto anónimo 
```

Llamada al método a través de una referencia:

```java
Calculation c=new Calculation();  
c.fact(5);
```

Llamada a un método a través de un objeto anónimo:

```java
new Calculation().fact(5);
```

Veamos el ejemplo completo de un objeto anónimo en Java.

```java
class Calculation{
    void fact(int  n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
    public static void main(String args[]){
        new Calculation().fact(5);//calling method with anonymous object  
    }
}
```

## Creación de varios objetos por un solo tipo

Podemos crear múltiples objetos de un solo tipo como hacemos en el caso de los primitivos.

Inicialización de variables primitivas:

```java
int a=10, b=20;  
```

Inicialización de variables de referencia:

```java
Rectangle r1=new Rectangle(), r2=new Rectangle();
```