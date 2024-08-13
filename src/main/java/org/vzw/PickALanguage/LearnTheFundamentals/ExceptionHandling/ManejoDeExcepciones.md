El manejo de excepciones es un aspecto crucial del desarrollo de software, ya que permite a los desarrolladores manejar con elegancia y recuperarse de errores inesperados o situaciones excepcionales que puedan producirse durante la ejecución del programa.

# Introduccion a Exception Handling en Java

El manejo de excepciones es el proceso de gestionar y responder a condiciones excepcionales que pueden ocurrir durante la ejecución de un programa. En Java, las excepciones son objetos que representan estas condiciones excepcionales. Cuando se produce una situación excepcional, se crea un objeto de excepción y se lanza para propagar el error por la pila de llamadas hasta que se captura y se maneja.

## Excepciones verificadas y no verificadas

En Java, las excepciones se clasifican en dos grandes categorías: excepciones comprobadas y excepciones no comprobadas.

### Checked exceptions

Se trata de excepciones que se comprueban en tiempo de compilación, lo que significa que el compilador impone el manejo de estas excepciones. Algunos ejemplos son IOException, SQLException y ClassNotFoundException.

### Unchecked exceptions

También conocidas como excepciones en tiempo de ejecución, estas excepciones no requieren un manejo explícito y no son comprobadas por el compilador. Algunos ejemplos son NullPointerException, ArrayIndexOutOfBoundsException y ArithmeticException.

## Jerarquía de clases de excepción de Java

La clase java.lang.Throwable es la clase raíz de la jerarquía de excepciones de Java heredada por dos subclases: Exception y Error. A continuación se indica la jerarquía de las clases de excepción de Java:

