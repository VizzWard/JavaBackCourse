# Qué es la clase abstracta de Java?

Ya hemos mencionado que Java implementa la abstracción mediante clases abstractas e interfaces. Primero vamos a explorar todo acerca de la clase abstracta.

**Una clase abstracta puede definirse como una clase declarada con la palabra clave "abstract" y tiene la restricción de que no puede ser instanciada.**

Una clase abstracta puede tener o no algún método abstracto (un método sin implementación). En lo que respecta a JVM, una clase abstracta es una clase incompleta que no tiene un comportamiento completo.

La sintaxis general de una clase abstracta es:

```java
abstract class <classname> {
    public abstract void abstracMethod();
    
    public void normalMethod(){
        //body
    }
}
```

Como se muestra en la sintaxis de la clase abstracta anterior, podemos tener métodos abstractos y no abstractos en una clase abstracta. La palabra clave 'abstract' precede a la declaración de la clase.

En pocas palabras, una clase abstracta puede describirse como:

- La clase abstracta se define con la palabra clave abstract.
- No se puede instanciar.
- Una clase abstracta puede tener métodos abstractos y no abstractos.
- Puede tener constructores y métodos estáticos.
- Puede tener un método final.

## ¿Para Qué Sirve Una Clase Abstracta En Java?

Veamos el ejemplo de los vehículos. Sabemos que los vehículos pueden ser de muchos tipos. Podemos tener Coches, Scooters, bicicletas, ciclomotores, autobuses, etc. Aunque hay muchos tipos de vehículos, tienen algunas propiedades o atributos que son comunes a todos los vehículos independientemente de su tipo.

Por ejemplo, cada vehículo tiene un modelo, un número de chasis, un color, etc. Cada uno de ellos tiene funciones como arrancar, parar, acelerar, frenar, etc. Ahora bien, cada vehículo tendrá las propiedades y métodos anteriores que también son comunes a los demás. Al mismo tiempo que a los usuarios de los vehículos, puede que no nos interesen algunos aspectos.

Por ejemplo, si una persona conduce un coche, lo que le interesará es arrancar y parar el vehículo o acelerar o frenar el vehículo. No le interesará saber cómo arranca o se para el vehículo. Sólo nos interesa el funcionamiento abstracto de las funciones y no sus detalles.

Ahora bien, si queremos representar el sistema de ejemplo anterior en una aplicación de software, ¿cómo lo diseñamos? En primer lugar, implementaremos algunas abstracciones. Ahora, sabemos que algunas funciones son comunes pero dependiendo de cada modelo la implementación de estas funciones será diferente.

Para empezar, declaramos una clase abstracta "Vehículo".

![](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/07/abstract-class-%E2%80%9CVehicle%E2%80%9D..png)

Así, tendremos una clase abstracta Vehículo y habrá una clase concreta que represente cada modelo de vehículo. A efectos ilustrativos, hemos utilizado sólo tres modelos: coche, moto y scooter.

```java
abstract class Vehicle{
    abstract void start () ;
    abstract void stop ();
    abstract void accelerate ();
    abstract void brake ();
}

class Car extends Vehicle{
    void start () {
        //code here
    }
    void stop () { 
        //code here
    }
    void accelerate () { 
        //code here…
    }
    void brake () {
        //code here
    }
}
                
class Bike extends Vehicle{
    void start () { 
        //code here
    }
    void stop () { 
        //code here
    }
    void accelerate () {
        //code here
    }
    void brake () {
        //code here…
    }
}
                                
class Scooter extends Vehicle{
    void start () {
        //code here…
    }
    void stop () {
        //code here…
    }
    void accelerate () {
        //code here…
    }
    void brake () {
        //code here…
    }
}
```

Así que tendremos una clase abstracta Vehículo y tres clases Coche, Moto y Scooter. Cada una de estas clases extenderá la clase Vehículo y sobrescribirá cada uno de los métodos abstractos.

Por lo tanto, en general, siempre que tenemos que representar un sistema que tiene métodos u operaciones comunes que representar, para presentar sólo la perspectiva externa al usuario, optamos por la abstracción. Como resultado, sacamos los métodos comunes y los representamos como métodos abstractos y reunimos estos métodos abstractos en una clase abstracta común.

Una vez que tenemos el esquema de un sistema representado como una clase abstracta y las operaciones como métodos abstractos, podemos derivar cualquier número de clases de la clase abstracta dada y anular los métodos abstractos para implementar estas operaciones para cada clase.

De este modo, resulta útil para diseñar un sistema.