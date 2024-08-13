# Circular Doubly Linked List
La lista circular doblemente enlazada es un tipo de estructura de datos más compleja en la que un nodo contiene punteros a su nodo anterior y al nodo siguiente. Las listas circulares doblemente enlazadas no contienen NULL en ninguno de sus nodos. El último nodo de la lista contiene la dirección del primer nodo de la lista. El primer nodo de la lista también contiene la dirección del último nodo de su puntero anterior.

![img](https://static.javatpoint.com/ds/images/circular-doubly-linked-list.png)

Debido a que una lista circular doblemente enlazada contiene tres partes en su estructura, exige más espacio por nodo y operaciones básicas más caras. Sin embargo, una lista circular doblemente enlazada facilita la manipulación de los punteros y la búsqueda es el doble de eficiente.

## Gestión de memoria de listas circulares doblemente enlazadas
La siguiente figura muestra cómo se asigna la memoria a una lista circular doblemente enlazada. La variable head contiene la dirección del primer elemento de la lista, es decir, 1, por lo que el nodo inicial de la lista contiene los datos A almacenados en la dirección 1. Como se supone que cada nodo de la lista tiene tres partes, el nodo inicial de la lista contiene la dirección del último nodo, es decir, 8 y el siguiente nodo, es decir, 4. El último nodo de la lista, que está almacenado en la dirección 8 y contiene datos como 6, contiene la dirección del primer nodo de la lista, como se muestra en la imagen, es decir, 1. En una lista circular doblemente enlazada, el último nodo se identifica por la dirección del primer nodo que se almacena en la parte siguiente del último nodo, por lo que el nodo que contiene la dirección del primer nodo es en realidad el último nodo de la lista.

![img](https://static.javatpoint.com/ds/images/circular-doubly-linked-list-memory-management.png)

## Operaciones

Hay varias operaciones que se pueden realizar en una lista circular doblemente enlazada. La estructura de nodos de una lista circular doblemente enlazada es similar a la de una lista doblemente enlazada. Sin embargo, las operaciones en la lista circular doblemente enlazada se describen en la siguiente tabla.

| SN  | Operación                  | Descripción                                                                 |
| --- | -------------------------- | --------------------------------------------------------------------------- |
| 1   | Inserción al principio     | Añadir un nodo en la lista enlazada doblemente circular al principio.        |
| 2   | Inserción al final         | Añadir un nodo en la lista enlazada doblemente circular al final.            |
| 3   | Eliminación al principio   | Eliminar un nodo de la lista enlazada doblemente circular desde el principio.|
| 4   | Eliminación al final       | Eliminar un nodo de la lista enlazada doblemente circular al final.          |
