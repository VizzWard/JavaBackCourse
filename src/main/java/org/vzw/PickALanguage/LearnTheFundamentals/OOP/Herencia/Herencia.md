# Herencia en Java

La herencia en Java es un mecanismo por el cual un objeto adquiere todas las propiedades y comportamientos de un objeto padre. Es una parte importante de la programación orientada a objetos.

La idea que subyace a la herencia en Java es que se pueden crear nuevas clases a partir de clases existentes. Cuando heredas de una clase existente, puedes reutilizar métodos y campos de la clase padre. Además, también puedes añadir nuevos métodos y campos en tu clase actual.

La herencia representa la relación IS-A, también conocida como relación padre-hijo.

## Terminos usados

- **Class**: Una clase es un grupo de objetos que tienen propiedades comunes. Es una plantilla o plano a partir del cual se crean los objetos.
- **Sub Class/Child Class**: Subclase es una clase que hereda de otra clase. También se denomina clase derivada, clase extendida o clase hija.
- **Super Class/Parent Class**: Superclase es la clase de la que una subclase hereda las características. También se denomina clase base o clase padre.
- **Reusability**: Como su nombre indica, la reutilización es un mecanismo que permite reutilizar los campos y métodos de una clase existente al crear una nueva. Puede utilizar los mismos campos y métodos ya definidos en la clase anterior.

## Syntax

```java
class Subclass-name extends Superclass-name {  
   //methods and fields  
}  
```

La palabra clave `extends` indica que usted está haciendo una nueva clase que deriva de una clase existente. El significado de "extends" es aumentar la funcionalidad.

En la terminología de Java, una clase que se hereda se denomina padre o superclase, y la nueva clase se denomina hijo o subclase.

## Ejemplo de Herencia

![](https://static.javatpoint.com/images/core/inheritance.jpg)

Programador es la subclase y Empleado es la superclase. La relación entre las dos clases es Programador ES-A Empleado. Esto significa que Programador es una clase de Empleado.

```java
class Employee{
    float salary=40000;
}

class Programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
```

***Salida:***
```text
 Programmer salary is:40000.0
 Bonus of programmer is:10000
```

## Tipos de Herencia

En función de la clase, puede haber tres tipos de herencia en java: simple, multinivel y jerárquica.

En la programación java, la herencia múltiple e híbrida sólo se soporta a través de interfaces.

![](https://static.javatpoint.com/images/core/typesofinheritance.jpg)

> Nota: La herencia múltiple no está soportada en Java a través de clases.

Cuando una clase hereda varias clases, se habla de herencia múltiple:

![](https://static.javatpoint.com/images/core/multiple.jpg)

## ¿Por qué no se admite la herencia múltiple en java?

Para reducir la complejidad y simplificar el lenguaje, la herencia múltiple no está soportada en java.

Considera un escenario en el que A, B y C son tres clases. La clase C hereda las clases A y B. Si las clases A y B tienen el mismo método y se llama desde el objeto de clase hijo, habrá ambigüedad para llamar al método de la clase A o B.

Dado que los errores en tiempo de compilación son mejores que los errores en tiempo de ejecución, Java produce un error en tiempo de compilación si heredas 2 clases. Así que si tiene el mismo método o diferentes, habrá error en tiempo de compilación.

```java
class A{
    void msg(){
        System.out.println("Hello");
    }
}

class B{
    void msg(){
        System.out.println("Welcome");
    }
}

class C extends A,B{//suppose if it were  

    public static void main(String args[]){
        C obj=new C();
        obj.msg();//Now which msg() method would be invoked?  
    }
}
```

***Salida:***

```text
Compile Time Error
```