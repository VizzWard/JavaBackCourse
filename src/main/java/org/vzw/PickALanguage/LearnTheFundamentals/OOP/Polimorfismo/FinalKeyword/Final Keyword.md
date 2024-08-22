# Final Keyword

La palabra clave final en java se utiliza para restringir al usuario. La palabra clave final en java se puede utilizar en muchos contextos. Final puede ser:

- Variable
- Clase
- Metodo

La palabra clave final se puede aplicar con las variables, una variable final que no tiene valor se llama variable final en blanco o variable final no inicializada. Sólo puede ser inicializada en el constructor. La variable final en blanco también puede ser estática y se inicializará únicamente en el bloque estático. Vamos a tener un aprendizaje detallado de estos. Primero vamos a aprender los conceptos básicos de la palabra clave final.

## final variable

Si haces cualquier variable como final, no puedes cambiar el valor de la variable final(Será constante).

![](https://static.javatpoint.com/images/core/final.jpg)

### Ejemplo

Hay una variable final speedlimit, vamos a cambiar el valor de esta variable, pero no se puede cambiar porque variable final una vez asignado un valor nunca se puede cambiar.

```java
class Bike9{
    final int speedlimit=90; //final variable  
    
    void run(){
        speedlimit=400;
    }
    
    public static void main(String args[]){
        Bike9 obj=new  Bike9();
        obj.run();
    }
}
```

***Salida:***

```text
Compile Time Error
```

## final method

Si haces que cualquier método sea final, no podrás anularlo.

```java
class Bike{
    final void run(){
        System.out.println("running");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}
```

***Salida:***

```text
Compile Time Error
```

## final class

Si haces que cualquier clase sea final, no podrás extenderla.

```java
final class Bike{
    
}

class Honda1 extends Bike{
    void run(){
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]){
        Honda1 honda= new Honda1();
        honda.run();
    }
}
```

***Salida:***

```text
Compile Time Error
```

## ¿Se hereda el método final?

Sí, el método final se hereda pero no se puede anular. Por ejemplo:

```java
class Bike{
    final void run(){
        System.out.println("running...");
    }
}

class Honda2 extends Bike{
    public static void main(String args[]){
        new Honda2().run();
    }
}
```

***Salida:***

```text
running...
```

## ¿Qué es una variable final en blanco o no inicializada?

Una variable final que no se inicializa en el momento de la declaración se conoce como variable final en blanco.

Es útil si se desea crear una variable que se inicialice en el momento de crear el objeto y que una vez inicializada no se pueda modificar. Por ejemplo el número de TARJETA de un empleado.

Sólo se puede inicializar en el constructor.

```java
class Student{
    int id;
    String name;
    final String PAN_CARD_NUMBER;  
    ...
}
```

### ¿Podemos inicializar la variable final en blanco?

Sí, pero sólo en el constructor. Por ejemplo:

```java
class Bike10{
    final int speedlimit;//blank final variable  

    Bike10(){
        speedlimit=70;
        System.out.println(speedlimit);
    }

    public static void main(String args[]){
        new Bike10();
    }
}
```

***Salida:***

```text
70
```

## static blank final variable

Una variable final estática que no se inicializa en el momento de la declaración se conoce como variable final estática en blanco. Sólo se puede inicializar en el bloque estático.

```java
class A{
    static final int data;//static blank final variable  
    
    static{ 
        data=50;
    }
    
    public static void main(String args[]){
        System.out.println(A.data);
    }
}
```

#### ¿Qué es el parámetro final?

Si declara un parámetro como final, no podrá cambiar su valor.

```java
class Bike11{
    int cube(final int n){
        n = n + 2;  //can't be changed as n is final  
        n * n * n;
    }
    
    public static void main(String args[]){
        Bike11 b = new Bike11();
        b.cube(5);
    }
}
```

***Salida:***

```text
Compile Time Error
```

#### ¿Podemos declarar final constructor?

No, porque el constructor nunca se hereda.