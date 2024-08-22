# Abstract Method en Java

Un método abstracto es un método precedido por la palabra clave 'abstract' sin ninguna implementación. Un método abstracto se declara dentro de una clase abstracta.

Un método abstracto es el que hace que una clase esté incompleta ya que no tiene implementación. Por lo tanto cuando incluimos un método abstracto en la clase, naturalmente la clase se vuelve incompleta.

Podemos utilizar el método abstracto implementándolo en una subclase, es decir, una clase hereda la clase abstracta y luego implementa o proporciona el código para todos los métodos abstractos declarados en la clase abstracta sobrescribiéndolos.

Por lo tanto, es obligatorio anular el método abstracto en la subclase. Si el método abstracto no se implementa también en la subclase, entonces tenemos que declarar la subclase también como "abstracta".

La declaración general del método abstracto es:

```java
abstract void methodName (parameter_list){...}
```

Al escribir el método abstracto, debemos recordar las siguientes reglas:

- Una clase que contiene uno o más métodos abstractos es una clase abstracta.
- Algunas otras palabras clave no deben utilizarse con la palabra clave abstracto.

Por lo tanto, las siguientes combinaciones son ilegales en Java:

- `final`
- `abstract native`
- `abstract static`
- `abstract private`
- `abstract synchronized`
- `abstract strictfp`

```java
//abstract class
abstract class Bank{
    abstract int getInterestRate();
}

class Citi extends Bank{
    int getInterestRate(){
        return 7;
    }
}

class HSBC extends Bank{
    int getInterestRate(){
        return 6;
    }
}

class Main{
    public static void main(String args[]){
        Bank b;
        b = new Citi ();      // concrete class object
        System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");
        b = new HSBC ();        // concrete class object
        System.out.println("HSBC Rate of Interest is: "+b.getInterestRate()+"%");
    }
}
```

En el ejemplo anterior, tenemos una clase Banco. En esta clase, tenemos un método abstracto, getInterestRate(). Luego declaramos dos clases - ICICI y BOI que heredan de la clase Bank. Ambas clases implementan el método getInterestRate() devolviendo sus respectivos tipos de interés.

Después en el método principal, creamos un objeto banco. Primero, el objeto banco contiene un objeto de la clase ICICI y muestra el tipo de interés. A continuación, se crea el objeto BOI y muestra el tipo de interés.

Así, podemos suponer que la clase Banco es una especie de esquema o estructura que nos permite obtener un tipo de interés. A partir de esta estructura, podemos crear tantas clases concretas como queramos, y luego podemos obtener los respectivos tipos de interés para cada objeto banco (esto se muestra en el método main).