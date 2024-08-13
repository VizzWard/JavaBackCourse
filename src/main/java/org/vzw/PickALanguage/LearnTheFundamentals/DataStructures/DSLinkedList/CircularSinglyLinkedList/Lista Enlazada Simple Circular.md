# Circular Singly Linked List
En una lista circular sencillamente enlazada, el último nodo de la lista contiene un puntero al primer nodo de la lista. 

Podemos tener tanto listas circulares simples como listas circulares dobles. Recorremos una lista circular simple hasta llegar al mismo nodo en el que empezamos. La lista circular no tiene principio ni final. No hay ningún valor nulo presente en la parte siguiente de ninguno de los nodos.

![img](https://static.javatpoint.com/ds/images/circular-singly-linked-list.png)

Las listas enlazadas circulares se utilizan sobre todo en el mantenimiento de tareas en sistemas operativos. Hay muchos ejemplos de uso de listas enlazadas circulares en informática, como la navegación por Internet, en la que un registro de las páginas visitadas en el pasado por el usuario se mantiene en forma de listas enlazadas circulares y se puede volver a acceder a ellas pulsando el botón anterior.

## Representación en memoria de una lista enlazada circular
En la siguiente imagen, representación en memoria de una lista circular enlazada que contiene las notas de un alumno en 4 asignaturas. Sin embargo, la imagen muestra un atisbo de cómo se está almacenando la lista circular en la memoria. El inicio o cabeza de la lista está apuntando al elemento con el índice 1 y contiene 13 marcas en la parte de datos y 4 en la parte siguiente. Lo que significa que está enlazado con el nodo que se está almacenando en el índice 4 de la lista.

Sin embargo, debido al hecho de que estamos considerando una lista enlazada circular en la memoria, el último nodo de la lista contiene la dirección del primer nodo de la lista.

![img](https://static.javatpoint.com/ds/images/memory-representation-circular-singly-linked-list.png)

## Operaciones

### Inserción

| SN  | Operación                 | Descripción                                                            |
| --- | ------------------------- | ---------------------------------------------------------------------- |
| 1   | Inserción al principio    | Añadir un nodo a la lista enlazada simple circular al principio.       |
| 2   | Inserción al final        | Añadir un nodo a la lista enlazada simple circular al final.           |

### Eliminación y Recorrido

| SN  | Operación                  | Descripción                                                                 |
| --- | -------------------------- | --------------------------------------------------------------------------- |
| 1   | Eliminación al principio   | Eliminar el nodo de la lista enlazada simple circular al principio.          |
| 2   | Eliminación al final       | Eliminar el nodo de la lista enlazada simple circular al final.              |
| 3   | Búsqueda                   | Comparar cada elemento del nodo con el elemento dado y devolver su ubicación en la lista; de lo contrario, devolver null. |
| 4   | Recorrido                  | Visitar cada elemento de la lista al menos una vez para realizar alguna operación específica. |
