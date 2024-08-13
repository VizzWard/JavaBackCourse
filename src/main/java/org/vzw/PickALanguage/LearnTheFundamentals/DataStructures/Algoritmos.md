# Algoritmos

## Que es un algoritmo?
Un algoritmo <mark>es un proceso o un conjunto de reglas necesarias para realizar cálculos u otras operaciones de resolución de problemas</mark>, especialmente mediante un ordenador. La definición formal de un algoritmo es que <mark>contiene el conjunto finito de instrucciones que se llevan a cabo en un orden específico para realizar la tarea específica.</mark> No es el programa o código completo; es sólo una solución (lógica) de un problema, que puede representarse como una descripción informal mediante un Diagrama de Flujo o Pseudocódigo.

## Características de un algoritmo

- Entrada: Un algoritmo tiene algunos valores de entrada. Podemos pasar 0 o algún valor de entrada a un algoritmo.
- Salida: Obtendremos 1 o más salidas al final de un algoritmo.
- Falta de ambigüedad: Un algoritmo debe ser inequívoco, lo que significa que las instrucciones de un algoritmo deben ser claras y sencillas.
- Finitud: Un algoritmo debe ser finito. Aquí, finitud significa que el algoritmo debe contener un número limitado de instrucciones, es decir, las instrucciones deben ser contables.
- Eficacia: Un algoritmo debe ser eficaz, ya que cada instrucción de un algoritmo afecta al proceso global.
- Independiente del lenguaje: Un algoritmo debe ser independiente del lenguaje para que las instrucciones de un algoritmo puedan implementarse en cualquiera de los lenguajes con el mismo resultado.

## Flujo de datos de un algoritmo

- Problema: Un problema puede ser un problema del mundo real o cualquier instancia del problema del mundo real para el que necesitamos crear un programa o el conjunto de instrucciones. El conjunto de instrucciones se conoce como algoritmo.
- Algoritmo: Se diseñará un algoritmo para un problema que es un procedimiento paso a paso.
- Entradas: Después de diseñar un algoritmo, las entradas requeridas y deseadas se proporcionan al algoritmo.
- Unidad de procesamiento: La unidad de procesamiento recibirá la entrada y producirá la salida deseada.
- Salida: La salida es el resultado del programa.

## ¿Por qué necesitamos algoritmos?

- Escalabilidad: Nos ayuda a comprender la escalabilidad. Cuando tenemos un gran problema en el mundo real, necesitamos reducirlo a pequeños pasos para analizar el problema con facilidad.
- Rendimiento: El mundo real no se descompone fácilmente en pasos más pequeños. Si el problema se puede dividir fácilmente en pasos más pequeños, significa que el problema es factible.
- Vamos a entender el algoritmo a través de un ejemplo del mundo real. Supongamos que queremos hacer un zumo de limón, así que los siguientes son los pasos necesarios para hacer un zumo de limón:
    1. En primer lugar, cortaremos el limón por la mitad.
    2. Exprime el limón todo lo que puedas y saca su zumo en un recipiente.
    3. Añadir dos cucharadas de azúcar.
    4. Remover el recipiente hasta que se disuelva el azúcar.
    5. Cuando el azúcar se haya disuelto, añade agua y hielo.
    6. Guarde el zumo en el frigorífico de 5 a minutos.
    7. Ahora, está listo para beber.
    
    El mundo real anterior puede compararse directamente con la definición del algoritmo. No podemos realizar el paso 3 antes que el paso 2, necesitamos seguir el orden específico para hacer zumo de limón. Un algoritmo también dice que todas y cada una de las instrucciones deben seguirse en un orden específico para realizar una tarea concreta.
    
