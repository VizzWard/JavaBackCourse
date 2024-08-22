# Interface in Java

Una interfaz en Java es un plano de una clase. Tiene constantes estáticas y métodos abstractos.

La interfaz en Java es un mecanismo para lograr la abstracción. Sólo puede haber métodos abstractos en la interfaz de Java, no cuerpo del método. Se utiliza para lograr la abstracción y la herencia múltiple en Java.

En otras palabras, se puede decir que las interfaces pueden tener métodos abstractos y variables. No puede tener un cuerpo de método.

Java Interface también representa la relación **IS-A**.

No se puede instanciar igual que la clase abstracta.

Desde Java 8, podemos tener métodos por defecto y estáticos en una interfaz.

Desde Java 9, podemos tener métodos privados en una interfaz.

## ¿Por qué utilizar la interfaz Java?

Existen principalmente tres razones para utilizar la interfaz.

- Se utiliza para lograr la abstracción.
- Por interfaz, podemos soportar la funcionalidad de herencia múltiple.
- Puede utilizarse para lograr un acoplamiento flexible.

## ¿Cómo declarar una interfaz?

Una interfaz se declara utilizando la palabra clave interfaz. Proporciona abstracción total; es decir, todos los métodos de una interfaz se declaran con el cuerpo vacío, y todos los campos son públicos, estáticos y finales por defecto. Una clase que implemente una interfaz debe implementar todos los métodos declarados en la interfaz.

### Syntax

```java
interface <interface_name>{  
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
} 
```

Desde Java 8, la interfaz puede tener métodos por defecto y estáticos que se discutirán más adelante.

## Adición interna del compilador

> El compilador de Java añade las palabras clave public y abstract antes del método de la interfaz. Además, añade las palabras clave public, static y final antes de los miembros de datos.

En otras palabras, los campos de la interfaz son públicos, estáticos y finales por defecto, y los métodos son públicos y abstractos.

