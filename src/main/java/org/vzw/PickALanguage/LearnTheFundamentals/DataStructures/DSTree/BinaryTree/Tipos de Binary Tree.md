# Tipos de árbol binario

## Full/ Proper/ Strict Binary Tree

El árbol binario completo también se conoce como árbol binario estricto. El árbol sólo puede considerarse binario completo, si cada nodo tiene 0 ó 2 hijos. El árbol binario completo también puede definirse como el árbol en el que cada nodo debe contener 2 hijos, excepto los nodos hoja.

![](https://static.javatpoint.com/ds/images/types-of-binary-tree.png)

### Propiedades

- El número de nodos hoja es igual al número de nodos internos más 1. En el ejemplo anterior, el número de nodos internos es 5; por lo tanto, el número de nodos hoja es igual a 6.
- El número máximo de nodos es el mismo que el número de nodos del árbol binario, es decir, 2^(h+1) -1.
- El número mínimo de nodos en el árbol binario completo es 2*h-1.
- La altura mínima del árbol binario completo es **log2(n+1) - 1**.
- La altura máxima del árbol binario completo puede calcularse como:
    - n= 2*h - 1
    - n+1 = 2*h
    - **h = n+1/2**

## Complete Binary Tree

El árbol binario completo es un árbol en el que todos los nodos están completamente llenos excepto el último nivel. En el último nivel, todos los nodos deben estar lo más a la izquierda posible. En un árbol binario completo, los nodos deben añadirse desde la izquierda.

![](https://static.javatpoint.com/ds/images/types-of-binary-tree2.png)

Este es un árbol binario completo porque todos los nodos están completamente llenos, y todos los nodos del último nivel se añaden primero a la izquierda.

### Propiedades

- El número máximo de nodos en un árbol binario completo es 2^(h+1) - 1.
- The minimum number of nodes in complete binary tree is 2^h.
- La altura mínima de un árbol binario completo es **log2(n+1) - 1**.

## Perfect Binary Tree

Un árbol es un árbol binario perfecto si todos los nodos internos tienen 2 hijos y todos los nodos hoja están en el mismo nivel.

![](https://static.javatpoint.com/ds/images/types-of-binary-tree3.png)

El árbol siguiente no es un árbol binario perfecto porque todos los nodos hoja no están en el mismo nivel.

![](https://static.javatpoint.com/ds/images/types-of-binary-tree4.png)

## Degenerate Binary Tree

El árbol binario degenerado es un árbol en el que todos los nodos internos tienen un solo hijo.

![](https://static.javatpoint.com/ds/images/types-of-binary-tree5.png)

![](https://static.javatpoint.com/ds/images/types-of-binary-tree6.png)

## Balanced Binary Tree

El árbol binario equilibrado es un árbol en el que tanto el árbol izquierdo como el derecho difieren en 1 como máximo. Por ejemplo, los árboles AVL y Rojo-Negro son árboles binarios equilibrados.

Este es un árbol binario equilibrado porque la diferencia entre el subárbol izquierdo y el subárbol derecho es cero:

![](https://static.javatpoint.com/ds/images/types-of-binary-tree7.png)

Este no es un árbol binario equilibrado porque la diferencia entre el subárbol izquierdo y el subárbol derecho es mayor que 1:

![](https://static.javatpoint.com/ds/images/types-of-binary-tree8.png)