- Ahora veremos un ejemplo de algoritmo en programación. Escribiremos un algoritmo para sumar dos números introducidos por el usuario.
    
    A continuación se indican los pasos necesarios para sumar dos números introducidos por el usuario:
    
    1. Inicio
    2. Declara tres variables a, b y suma.
    3. Introduzca los valores de a y b.
    4. Suma los valores de a y b y almacena el resultado en la variable suma, es decir, suma=a+b.
    5. Imprimir suma
    6. Stop

## Factores de un algoritmo

A continuación se enumeran los factores que debemos tener en cuenta para diseñar un algoritmo:

- Modularidad: Si se da cualquier problema y podemos dividir ese problema en pequeños módulos o pequeños  pasos, significa que esta característica ha sido perfectamente diseñada para el algoritmo.
- Corrección: La corrección de un algoritmo se define como cuando las entradas dadas producen la salida deseada. El análisis de un algoritmo se ha hecho correctamente.
- Mantenibilidad: Aquí, mantenibilidad significa que el algoritmo debe ser diseñado de una manera estructurada muy simple para que cuando redefinimos el algoritmo, ningún cambio importante se hará en el algoritmo.
- Funcionalidad: Considera varios pasos lógicos para resolver el problema del mundo real.
- Robustez: La robustez significa que un algoritmo puede definir claramente nuestro problema.
- Facilidad de uso: Si el algoritmo no es fácil de usar, el diseñador no podrá explicárselo al programador.
- Simplicidad: Si el algoritmo es simple, entonces es fácil de entender.
- Extensibilidad: Si cualquier otro diseñador de algoritmos o programador quiere utilizar su algoritmo, entonces debe ser extensible.

## Importancia de los algoritmos

1. Importancia teórica: Cuando se nos plantea cualquier problema del mundo real y lo descomponemos en pequeños módulos. Para descomponer el problema, debemos conocer todos los aspectos teóricos. 
2. Importancia práctica: Como sabemos, la teoría no puede completarse sin la aplicación práctica. Así pues, la importancia del algoritmo puede considerarse tanto teórica como práctica.

## Cuestiones de algoritmos

A continuación se enumeran los problemas que surgen al diseñar un algoritmo:

- Cómo diseñar algoritmos: Como sabemos que un algoritmo es un procedimiento paso a paso, debemos seguir algunos pasos para diseñar un algoritmo.
- Cómo analizar la eficiencia de un algoritmo.

## Enfoques del algoritmo

A continuación se presentan los enfoques utilizados tras considerar tanto la importancia teórica como práctica del diseño de un algoritmo:

- Algoritmo de fuerza bruta: Se aplica la estructura lógica general para diseñar un algoritmo. También se conoce como algoritmo de búsqueda exhaustiva que busca todas las posibilidades para proporcionar la solución requerida. Estos algoritmos son de dos tipos:
    - Optimización: Encontrar todas las soluciones de un problema y luego sacar la mejor solución o si se conoce el valor de la mejor solución entonces terminará si se conoce la mejor solución.
    - Sacrificar: Tan pronto como se encuentre la mejor solución, entonces se detendrá.
- Divide y vencerás: Es una implementación muy de un algoritmo. Permite diseñar un algoritmo en una variación paso a paso. Descompone el algoritmo para resolver el problema en diferentes métodos. Permite descomponer el problema en diferentes métodos, y se produce una salida válida para la entrada válida. Esta salida válida se pasa a alguna otra función.
- Algoritmo codicioso: Es un paradigma de algoritmo que realiza una elección óptima en cada iteración con la esperanza de obtener la mejor solución. Es fácil de implementar y tiene un tiempo de ejecución más rápido. Sin embargo, son muy raros los casos en los que proporciona la solución óptima.
- Programación dinámica: Hace que el algoritmo sea más eficiente almacenando los resultados intermedios. Sigue cinco pasos diferentes para encontrar la solución óptima del problema:
    - Descompone el problema en un subproblema para encontrar la solución óptima.
    - Tras descomponer el problema, encuentra la solución óptima a partir de estos subproblemas.
    - Almacenar el resultado de los subproblemas se conoce como memorización.
    - Reutilizar el resultado para que no pueda volver a calcularse para los mismos subproblemas.
    - Por último, calcula el resultado del programa complejo.
