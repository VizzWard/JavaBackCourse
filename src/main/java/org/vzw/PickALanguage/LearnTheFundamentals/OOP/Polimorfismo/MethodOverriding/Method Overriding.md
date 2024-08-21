# Method Overriding

Si la subclase (clase hija) tiene el mismo método que el declarado en la clase padre, se conoce como sobreescritura de métodos en Java.

En otras palabras, si una subclase proporciona la implementación específica del método que ha sido declarado por una de sus clases padre, se conoce como overriding de método.

### Uso de la sustitución de métodos Java

- La sobreescritura de métodos se utiliza para proporcionar la implementación específica de un método que ya es proporcionado por su superclase.
- La sobreescritura de métodos se utiliza para el polimorfismo en tiempo de ejecución.

### Reglas para la sustitución de métodos Java

1. El método debe tener el mismo nombre que en la clase padre.
2. El método debe tener el mismo parámetro que en la clase padre.
3. Debe existir una relación IS-A (herencia).

### Comprender el problema sin anulación de métodos

Entendamos el problema al que nos podemos enfrentar en el programa si no utilizamos el overriding de métodos.

```java
//Programa para demostrar por qué necesitamos la sobreescritura de métodos

//Aquí, estamos llamando al método de la clase padre con el hijo
//class object.
//Creación de una clase padre
class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}

//Creación de una clase hija
class Bike extends Vehicle{
    public static void main(String args[]){
        //crear una instancia de clase hija
        Bike obj = new Bike();
        
        //llamar al método con la instancia de la clase hija
        obj.run();
    }
}
```

***Salida:***
```text
Vehicle is running
```

El problema es que tengo que proporcionar una implementación específica del método run() en la subclase, por eso usamos el método overriding.

### Ejemplo de sustitución de métodos

En este ejemplo, hemos definido el método run en la subclase tal y como está definido en la clase padre, pero tiene una implementación específica. El nombre y el parámetro del método son los mismos, y existe relación IS-A entre las clases, por lo que hay sobreescritura de métodos.

```java
//Programa para ilustrar el uso de la sustitución de métodos Java

//Creación de una clase padre.
class Vehicle{
    //definir un método
    void run(){
        System.out.println("Vehicle is running");
    }
}
//Creating a child class
class Bike2 extends Vehicle{
    //definiendo el mismo método que en la clase padre
    void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]){
        Bike2 obj = new Bike2();//crear objeto
        obj.run();//método de llamada
    }
}
```

***Salida:***
```text
Bike is running safely
```

### Un ejemplo real de sustitución de métodos Java

Consideremos un escenario en el que Bank es una clase que proporciona funcionalidad para obtener el tipo de interés. Sin embargo, el tipo de interés varía según los bancos. Por ejemplo, los bancos SBI, ICICI y AXIS pueden ofrecer un tipo de interés del 8%, 7% y 9%.

![](https://static.javatpoint.com/images/core/bankinheritance.png)

> [`Codigo`](Test.java)

## ¿Podemos anular un método estático?

No, un método estático no puede ser anulado. Se puede probar mediante polimorfismo en tiempo de ejecución, así que lo aprenderemos más adelante.

### ¿Por qué no podemos anular un método estático?

Esto se debe a que el método estático está vinculado a la clase, mientras que el método de instancia está vinculado a un objeto. Static pertenece al área de la clase, y una instancia pertenece al área del montón.

### ¿Podemos anular el método main de java?

No, porque el main es un método estático.