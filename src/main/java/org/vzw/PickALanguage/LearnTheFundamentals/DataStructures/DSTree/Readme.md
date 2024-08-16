# Estructura de datos de árbol
Las estructuras de datos lineales, como una matriz, una lista enlazada, una pila y una cola, todos los elementos se organizan de forma secuencial. Las diferentes estructuras de datos se utilizan para distintos tipos de datos.

**Para elegir la estructura de datos se tienen en cuenta algunos factores:**

- **¿Qué tipo de datos hay que almacenar?**: Cabe la posibilidad de que una determinada estructura de datos sea la más adecuada para algún tipo de datos.
- **Coste de las operaciones**: Si queremos minimizar el coste de las operaciones para las operaciones que se realizan con más frecuencia. Por ejemplo, tenemos una lista simple sobre la que tenemos que realizar la operación de búsqueda; entonces, podemos crear un array en el que los elementos se almacenen ordenados para realizar la búsqueda binaria. La búsqueda binaria funciona muy rápido para la lista simple, ya que divide el espacio de búsqueda a la mitad.
- **Uso de memoria**: A veces, queremos una estructura de datos que utilice menos memoria.

Un **Tree** es también una de las estructuras de datos que representan datos jerárquicos. Supongamos que queremos mostrar los empleados y sus posiciones de forma jerárquica, entonces se puede representar asi:

