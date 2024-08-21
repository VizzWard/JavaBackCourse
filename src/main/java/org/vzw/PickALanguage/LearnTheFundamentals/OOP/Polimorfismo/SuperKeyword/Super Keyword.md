# Super Keyword

La palabra clave super en Java es una variable de referencia que se utiliza para referirse inmediato objeto de clase padre.

Cada vez que se crea una instancia de una subclase, se crea implícitamente una instancia de la clase padre a la que se hace referencia mediante la variable de superreferencia.

## Uso de la superpalabra clave Java

### 1) super se puede utilizar para hacer referencia inmediata a la variable de instancia de la clase padre

Podemos utilizar la palabra clave super para acceder al miembro de datos o campo de la clase padre. Se utiliza si la clase padre y la clase hija tienen los mismos campos.

```java
class Animal{
    String color="white";
}

class Dog extends Animal{
    String color="black";
    
    void printColor(){
        System.out.println(color);//prints color of Dog class  
        System.out.println(super.color);//prints color of Animal class  
    }
}

class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
    }
}
```

***Salida:***

```text
black
white
```

En el ejemplo anterior, Animal y Perro tienen una propiedad común color. Si imprimimos la propiedad color, se imprimirá por defecto el color de la clase actual. Para acceder a la propiedad padre, necesitamos usar la palabra clave super.

### 2) super puede utilizarse para invocar un método inmediato de la clase padre

La palabra clave super también se puede utilizar para invocar el método de la clase padre. Debe utilizarse si la subclase contiene el mismo método que la clase padre. En otras palabras, se utiliza si se anula el método.

```java
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("eating bread...");
    }
    
    void bark(){
        System.out.println("barking...");
    }
    
    void work(){
        super.eat();
        bark();
    }
}
class TestSuper2 {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.work();
    }
}
```

***Salida:***

```text
eating...
barking...
```

En el ejemplo anterior Animal y Dog ambas clases tienen el método eat() si llamamos al método eat() de la clase Dog, llamará al método eat() de la clase Dog por defecto porque se da prioridad a lo local.

Para llamar al método de la clase padre, necesitamos usar la palabra clave super.

### 3) super() puede utilizarse para invocar al constructor inmediato de la clase padre

La palabra clave super también se puede utilizar para invocar al constructor de la clase padre. Veamos un ejemplo sencillo:

```java
class Animal{
    Animal(){
        System.out.println("animal is created");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("dog is created");
    }
}
class TestSuper3{
    public static void main(String args[]){
        Dog d=new Dog();
    }
} 
```

***Salida:***

```text
animal is created
dog is created
```

> Nota: super() es añadido en cada constructor de clase automáticamente por el compilador si no hay super() o this().

![](https://static.javatpoint.com/images/core/java-super.jpg)

Como bien sabemos, el compilador proporciona automáticamente el constructor por defecto si no hay constructor. Pero, también añade super() como la primera declaración.