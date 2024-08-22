# Instance Initializer Block vs Static Initializer Block

## Instance Initializer Block (Bloque de Inicialización de Instancias)

Un Instance Initializer Block es un bloque de código entre llaves {} dentro de una clase, que se ejecuta cada vez que se crea una instancia (objeto) de esa clase, antes de que se ejecute el constructor de la misma.

### Características

- Ejecución: El bloque se ejecuta cada vez que se crea un objeto, justo antes del constructor. Si la clase tiene varios constructores, el bloque se ejecutará independientemente del constructor que se llame.
- Uso: Se utiliza principalmente para realizar tareas de inicialización comunes que todos los constructores deben ejecutar, sin necesidad de duplicar código en cada constructor.
- Alcance: El código dentro de un Instance Initializer Block tiene acceso a todas las variables de instancia de la clase, y puede realizar cualquier tipo de operación sobre ellas.

```java
class Example {
    int value;

    // Instance Initializer Block
    {
        value = 10;
        System.out.println("Instance Initializer Block: value initialized to " + value);
    }

    Example() {
        System.out.println("Constructor called");
    }

    Example(int x) {
        System.out.println("Constructor called with value: " + x);
    }

    public static void main(String[] args) {
        Example obj1 = new Example();   // Ejecuta el Instance Initializer Block, luego el constructor
        Example obj2 = new Example(20); // Ejecuta el Instance Initializer Block, luego el constructor con argumento
    }
}
```

## Static Initializer Block (Bloque de Inicialización Estática)

Un Static Initializer Block es un bloque de código que se ejecuta una única vez cuando la clase es cargada en memoria, es decir, antes de que se cree cualquier instancia de la clase o se acceda a cualquier miembro estático.

### Características

- Ejecución: Este bloque se ejecuta solo una vez, cuando la JVM carga la clase. Si hay múltiples bloques estáticos en la clase, se ejecutarán en el orden en que aparecen.
- Uso: Se utiliza principalmente para inicializar variables estáticas o para ejecutar código que deba ejecutarse una vez por clase, no por objeto.
- Alcance: El código dentro de un Static Initializer Block tiene acceso a todas las variables estáticas de la clase, pero no a las variables de instancia, ya que las instancias no existen en ese momento.

```java
class Example {
    static int staticValue;

    // Static Initializer Block
    static {
        staticValue = 50;
        System.out.println("Static Initializer Block: staticValue initialized to " + staticValue);
    }

    public static void main(String[] args) {
        Example obj1 = new Example(); // El bloque estático ya se ha ejecutado cuando se crea obj1
        Example obj2 = new Example(); // El bloque estático NO se ejecuta de nuevo
    }
}
```

## Comparacion

| Característica | Instance Initializer Block | Static Initializer Block |
|---|---|---|
| Ejecución | Se ejecuta cada vez que se crea un objeto | Se ejecuta una sola vez cuando se carga la clase|
| Acceso a variables | Puede acceder y modificar variables de instancia | Solo puede acceder y modificar variables estáticas |
| Propósito | Inicializar variables de instancia u operaciones que deben ocurrir para cada objeto | Inicializar variables estáticas u operaciones que deben ocurrir una vez para la clase |
| Orden de ejecución | Antes del constructor de la clase | Antes de cualquier instancia o método estático |
| Uso común | Evitar duplicación de código en constructores | Inicializar datos comunes a toda la clase |

## Ejemplo combinado

```java
class Example {
    static int staticValue;
    int instanceValue;

    // Static Initializer Block
    static {
        staticValue = 50;
        System.out.println("Static Initializer Block: staticValue initialized to " + staticValue);
    }

    // Instance Initializer Block
    {
        instanceValue = 20;
        System.out.println("Instance Initializer Block: instanceValue initialized to " + instanceValue);
    }

    Example() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Example obj1 = new Example(); // Se ejecuta primero el bloque estático, luego el bloque de instancia, luego el constructor
        Example obj2 = new Example(); // Se ejecuta solo el bloque de instancia y el constructor (el bloque estático no se repite)
    }
}
```

Ambos bloques ofrecen formas poderosas de controlar la inicialización de clases y objetos en Java, garantizando que el código se ejecute en el momento adecuado con el alcance apropiado.