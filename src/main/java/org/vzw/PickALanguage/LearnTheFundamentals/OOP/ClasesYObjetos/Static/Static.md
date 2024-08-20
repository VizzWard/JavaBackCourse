# Java static keyword

La palabra clave static en Java se utiliza principalmente para la gestión de memoria. Podemos aplicar la palabra clave static con variables, métodos, bloques y clases anidadas. La palabra clave static pertenece a la clase que una instancia de la clase.

Static puede ser:

- Variable (también denominada variable de clase).
- Método (también denominado método de clase).
- Bloque.
- Clase anidada.

## Java static variable

Si declaras cualquier variable como estática, se conoce como variable estática.

- La variable estática se puede utilizar para hacer referencia a la propiedad común de todos los objetos (que no es única para cada objeto), por ejemplo, el nombre de la empresa de los empleados, el nombre de la universidad de los estudiantes, etc.
- La variable estática obtiene memoria sólo una vez en el área de clase en el momento de la carga de la clase.

### Ventajas de una variable estatica

Hace que su programa sea eficiente en el uso de la memoria (es decir, ahorra memoria).

### Comprender el problema sin variable estática

```java
class Student{
    int rollno;
    String name;
    String college="ITS";
}
```

Supongamos que hay 500 estudiantes en mi universidad, ahora todos los miembros de datos de instancia obtendrán memoria cada vez que se cree el objeto. Todos los estudiantes tienen un nombre y un rol único, por lo que los datos de instancia son buenos en este caso. Aquí, "college" se refiere a la propiedad común de todos los objetos. Si lo hacemos estático, este campo obtendrá la memoria sólo una vez.

<mark>La propiedad estática Java se comparte con todos los objetos.</mark>

### Ejemplo

```java
class Contador {
    // Variable estática
    static int conteo = 0;

    // Constructor
    public Contador() {
        // Incrementar la variable estática cada vez que se crea un objeto
        conteo++;
    }

    // Método para mostrar el valor del conteo
    public static void mostrarConteo() {
        System.out.println("Número de objetos creados: " + conteo);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Contador
        Contador obj1 = new Contador();
        Contador.mostrarConteo();  // Salida: Número de objetos creados: 1

        Contador obj2 = new Contador();
        Contador.mostrarConteo();  // Salida: Número de objetos creados: 2

        Contador obj3 = new Contador();
        Contador.mostrarConteo();  // Salida: Número de objetos creados: 3
    }
}
```

## Java static method

Si aplica la palabra clave static con cualquier método, se conoce como método estático.

- Un método estático pertenece a la clase y no al objeto de una clase.
- Un método estático puede invocarse sin necesidad de crear una instancia de una clase.
- Un método estático puede acceder a un miembro de datos estáticos y puede cambiar su valor.

```java
class Calculadora {
    // Método estático para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método estático para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método estático para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método estático para dividir dos números
    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Llamar a los métodos estáticos de la clase Calculadora sin crear un objeto
        int suma = Calculadora.sumar(10, 5);
        int resta = Calculadora.restar(10, 5);
        int multiplicacion = Calculadora.multiplicar(10, 5);
        int division = Calculadora.dividir(10, 5);

        // Mostrar los resultados
        System.out.println("Suma: " + suma);             // Salida: Suma: 15
        System.out.println("Resta: " + resta);           // Salida: Resta: 5
        System.out.println("Multiplicación: " + multiplicacion); // Salida: Multiplicación: 50
        System.out.println("División: " + division);     // Salida: División: 2
    }
}
```

### Restricciones

Hay dos restricciones principales para el método estático: 

- El método estático no puede utilizar miembro de datos no estáticos o llamar método no estático directamente.
- `this` y `super` no pueden utilizarse en un contexto estático.

## Java static block

- Se utiliza para inicializar el miembro de datos estático.
- Se ejecuta antes del método principal en el momento de cargar la clase.

```java
class EjemploStaticBlock {
    // Variable estática
    static int valor;

    // Bloque estático
    static {
        System.out.println("El bloque estático se ejecuta antes que el constructor y cualquier método.");
        valor = 42; // Inicialización de la variable estática
    }

    // Constructor
    public EjemploStaticBlock() {
        System.out.println("Constructor llamado.");
    }

    // Método estático para mostrar el valor
    public static void mostrarValor() {
        System.out.println("Valor: " + valor);
    }
}

public class Main {
    public static void main(String[] args) {
        // Llamar al método estático
        EjemploStaticBlock.mostrarValor(); // Salida: El bloque estático se ejecuta antes que el constructor y cualquier método. Valor: 42

        // Crear un objeto de la clase EjemploStaticBlock
        EjemploStaticBlock obj = new EjemploStaticBlock(); // Salida: Constructor llamado.
    }
}
```

