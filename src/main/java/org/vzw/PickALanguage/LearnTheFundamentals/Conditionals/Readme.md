# Condicionales

**Las declaraciones condicionales**, **expresiones** o simplemente **condicionales** son características de los lenguajes de programación que indican a la computadora que ejecute ciertas acciones, siempre que se cumplan ciertas condiciones.

**Los condicionales** se utilizan a través de los diversos lenguajes de programación para instruir a la computadora sobre la decisión a tomar cuando se presentan ciertas condiciones. Estas decisiones se toman si y solo si las condiciones preestablecidas son **verdaderas** o **falsas**, dependiendo de las funciones que el programador tenga en mente.

Ejemplo:

```java
 public static void Weather(String myDay) {
            if (myDay.equals("Sunny"))
            {
                System.out.println("Leer en la biblioteca");
            }
            else if (myDay.equals("Raining"))
            {
                System.out.println("Leer en casa");
            }
            else if (myDay.equals("Cloudy"))
            {
                System.out.println("Leer en el jardín");
            }
            else
            {
                System.out.println("Descansar");
            }
}
```

En el ejemplo anterior, podemos ver cómo un programa podría utilizarse para expresar diversas decisiones basadas en la veracidad o falsedad de las condiciones dadas.

Las declaraciones condicionales son vitales en el campo de la programación y la ingeniería de software, ya que las condiciones pueden ser usadas por los programadores e ingenieros de software para permitir que una máquina simule el comportamiento de una persona que tiene la capacidad de tomar decisiones y realizar acciones basadas en la decisión tomada.

## Declaracion IF
La sintaxis de if es tan simple como escribir if con llaves de apertura y cierre, seguido de la condición que se pretende comparar o verificar. La expresión if simplemente compara si la condición encerrada en las llaves es verdadera o falsa.

Si es verdadero, la condición if se ejecuta. Si es falsa, la ejecución pasa al siguiente bloque para verificar.
```java
if (day.equals("Monday")) // Condición
    {
        // Decisión
        System.out.println("Ir a la escuela");
}
```

## Declaracion Else IF
Mientras que la declaración if se puede usar para verificar una condición, else if se usa para verificar múltiples condiciones. La declaración else if tiene una sintaxis similar a la declaración if, seguida del bloque else if. Por ejemplo:
```java
if (myDay.equals("Sunny"))
    {
      // Decisión
      System.out.println("Leer en la biblioteca");
    }
    // 2ª condición
    else if (myDay.equals("Raining"))
    {
      // Decisión
      System.out.println("Leer en casa");
    }
    // 3ª condición
    else if (myDay.equals("Cloudy"))
    {
      // Decisión
      System.out.println("Leer en el jardín");
}
```

En las declaraciones else if, las condiciones se verifican de arriba hacia abajo. Si el primer bloque devuelve true, el segundo y el tercer bloque no serán verificados, pero si el primer bloque if devuelve false, se verificará el segundo bloque. Esta verificación continúa hasta que un bloque devuelve un resultado true.

## Declaracion Else
La declaración else es la declaración predeterminada de todas las expresiones condicionales, en todos los lenguajes de programación. Es decir, cuando todas las condiciones if y else if devuelven false, entonces se ejecuta el bloque final else. La sintaxis de else es simplemente escribir else seguido de la declaración predeterminada entre llaves de apertura y cierre.
```java
    // 1ª condición
    if (myDay.equals("Sunny"))
    {
      // Decisión
      System.out.println("Leer en la biblioteca");
    }
    // 2ª condición
    else if (myDay.equals("Raining"))
    {
      // Decisión
      System.out.println("Leer en casa");
    }
    // 3ª condición
    else if (myDay.equals("Cloudy"))
    {
      // Decisión
      System.out.println("Leer en el jardín");
    }
    else
    {
      // Decisión Predeterminada
      System.out.println("Descansar");
    }
```

### Switch
Es otra versión de la declaración condicional; hace que el código sea más limpio y legible en comparación con el convencional if, else if, else.

En las expresiones switch, cada bloque está terminado por una palabra clave break. Las declaraciones en switch se expresan con cases.
```java
  	int myDay = 4; // estableciendo el valor para probar
    switch (myDay) {
        case 1:
            System.out.println("Leer en la biblioteca");
            break;
        case 2:
            System.out.println("Leer en casa");
            break;
        case 3:
            System.out.println("Leer en el jardín");
            break;
        default:
            System.out.println("Descansar");
            break;
    }
```