# Arrays
Los [arreglos](https://www.javatpoint.com/data-structure-array) en Java son estructuras de datos que permiten almacenar múltiples valores del mismo tipo en una única variable, accediendo a cada valor a través de un índice.

## Estructura y Declaración de Arreglos
Un arreglo en Java se declara especificando el tipo de datos seguido de corchetes [] y luego el nombre del arreglo. Puedes declararlo y luego inicializarlo o hacerlo en un solo paso:
1. Declaracion sin inicializacion:
    ```java
    int[] myArray; // Declara un arreglo de enteros
    ```
2. Declaración con inicialización:
    ```java
    int[] myArray = new int[10]; // Declara e inicializa un arreglo de 10 enteros
    ```
3. Declaración e inicialización con valores:
    ```java
    int[] myArray = {1, 2, 3, 4, 5}; // Declara e inicializa un arreglo con valores específicos
    ```

## Estructura de un Arreglo
- Índices: Los arreglos en Java son indexados, comenzando desde 0 hasta n-1, donde n es el número de elementos en el arreglo.
- Elementos: Cada elemento en el arreglo es accesible mediante su índice.

## Tipo de datos aceptados
Los arreglos en Java pueden almacenar cualquier tipo de dato primitivo (como int, char, float, etc.) y objetos. Aquí algunos ejemplos:
- Arreglo de enteros:
    ```java
    int[] intArray = new int[5];
    ```
- Arreglo de caracteres:
    ```java
    char[] charArray = {'a', 'b', 'c'};
    ```
- Arreglo de objetos:
    ```java
    String[] stringArray = new String[3];
    ```

## Inicialización y Acceso a Elementos

Puedes acceder y modificar los elementos del arreglo usando su índice:
```java
int[] numbers = new int[5];
numbers[0] = 10; // Asignar el valor 10 al primer elemento
int firstNumber = numbers[0]; // Acceder al primer elemento
```

## Arreglos Multidimensionales
Java también soporta arreglos multidimensionales, como los arreglos bidimensionales (matrices):
```java
int[][] matrix = new int[3][3]; // Declara una matriz de 3x3
```

## Características Adicionales
- Tamaño fijo: El tamaño de un arreglo se fija al momento de su creación y no puede cambiarse.
- Tipo homogéneo: Todos los elementos del arreglo deben ser del mismo tipo de datos.