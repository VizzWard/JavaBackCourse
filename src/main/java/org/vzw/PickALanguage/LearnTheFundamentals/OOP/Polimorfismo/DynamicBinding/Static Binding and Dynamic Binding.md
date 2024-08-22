# Static Binding and Dynamic Binding

La conexión de una llamada al cuerpo de un método se conoce como binding.

Existen dos tipos de binding:

1. Vinculación estática (también conocida como vinculación temprana).
2. Vinculación dinámica (también conocida como vinculación tardía).

## Comprender el tipo (type)

Entendamos el tipo de instancia.

### Las variables tienen un tipo

Cada variable tiene un tipo, puede ser primitivo y no primitivo.

```java
int data=30;
```

Aquí la variable de datos es de tipo int.

### Las referencias tienen un tipo

```java
class Dog{
    public static void main(String args[]){
        Dog d1;//d1 en un tipo de perro
    }
}
```

### Los objetos tienen un tipo

Un objeto es una instancia de una clase particular de Java, pero también es una instancia de su superclase.

```java
class Animal{}

class Dog extends Animal{
    public static void main(String args[]){
        Dog d1=new Dog();
    }
}
```

Aquí d1 es una instancia de la clase Dog, pero también es una instancia de Animal.

## static binding

Cuando el tipo del objeto se determina en tiempo de compilación (por el compilador), se conoce como enlace estático.

Si existe algún método privado, final o estático en una clase, existe vinculación estática.

```java
class Dog{
    private void eat(){
        System.out.println("dog is eating...");
    }

    public static void main(String args[]){
        Dog d1=new Dog();
        d1.eat();
    }
}
```

## Dynamic binding

Cuando el tipo del objeto se determina en tiempo de ejecución, se denomina enlace dinámico.

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

    public static void main(String args[]){
        Animal a=new Dog();
        a.eat();
    }
}
```

En el ejemplo anterior el tipo del objeto no puede ser determinado por el compilador, porque la instancia de Dog es también una instancia de Animal, por lo que el compilador no conoce su tipo, sólo su tipo base.