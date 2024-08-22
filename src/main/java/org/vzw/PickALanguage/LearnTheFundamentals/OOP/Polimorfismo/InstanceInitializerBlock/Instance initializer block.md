# Instance initializer block

El bloque inicializador de instancia se utiliza para inicializar los datos de instancia. Se ejecuta cada vez que se crea un objeto de la clase.

La inicialización de la variable de instancia se puede hacer directamente, pero se pueden realizar operaciones adicionales mientras se inicializa la variable de instancia en el bloque inicializador de instancia.

### ¿Para qué sirve el bloque inicializador de instancia si podemos asignar directamente un valor a un miembro de datos de instancia? Por ejemplo:

 ```java
class Bike{       
    int speed=100;  
}
```

### ¿Por qué utilizar el bloque inicializador de instancia?

Supongamos que tengo que realizar algunas operaciones mientras se asigna valor a un miembro de datos de instancia, por ejemplo, un bucle for para llenar una matriz compleja o la gestión de errores, etc.

### Ejemplo de bloque inicializador de instancia

Veamos un ejemplo de bloque inicializador de instancia que realiza la inicialización.

```java
class Bike7{
    int speed;

    Bike7(){
        System.out.println("speed is "+speed);
    }

    {
        speed=100;
    }

    public static void main(String args[]){
        Bike7 b1=new Bike7();
        Bike7 b2=new Bike7();
    }
}
```

***Salida:***

```text
speed is 100
speed is 100
```

Hay tres lugares en java donde se pueden realizar operaciones: 
- bloque
- constructor
- métodos

### ¿Qué se invoca primero, el bloque inicializador de instancia o el constructor?

```java
class Bike8{
    int speed;

    Bike8(){
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }

    public static void main(String args[]){
        Bike8 b1=new Bike8();
        Bike8 b2=new Bike8();
    }
}
```

***Salida:***

```text
instance initializer block invoked
constructor is invoked
instance initializer block invoked
constructor is invoked
```

En el ejemplo anterior, parece que el bloque inicializador de instancia se invoca en primer lugar, pero NO. El bloque inicializador de instancia se invoca en el momento de la creación del objeto. El compilador de java copia el bloque inicializador de instancia en el constructor después de la primera sentencia super(). Así que en primer lugar, el constructor es invocado. Entendámoslo por la figura:

> Nota: El compilador de java copia el código del bloque inicializador de instancia en cada constructor.

![](https://static.javatpoint.com/images/instanceinitializerblock.jpg)

## Reglas para el bloque inicializador de instancias

- El bloque inicializador de instancia se crea cuando se crea la instancia de la clase.
- El bloque inicializador de instancia se invoca después de invocar el constructor de la clase padre (es decir, después de la llamada al constructor super()).
- El bloque inicializador de instancia viene en el orden en que aparecen.

### Programa del bloque inicializador de instancia que se invoca después de super()

```java
class A{
    A(){
        System.out.println("parent class constructor invoked");
    }
}

class B2 extends A{
    B2(){
        super();
        System.out.println("child class constructor invoked");
    }

    {
        System.out.println("instance initializer block is invoked");
    }

    public static void main(String args[]){
        B2 b=new B2();
    }
}
```

***Salida:***

```text
parent class constructor invoked
instance initializer block is invoked
child class constructor invoked
```