![img](https://static.javatpoint.com/ds/images/tree.png)

El árbol muestra la jerarquía organizativa de una empresa. En la estructura, John es el CEO de la empresa y tiene dos subordinados directos llamados Steve y Rohan. Steve tiene tres subordinados directos: Lee, Bob y Ella. Bob tiene dos subordinados directos llamados Sal y Emma. Emma tiene dos subordinados directos llamados Tom y Raj. Tom tiene un subordinado directo llamado Bill. 

Esta estructura lógica particular se conoce como Árbol. Su estructura es similar a la de un árbol real, por lo que se denomina Árbol. En esta estructura, la raíz se encuentra en la parte superior, y sus ramas se mueven en dirección descendente. Por lo tanto, podemos decir que la estructura de datos Árbol es una forma eficiente de almacenar los datos de forma jerárquica.

**Puntos clave:**

- Una estructura de datos en árbol se define como una colección de objetos o entidades conocidos como nodos que se enlazan entre sí para representar o simular una jerarquía.
- Una estructura de datos en árbol es una estructura de datos no lineal porque no almacena de forma secuencial. Se trata de una estructura jerárquica, ya que los elementos de un árbol se organizan en varios niveles.
- En la estructura de datos Árbol, el nodo superior se conoce como nodo raíz. Cada nodo contiene algún dato, y los datos pueden ser de cualquier tipo. En la estructura de árbol anterior, el nodo contiene el nombre del empleado, por lo que el tipo de dato sería una cadena.
- Cada nodo contiene unos datos y el enlace o referencia de otros nodos que pueden llamarse hijos.

**Términos básicos utilizados en la estructura de datos de árbol.**

En la esta estructura, cada nodo está etiquetado con un número. Cada flecha mostrada en la figura anterior se conoce como enlace entre los dos nodos.

![img](https://static.javatpoint.com/ds/images/tree2.png)

- **Root**: El nodo raíz es el nodo más alto en la jerarquía del árbol. En otras palabras, el nodo raíz es el que no tiene ningún padre. En la estructura anterior, el nodo número 1 es el nodo raíz del árbol. Si un nodo está directamente vinculado a otro, se habla de una relación padre-hijo.
- **Child node**: Si el nodo es descendiente de cualquier nodo, entonces el nodo se conoce como nodo hijo.
- **Parent**: Si el nodo contiene algún subnodo, entonces se dice que ese nodo es el padre de ese subnodo.
- **Sibling**: Los nodos que tienen el mismo padre se conocen como hermanos.
- **Leaf Node**: El nodo del árbol que no tiene ningún nodo hijo se denomina nodo hoja. Un nodo hoja es el nodo inferior del árbol. En un árbol general puede haber cualquier número de nodos hoja. Los nodos hoja también pueden denominarse nodos externos.
- **Internal Nodes**: Un nodo tiene al menos un nodo hijo denominado interno.
- **Ancestor Node**: Un antepasado de un nodo es cualquier nodo predecesor en una ruta desde la raíz hasta ese nodo. El nodo raíz no tiene ningún antepasado. En el árbol que se muestra en la imagen anterior, los nodos 1, 2 y 5 son los ancestros del nodo 10.
- **Descendant**: El sucesor inmediato del nodo dado se conoce como descendiente de un nodo. En la figura anterior, 10 es el descendiente del nodo 5.

## Propiedades de la estructura de datos Tree

- Estructura de datos recursiva: El árbol también se conoce como estructura de datos recursiva. Un árbol puede definirse como recursivo porque el nodo distinguido en una estructura de datos de árbol se conoce como nodo raíz. El nodo raíz del árbol contiene un enlace a todas las raíces de sus subárboles. El subárbol izquierdo se muestra en color amarillo, y el subárbol derecho en color rojo. El subárbol izquierdo puede dividirse a su vez en subárboles que se muestran en tres colores diferentes. Recursividad significa reducir algo de forma autosimilar. Así, esta propiedad recursiva de la estructura de datos Tree se implementa en diversas aplicaciones.

![img](https://static.javatpoint.com/ds/images/tree3.png)

- Número de aristas: Si hay nodos, habrá n-1 aristas. Cada flecha de la estructura representa un enlace o camino. Cada nodo, excepto el nodo raíz, tendrá al menos un enlace entrante conocido como arista. Habrá un enlace para la relación padre-hijo.
- Profundidad del nodo x: La profundidad del nodo x puede definirse como la longitud del camino desde la raíz hasta el nodo x. Una arista contribuye con una unidad de longitud en el camino. Por tanto, la profundidad del nodo x también puede definirse como el número de aristas entre el nodo raíz y el nodo x. El nodo raíz tiene 0 de profundidad.
- Altura del nodo x: La altura del nodo x puede definirse como el camino más largo desde el nodo x hasta el nodo hoja.

## Implementacion de Tree
La estructura de datos en árbol puede crearse creando los nodos dinámicamente con la ayuda de los punteros.

![img](https://static.javatpoint.com/ds/images/tree4.png)

Podemos ver la representación de la estructura de datos del árbol en la memoria. En la estructura anterior, el nodo contiene tres campos. El segundo campo almacena los datos; el primer campo almacena la dirección del hijo izquierdo, y el tercer campo almacena la dirección del hijo derecho.

### Estructura del Nodo
```java
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
```

La estructura anterior sólo puede definirse para los árboles binarios porque el árbol binario sólo puede tener dos hijos, mientras que los árboles genéricos pueden tener más de dos hijos. La estructura del nodo para los árboles genéricos sería diferente en comparación con el árbol binario.

## Aplicacion de los Trees

- **Almacenamiento natural de datos jerárquicos**: Los árboles se utilizan para almacenar los datos en la estructura jerárquica. Por ejemplo, el sistema de archivos. El sistema de archivos almacenados en la unidad de disco, el archivo y la carpeta están en la forma de los datos naturalmente jerárquicos y almacenados en forma de árboles.
- **Organizar datos**: Se utiliza para organizar los datos de forma que la inserción, eliminación y búsqueda sean eficientes. Por ejemplo, un árbol binario tiene un tiempo logN para buscar un elemento.
- **Trie**: Es un tipo especial de árbol que se utiliza para almacenar el diccionario. Es un método rápido y eficaz para la corrección ortográfica dinámica.
- **Heap**: También es una estructura de datos en árbol implementada mediante arrays. Se utiliza para implementar colas de prioridad.
- **B-Tree y B+Tree**: B-Tree y B+Tree son las estructuras de datos en árbol utilizadas para implementar la indexación en bases de datos.
- **Tabla de enrutamiento**: La estructura de datos en árbol también se utiliza para almacenar los datos en tablas de enrutamiento en los routers.

## Tipos de Arboles (Trees)

### General tree

En el árbol general, un nodo puede tener 0 o un máximo de n numero de nodos. No se impone ninguna restricción al grado del nodo (el número de nodos que puede contener un nodo). El nodo superior de un árbol general se conoce como nodo raíz. Los hijos del nodo raíz se conocen como subárboles.

![img](https://static.javatpoint.com/ds/images/types-of-tree1.png)

En un árbol general puede haber n número de subárboles. 

En el árbol general, los subárboles no están ordenados, ya que los nodos del subárbol no pueden ordenarse. Cada árbol no vacío tiene una arista descendente, y estas aristas están conectadas a los nodos conocidos como nodos hijos. El nodo raíz se etiqueta con el nivel 0. Los nodos que tienen el mismo padre se conocen como hermanos.

### Binary tree

En un árbol binario, cada nodo de un árbol puede tener dos nodos hijos como máximo. Aquí, máximo significa si el nodo tiene 0 nodos, 1 nodo o 2 nodos.

![img](https://static.javatpoint.com/ds/images/types-of-tree2.png)

### Binary Search tree

El árbol de búsqueda binario es una estructura de datos no lineal en la que un nodo está conectado a n nodos. Es una estructura de datos basada en nodos. 

Un nodo puede representarse en un árbol de búsqueda binario con tres campos: parte de datos, hijo izquierdo e hijo derecho. Un nodo puede conectarse a los dos nodos hijos más próximos en un árbol de búsqueda binario, por lo que el nodo contiene dos punteros (puntero hijo izquierdo y puntero hijo derecho).

Cada nodo del subárbol izquierdo debe contener un valor menor que el valor del nodo raíz, y el valor de cada nodo del subárbol derecho debe ser mayor que el valor del nodo raíz.

![img](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fjournaldev.nyc3.digitaloceanspaces.com%2F2020%2F01%2FBinary_Tree_Level.png&f=1&nofb=1&ipt=f68377f13c53c773f445a9d2a545b8c7a7e8f9e1492d0e46e6404fa5d01156a5&ipo=images)

### AVL Tree

Es uno de los tipos del árbol binario, o podemos decir que es una variante del árbol de búsqueda binario. El árbol AVL satisface las propiedades del árbol binario y del árbol de búsqueda binario. Es un árbol de búsqueda binario autoequilibrado que fue inventado por Adelson Velsky Lindas. En este caso, autoequilibrado significa que se equilibran las alturas del subárbol izquierdo y del subárbol derecho. Este equilibrio se mide en términos de factor de equilibrio.

Podemos considerar a un árbol como un árbol AVL si el árbol obedece al árbol de búsqueda binaria así como a un factor de equilibrio. El factor de equilibrio puede definirse como la diferencia entre la altura del subárbol izquierdo y la altura del subárbol derecho. El valor del factor de equilibrio debe ser 0, -1 ó 1; por lo tanto, cada nodo del árbol AVL debe tener el valor del factor de equilibrio como 0, -1 ó 1.

![](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fwp-content%2Fuploads%2F20221124093021%2Favl.png&f=1&nofb=1&ipt=a4783e929507b9f0ef0a9857363ac58868bf901508be365c4d1fcc548a312433&ipo=images)

### Red-Black Tree

El red-black tree es el árbol de búsqueda binario. El prerrequisito del árbol rojo-negro es que conozcamos el árbol de búsqueda binario. En un árbol de búsqueda binaria, el valor del subárbol izquierdo debe ser menor que el valor de ese nodo, y el valor del subárbol derecho debe ser mayor que el valor de ese nodo. Como sabemos, la complejidad temporal de la búsqueda binaria en el caso medio es log2n, en el mejor caso es O(1), y en el peor caso es O(n).

Cuando se realiza cualquier operación en el árbol, queremos que nuestro árbol esté equilibrado para que todas las operaciones como buscar, insertar, borrar, etc., tomen menos tiempo, y todas estas operaciones tendrán la complejidad temporal de log2n.

![](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fstatic.javatpoint.com%2Fds%2Fimages%2Fred-black-tree-vs-avl-tree.png&f=1&nofb=1&ipt=1d30c41134f1d1509b2fbfd0e174edbde0ca128e07df5ce0523b4cadca207fc3&ipo=images)

El árbol rojo-negro es un árbol de búsqueda binaria autoequilibrado. El árbol AVL también es un árbol de búsqueda binario que se equilibra en altura, entonces por qué necesitamos un árbol Rojo-Negro. En el árbol AVL, no sabemos cuántas rotaciones serían necesarias para equilibrar el árbol, pero en el árbol Rojo-Negro, se requieren un máximo de 2 rotaciones para equilibrar el árbol. Contiene un bit adicional que representa el color rojo o negro de un nodo para garantizar el equilibrio del árbol.

### Splay tree

La estructura de datos de árbol splay es también un árbol de búsqueda binario en el que el elemento al que se ha accedido recientemente se coloca en la posición raíz del árbol realizando algunas operaciones de rotación. Aquí, splaying significa el nodo al que se ha accedido recientemente. Es un árbol de búsqueda binario autoequilibrado que no tiene una condición de equilibrio explícita como el árbol AVL.

![](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fstatic.javatpoint.com%2Fds%2Fimages%2Fsplay-tree3.png&f=1&nofb=1&ipt=a6d6f0afc61a8aa571bc9a462410ca77aa056c2df92199a244e1ebd11cd8cbd4&ipo=images)

Es posible que la altura del árbol de repetición no esté equilibrada, es decir, que la altura de los subárboles izquierdo y derecho sea diferente, pero las operaciones en el árbol de repetición requieren un tiempo logN, donde n es el número de nodos.

El árbol Splay es un árbol equilibrado, pero no puede considerarse un árbol equilibrado en altura porque después de cada operación se realiza una rotación que conduce a un árbol equilibrado.

### Treap

La estructura de datos Treap procede de la estructura de datos Tree y Heap. Por lo tanto, comprende las propiedades de las estructuras de datos Tree y Heap. En el árbol de búsqueda binario, cada nodo del subárbol izquierdo debe ser igual o menor que el valor del nodo raíz y cada nodo del subárbol derecho debe ser igual o mayor que el valor del nodo raíz. En la estructura de datos heap, tanto el subárbol derecho como el izquierdo contienen claves mayores que la raíz; por lo tanto, podemos decir que el nodo raíz contiene el valor más bajo.

En la estructura de datos treap, cada nodo tiene clave y prioridad, donde la clave se deriva del árbol de búsqueda binario y la prioridad se deriva de la estructura de datos heap.

La estructura de datos Treap sigue dos propiedades:

- Hijo derecho de un nodo >= nodo actual e hijo izquierdo de un nodo <= nodo actual (árbol binario) 
- Los hijos de cualquier subárbol deben ser mayores que el nodo (montón)

### B-tree

El árbol B es un árbol equilibrado de m vías, donde m define el orden del árbol. Hasta ahora, hemos leído que el nodo contiene sólo una clave, pero el árbol B puede tener más de una clave y más de 2 hijos. Siempre mantiene los datos ordenados. En el árbol binario, es posible que los nodos hoja estén en distintos niveles, pero en el árbol b, todos los nodos hoja deben estar en el mismo nivel.

![](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.programiz.com%2Fsites%2Ftutorial2program%2Ffiles%2Fsearch-1.png&f=1&nofb=1&ipt=a8eb3aa2ef3561f73611cea4d34fe5172281fb2a08026f1676844b3d30567b76&ipo=images)

**Si el orden es m entonces el nodo tiene las siguientes propiedades:**

- Cada nodo de un árbol b puede tener un máximo de m hijos
- Para los hijos mínimos, un nodo hoja tiene 0 hijos, el nodo raíz tiene un mínimo de 2 hijos y el nodo interno tiene un techo mínimo de m/2 hijos.
- Cada nodo tiene un máximo de (m-1) claves.

El nodo raíz debe contener como mínimo 1 clave y todos los demás nodos deben contener al menos el techo de m/2 menos 1 claves.