# Binary Search Tree

Un árbol de búsqueda binario sigue un cierto orden para ordenar los elementos. En un árbol de búsqueda binario, el valor del nodo izquierdo debe ser menor que el del nodo padre, y el valor del nodo derecho debe ser mayor que el del nodo padre. Esta regla se aplica recursivamente a los subárboles izquierdo y derecho de la raíz.

![](https://static.javatpoint.com/ds/images/binary-search-tree1.png)

Podemos observar que el nodo raíz es 40, y todos los nodos del subárbol izquierdo son menores que el nodo raíz, y todos los nodos del subárbol derecho son mayores que el nodo raíz.

Del mismo modo, podemos ver que el hijo izquierdo del nodo raíz es mayor que su hijo izquierdo y menor que su hijo derecho. Por lo tanto, también satisface la propiedad de árbol de búsqueda binario. Por lo tanto, podemos decir que el árbol de la imagen anterior es un árbol de búsqueda binario.

Supongamos que cambiamos el valor del nodo 35 a 55 en el árbol anterior:

![](https://static.javatpoint.com/ds/images/binary-search-tree2.png)

El valor del nodo raíz es 40, que es mayor que su hijo izquierdo 30 pero menor que el hijo derecho de 30, es decir, 55. Por lo tanto, el árbol anterior no satisface la propiedad de árbol de búsqueda binario. Por lo tanto, el árbol no es un árbol de búsqueda binario.

## Ventajas

- Buscar un elemento en el árbol de búsqueda binario es fácil, ya que siempre tenemos una pista de qué subárbol tiene el elemento deseado.
- En comparación con las matrices y las listas enlazadas, las operaciones de inserción y eliminación son más rápidas en BST.

## Ejemplo de creación de un árbol de búsqueda binario

Supongamos que los elementos de datos son - `45`, `15`, `79`, `90`, `10`, `55`, `12`, `20`, `50`.

En primer lugar, tenemos que insertar 45 en el árbol como raíz del mismo.

A continuación, lea el siguiente elemento; si es más pequeño que el nodo raíz, insértelo como raíz del subárbol izquierdo y pase al siguiente elemento.

En caso contrario, si el elemento es mayor que el nodo raíz, se inserta como raíz del subárbol derecho.

### Paso a paso

1. Insertar `45`.
```text
45
```

2. Insertar `15`.
```text
  45
 /
15
```

3. Insertar `79`.
```text
  45
 /  \
15   79
```

4. Insertar `90`.
```text
  45
 /  \
15   79
       \
        90
```

5. Insertar `10`.
```text
       45
      /  \
     15   79
    /        \
   10         90
```

6. Insertar `55`.
```text
       45
      /  \
     15   79
    /     /  \
   10    55   90
```

7. Insertar `12`.
```text
       45
      /  \
     15   79
    /     /  \
   10    55   90
     \  
     12
```

8. Insertar `20`.
```text
       45
      /  \
     15   79
    / \   /  \
   10 20 55   90
     \  
     12 
```

9. Insertar `50`.
```text
       45
      /  \
     15   79
    / \   /  \
   10 20 55   90
     \   /
     12 50
```

## Searching

1. En primer lugar, compara el elemento a buscar con el elemento raíz del árbol.
2. Si la raíz coincide con el elemento de destino, devuelve la ubicación del nodo.
3. Si no coincide, entonces comprueba si el elemento es menor que el elemento raíz, si es menor que el elemento raíz, entonces se mueve al subárbol de la izquierda.
4. Si es mayor que el elemento raíz, pasa al subárbol de la derecha.
5. Repita el procedimiento anterior de forma recursiva hasta encontrar la coincidencia.
6. Si el elemento no se encuentra o no está presente en el árbol, devuelve NULL.

***Paso 1***:

![](https://static.javatpoint.com/ds/images/binary-search-tree12.png)

***Paso 2***:

![](https://static.javatpoint.com/ds/images/binary-search-tree13.png)

***Paso 3***:

![](https://static.javatpoint.com/ds/images/binary-search-tree14.png)

### Algoritmo

```java
// Método de búsqueda
    public Node search(Node root, int item) {
        // Paso 1: Verificar si el nodo actual es null o si hemos encontrado el item
        if (root == null || root.data == item) {
            return root;
        }

        // Paso 2: Si el item es menor que el dato del nodo actual, buscar en el subárbol izquierdo
        if (item < root.data) {
            return search(root.left, item);
        }

        // Paso 3: Si el item es mayor que el dato del nodo actual, buscar en el subárbol derecho
        return search(root.right, item);
    }
```

## Deletion

En un árbol de búsqueda binario, debemos eliminar un nodo del árbol teniendo en cuenta que no se viole la propiedad del BST. Para eliminar un nodo del BST, se dan tres situaciones posibles:

1. El nodo a eliminar es el nodo hoja.
2. El nodo a eliminar sólo tiene un hijo.
3. El nodo a eliminar tiene dos hijos

### Cuando el nodo a eliminar es el nodo hoja

Es el caso más sencillo para eliminar un nodo en BST. En este caso, tenemos que sustituir el nodo hoja por NULL y simplemente liberar el espacio asignado.

Supongamos que tenemos que eliminar el nodo 90, ya que el nodo a eliminar es un nodo hoja, por lo que será reemplazado por NULL, y el espacio asignado se liberará.

![](https://static.javatpoint.com/ds/images/binary-search-tree15.png)

### Cuando el nodo a eliminar sólo tiene un hijo

Tenemos que sustituir el nodo destino por su nodo hijo y, a continuación, eliminar el nodo hijo. Esto significa que después de reemplazar el nodo destino por su nodo hijo, el nodo hijo contendrá ahora el valor a borrar. Por lo tanto, simplemente tenemos que sustituir el nodo hijo por NULL y liberar el espacio asignado.

Supongamos que tenemos que eliminar el nodo 79, ya que el nodo a eliminar sólo tiene un hijo, por lo que será reemplazado por su hijo 55.

Por lo tanto, el nodo 79 reemplazado será ahora un nodo hoja que se puede eliminar fácilmente.

![](https://static.javatpoint.com/ds/images/binary-search-tree16.png)

### Cuando el nodo a eliminar tiene dos hijos

Este caso de eliminación de un nodo en el BST es un poco complejo entre los otros dos casos. En tal caso, los pasos a seguir son:

1. En primer lugar, busque el sucesor en orden del nodo que desea eliminar.
2. Después, sustituye ese nodo por el sucesor en orden hasta que el nodo objetivo se sitúe en la hoja del árbol.
3. Y por último, sustituir el nodo por NULL y liberar el espacio asignado.

El sucesor dentro del orden es necesario cuando el hijo derecho del nodo no está vacío. Podemos obtener el sucesor en orden encontrando el elemento mínimo en el hijo derecho del nodo.

Supongamos que tenemos que eliminar el nodo 45 que es el nodo raíz, ya que el nodo a eliminar tiene dos hijos, por lo que será reemplazado por su sucesor en orden. Ahora, el nodo 45 estará en la hoja del árbol para que pueda ser eliminado fácilmente.

![](https://static.javatpoint.com/ds/images/binary-search-tree17.png)

## Insertion

Una nueva clave en BST se inserta siempre en la hoja. Para insertar un elemento en el BST, tenemos que empezar a buscar desde el nodo raíz; si el nodo que se va a insertar es menor que el nodo raíz, entonces busca una ubicación vacía en el subárbol izquierdo. En caso contrario, busque la ubicación vacía en el subárbol derecho e inserte los datos. La inserción en BST es similar a la búsqueda, ya que siempre tenemos que mantener la regla de que el subárbol izquierdo es más pequeño que la raíz, y el subárbol derecho es más grande que la raíz.

![](https://static.javatpoint.com/ds/images/binary-search-tree18.png)

![](https://static.javatpoint.com/ds/images/binary-search-tree19.png)

## Complejidad

### Complejidad temporal

| Operacion | Complejidad temporal en el mejor de los casos | Complejidad temporal media de los casos | Complejidad temporal en el peor de los casos |
|-----------|---------------------------|------------------------------|----------------------------|
| Insertion | O(log n)                   | O(log n)                      | O(n)                       |
| Deletion  | O(log n)                   | O(log n)                      | O(n)                       |
| Search    | O(log n)                   | O(log n)                      | O(n)                       |


### Complejidad espacial

| Operacion | Complejidad espacial |
|------------|----------------------|
| Insertion  | O(n)                 |
| Deletion   | O(n)                 |
| Search     | O(n)                 |

