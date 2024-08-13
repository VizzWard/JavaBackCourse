# Linked List
La lista enlazada es una estructura de datos lineal que incluye una serie de nodos conectados. Una lista enlazada puede definirse como los nodos que se almacenan aleatoriamente en la memoria. Un nodo de la lista enlazada contiene dos partes, es decir, la primera es la parte de datos y la segunda es la parte de direcciones. El último nodo de la lista contiene un puntero a null. Después del array, la lista enlazada es la segunda estructura de datos más utilizada. En una lista enlazada, cada enlace contiene una conexión con otro enlace

## Representación de una lista enlazada

Una lista enlazada puede representarse como una conexión de nodos en la que cada nodo apunta al siguiente nodo de la lista.

![Untitled](https://static.javatpoint.com/ds/images/ds-linked-list.png)

Hasta ahora, hemos estado utilizando la estructura de datos Array para organizar el grupo de elementos que van a ser almacenados individualmente en la memoria. Sin embargo, Array tiene varias ventajas y desventajas que deben ser conocidas para decidir la estructura de datos que se utilizará en todo el programa.

## ¿Por qué utilizar listas enlazadas en lugar de matrices?

La lista enlazada es una estructura de datos que supera las limitaciones de las matrices. Veamos primero algunas de las limitaciones de las matrices

- El tamaño de la matriz debe conocerse de antemano antes de utilizarla en el programa.
- Aumentar el tamaño de la matriz es un proceso que lleva tiempo. Es casi imposible ampliar el tamaño de la matriz en tiempo de ejecución.
- Todos los elementos de la matriz deben almacenarse de forma contigua en la memoria. Para insertar un elemento en la matriz es necesario desplazar todos sus predecesores.

Las listas enlazadas son útiles porque:

- Asigna la memoria dinámicamente. Todos los nodos de la lista enlazada se almacenan de forma no contigua en la memoria y se enlazan entre sí con la ayuda de punteros.
- En las listas enlazadas, el tamaño deja de ser un problema, ya que no es necesario definirlo en el momento de la declaración. La lista crece según la demanda del programa y se limita al espacio de memoria disponible.

## ¿Cómo declarar una lista enlazada?

Es sencillo declarar un array, ya que es de tipo simple, mientras que la declaración de una lista enlazada es un poco más típica que la de un array. La lista enlazada contiene dos partes, y ambas son de tipos diferentes, es decir, una es la variable simple, mientras que la otra es la variable puntero. Podemos declarar la lista enlazada utilizando la estructura de tipos de datos definida por el usuario.

```java
struct node<data type> name = new struct node <>();
// Declaración e inicialización de la LinkedList
LinkedList<String> list = new LinkedList<>();
```

En la declaración anterior, hemos definido una estructura llamada nodo que contiene dos variables, una es data que es de tipo entero, y otra es next que es un puntero que contiene la dirección del siguiente nodo.

## Operaciones realizadas en listas enlazadas

- **Insertion:** Esta operación se realiza para añadir un elemento a la lista.
- **Deletion:** Se realiza para borrar una operación de la lista.
- **Display:** Se realiza para visualizar los elementos de la lista.
- **Search:**  Se realiza para buscar un elemento de la lista utilizando la clave dada.

## Complejidad de las listas enlazadas

Veamos ahora la complejidad temporal y espacial de la lista enlazada para las operaciones buscar, insertar y borrar.

### 1. Complejidad temporal

| Operaciones | Complejidad temporal media de los casos | Complejidad temporal en el peor de los casos |
| --- | --- | --- |
| Insertion | O(1) | O(1) |
| Deletion | O(1) | O(1) |
| Search | O(n) | O(n) |

Donde "n" es el número de nodos del árbol dado.

### 2. Complejidad espacial

| Operations | Complejidad espacial |
| --- | --- |
| Insertion | O(n) |
| Deletion | O(n) |
| Search | O(n) |

La complejidad espacial de las listas enlazadas es O(n).

## Ventajas de las listas enlazadas

- Estructura de datos dinámica: El tamaño de la lista enlazada puede variar en función de las necesidades. Las listas enlazadas no tienen un tamaño fijo.
- Inserción y borrado: A diferencia de las matrices, la inserción y el borrado en las listas enlazadas es más fácil. Los elementos de una matriz se almacenan en una ubicación consecutiva, mientras que los elementos de una lista enlazada se almacenan en una ubicación aleatoria. Para insertar o eliminar un elemento en un array, tenemos que desplazar los elementos para crear el espacio. En cambio, en una lista enlazada, en lugar de desplazar, sólo tenemos que actualizar la dirección del puntero del nodo.
- Memoria eficiente: El tamaño de una lista enlazada puede crecer o decrecer según las necesidades, por lo que el consumo de memoria en una lista enlazada es eficiente.
- Implementación: Podemos implementar tanto pilas como colas utilizando listas enlazadas.

## Desventajas de las listas enlazadas

- Uso de memoria: En las listas enlazadas, los nodos ocupan más memoria que las matrices. Cada nodo de la lista enlazada ocupa dos tipos de variables, es decir, una es una variable simple, y otra es la variable puntero.
- Recorrido: El recorrido no es fácil en la lista enlazada. Si tenemos que acceder a un elemento de la lista enlazada, no podemos acceder aleatoriamente, mientras que en el caso de un array podemos acceder aleatoriamente por índice. Por ejemplo, si queremos acceder al tercer nodo, tendremos que recorrer todos los nodos anteriores. Por lo tanto, el tiempo necesario para acceder a un nodo en particular es grande.
- Recorrido inverso: El recorrido inverso es difícil en una lista enlazada. En una lista doblemente enlazada, es más fácil, pero requiere más memoria para almacenar el puntero hacia atrás.

## Aplicaciones de las listas enlazadas

- Con la ayuda de una lista enlazada, los polinomios pueden ser representados así como podemos realizar las operaciones sobre el polinomio.
- Una lista enlazada se puede utilizar para representar la matriz dispersa.
- Las distintas operaciones, como los datos de los estudiantes, los datos de los empleados o los datos de los productos, pueden implementarse utilizando una lista enlazada, ya que ésta utiliza el tipo de datos de estructura que puede contener distintos tipos de datos.
- Utilizando listas enlazadas, podemos implementar pilas, colas, árboles y otras estructuras de datos.
- El grafo es una colección de aristas y vértices, y puede representarse como una matriz de adyacencia y una lista de adyacencia. Si queremos representar el grafo como una matriz de adyacencia, entonces se puede implementar como un array. Si queremos representar el grafo como una lista de adyacencia, entonces se puede implementar como una lista enlazada.
- Una lista enlazada se puede utilizar para implementar la asignación dinámica de memoria. La asignación dinámica de memoria es la asignación de memoria realizada en tiempo de ejecución.

## Tipos de Listas Enlazadas

- Singly Linked List
- Doubly Linked List
- Circular Linked List
- Doubly Circular Linked List