# Java Encapsulation

La encapsulación es una de las características clave de la programación orientada a objetos. La encapsulación consiste en agrupar campos y métodos dentro de una misma clase.

Evita que las clases externas accedan a los campos y métodos de una clase y los modifiquen. Esto también ayuda a lograr la ocultación de datos.

### Ejemplo 1: Encapsulación

```java
class Area {

  // campos para calcular el área
  int length;
  int breadth;

  // constructor para inicializar los valores
  Area(int length, int breadth) {
      this.length = length;
      this.breadth = breadth;
  }

  // método para calcular el área
  public void getArea() {
      int area = length * breadth;
      System.out.println("Area: " + area);
  }
}

class Main {
  public static void main(String[] args) {
      // crear objeto de Área
      // valor de paso de longitud y anchura
      Area rectangle = new Area(5, 6);
      rectangle.getArea();
  }
}
```

***Salida:***

```text
Area: 30
```

En el ejemplo anterior, hemos creado una clase llamada `Area`. El objetivo principal de esta clase es calcular el área.

Para calcular un área, necesitamos dos variables: `length` y `breadth` y un método: `getArea()`. Por lo tanto, hemos agrupado estos campos y métodos en una sola clase.

En este caso, también se puede acceder a los campos y métodos desde otras clases. Por lo tanto, no se trata de una ocultación de datos.

Esto es sólo encapsulación. Sólo estamos manteniendo códigos similares juntos.

> Nota: La gente suele considerar la encapsulación como una ocultación de datos, pero eso no es del todo cierto.
> 
> La encapsulación consiste en agrupar campos y métodos relacionados. Puede utilizarse para ocultar datos. La encapsulación en sí misma no es una ocultación de datos.

## ¿Por qué encapsular?

En Java, la encapsulación nos ayuda a mantener juntos los campos y métodos relacionados, lo que hace que nuestro código sea más limpio y fácil de leer.

Ayuda a controlar los valores de nuestros campos de datos. Por ejemplo:

```java
class Person { 
    private int age;
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```

Aquí, estamos haciendo privada la variable `age` y aplicando la lógica dentro del método `setAge()`. Ahora, `age` no puede ser negativa.

Los métodos getter y setter proporcionan acceso de **sólo lectura** o **sólo escritura** a los campos de nuestra clase. Por ejemplo:

```java
getName()  // provides read-only access
setName() // provides write-only access
```

Ayuda a desacoplar componentes de un sistema. Por ejemplo, podemos encapsular código en varios paquetes.

Estos componentes desacoplados (bundle) pueden desarrollarse, probarse y depurarse de forma independiente y concurrente. Y, cualquier cambio en un componente en particular no tiene ningún efecto sobre otros componentes.

También podemos conseguir ocultar datos utilizando la encapsulación. En el ejemplo anterior, si cambiamos las variables length y breadth a private, entonces el acceso a estos campos queda restringido.

Y, se mantienen ocultos de las clases externas. Esto se denomina **ocultación de datos**.

## Data Hiding

La ocultación de datos es una forma de restringir el acceso a los miembros de nuestros datos ocultando los detalles de implementación. La encapsulación también permite ocultar datos.

Podemos utilizar modificadores de acceso para lograr la ocultación de datos. Por ejemplo:

```java
class Person {

    // private field
    private int age;

    // getter method
    public int getAge() {
        return age;
    }

    // setter method
    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Person
        Person p1 = new Person();

        // change age using setter
        p1.setAge(24);

        // access age using getter
        System.out.println("My age is " + p1.getAge());
    }
}
```

***Salida:***

```text
My age is 24
```

En el ejemplo anterior, tenemos un campo privado `age`. Como es privado, no se puede acceder a él desde fuera de la clase.

Para acceder a la edad, hemos utilizado los métodos públicos: getAge() y setAge(). Estos métodos se denominan métodos getter y setter.

Hacer privada la edad nos permitió restringir el acceso no autorizado desde fuera de la clase. Esto es ocultación de datos.

Si intentamos acceder al campo edad desde la clase Main, obtendremos un error.

```java
// error: age has private access in Person
p1.age = 24;
```