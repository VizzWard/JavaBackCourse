# Doubly Linked List
Una lista doblemente enlazada es un tipo complejo de lista enlazada en la que un nodo contiene un puntero al nodo anterior y al siguiente de la secuencia. Por lo tanto, en una lista doblemente enlazada, un nodo consta de tres partes: datos del nodo, puntero al siguiente nodo de la secuencia (puntero siguiente) , puntero al nodo anterior (puntero anterior). 

![img](https://static.javatpoint.com/ds/images/doubly-linked-list.png)

Lista doblemente enlazada que contiene tres nodos con números del 1 al 3 en su parte de datos:

![img](https://static.javatpoint.com/ds/images/doubly-linked-list2.png)

## Estructura del Nodo
En java la estructura del nodo es declarada como:
```java
//clase Nodo - Para Doubly Linked List
class Node {
    Object data; // Datos almacenados en el nodo
    Node next;   // Referencia al siguiente nodo
    Node prev;   // Referencia al anterior nodo

    // Constructor para inicializar el nodo con un valor
    Node(Object data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
```

En una lista enlazada simple, sólo podemos recorrerla en una dirección, porque cada nodo contiene la dirección del nodo siguiente y no tiene ningún registro de sus nodos anteriores. Sin embargo, las listas doblemente enlazadas superan esta limitación. Debido al hecho de que, cada nodo de la lista contiene la dirección de su nodo anterior, podemos encontrar todos los detalles sobre el nodo anterior también mediante el uso de la dirección anterior almacenada dentro de la parte anterior de cada nodo.

## Representación en memoria de una lista doblemente enlazada

La representación en memoria de una lista doblemente enlazada se muestra en la siguiente imagen. Generalmente, las listas doblemente enlazadas consumen más espacio por cada nodo y, por tanto, provocan operaciones básicas más expansivas como la inserción y la eliminación. Sin embargo, podemos manipular fácilmente los elementos de la lista ya que la lista mantiene punteros en ambas direcciones (hacia adelante y hacia atrás). 

En la siguiente imagen, el primer elemento de la lista que es es decir, 13 almacenado en la dirección 1. El puntero de la cabeza apunta a la dirección inicial 1. El puntero de la cabeza apunta a la dirección inicial 1. Como este es el primer elemento que se añade a la lista, el prev de la lista contiene null. El siguiente nodo de la lista reside en la dirección 4 por lo tanto el primer nodo contiene 4 en su siguiente puntero.

Podemos recorrer la lista de esta manera hasta encontrar cualquier nodo que contenga null o -1 en su parte siguiente.

![img](https://static.javatpoint.com/ds/images/doubly-linked-list-memory-representation.png)


## Operaciones con listas doblemente enlazadas

|     | Operacion   | Descripcion     |
| --- | --- | --- |
| 1 | Inserción al inicio | Agregar el nodo al principio de la lista enlazada. |
| 2 | Inserción al final | Agregar el nodo al final de la lista enlazada. |
| 3 | Inserción después de un nodo específico | Agregar el nodo en la lista enlazada después de un nodo específico. |
| 4 | Eliminación al inicio | Eliminar el nodo del principio de la lista. |
| 5 | Eliminación al final | Eliminar el nodo del final de la lista. |
| 6 | Eliminación del nodo que contiene un dato dado | Eliminar el nodo que se encuentra justo después del nodo que contiene el dato dado. |
| 7 | Búsqueda | Comparar los datos de cada nodo con el ítem a buscar y devolver la ubicación del ítem en la lista si se encuentra, de lo contrario devolver null. |
| 8 | Recorrido | Visitar cada nodo de la lista al menos una vez para realizar alguna operación específica como búsqueda, ordenamiento, visualización, etc. |
