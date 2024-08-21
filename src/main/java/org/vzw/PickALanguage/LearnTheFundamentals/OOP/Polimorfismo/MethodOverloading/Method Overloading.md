# Method Overloading

Si una clase tiene múltiples métodos con el mismo nombre pero diferentes parámetros, se conoce como sobrecarga de métodos.

Si tenemos que realizar una sola operación, tener el mismo nombre de los métodos aumenta la legibilidad del programa.

Supongamos que tienes que realizar la suma de los números dados pero puede haber cualquier número de argumentos, si escribes el método como a(int,int) para dos parámetros, y b(int,int,int) para tres parámetros entonces puede ser difícil para ti así como para otros programadores entender el comportamiento del método porque su nombre difiere.

> Ventajas de la sobrecarga de métodos:
> 
> La sobrecarga de métodos aumenta la legibilidad del programa.

**Diferentes formas de sobrecargar el método**:

- [Cambiando el número de argumentos.](MethodOverloading1.java)
- [Cambiando el tipo de datos.](MethodOverloading2.java)

## ¿Por qué la sobrecarga de métodos no es posible cambiando únicamente el tipo de retorno del método?

En java, la sobrecarga de métodos no es posible cambiando el tipo de retorno del método sólo por ambigüedad. Veamos cómo puede ocurrir la ambigüedad:

```java
class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static double add(int a,int b){
        return a+b;
    }
}
class TestOverloading3{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));//ambiguity  
    }
}
```

***Salida:***

```text
Compile Time Error: method add(int,int) is already defined in class Adder
```

> Nota: El error en tiempo de compilación es mejor que el error en tiempo de ejecución. Así, el compilador de java renderiza el error de tiempo de compilación si se declara el mismo método que tiene los mismos parámetros.

## ¿Podemos sobrecargar el método main() de java?

Sí, mediante la sobrecarga de métodos. Se puede tener cualquier número de métodos principales en una clase por sobrecarga de métodos. Pero la JVM llama al método main() que sólo recibe un array de cadenas como argumentos. Veamos un ejemplo sencillo:

```java
class TestOverloading4{
    public static void main(String[] args){
        System.out.println("main with String[]");
    }
    
    public static void main(String args){
        System.out.println("main with String");
    }
    
    public static void main(){
        System.out.println("main without args");
    }
}
```

***Salida:***

```text
main with String[]
```

## Sobrecarga de métodos y promoción de tipos

Un tipo es promovido a otro implícitamente si no se encuentra un tipo de dato coincidente. Entendamos el concepto:

![](https://static.javatpoint.com/images/java-type-promotion.png)

Como se muestra en el diagrama anterior, byte puede promoverse a short, int, long, float o double. El tipo de datos short puede convertirse en int, long, float o double. El tipo de datos char puede convertirse en int, long, float o double, etc.

### Ejemplos

- [Ejemplo de sobrecarga de métodos con TypePromotion](OverloadingCalculation1.java)
- [Ejemplo de sobrecarga de métodos con promoción de tipos si se encuentran coincidencias](OverloadingCalculation2.java)
- [Ejemplo de sobrecarga de métodos con promoción de tipos en caso de ambigüedad](OverloadingCalculation3.java)

> Un tipo no se despromueve implícitamente, por ejemplo, double no puede despromoverse a ningún tipo implícitamente.