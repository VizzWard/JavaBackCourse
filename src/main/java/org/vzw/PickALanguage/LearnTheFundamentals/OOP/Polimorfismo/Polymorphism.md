# Polymorphism

El polimorfismo en Java es un concepto por el cual podemos realizar una misma acción de diferentes maneras. Polimorfismo se deriva de 2 palabras griegas: poly y morphs. La palabra "poly" significa muchos y "morphs" significa formas. Por tanto, polimorfismo significa muchas formas.

Hay dos tipos de polimorfismo en Java: polimorfismo en tiempo de compilación y polimorfismo en tiempo de ejecución. Podemos realizar polimorfismo en java por sobrecarga de métodos y anulación de métodos.

Si sobrecarga un método estático en Java, es el ejemplo de polimorfismo en tiempo de compilación. Aquí, nos centraremos en el polimorfismo en tiempo de ejecución en java.

## Runtime Polymorphism

El polimorfismo en tiempo de ejecución o envío dinámico de métodos es un proceso en el que una llamada a un método anulado se resuelve en tiempo de ejecución en lugar de en tiempo de compilación.

En este proceso, se llama a un método anulado a través de la variable de referencia de una superclase. La determinación del método a llamar se basa en el objeto al que hace referencia la variable de referencia.

### Upcasting

Si la variable de referencia de la clase Padre se refiere al objeto de la clase Hijo, se conoce como upcasting. Por ejemplo:

![](https://static.javatpoint.com/images/java-upcasting.png)

```java
class A{
    
}  

class B extends A{
    
}  
```

```java
A a=new B();//upcasting  
```

Para upcasting, podemos utilizar la variable de referencia de tipo de clase o un tipo de interfaz. Por ejemplo:

```java
interface I{
    
}  

class A{
    
}  
class B extends A implements I{
    
}  
```

Aquí, la relación de la clase B sería:

```text
B IS-A A
B IS-A I
B IS-A Object
```

Dado que Object es la clase raíz de todas las clases en Java, podemos escribir B IS-A Object.

## Ejemplo de Java Runtime Polymorphism

En este ejemplo, estamos creando dos clases Bike y Splendor. La clase Splendor extiende la clase Bike y sobreescribe su método run(). 

Estamos llamando al método run mediante la variable de referencia de la clase Parent. Dado que se refiere al objeto de la subclase y el método de la subclase anula el método de la clase padre, el método de la subclase se invoca en tiempo de ejecución.

Dado que la invocación de métodos está determinada por la JVM y no por el compilador, se conoce como polimorfismo en tiempo de ejecución.

```java
class Bike{ 
    void run(){System.out.println("running");}  
} 

class Splendor extends Bike{ 
    void run(){
        System.out.println("running safely with 60km");
    }  
    
    public static void main(String args[]){
        Bike b = new Splendor();//upcasting
        // b.run();
    }  
}  
```

***Salida:***

```text
running safely with 60km.
```

## Ejemplos

- [`Shape`](Ejemplos/TestPolymorphism.java)
- [`Animal`](Ejemplos/TestPolymorphism2.java)

## Runtime Polymorphism con Datos de los miembros

Un método se anula, no los miembros de datos, por lo que el polimorfismo en tiempo de ejecución no se puede lograr por los miembros de datos.

En el ejemplo dado a continuación, ambas clases tienen un miembro de datos speedlimit. Estamos accediendo al miembro de datos por la variable de referencia de la clase Padre que se refiere al objeto de la subclase. Dado que estamos accediendo al miembro de datos que no está anulado, por lo tanto, se accederá al miembro de datos de la clase padre siempre.

> Regla: El polimorfismo en tiempo de ejecución no puede lograrse mediante miembros de datos.

```java
class Bike{ 
    int speedlimit=90;  
}  

class Honda3 extends Bike {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike obj = new Honda3();

        System.out.println( obj.speedlimit );//90  
    }
}
```

***Salida:***

```text
90
```

## Runtime Polymorphism con Herencia multinivel

```java
class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("eating fruits");
    }
}

class BabyDog extends Dog{
    void eat(){
        System.out.println("drinking milk");
    }
    
    public static void main(String args[]){
        Animal a1,a2,a3;
        
        a1=new Animal();
        a2=new Dog();
        a3=new BabyDog();
        
        a1.eat();
        a2.eat();
        a3.eat();
    }
}
```

***Salida:***

```text
eating
eating fruits
drinking Milk
```

## Try for Output

```java
class Animal{
    void eat(){
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("dog is eating...");
    }
}

class BabyDog1 extends Dog{
    public static void main(String args[]){
        Animal a=new BabyDog1();
        a.eat();
    }
}
```

***Salida:***

```text
Dog is eating
```

Dado que BabyDog no sobreescribe el método eat(), se invoca el método eat() de la clase Dog.