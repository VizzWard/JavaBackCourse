# Nested Interface

Una interfaz declarada dentro de otra interfaz o clase, se conoce como interfaz anidada. Las interfaces anidadas se utilizan para agrupar interfaces relacionadas de modo que su mantenimiento resulte sencillo. La interfaz anidada debe ser referenciada por la interfaz o clase externa. No se puede acceder a ella directamente.

- La interfaz anidada debe ser pública si se declara dentro de la interfaz, pero puede tener cualquier modificador de acceso si se declara dentro de la clase.
- Las interfaces anidadas se declaran estáticas

### Sintaxis de la interfaz anidada que se declara dentro de la interfaz

```java
interface interface_name{
    ...  
    interface nested_interface_name{  
        ...  
    }
}
```

### Sintaxis de la interfaz anidada que se declara dentro de la clase

```java
class class_name{
    ...  
    interface nested_interface_name{  
        ...  
    }
}
```

### Ejemplo de interfaz anidada que se declara dentro de la interfaz

En este ejemplo, aprenderemos cómo declarar la interfaz anidada y cómo podemos acceder a ella.

```java
interface Showable{ 
    void show();  
    interface Message{  
        void msg();  
    }
}

class TestNestedInterface1 implements Showable.Message{ 
    public void msg(){
        System.out.println("Hello nested interface");
    }
    
    public static void main(String args[]){  
        Showable.Message message=new TestNestedInterface1();//upcasting here  
        message.msg();  
    } 
}  
```

***Salida:***

```text
hello nested interface
```

Como se puede ver en el ejemplo anterior, estamos accediendo a la interfaz Message a través de su interfaz externa Showable porque no se puede acceder directamente. Es como el almirah dentro de la habitación; no podemos acceder al almirah directamente porque primero debemos entrar en la habitación. En el marco de recolección, el microsistema sun ha proporcionado una interfaz anidada Entry. Entry es la subinterfaz de Map, es decir, se accede a ella mediante Map.Entry.

### Código interno generado por el compilador java para la interfaz anidada Mensaje

El compilador java crea internamente una interfaz pública y estática como se muestra a continuación:

```java
public static interface Showable$Message { 
    public abstract void msg();  
}
```

### Ejemplo de interfaz anidada que se declara dentro de la clase

Veamos cómo podemos definir una interfaz dentro de la clase y cómo podemos acceder a ella.

```java
class A{ 
    interface Message{  
        void msg();  
    }
}

class TestNestedInterface2 implements A.Message{  
    public void msg(){
        System.out.println("Hello nested interface");
    }  
  
    public static void main(String args[]){  
        A.Message message=new TestNestedInterface2();//upcasting here  
        message.msg();  
 }  
} 
```

***Salida:***

```text
hello nested interface
```

### ¿Podemos definir una clase dentro de la interfaz?

Sí, si definimos una clase dentro de la interfaz, el compilador de Java crea una clase estática anidada. Veamos cómo podemos definir una clase dentro de la interfaz:

```java
interface M{ 
    class A{
        
    }  
}  
```