![Untitled](https://static.javatpoint.com/core/images/hierarchy-of-exception-handling.png)

## Tipos de excepciones de Java

Existen principalmente dos tipos de excepciones: comprobadas y no comprobadas. Un error se considera una excepción no comprobada. Sin embargo, según Oracle, hay tres tipos de excepciones a saber:

![Untitled](https://static.javatpoint.com/core/images/types-of-exception-handling.png)

### Diferencia entre excepciones comprobadas y no comprobadas

1. **Checked Exception:** Las clases que heredan directamente de la clase Throwable excepto RuntimeException y Error se conocen como excepciones comprobadas. Por ejemplo, IOException, SQLException, etc. Las excepciones verificadas se comprueban en tiempo de compilación.
2. **Unchecked Exception:** Las clases que heredan la RuntimeException se conocen como excepciones no comprobadas. Por ejemplo, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Las excepciones no comprobadas no se comprueban en tiempo de compilación, pero sí en tiempo de ejecución.
3. **Error:** es irrecuperable. Algunos ejemplos de errores son OutOfMemoryError, VirtualMachineError, AssertionError, etc.

## **Java Exception Keywords**

Java proporciona cinco palabras clave que se utilizan para manejar la excepción. La siguiente tabla describe cada una de ellas.

| Keyword | Description |
| --- | --- |
| try | La palabra clave "try" se utiliza para especificar un bloque donde debemos colocar un código de excepción. Esto significa que no podemos usar el bloque try solo. El bloque try debe ir seguido de catch o finally. |
| catch | El bloque "catch" se utiliza para manejar la excepción. Debe ir precedido por el bloque try, lo que significa que no podemos utilizar el bloque catch solo. Puede ser seguido por el bloque finally más tarde. |
| finally | El bloque "finally" se utiliza para ejecutar el código necesario del programa. Se ejecuta tanto si se gestiona una excepción como si no. |
| throw | La palabra clave "throw" se utiliza para lanzar una excepción. |
| throws | La palabra clave "throws" se utiliza para declarar excepciones. Especifica que puede ocurrir una excepción en el método. No lanza una excepción. Se utiliza siempre con la firma del método. |

## **Java Exception Handling Example**

Ver en proyecto archivo → `TryCatch.java` 

```java
public class JavaExceptionExample{
        public static void main(String args[]){
            try{
                //Código que puede provocar una excepción  
                int data=100/0;
            }catch(ArithmeticException e){System.out.println(e);}
            //Resto del código  
            System.out.println("Resto del código ...");
        }
    } 
```

## Escenarios comunes de las excepciones de Java

- Un escenario en el que se produce una ArithmeticException
    
    Si dividimos cualquier número por cero, se produce una ArithmeticException.
    
    ```java
    int a=50/0;//ArithmeticException  
    ```
    
- Un escenario en el que se produce una NullPointerException
    
    Si tenemos un valor nulo en cualquier variable, al realizar cualquier operación sobre la variable se lanza una NullPointerException.
    
    ```java
    String s = null;  
    System.out.println(s.length());//NullPointerException  
    ```
    
- Un escenario en el que se produce una NumberFormatException
    
    Si el formato de cualquier variable o número no coincide, puede provocar una NumberFormatException. Supongamos que tenemos una variable de cadena que tiene caracteres; la conversión de esta variable en dígito causará NumberFormatException.
    
    ```java
    String s ="abc";  
    int i=Integer.parseInt(s);//NumberFormatException  
    ```
    
- Escenario en el que se produce una ArrayIndexOutOfBoundsException
    
    Cuando un array excede su tamaño, se produce la ArrayIndexOutOfBoundsException. puede haber otras razones para que se produzca ArrayIndexOutOfBoundsException. Considera las siguientes sentencias.
    
    ```java
    int a[] = new int[5];  
    a[10] = 50; //ArrayIndexOutOfBoundsException  
    ```
    

# **Java catch block**

Ver en proyecto archivo → `ExceptionHandlingwithMethodOverriding.java` 

El bloque catch de Java se utiliza para manejar la Excepción declarando el tipo de excepción dentro del parámetro. La excepción declarada debe ser la excepción de la clase padre (es decir, Exception) o el tipo de excepción generado. Sin embargo, el buen enfoque es declarar el tipo de excepción generado.

El bloque catch debe utilizarse sólo después del bloque try. Puede utilizar varios bloques catch con un único bloque try.

### **Internal Working of Java try-catch block**

![Untitled](https://static.javatpoint.com/core/images/java-try-catch-block.png)

La JVM comprueba en primer lugar si la excepción se maneja o no. Si la excepción no se maneja, la JVM proporciona un manejador de excepciones por defecto que realiza las siguientes tareas:

- Imprime la descripción de la excepción.
- Imprime el seguimiento de la pila (jerarquía de métodos en los que se ha producido la excepción)
- Provoca la finalización del programa.

Pero si el programador de la aplicación gestiona la excepción, se mantiene el flujo normal de la aplicación, es decir, se ejecuta el resto del código.

# **Java Catch Multiple Exceptions**

Ver en proyecto archivo → `MultipleTryCatch.java` 

Un bloque try puede ir seguido de uno o más bloques catch. Cada bloque catch debe contener un manejador de excepciones diferente. Por lo tanto, si usted tiene que realizar diferentes tareas en la ocurrencia de diferentes excepciones, utilice java multi-catch bloque.

Es importante recordar que:

- Cada vez sólo se produce una excepción y cada vez sólo se ejecuta un bloque catch.
- Todos los bloques catch deben estar ordenados del más específico al más general, es decir, catch para ArithmeticException debe ir antes que catch para Exception.

### Diagrama de flujo del bloque de captura múltiple

![Untitled](https://static.javatpoint.com/core/images/multiple-catch-block-in-java.png)

# Nested Try Block

Ver en proyecto archivo → `NestedTryBlock.java` 

En Java, está permitido utilizar un bloque try dentro de otro bloque try. Se denomina bloque try anidado. Cada vez que introducimos una sentencia en el bloque try, el contexto de esa excepción se coloca en la pila.

Por ejemplo, el bloque try interno puede utilizarse para manejar la ArrayIndexOutOfBoundsException mientras que el bloque try externo puede manejar la ArithemeticException (división por cero).

### ¿Por qué utilizar un bloque try anidado?

A veces puede darse la situación de que una parte de un bloque cause un error y todo el bloque cause otro error. En estos casos, los manejadores de excepciones tienen que estar anidados.

# **Java finally block**

Ver en proyecto archivo → `FinallyBlock.java` 

El bloque finally de Java es un bloque que se utiliza para ejecutar código importante, como cerrar la conexión, etc.

El bloque finally de Java siempre se ejecuta tanto si se maneja una excepción como si no. Por lo tanto, contiene todas las sentencias necesarias que deben imprimirse independientemente de que se produzca o no la excepción.

El bloque finally sigue al bloque try-catch.

### Diagrama de flujo de bloque final

![Untitled](https://static.javatpoint.com/core/images/java-finally-block.png)

Nota: Si no manejas alguna excepción, antes de terminar el programa, la JVM ejecuta el bloque finally (si existe).

### ¿Por qué utilizar Java finally block?

- El bloque finally en Java se puede utilizar para poner código de "limpieza", como cerrar un archivo, cerrar la conexión, etc.
- Las declaraciones importantes que deben imprimirse pueden colocarse en el bloque finally.

# **Java throw Exception**

Ver en proyecto archivo → `ThrowKeyword.java` 

En Java, las excepciones nos permiten escribir códigos de buena calidad en los que los errores se comprueban en tiempo de compilación en lugar de en tiempo de ejecución y podemos crear excepciones personalizadas facilitando la recuperación y depuración del código.

### **Java throw keyword**

La palabra clave throw de Java se utiliza para lanzar una excepción explícitamente.

Especificamos el objeto de excepción que va a ser lanzado. La excepción contiene un mensaje que proporciona la descripción del error. Estas excepciones pueden estar relacionadas con las entradas del usuario, el servidor, etc.

En Java podemos lanzar excepciones controladas o no controladas mediante la palabra clave throw. Se utiliza principalmente para lanzar una excepción personalizada. Hablaremos de las excepciones personalizadas más adelante en esta sección.

También podemos definir nuestro propio conjunto de condiciones y lanzar una excepción explícitamente utilizando la palabra clave throw. Por ejemplo, podemos lanzar una ArithmeticException si dividimos un número por otro. Aquí, sólo tenemos que establecer la condición y lanzar la excepción utilizando la palabra clave throw.

La sintaxis de la palabra clave throw de Java se indica a continuación.

```java
throw new exception_class("error message");  
```

Ejemplo:

```java
throw new IOException("sorry device error");   
```

Donde la Instancia debe ser de tipo Throwable o subclase de Throwable. Por ejemplo, Exception es la subclase de Throwable y las excepciones definidas por el usuario suelen extender la clase Exception.

# **Java Exception Propagation**

Ver en proyecto archivo → `ExceptionPropagation.java` 

Una excepción se lanza primero desde la parte superior de la pila y, si no se captura, desciende por la pila de llamadas hasta el método anterior. Si no es capturada allí, la excepción vuelve a descender al método anterior, y así sucesivamente hasta que son capturadas o hasta que llegan al final de la pila de llamadas. Esto se denomina propagación de excepciones.

Nota: Por defecto, las excepciones no comprobadas se reenvían en la cadena de llamada (se propagan).

# **Java throws keyword**

Ver en proyecto archivo → `ThrowsKeyword.java` 

La palabra clave throws de Java se utiliza para declarar una excepción. Informa al programador de que puede producirse una excepción. Por lo tanto, es mejor para el programador proporcionar el código de manejo de excepciones para que el flujo normal del programa se pueda mantener.

El Manejo de Excepciones se utiliza principalmente para manejar las excepciones verificadas. Si se produce alguna excepción no comprobada como NullPointerException, es culpa del programador que no está comprobando el código antes de ser utilizado.

### **Syntax of Java throws**

```java
return_type method_name() throws exception_class_name{  
//method code  
}  
```

### ¿Qué excepción debe declararse?

- excepción no controlada: bajo nuestro control para que podamos corregir nuestro código.
- error: fuera de nuestro control. Por ejemplo, no podemos hacer nada si se produce un VirtualMachineError o un StackOverflowError.

### Ventajas de la palabra clave throws de Java

Ahora la Excepción Comprobada puede ser propagada (reenviada en la pila de llamadas).

Proporciona información a la persona que llama al método sobre la excepción.

# Diferencia entre throw y throws en Java

Ver en proyecto archivo → `ThrowAndThrows.java` 

La palabra clave throw y throws es el concepto de manejo de excepciones donde la palabra clave throw lanza la excepción explícitamente desde un método o un bloque de código mientras que la palabra clave throws se utiliza en la firma del método.

|  | Base de las diferencias | throw | throws |
| --- | --- | --- | --- |
| 1. | Definición | La palabra clave throw de Java se utiliza para lanzar una excepción explícitamente en el código, dentro de la función o del bloque de código. | La palabra clave Java throws se utiliza en la firma del método para declarar una excepción que puede ser lanzada por la función durante la ejecución del código. |
| 2. | Utilización | Tipo de excepción Utilizando la palabra clave throw, sólo podemos propagar una excepción no comprobada, es decir, la excepción comprobada no puede propagarse utilizando sólo throw. | Utilizando la palabra clave throws, podemos declarar tanto excepciones comprobadas como no comprobadas. Sin embargo, la palabra clave throws sólo se puede utilizar para propagar excepciones comprobadas. |
| 3. | Sintaxis | La palabra clave throw va seguida de una instancia de Excepción a lanzar. | La palabra clave throws va seguida de los nombres de clase de las Excepciones a lanzar. |
| 4. | Declaración | dentro del método. | throws se utiliza con la firma del método. |
| 5. | Aplicación interna | Sólo podemos lanzar una excepción a la vez, es decir, no podemos lanzar múltiples excepciones. | Podemos declarar múltiples excepciones usando la palabra clave throws que pueden ser lanzadas por el método. Por ejemplo, main() lanza IOException, SQLException. |

# Diferencia entre final, finally y finalize

Ver en proyecto archivo → `FinalOrFinallyOrFinalize.java` 

Final, finally y finalize son palabras clave en Java que se utilizan en el manejo de excepciones. Cada una de estas palabras clave tiene una funcionalidad diferente. La diferencia básica entre final, finally y finalize es que final es un modificador de acceso, finally es el bloque en Manejo de Excepciones y finalize es el método de clase objeto.

|  | Key | final | finally | finalize |
| --- | --- | --- | --- | --- |
| 1. | Definición | final es la palabra clave y modificador de acceso que se utiliza para aplicar restricciones a una clase, método o variable. | finally es el bloque en Java Exception Handling para ejecutar el código importante tanto si se produce la excepción como si no. | finalize es el método en Java que se utiliza para realizar un proceso de limpieza justo antes de que el objeto sea recolectado. |
| 2. | Aplicable a | Final se utiliza con las clases, métodos y variables. | El bloque Finally siempre está relacionado con los bloques try y catch en el manejo de excepciones. | El método finalize() se utiliza con los objetos. |
| 3. | Funcionalidad | 1. Una vez declarada, la variable final se convierte en constante y no puede modificarse.
2. El método final no puede ser sobrescrito por una subclase.
3. clase final no se puede heredar. | 1. El bloque finally ejecuta el código importante aunque se produzca o no una excepción.
2. el bloque finally limpia todos los recursos utilizados en el bloque try. | El método finalize realiza las actividades de limpieza con respecto al objeto antes de su destrucción. |
| 4. | Ejecución | El método final se ejecuta sólo cuando lo llamamos. | El bloque Finally se ejecuta tan pronto como se ejecuta el bloque try-catch.
Su ejecución no depende de la excepción. | finalize se ejecuta justo antes de destruir el objeto. |

# Manejo de excepciones con sustitución de métodos en Java

Ver en proyecto archivo → `ExceptionHandlingwithMethodOverriding.java` 

Hay muchas reglas si hablamos de sobreescritura de métodos con manejo de excepciones.

- Si el método de la superclase no declara una excepción
    - Si el método de la superclase no declara una excepción, el método sobrescrito de la subclase no puede declarar la excepción comprobada, pero puede declarar la excepción no comprobada.
- Si el método de la superclase declara una excepción
    - Si el método de la superclase declara una excepción, el método anulado de la subclase puede declarar lo mismo, una excepción de la subclase o ninguna excepción, pero no puede declarar la excepción padre.

### Si el método de la superclase no declara una excepción

- Regla 1: Si el método de la superclase no declara una excepción, el método sobrescrito de la subclase no puede declarar la excepción comprobada.
    
    Ejemplo en proyecto archivo → `TestExceptionChild.java` 
    
- Regla 2: Si el método de la superclase no declara una excepción, el método sobrescrito de la subclase no puede declarar la excepción comprobada, pero puede declarar la excepción no comprobada.
    
    Ejemplo en proyecto archivo → `TestExceptionChild1.java` 
    

### Si el método de la superclase declara una excepción

Regla 1: Si el método de la superclase declara una excepción, el método sobrescrito de la subclase puede declarar la misma excepción de la subclase o ninguna excepción, pero no puede declarar la excepción padre.

- Ejemplo en caso de que un método anulado de una subclase declare una excepción padre
    
    Ejemplo en proyecto archivo → `TestExceptionChild2.java` 
    
- Ejemplo en caso de que el método anulado de una subclase declare la misma excepción
    
    Ejemplo en proyecto archivo → `TestExceptionChild3.java` 
    
- Ejemplo en caso de que un método sobrescrito de una subclase declare una excepción de subclase
    
    Ejemplo en proyecto archivo → `TestExceptionChild4.java` 
    
- Ejemplo en caso de que el método anulado de la subclase no declare ninguna excepción
    
    Ejemplo en proyecto archivo → `TestExceptionChild5.java` 
    

# **Java Custom Exception**

Ver en proyecto archivo → `CustomExceptions.java` 

En Java, podemos crear nuestras propias excepciones que son clases derivadas de la clase Exception. La creación de nuestra propia excepción se conoce como excepción personalizada o excepción definida por el usuario. Básicamente, Java excepciones personalizadas se utilizan para personalizar la excepción de acuerdo a las necesidades del usuario.

### ¿Por qué utilizar excepciones personalizadas?

Las excepciones Java cubren casi todo el tipo general de excepciones que pueden ocurrir en la programación. Sin embargo, a veces necesitamos crear excepciones personalizadas.

Algunas de las razones para utilizar excepciones personalizadas:

- Atrapar y dar un tratamiento específico a un subconjunto de excepciones Java existentes.
- Excepciones de lógica empresarial: Son las excepciones relacionadas con la lógica de negocio y el flujo de trabajo. Es útil para que los usuarios de la aplicación o los desarrolladores comprendan el problema exacto.

Para crear una excepción personalizada, necesitamos extender la clase Exception que pertenece al paquete java.lang.

Considere el siguiente ejemplo, donde creamos una excepción personalizada llamada WrongFileNameException:

```java
public class WrongFileNameException extends Exception {  
    public WrongFileNameException(String errorMessage) {  
	    super(errorMessage);  
    }  
} 
```

Nota: Necesitamos escribir el constructor que toma el String como mensaje de error y se llama constructor de la clase padre.