- Algoritmo Branch and Bound: El algoritmo de rama y límite sólo puede aplicarse a problemas de programación entera. Este método divide todos los conjuntos de soluciones viables en subconjuntos más pequeños. Estos subconjuntos se evalúan posteriormente para encontrar la mejor solución.
- Algoritmo aleatorio: Como hemos visto en un algoritmo regular, tenemos una entrada predefinida y una salida requerida. Aquellos algoritmos que tienen algún conjunto definido de entradas y salida requerida, y siguen algunos pasos descritos se conocen como algoritmos deterministas. ¿Qué ocurre cuando se introduce una variable aleatoria en un algoritmo aleatorio? En un algoritmo aleatorio, algunos bits aleatorios son introducidos por el algoritmo y añadidos en la entrada para producir la salida, que es aleatoria por naturaleza. Los algoritmos aleatorios son más sencillos y eficientes que los algoritmos deterministas.
- Backtracking: El backtracking es una técnica algorítmica que resuelve el problema recursivamente y elimina la solución si no satisface las restricciones de un problema.

A continuación se indican las principales categorías de algoritmos:

- **Sort**: Algoritmo desarrollado para clasificar los elementos en un orden determinado.
- **Search**: Algoritmo desarrollado para buscar los elementos dentro de una estructura de datos.
- **Delete**: Algoritmo desarrollado para borrar el elemento existente dentro de una estructura de datos.
- **Insert**: Algoritmo desarrollado para insertar un elemento dentro de una estructura de datos.
- **Update**: Algoritmo desarrollado para actualizar el elemento existente dentro de una estructura de datos.

## Análisis de algoritmos

El algoritmo se puede analizar en dos niveles, es decir, el primero es antes de crear el algoritmo, y el segundo es después de crear el algoritmo. A continuación se presentan los dos análisis de un algoritmo:

- Análisis previo: El análisis previo es el análisis teórico de un algoritmo que se realiza antes de implementarlo. Se pueden tener en cuenta varios factores antes de implementar el algoritmo, como la velocidad del procesador, que no afecta a la parte de implementación.
- Análisis posterior: En este caso, el análisis posterior es un análisis práctico de un algoritmo. El análisis práctico se consigue implementando el algoritmo utilizando cualquier lenguaje de programación. Este análisis evalúa básicamente el tiempo de ejecución y el espacio que ocupa el algoritmo.

## Complejidad del algoritmo

El rendimiento del algoritmo puede medirse en dos factores:

- Complejidad temporal
    
    La complejidad temporal de un algoritmo es la cantidad de tiempo necesaria para completar la ejecución. La complejidad temporal de un algoritmo se denota mediante la notación big O. Aquí, la notación big O es la notación asintótica para representar la complejidad temporal. La complejidad temporal se calcula principalmente contando el número de pasos necesarios para finalizar la ejecución. Vamos a entender la complejidad temporal a través de un ejemplo.
    
    ```java
    sum = 0;  
    // Supongamos que tenemos que calcular la suma de n números. 
    for i = 1 to n  
        sum = sum + i;  
    // cuando el bucle termina entonces sum mantiene la suma de los n números 
    return sum;  
    ```
    
    En el código anterior, la complejidad temporal de la sentencia del bucle será al menos n, y si el valor de n aumenta, entonces la complejidad temporal también aumenta. Mientras que la complejidad del código, es decir, la suma de retorno será constante ya que su valor no depende del valor de n y proporcionará el resultado en un solo paso. Por lo general, consideramos la complejidad en el peor momento, ya que es el tiempo máximo que se tarda para cualquier tamaño de entrada dado.
    
