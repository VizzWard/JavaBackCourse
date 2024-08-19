# AVL Tree

El árbol AVL puede definirse como un árbol de búsqueda binario de altura equilibrada en el que cada nodo está asociado a un factor de equilibrio que se calcula restando la altura de su subárbol derecho de la de su subárbol izquierdo.

Se dice que el árbol está equilibrado si el factor de equilibrio de cada nodo está entre -1 y 1, de lo contrario, el árbol estará desequilibrado y deberá equilibrarse.

## Factor de equilibrio 

***Factor de equilibrio (k) = altura (izquierda(k)) - altura (derecha(k))***

Si el factor de equilibrio de cualquier nodo es 1, significa que el subárbol izquierdo está un nivel por encima del subárbol derecho.

Si el factor de equilibrio de cualquier nodo es 0, significa que el subárbol izquierdo y el subárbol derecho contienen la misma altura.

Si el factor de equilibrio de cualquier nodo es -1, significa que el subárbol izquierdo está un nivel por debajo del subárbol derecho.

En la siguiente figura se muestra un árbol AVL. Podemos ver que, factor de equilibrio asociado con cada nodo está entre -1 y +1. por lo tanto, es un ejemplo de árbol AVL.

![](https://static.javatpoint.com/ds/images/avl-tree.png)


## Complejidad

| Algoritmo | Caso Medio | Peor Caso |
|-----------|------------|-----------|
| Space     | O(n)       | O(n)      |
| Search    | O(log n)   | O(log n)  |
| Insert    | O(log n)   | O(log n)  |
| Delete    | O(log n)   | O(log n)  |

## Operaciones

Debido al hecho de que el árbol AVL es también un árbol de búsqueda binario, todas las operaciones se realizan de la misma manera que en un árbol de búsqueda binario. La búsqueda y el desplazamiento no violan la propiedad del árbol AVL. Sin embargo, la inserción y la eliminación son las operaciones que pueden violar esta propiedad y, por lo tanto, necesitan ser revisadas.

| Nº | Operación  | Descripción |
|----|------------|-------------|
| 1  | Inserción  | La inserción en un árbol AVL se realiza de la misma manera que en un árbol binario de búsqueda. Sin embargo, puede llevar a una violación de la propiedad del árbol AVL y, por lo tanto, el árbol puede necesitar ser balanceado. El árbol se puede balancear aplicando rotaciones. |
| 2  | Eliminación | La eliminación también se puede realizar de la misma manera que en un árbol binario de búsqueda. La eliminación también puede alterar el balance del árbol, por lo que se utilizan varios tipos de rotaciones para reequilibrar el árbol. |

El árbol AVL controla la altura del árbol de búsqueda binario al no permitir que esté sesgado. El tiempo necesario para todas las operaciones en un árbol de búsqueda binario de altura h es O(h). Sin embargo, puede ampliarse a O(n) si el BST se vuelve sesgado (es decir, en el peor de los casos). Al limitar esta altura a log n, el árbol AVL impone un límite superior a cada operación para que sea O(log n), donde n es el número de nodos.

## Rotaciones AVL

Realizamos la rotación en el árbol AVL sólo en caso de que el Factor de equilibrio sea distinto de -1, 0 y 1. Existen básicamente cuatro tipos de rotaciones que son los siguientes:

1. ***LL rotación***: El nodo insertado está en el subárbol izquierdo del subárbol izquierdo de A.
2. ***RR rotación***: El nodo insertado está en el subárbol derecho del subárbol derecho de A.
3. ***LR rotación***: El nodo insertado está en el subárbol derecho del subárbol izquierdo de A.
4. ***RL rotación*** : El nodo insertado está en el subárbol izquierdo del subárbol derecho de A.

Donde el nodo A es el nodo cuyo Factor de equilibrio es distinto de -1, 0, 1.

Las dos primeras rotaciones LL y RR son rotaciones simples y las dos siguientes rotaciones LR y RL son rotaciones dobles. Para que un árbol sea desequilibrado, la altura mínima debe ser de al menos 2, Entendamos cada rotación.

### LL Rotación

Cuando el BST se desequilibra, debido a que un nodo se inserta en el subárbol izquierdo del subárbol izquierdo de C, entonces realizamos la rotación LL, la rotación LL es una rotación en el sentido de las agujas del reloj, que se aplica en la arista situada debajo de un nodo que tiene factor de equilibrio 2.

![](https://static.javatpoint.com/ds/images/avl-tree2.jpg)

### RR Rotación

Cuando el BST se desequilibra, debido a que un nodo se inserta en el subárbol derecho del subárbol derecho de A, entonces realizamos la rotación RR, la rotación RR es una rotación en sentido contrario a las agujas del reloj, que se aplica en la arista situada debajo de un nodo que tiene factor de equilibrio -2

![](https://static.javatpoint.com/ds/images/avl-tree.jpg)

En el ejemplo anterior, el nodo A tiene un factor de equilibrio -2 porque se ha insertado un nodo C en el subárbol derecho del subárbol derecho de A. Realizamos la rotación RR en la arista inferior a A.

### LR Rotación

Las rotaciones dobles son un poco más difíciles que la rotación simple que ya se ha explicado anteriormente. Rotación LR = Rotación RR + Rotación LL, es decir, primero se realiza la rotación RR en el subárbol y después la rotación LL en el árbol completo, entendiendo por árbol completo el primer nodo de la ruta del nodo insertado cuyo factor de equilibrio sea distinto de -1, 0 o 1.

| Estado | Acción |
| --- | --- |
| ![](https://static.javatpoint.com/ds/images/avl-tree3.jpg) | Se ha insertado un nodo B en el subárbol derecho de A el subárbol izquierdo de C, debido a lo cual C se ha convertido en un nodo desequilibrado que tiene factor de equilibrio 2. Este caso es la rotación L R donde: El nodo insertado está en el subárbol derecho del subárbol izquierdo de C. |
| ![](https://static.javatpoint.com/ds/images/avl-tree4.jpg) | 	Como rotación LR = rotación RR + LL, se realiza primero la rotación RR (en sentido contrario a las agujas del reloj) en el subárbol enraizado en A. Al hacer la rotación RR, el nodo ***A***, se ha convertido en el subárbol izquierdo de ***B***. |
| ![](https://static.javatpoint.com/ds/images/avl-tree5.jpg) | Después de realizar la rotación RR, el nodo C sigue estando desequilibrado, es decir, tiene un factor de equilibrio 2, ya que el nodo insertado A está a la izquierda de ***C***. |
| ![](https://static.javatpoint.com/ds/images/avl-tree6.jpg) | Ahora realizamos una rotación LL en el sentido de las agujas del reloj en el árbol completo, es decir, en el nodo ***C***. El nodo C se ha convertido ahora en el subárbol derecho del nodo B, A es el subárbol izquierdo de B. |
| ![](https://static.javatpoint.com/ds/images/avl-tree7.jpg) | El factor de equilibrio de cada nodo es ahora -1, 0 o 1, es decir, el BST está equilibrado ahora. |

### RL Rotación

Como ya se ha explicado anteriormente, las rotaciones dobles son un poco más difíciles que la rotación simple. R L rotación = LL rotación + RR rotación, es decir, primero LL rotación se realiza en subárbol y luego RR rotación se realiza en árbol completo, por árbol completo nos referimos al primer nodo de la ruta de inserción de nodo cuyo factor de equilibrio es distinto de -1, 0, o 1.

| Estado | Acción |
| --- | --- |
| ![](https://static.javatpoint.com/ds/images/avl-tree8.jpg) | Se ha insertado un nodo ***B*** en el subárbol izquierdo de ***C*** el subárbol derecho de ***A***, debido a lo cual A se ha convertido en un nodo desequilibrado que tiene factor de equilibrio - 2. Este caso es la rotación RL donde: El nodo insertado está en el subárbol izquierdo del subárbol derecho de A. |
| ![](https://static.javatpoint.com/ds/images/avl-tree9.jpg) | Como rotación RL = rotación LL + rotación RR, se realiza primero la rotación LL (en el sentido de las agujas del reloj) del subárbol enraizado en C. Al hacer la rotación RR, el nodo ***C*** se ha convertido en el subárbol derecho de ***B***. |
| ![](https://static.javatpoint.com/ds/images/avl-tree10.jpg) | Después de realizar la rotación LL, el nodo ***A*** sigue estando desequilibrado, es decir, tiene un factor de equilibrio -2, lo que se debe al subárbol derecho del nodo A del subárbol derecho. |
| ![](https://static.javatpoint.com/ds/images/avl-tree11.jpg) | Ahora realizamos la rotación RR (rotación en sentido contrario a las agujas del reloj) en el árbol completo, es decir, en el nodo A. El nodo ***C*** se ha convertido ahora en el subárbol derecho del nodo B, y el nodo A se ha convertido en el subárbol izquierdo de B. |
| ![](https://static.javatpoint.com/ds/images/avl-tree12.jpg) | El factor de equilibrio de cada nodo es ahora -1, 0 o 1, es decir, el BST está equilibrado ahora. |

## Practica: Construye un árbol AVL que tenga los siguientes elementos

***H, I, J, B, A, E, C, F, D, G, K, L***

### 1. Insert H, I, J

![](https://static.javatpoint.com/ds/images/avl-tree13.png)

Al insertar los elementos anteriores, especialmente en el caso de H, el BST se desequilibra ya que el Factor de Equilibrio de H es -2. Dado que el BST está sesgado a la derecha, realizaremos la Rotación RR en el nodo H.

***El árbol de equilibrio resultante es:***

![](https://static.javatpoint.com/ds/images/avl-tree14.png)

### 2. Insert B, A

![](https://static.javatpoint.com/ds/images/avl-tree15.png)

Al insertar los elementos anteriores, especialmente en el caso de A, el BST se desequilibra ya que el Factor de Equilibrio de H e I es 2, consideramos el primer nodo desde el último nodo insertado, es decir, H. Como el BST desde H está sesgado a la izquierda, realizaremos la Rotación LL en el nodo H.

***El árbol de equilibrio resultante es:***

![](https://static.javatpoint.com/ds/images/avl-tree16.png)

### 3. Insert E

![](https://static.javatpoint.com/ds/images/avl-tree17.png)

Al insertar E, el BST se desequilibra ya que el Factor de Equilibrio de I es 2, puesto que si viajamos de E a I nos encontramos con que está insertado en el subárbol izquierdo del subárbol derecho de I, realizaremos la Rotación LR sobre el nodo I. Rotación LR = RR + LL

#### 3.a) Primero realizamos la rotación RR en el nodo B

***El árbol resultante tras la rotación RR es:***

![](https://static.javatpoint.com/ds/images/avl-tree18.png)

#### 3.b) Primero realizamos una rotación LL en el nodo I

***El árbol equilibrado resultante tras la rotación LL es:***

![](https://static.javatpoint.com/ds/images/avl-tree19.png)

### 4. Insert C, F, D

![](https://static.javatpoint.com/ds/images/avl-tree20.png)

Al insertar C, F, D, el BST se desequilibra ya que el Factor de Equilibrio de B y H es -2, ya que si viajamos de D a B nos encontramos que está insertado en el subárbol derecho del subárbol izquierdo de B, realizaremos Rotación RL en el nodo I. Rotación RL = LL + RR.

#### 4.a) Primero realizamos una rotación LL en el nodo E

***El árbol resultante tras la rotación LL es:***

![](https://static.javatpoint.com/ds/images/avl-tree21.png)

#### 4.b) A continuación, realizamos la rotación RR en el nodo B

***El árbol equilibrado resultante tras la rotación RR es:***

![](https://static.javatpoint.com/ds/images/avl-tree22.png)

### 5. Insert G

![](https://static.javatpoint.com/ds/images/avl-tree23.png)

Al insertar G, el BST se desequilibra ya que el Factor de Equilibrio de H es 2, puesto que si viajamos de G a H, nos encontramos que está insertado en el subárbol izquierdo del subárbol derecho de H, realizaremos Rotación LR en el nodo I. Rotación LR = RR + LL.

#### 5.a) Primero realizamos la rotación RR en el nodo C

***El árbol resultante tras la rotación RR es:***

![](https://static.javatpoint.com/ds/images/avl-tree24.png)

#### 5.b) A continuación, realizamos una rotación LL en el nodo H

***El árbol equilibrado resultante tras la rotación LL es:***

![](https://static.javatpoint.com/ds/images/avl-tree25.png)

### 6. Insert K

![](https://static.javatpoint.com/ds/images/avl-tree26.png)

Al insertar K, el BST se desequilibra, ya que el factor de equilibrio de I es -2. Como el BST está sesgado a la derecha de I a K, realizaremos la rotación RR en el nodo I.

***El árbol equilibrado resultante tras la rotación RR es:***

![](https://static.javatpoint.com/ds/images/avl-tree27.png)

### 7. Insert L

Al insertar el árbol L sigue estando equilibrado, ya que el factor de equilibrio de cada nodo es ahora -1, 0, +1. Por lo tanto, el árbol es un árbol AVL equilibrado.

![](https://static.javatpoint.com/ds/images/avl-tree28.png)