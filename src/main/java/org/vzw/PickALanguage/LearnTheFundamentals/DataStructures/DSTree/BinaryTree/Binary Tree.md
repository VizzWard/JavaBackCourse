# Binary Tree

El árbol binario significa que el nodo puede tener como máximo dos hijos. Por lo tanto, cada nodo puede tener 0, 1 o 2 hijos.

![img](https://static.javatpoint.com/ds/images/binary-tree.png)

Este es un arbol binario porque cada nodo tiene como maximo dos hijos. Y su representacion en forma de Nodo seria:

![](https://static.javatpoint.com/ds/images/binary-tree2.png)

El nodo 1 contiene dos punteros, un puntero izquierdo y otro derecho. El nodo 2 contiene ambos nodos (nodo izquierdo y derecho); por lo tanto, tiene dos punteros (izquierdo y derecho). Los nodos 3, 5 y 6 son los nodos hoja, por lo que todos estos nodos contienen punteros NULL en las partes izquierda y derecha.

## Propiedades

- En cada nivel de i, el número máximo de nodos es 2i.
- La altura del árbol se define como el camino más largo desde el nodo raíz hasta el nodo hoja. El árbol que se muestra arriba tiene una altura igual a 3. Por lo tanto, el número máximo de nodos a la altura 3 es igual a (1+2+4+8) = 15. En general, el número máximo de nodos posible en la altura h es (2^0 + 2^1 + 2^2+....2^h) = 2^(h+1) -1.
- El número mínimo de nodos posible a la altura h es igual a h+1.
- Si el número de nodos es mínimo, la altura del árbol será máxima. A la inversa, si el número de nodos es máximo, la altura del árbol será mínima.

Si hay 'n' número de nodos en el árbol binario.

**La altura mínima puede calcularse como:**
- n = 2^(h+1) -1

Tomando tronco en ambos lados
- log2(n+1) = log2(2^(h+1))
- log2(n+1) = h+1
- **h = log2(n+1) - 1**

**La altura máxima puede calcularse como:**
- n = h+1
- **h= n-1**
