# B+ Tree

B+ Tree es una extensión de B Tree que permite operaciones eficientes de inserción, eliminación y búsqueda.

En el árbol B, tanto las claves como los registros pueden almacenarse en los nodos internos y en los nodos hoja. En cambio, en el árbol B+, los registros (datos) sólo pueden almacenarse en los nodos hoja, mientras que los nodos internos sólo pueden almacenar los valores clave.

Los nodos de las hojas de un árbol B+ se enlazan en forma de listas simples para que las búsquedas sean más eficaces.

Los árboles B+ se utilizan para almacenar grandes cantidades de datos que no pueden almacenarse en la memoria principal. Dado que el tamaño de la memoria principal es siempre limitado, los nodos internos (claves para acceder a los registros) del árbol B+ se almacenan en la memoria principal, mientras que los nodos de las hojas se almacenan en la memoria secundaria.

Los nodos internos del árbol B+ suelen denominarse nodos índice. Un árbol B+ de orden 3:

![](https://static.javatpoint.com/ds/images/b-plus-tree.png)

## Ventajas

1. Los registros pueden obtenerse en el mismo número de accesos al disco.
2. La altura del árbol se mantiene equilibrada y es menor que la del árbol B.
3. Podemos acceder a los datos almacenados en un árbol B+ tanto de forma secuencial como directa.
4. Las claves se utilizan para la indexación.
5. Consultas de búsqueda más rápidas, ya que los datos sólo se almacenan en los nodos hoja.

## B Tree VS B+ Tree

| N.º | Árbol B | Árbol B+ |
| --- | ------- | -------- |
| 1   | Las claves de búsqueda no se pueden almacenar repetidamente. | Se pueden presentar claves de búsqueda redundantes. |
| 2   | Los datos se pueden almacenar en nodos hoja y en nodos internos. | Los datos solo se pueden almacenar en los nodos hoja. |
| 3   | La búsqueda de algunos datos es un proceso más lento, ya que los datos se pueden encontrar tanto en los nodos internos como en los nodos hoja. | La búsqueda es comparativamente más rápida, ya que los datos solo se pueden encontrar en los nodos hoja. |
| 4   | La eliminación de nodos internos es complicada y requiere mucho tiempo. | La eliminación nunca será un proceso complicado, ya que los elementos siempre se eliminan de los nodos hoja. |
| 5   | Los nodos hoja no pueden estar enlazados entre sí. | Los nodos hoja están enlazados entre sí para hacer las operaciones de búsqueda más eficientes. |

## Insertion en B+ Tree

1. Insertar el nuevo nodo como nodo hoja
2. Si la hoja no tiene el espacio necesario, divida el nodo y copie el nodo del medio en el siguiente nodo índice.
3. Si el nodo índice no tiene el espacio necesario, divida el nodo y copie el elemento central en la siguiente página índice.

### Ejemplo

Inserta el valor 195 en el árbol B+ de orden 5.

![](https://static.javatpoint.com/ds/images/b-plus-tree-insertion.png)

195 se insertará en el subárbol derecho de 120 después de 190. Insértalo en la posición deseada.

![](https://static.javatpoint.com/ds/images/b-plus-tree-insertion2.png)

El nodo contiene un número de elementos superior al máximo, es decir, 4, por lo tanto, divídalo y coloque el nodo mediano hasta el padre.

![](https://static.javatpoint.com/ds/images/b-plus-tree-insertion3.png)

Ahora, el nodo índice contiene 6 hijos y 5 claves, lo que viola las propiedades del árbol B+, por lo que necesitamos dividirlo, como se muestra a continuación.

![](https://static.javatpoint.com/ds/images/b-plus-tree-insertion4.png)

## Deletion en B+ Tree

1. Borra la llave y los datos de las hojas.
2. Si el nodo hoja contiene menos del número mínimo de elementos, fusiona hacia abajo el nodo con su hermano y elimina la clave entre ellos.
3. Si el nodo índice contiene menos del número mínimo de elementos, fusiona el nodo con el hermano y desplaza hacia abajo la clave entre ellos.

### Ejemplo

Borrar la clave 200 del árbol B

![](https://static.javatpoint.com/ds/images/b-plus-tree-deletion.png)

200 está presente en el subárbol derecho de 190, después de 195. elimínelo.

![](https://static.javatpoint.com/ds/images/b-plus-tree-deletion2.png)

Fusiona los dos nodos utilizando 195, 190, 154 y 129.

![](https://static.javatpoint.com/ds/images/b-plus-tree-deletion3.png)

Ahora, el elemento 120 es el único elemento presente en el nodo que viola las propiedades del Árbol B+. Por lo tanto, tenemos que fusionarlo utilizando 60, 78, 108 y 120.

Ahora, la altura del árbol B+ disminuirá en 1.

![](https://static.javatpoint.com/ds/images/b-plus-tree-deletion4.png)