![](https://static.javatpoint.com/images/interface.png)

## Relación entre clases e interfaces

Como se muestra en la siguiente figura, una clase extiende otra clase, una interfaz extiende otra interfaz, pero una clase implementa una interfaz.

![](https://static.javatpoint.com/images/core/interfacerelation.jpg)

## Ejemplos

En este ejemplo, la interfaz Printable sólo tiene un método, y su implementación se proporciona en la clase A6.

```java
interface printable{ 
    void print();  
}

class A6 implements printable{ 
    public void print(){
        System.out.println("Hello");
    }  
    
    public static void main(String args[]){
        A6 obj = new A6();
        obj.print();
    }  
}
```

***Salida:***

```text
Hello
```

### Ejemplo de interfaz Java: Drawable

En este ejemplo, la interfaz Drawable sólo tiene un método. Su implementación es proporcionada por las clases Rectángulo y Círculo. En un escenario real, una interfaz es definida por otra persona, pero su implementación es proporcionada por diferentes proveedores de implementación. Además, es utilizada por otra persona. La parte de implementación queda oculta para el usuario que utiliza la interfaz.

```java
//Interface declaration: by first user  
interface Drawable{ 
    void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
    public void draw(){
        System.out.println("drawing rectangle");
    }  
}  

class Circle implements Drawable{  
    public void draw(){
        System.out.println("drawing circle");
    }  
}  

//Using interface: by third user  
class TestInterface1{  
    public static void main(String args[]){  
        Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
        d.draw();  
    }
}  
```

***Salida:***

```text
drawing circle
```

### Ejemplo de interfaz Java: Banco

Veamos otro ejemplo de interfaz java que proporciona la implementación de la interfaz Bank.

```java
interface Bank{  
    float rateOfInterest();  
} 

class SBI implements Bank{  
    public float rateOfInterest(){
        return 9.15f;
    }  
} 

class PNB implements Bank{  
    public float rateOfInterest(){
        return 9.7f;
    }  
}  

class TestInterface2{  
    public static void main(String[] args){  
        Bank b=new SBI();  
        System.out.println("ROI: "+b.rateOfInterest());  
    }
}  
```

***Salida:***

```text
ROI: 9.15
```

## Herencia múltiple en Java por interfaz

Si una clase implementa varias interfaces, o una interfaz extiende varias interfaces, se habla de herencia múltiple.

![](https://static.javatpoint.com/images/core/multipleinheritance.jpg)

```java
interface Printable{  
    void print();  
}

interface Showable{  
    void show();  
}

class A7 implements Printable,Showable{  
    public void print(){
        System.out.println("Hello");
    }  
    public void show(){
        System.out.println("Welcome");
    }  
  
    public static void main(String args[]){  
        A7 obj = new A7();  
        obj.print();  
        obj.show();  
    }  
}  
```

***Salida:***

```text
Hello
Welcome
```

### En java no se admite la herencia múltiple a través de una clase, pero sí a través de una interfaz, ¿por qué?

Como hemos explicado en herencia, la herencia múltiple no está soportada en el caso de las clases debido a la ambigüedad. Sin embargo, es compatible en el caso de una interfaz porque no hay ambigüedad. Es porque su implementación es proporcionada por la clase de implementación. Por ejemplo:

```java
interface Printable{  
    void print();  
}

interface Showable{  
    void print();  
}

class TestInterface3 implements Printable, Showable{  
    public void print(){
        System.out.println("Hello");
    }
    
    public static void main(String args[]){  
        TestInterface3 obj = new TestInterface3();  
        obj.print();  
    } 
} 
```

***Salida:***

```text
Hello
```

Como se puede ver en el ejemplo anterior, Printable y Showable interfaz tienen los mismos métodos, pero su aplicación es proporcionada por la clase TestTnterface1, por lo que no hay ambigüedad.

## Herencia de interfaces

Una clase implementa una interfaz, pero una interfaz extiende otra interfaz.

```java
interface Printable{  
    void print();  
}

interface Showable extends Printable{  
    void show();  
}

class TestInterface4 implements Showable{  
    public void print(){
        System.out.println("Hello");
    }  
    public void show(){
        System.out.println("Welcome");
    }
    public static void main(String args[]){  
        TestInterface4 obj = new TestInterface4();  
        obj.print();  
        obj.show();  
    }
}  
```

***Salida:***

```text
Hello
Welcome
```

## Java 8 Default Method en Interface

Desde Java 8, podemos tener el cuerpo del método en la interfaz. Pero necesitamos que sea un método por defecto. Veamos un ejemplo:

```java
interface Drawable{  
    void draw();
    
    default void msg(){
        System.out.println("default method");
    }
}  

class Rectangle implements Drawable{  
    public void draw(){ 
        System.out.println("drawing rectangle");
    }  
}

class TestInterfaceDefault{  
    public static void main(String args[]){  
        Drawable d=new Rectangle();  
        d.draw();  
        d.msg();  
    }
}
```

***Salida:***

```text
drawing rectangle
default method
```

## Java 8 Static Method en Interface

Desde Java 8, podemos tener métodos estáticos en la interfaz. Veamos un ejemplo:

```java
interface Drawable{  
    void draw();  
    static int cube(int x){
        return x * x * x;
    }  
}

class Rectangle implements Drawable{  
    public void draw(){
        System.out.println("drawing rectangle");
    }  
}

class TestInterfaceStatic{  
    public static void main(String args[]){  
        Drawable d=new Rectangle();  
        d.draw();  
        System.out.println(Drawable.cube(3));  
    }
}
```

***Salida:***

```text
drawing rectangle
27
```

### ¿Qué es una interfaz marcada o etiquetada?

Una interfaz que no tiene ningún miembro se conoce como interfaz marcadora o etiquetada, por ejemplo,  Serializable, Cloneable, Remote, etc. Se utilizan para proporcionar alguna información esencial a la JVM para que ésta pueda realizar alguna operación útil.

```java
public interface Serializable{}
```

## Interfaz anidada en Java

Una interfaz puede tener otra interfaz que se conoce como interfaz anidada. Por ejemplo:

```java
interface printable{ 
    void print();  
    interface MessagePrintable{  
        void msg();  
    }  
}
```