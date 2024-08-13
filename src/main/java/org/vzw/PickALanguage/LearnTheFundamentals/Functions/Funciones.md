# Funciones

### Métodos en Java

Un método es un bloque de código que solo se ejecuta cuando se le llama.

Puedes pasar datos, conocidos como parámetros, a un método. Los métodos se utilizan para realizar ciertas acciones, y también se conocen como funciones.

**Crear un Método**

Un método debe ser declarado dentro de una clase. Se define con el nombre del método, seguido de paréntesis (). Java proporciona algunos métodos predefinidos, como `System.out.println()`, pero también puedes crear tus propios métodos para realizar ciertas acciones:

```java
public class Main {
    // Crear un método dentro de main:
    static void myMethod() {
        // Código a ejecutar
    }
}
```

**Llamar a un Método**

Para llamar a un método en Java, escribe el nombre del método seguido de dos paréntesis () y un punto y coma ;.
```java
public class Main {
    static void myMethod() {
        System.out.println("¡Acabo de ser ejecutado!");
    }

    public static void main(String[] args) {
        myMethod();
    }
}
```
Salida:
```java
"¡Acabo de ser ejecutado!"
```    
Un método también se puede llamar varias veces:
```java
public class Main {
    static void myMethod() {
        System.out.println("¡Acabo de ser ejecutado!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}
```
**Salida:**
```java
¡Acabo de ser ejecutado!
¡Acabo de ser ejecutado!
¡Acabo de ser ejecutado!
```

## Que es un metodo en java?
Un método es un bloque de código o una colección de declaraciones o un conjunto de código agrupado para realizar una tarea u operación determinada. Se utiliza para lograr la reutilización del código. Escribimos un método una vez y lo usamos muchas veces. No es necesario escribir el código una y otra vez. También proporciona una fácil modificación y legibilidad del código, simplemente agregando o eliminando un bloque de código. El método se ejecuta solo cuando lo llamamos o invocamos.

El método más importante en Java es el método **`main()`**.

### Declaracion del Metodo
La declaración del método proporciona información sobre los atributos del método, como visibilidad, tipo de retorno, nombre y argumentos. Tiene seis componentes que se conocen como encabezado del método, como se muestra en la siguiente figura.

![img](https://media.geeksforgeeks.org/wp-content/uploads/methods-in-java.png)

**Firma del Método**: Cada método tiene una firma de método. Es una parte de la declaración del método. Incluye el nombre del método y la lista de parámetros.

**Especificador de Acceso**: El especificador de acceso o modificador es el tipo de acceso del método. Especifica la visibilidad del método. Java proporciona cuatro tipos de especificadores de acceso:

- **Public**: El método es accesible por todas las clases cuando se usa el especificador public en nuestra aplicación.
- **Private**: Cuando usamos un especificador de acceso private, el método es accesible solo en las clases en las que está definido.
- **Protected**: Cuando usamos un especificador de acceso protected, el método es accesible dentro del mismo paquete o en subclases en un paquete diferente.
- **Default**: Cuando no usamos ningún especificador de acceso en la declaración del método, Java usa el especificador de acceso default por defecto. Es visible solo desde el mismo paquete.

**Tipo de Retorno**: El tipo de retorno es un tipo de dato que el método devuelve. Puede tener un tipo de dato primitivo, objeto, colección, void, etc. Si el método no devuelve nada, usamos la palabra clave void.

**Nombre del Método**: Es un nombre único que se usa para definir el nombre de un método. Debe corresponder a la funcionalidad del método. Por ejemplo, si estamos creando un método para la resta de dos números, el nombre del método debe ser subtraction(). Un método se invoca por su nombre.

**Lista de Parámetros**: Es la lista de parámetros separados por una coma y encerrados en paréntesis. Contiene el tipo de dato y el nombre de la variable. Si el método no tiene parámetros, deja los paréntesis en blanco.

**Cuerpo del Método**: Es una parte de la declaración del método. Contiene todas las acciones a realizar. Está encerrado entre llaves.

### Nombrar un Método
Al definir un método, recuerda que el nombre del método debe ser un verbo y comenzar con una letra minúscula. Si el nombre del método tiene más de dos palabras, el primer nombre debe ser un verbo seguido de un adjetivo o sustantivo. En el nombre de métodos con múltiples palabras, la primera letra de cada palabra debe estar en mayúscula, excepto la primera palabra. Por ejemplo:

Nombre de método de una sola palabra: `sum()`, `area()`.

Nombre de método de múltiples palabras: `areaOfCircle()`, `stringComparison()`.

También es posible que un método tenga el mismo nombre que otro método en la misma clase, esto se conoce como sobrecarga de métodos.