# Java instanceof

El operador instanceof de java se utiliza para comprobar si el objeto es una instancia del tipo especificado (clase o subclase o interfaz).

El instanceof en java es también conocido como operador de comparación de tipos porque compara la instancia con el tipo. Devuelve verdadero o falso. Si aplicamos el operador instanceof con cualquier variable que tenga valor nulo, devuelve false.

```java
class Simple1{
    public static void main(String args[]){
        Simple1 s=new Simple1();
        System.out.println(s instanceof Simple1);//true  
    }
}
```

***Salida:***

```text
true
```

Un objeto de tipo subclase es también un tipo de clase padre. Por ejemplo, si Perro extiende a Animal, el objeto de Perro puede ser referido tanto por la clase Perro como por la clase Animal.

```java
class Animal{
    
}

class Dog1 extends Animal{//Dog inherits Animal  

    public static void main(String args[]){
        Dog1 d=new Dog1();
        System.out.println(d instanceof Animal);//true  
    }
}
```

***Salida:***

```text
true
```

### instanceof en java con una variable que tiene valor nulo

Si aplicamos el operador instanceof con una variable que tiene valor nulo, devuelve false. Veamos el ejemplo dado a continuación donde aplicamos el operador instanceof con la variable que tiene valor nulo.

```java
class Dog2{
    public static void main(String args[]){
        Dog2 d=null;
        System.out.println(d instanceof Dog2);//false  
    }
}
```

***Salida:***

```text
false
```

## Downcasting con el operador instanceof



Cuando el tipo Subclass hace referencia al objeto de la clase Parent, se conoce como downcasting. Si lo realizamos directamente, el compilador da un error de compilación. Si lo realizamos mediante typecasting, se lanza una ClassCastException en tiempo de ejecución. Pero si utilizamos el operador instanceof, el downcasting es posible.

```java
Dog d=new Animal(); //Compilation error  
```

Si realizamos downcasting por typecasting, se lanza una ClassCastException en tiempo de ejecución.

```java
Dog d=(Dog)new Animal();  
//Se compila correctamente pero se lanza una ClassCastException en tiempo de ejecución
```

### Posibilidad de downcasting con instanceof

Veamos un ejemplo en el que el downcasting es posible mediante el operador instanceof.

```java
class Animal { 
    
}

class Dog3 extends Animal {
    static void method(Animal a) {
        if(a instanceof Dog3){
            Dog3 d=(Dog3)a;//downcasting  
            System.out.println("ok downcasting performed");
        }
    }

    public static void main (String [] args) {
        Animal a=new Dog3();
        Dog3.method(a);
    }
}
```

***Salida:***

```text
ok downcasting performed
```

### Downcasting sin el uso de instanceof

El downcasting también puede realizarse sin utilizar el operador instanceof como se muestra en el siguiente ejemplo:

```java
class Animal {
    
}

class Dog4 extends Animal {
    static void method(Animal a) {
        Dog4 d=(Dog4)a;//downcasting  
        System.out.println("ok downcasting performed");
    }
    
    public static void main (String [] args) {
        Animal a=new Dog4();
        Dog4.method(a);
    }
}
```

***Salida:***

```text
ok downcasting performed
```

Vamos a echar un vistazo más de cerca a esto, el objeto real que se hace referencia por a, es un objeto de la clase Dog. Así que si hacemos downcast, está bien. Pero lo que sucederá si escribimos:

```java
Animal a=new Animal();  
Dog.method(a);  
//Ahora lanza ClassCastException pero no en caso de operador instanceof
```

## Ejemplo de uso real de instanceof

```java
interface Printable{
    
}

class A implements Printable{
    public void a(){
        System.out.println("a method");
    }
}

class B implements Printable{
    public void b(){
        System.out.println("b method");
    }
}

class Call{
    void invoke(Printable p){//upcasting  
        if(p instanceof A){
            A a=(A)p;//Downcasting   
            a.a();
        }
        if(p instanceof B){
            B b=(B)p;//Downcasting   
            b.b();
        }

    }
} 

class Test4{
    public static void main(String args[]){
        Printable p=new B();
        Call c=new Call();
        c.invoke(p);
    }
}
```

***Salida:***

```text
b method
```