- Complejidad espacial
    
    La complejidad espacial de un algoritmo es la cantidad de espacio necesario para resolver un problema y producir un resultado. Al igual que la complejidad temporal, la complejidad espacial también se expresa en notación big O.
    
    Para un algoritmo, el espacio es necesario para los siguientes fines:
    
    1. Para almacenar instrucciones de programa.
    2. Para almacenar valores constantes.
    3. Para almacenar valores variables.
    4. Para realizar un seguimiento de las llamadas a funciones, los saltos de sentencia, etc.
    
    Espacio auxiliar: El espacio extra requerido por el algoritmo, excluyendo el tamaño de la entrada, se conoce como espacio auxiliar. La complejidad espacial considera ambos espacios, es decir, el espacio auxiliar y el espacio utilizado por la entrada.
    
    Entonces:
    
    Complejidad espacial = Espacio auxiliar + Tamaño de entrada.
    

## Tipos de algoritmos

Los siguientes son los tipos de algoritmos: 

- Algoritmo de búsqueda.
    
    Cada día buscamos algo en nuestra vida cotidiana. Del mismo modo, en el caso de los ordenadores, se almacenan grandes cantidades de datos y, cuando el usuario los solicita, el ordenador los busca en la memoria y se los proporciona. Hay principalmente dos técnicas disponibles para buscar los datos en una matriz:
    
    - **Linear search**
        
        La búsqueda lineal es un algoritmo muy sencillo que empieza a buscar un elemento o un valor desde el principio de una matriz hasta que no encuentra el elemento deseado. Compara el elemento a buscar con todos los elementos de un array, si se encuentra la coincidencia, entonces devuelve el índice del elemento sino devuelve -1. Este algoritmo se puede implementar en la lista sin ordenar.
        
    - **Binary Search**
        
        Un algoritmo binario es el algoritmo más simple que busca el elemento muy rápidamente. Se utiliza para buscar el elemento de la lista ordenada. Los elementos deben almacenarse en orden secuencial o de forma ordenada para aplicar el algoritmo binario. La búsqueda binaria no puede implementarse si los elementos se almacenan de forma aleatoria. Se utiliza para encontrar el elemento central de la lista.
        
- Algoritmo de ordenación.
    
    Los algoritmos de ordenación se utilizan para reordenar los elementos de una matriz o de una estructura de datos en orden ascendente o descendente. El operador de comparación decide el nuevo orden de los elementos.
    
    - ¿Por qué necesitamos un algoritmo de clasificación?
        - Un algoritmo de ordenación eficiente es necesario para optimizar la eficiencia de otros algoritmos como el algoritmo de búsqueda binaria, ya que un algoritmo de búsqueda binaria requiere que una matriz se ordene en un orden particular, principalmente en orden ascendente.
        - Produce información en un orden clasificado, que es un formato legible para el ser humano.
        - La búsqueda de un elemento concreto en una lista ordenada es más rápida que en una lista sin ordenar.

### Notas
Los algoritmos son secuencias de pasos diseñadas para realizar una tarea específica. Los principales tipos incluyen:

- Algoritmos de Ordenamiento: Organizadores de datos en una secuencia específica. Ejemplos:
- Bubble Sort: Comparación y intercambio de elementos adyacentes.
- Quick Sort: Selección de un pivote para dividir y conquistar.
- Merge Sort: División de datos en sublistas y combinación ordenada.
- Algoritmos de Búsqueda: Encuentran elementos dentro de una estructura de datos. Ejemplos:
- Linear Search: Revisión secuencial de elementos.
- Binary Search: Búsqueda en una estructura ordenada dividiendo el rango de búsqueda a la mitad.

La complejidad de un algoritmo evalúa su rendimiento en términos de tiempo y espacio:

- Complejidad Temporal: Mide el tiempo que toma ejecutar un algoritmo en función del tamaño de la entrada.
- Complejidad Espacial: Mide la cantidad de memoria requerida por el algoritmo.