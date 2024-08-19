# B Tree

El Árbol B es un árbol especializado de *m* vías que puede utilizarse ampliamente para el acceso a disco. Un árbol B de orden *m* puede tener como máximo ***m-1*** claves y *m* hijos. Una de las principales razones para utilizar un árbol B es su capacidad para almacenar un gran número de claves en un único nodo y grandes valores de clave manteniendo la altura del árbol relativamente pequeña.

Un árbol B de orden *m* contiene todas las propiedades de un árbol de orden *M*. Además, contiene las siguientes propiedades:

1. Cada nodo de un árbol B contiene como máximo *m* hijos.
2. Cada nodo de un árbol B, excepto el nodo raíz y el nodo hoja, contiene al menos ***m/2*** hijos.
3. Los nodos raíz deben tener al menos 2 nodos.
4. Todos los nodos hoja deben estar al mismo nivel.

No es necesario que todos los nodos tengan el mismo número de hijos, pero cada nodo debe tener un número ***m/2*** de nodos.

Árbol B de orden 4:

![](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fwp-content%2Fuploads%2F20200506235136%2Foutput253.png&f=1&nofb=1&ipt=7a5384c4b08115f62723bb417388c38e77905af7c862d66d179d1355740317ae&ipo=images)

Al realizar algunas operaciones en el Árbol B, puede violarse alguna propiedad del Árbol B, como el número mínimo de hijos que puede tener un nodo. Para mantener las propiedades del árbol B, el árbol puede dividirse o unirse.

## Operaciones

### Searching

La búsqueda en árboles B es similar a la del árbol de búsqueda binario. Por ejemplo, si buscamos un elemento 49 en el siguiente Árbol B. El proceso será algo como lo siguiente :

1. Compara el elemento 49 con el nodo raíz 78. Puesto que 49 < 78 por lo tanto, muévete a su subárbol izquierdo.
2. Como 40<49<56, atraviesa el subárbol derecho de 40.
3. 49>45, muévete a la derecha. Compara 49.
4. match found, return.

La búsqueda en un árbol B depende de la altura del árbol. El algoritmo de búsqueda tarda O(log n) en buscar cualquier elemento en un árbol B.

![](https://static.javatpoint.com/ds/images/b-tree-searching.png)

### Inserting

Las inserciones se realizan a nivel de los nodos hoja. Para insertar un elemento en el árbol B debe seguirse el siguiente algoritmo.

1. Recorrer el árbol B para encontrar el nodo hoja adecuado en el que se pueda insertar el nodo.
2. Si el nodo hoja contiene menos de m-1 claves entonces inserte el elemento en orden creciente.
3. En caso contrario, si el nodo hoja contiene m-1 claves, siga los siguientes pasos.
    - Inserta el nuevo elemento en el orden creciente de elementos.
    - Divide el nodo en los dos nodos de la mediana.
    - Empuja el elemento mediano hasta su nodo padre.
    - Si el nodo padre también contiene m-1 número de claves, entonces divídalo también siguiendo los mismos pasos.

***Ejemplo:***

Inserta el nodo 8 en el Árbol B de orden 5.

![](https://static.javatpoint.com/ds/images/b-tree-inserting.png)

8 se insertará a la derecha de 5, por lo tanto inserte 8.

![](https://static.javatpoint.com/ds/images/b-tree-inserting2.png)

El nodo, ahora contiene 5 claves que es mayor que (5 -1 = 4 ) claves. Por lo tanto dividir el nodo de la mediana es decir, 8 y empujarlo hasta su nodo padre se muestra como sigue.

![](https://static.javatpoint.com/ds/images/b-tree-inserting3.png)

### Deletion

El borrado también se realiza en los nodos hoja. El nodo que se va a eliminar puede ser un nodo hoja o un nodo interno. Para eliminar un nodo de un árbol B hay que seguir el siguiente algoritmo.

1. Localiza el nodo hoja.
2. Si hay más de m/2 claves en el nodo hoja, elimine la clave deseada del nodo.
3. Si el nodo hoja no contiene m/2 claves entonces completa las claves tomando el elemento de ocho o hermano izquierdo.
    - Si el hermano izquierdo contiene más de m/2 elementos, entonces empuja su elemento mayor hacia arriba hasta su padre y mueve el elemento intermedio hacia abajo hasta el nodo donde se elimina la clave.
    - Si el hermano derecho contiene más de m/2 elementos entonces empuja su elemento más pequeño hacia arriba al padre y mueve el elemento intermedio hacia abajo al nodo donde se elimina la clave.
4. Si ninguno de los hermanos contiene más de m/2 elementos, se crea un nuevo nodo hoja uniendo dos nodos hoja y el elemento intermedio del nodo padre.
5. Si el padre se queda con menos de m/2 nodos entonces, aplique el proceso anterior en el padre también.

Si el nodo que se desea eliminar es un nodo interno, se sustituye por su sucesor o predecesor en el orden. Dado que el sucesor o predecesor siempre estará en el nodo hoja, el proceso será similar al de la eliminación del nodo del nodo hoja.

***Ejemplo:***

Elimine el nodo 53 del Árbol B de orden 5.

![](https://static.javatpoint.com/ds/images/b-tree-deletion.png)

53 está presente en el hijo derecho del elemento 49. Suprímalo.

![](https://static.javatpoint.com/ds/images/b-tree-deletion2.png)

Ahora, 57 es el único elemento que queda en el nodo, el número mínimo de elementos que deben estar presentes en un árbol B de orden 5, es 2. es menor que eso, los elementos en su sub-árbol izquierdo y derecho tampoco son suficientes por lo tanto, fusionarlo con el hermano izquierdo y el elemento intermedio del padre es decir, 49.

El árbol B final es:

![](https://static.javatpoint.com/ds/images/b-tree-deletion3.png)

