#  Binary Tree Implementacion

Un árbol binario se implementa con la ayuda de punteros. El primer nodo del árbol está representado por el puntero raíz. Cada nodo del árbol consta de tres partes: datos, puntero izquierdo y puntero derecho. Para crear un árbol binario, primero necesitamos crear el nodo. Crearemos el nodo definido por el usuario:

```java
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
```

En la estructura anterior, data es el valor, left pointer contiene la dirección del nodo izquierdo, y right pointer contiene la dirección del nodo derecho.

## Metodos de la Clase BinaryTree

### insert

Inserta un nuevo valor en el árbol binario. Llama al método recursivo insertRec para encontrar la posición adecuada.

```java
public void insert(int value) {
    root = insertRec(root, value);
}
```
- Propósito: Iniciar el proceso de inserción de un nuevo valor en el árbol.
- Acción: Llama al método recursivo insertRec pasando la raíz actual (root) y el valor a insertar.

### insertRec

Método recursivo para insertar el valor en el árbol. Si el árbol está vacío, crea un nuevo nodo. Si no, inserta el valor en el subárbol izquierdo o derecho según corresponda.

```java
private Node insertRec(Node root, int value) {
    // Caso base: si el árbol está vacío, crea un nuevo nodo
    if (root == null) {
        root = new Node(value);
        return root;
    }

    // Si el valor a insertar es menor que el valor del nodo actual,
    // inserta en el subárbol izquierdo
    if (value < root.value) {
        root.left = insertRec(root.left, value);
    }
    // Si el valor a insertar es mayor que el valor del nodo actual,
    // inserta en el subárbol derecho
    else if (value > root.value) {
        root.right = insertRec(root.right, value);
    }

    // Devuelve el nodo sin cambios
    return root;
}
```

- Propósito: Realizar la inserción recursiva del valor en la ubicación correcta del árbol.
- Acción: Dependiendo de la situación, este método realiza las siguientes acciones:
    1.  Caso Base: Árbol Vacío:
        - `if (root == null) { root = new Node(value); return root; }`
        - Acción: Si el `root` es `null`, significa que hemos encontrado una posición vacía en el árbol donde podemos insertar el nuevo valor. Creamos un nuevo nodo con el valor y lo retornamos.
        - Resultado: El nuevo nodo se convierte en la raíz del subárbol en el que se insertó.
    2. Valor Menor que el Valor del Nodo Actual:
        - `if (value < root.value) { root.left = insertRec(root.left, value); }`
        - Acción: Si el valor a insertar es menor que el valor del nodo actual (root.value), debemos insertar el valor en el subárbol izquierdo. Llamamos recursivamente al método insertRec para procesar el subárbol izquierdo.
        - Resultado: La llamada recursiva busca la posición adecuada en el subárbol izquierdo para insertar el nuevo valor.
    3. Valor Mayor que el Valor del Nodo Actual:
        - `else if (value > root.value) { root.right = insertRec(root.right, value); }`
        - Acción: Si el valor a insertar es mayor que el valor del nodo actual (`root.value`), debemos insertar el valor en el subárbol derecho. Llamamos recursivamente al método `insertRec` para procesar el subárbol derecho.
        - Resultado: La llamada recursiva busca la posición adecuada en el subárbol derecho para insertar el nuevo valor.
    4. Retornar el Nodo Actual:
        - `return root;`
        - Acción: Después de realizar la inserción en el subárbol izquierdo o derecho, retornamos el nodo actual (`root`). Esto asegura que la estructura del árbol no se rompa y se mantiene el enlace entre los nodos.

### search

Este método busca un valor específico en el árbol.

```java
// Método público para buscar un valor en el árbol
public boolean search(int value) {
    return searchRec(root, value);
}

// Método recursivo para buscar un valor en el árbol
private boolean searchRec(Node root, int value) {
    if (root == null) {
        return false; // Si el nodo es null, el valor no se encontró
    }
    if (root.value == value) {
        return true; // Valor encontrado
    }
    if (value < root.value) {
        return searchRec(root.left, value); // Buscar en el subárbol izquierdo
    } else {
        return searchRec(root.right, value); // Buscar en el subárbol derecho
    }
}
```

`searchRec(Node root, int value)`: Si el nodo actual es null, el valor no está en el árbol y retorna false. Si el valor del nodo actual es igual al valor que se busca, retorna true. Si el valor que se busca es menor, se busca en el subárbol izquierdo; si es mayor, se busca en el subárbol derecho.

### inorder

Este método realiza un recorrido Inorder del árbol, es decir, visita los nodos en el siguiente orden: izquierda, raíz, derecha.

```java
// Método público para iniciar el recorrido Inorder
public void inorder() {
    inorderRec(root);
    System.out.println();
}

// Método recursivo para el recorrido Inorder
private void inorderRec(Node root) {
    if (root != null) {
        inorderRec(root.left);   // Recorrido del subárbol izquierdo
        System.out.print(root.value + " "); // Visita del nodo raíz
        inorderRec(root.right);  // Recorrido del subárbol derecho
    }
}
```

`inorderRec(Node root)`: Este es el método recursivo que hace el trabajo real. Si el nodo root no es null, primero visita el subárbol izquierdo, luego imprime el valor del nodo, y finalmente visita el subárbol derecho. El resultado es que los valores se imprimen en orden ascendente.

### preorder

Este método realiza un recorrido Preorder del árbol, es decir, visita los nodos en el siguiente orden: raíz, izquierda, derecha

```java
// Método público para iniciar el recorrido Preorder
public void preorder() {
    preorderRec(root);
    System.out.println();
}

// Método recursivo para el recorrido Preorder
private void preorderRec(Node root) {
    if (root != null) {
        System.out.print(root.value + " "); // Visita del nodo raíz
        preorderRec(root.left);   // Recorrido del subárbol izquierdo
        preorderRec(root.right);  // Recorrido del subárbol derecho
    }
}
```

`preorderRec(Node root)`: En este caso, primero se visita el nodo raíz, luego el subárbol izquierdo, y finalmente el subárbol derecho. Este tipo de recorrido es útil para copiar un árbol o para evaluar expresiones en árboles de expresión.

### postorder

Este método realiza un recorrido Postorder del árbol, es decir, visita los nodos en el siguiente orden: izquierda, derecha, raíz.

```java
// Método público para iniciar el recorrido Postorder
public void postorder() {
    postorderRec(root);
    System.out.println();
}

// Método recursivo para el recorrido Postorder
private void postorderRec(Node root) {
    if (root != null) {
        postorderRec(root.left);   // Recorrido del subárbol izquierdo
        postorderRec(root.right);  // Recorrido del subárbol derecho
        System.out.print(root.value + " "); // Visita del nodo raíz
    }
}
```

`postorderRec(Node root)`: Aquí, primero se recorre el subárbol izquierdo, luego el subárbol derecho, y finalmente se visita el nodo raíz. Este tipo de recorrido es útil en situaciones donde necesitas procesar nodos después de haber procesado todos sus hijos.

### height

Este método calcula la altura del árbol, que es la longitud del camino más largo desde la raíz hasta una hoja.

```java
// Método público para obtener la altura del árbol
public int height() {
    return heightRec(root);
}

// Método recursivo para calcular la altura del árbol
private int heightRec(Node root) {
    if (root == null) {
        return -1; // Si el árbol está vacío, la altura es -1
    } else {
        int leftHeight = heightRec(root.left);   // Altura del subárbol izquierdo
        int rightHeight = heightRec(root.right); // Altura del subárbol derecho
        return Math.max(leftHeight, rightHeight) + 1; // Altura del árbol actual
    }
}
```

`heightRec(Node root)`: Este método recursivo calcula la altura del subárbol izquierdo y derecho, y luego retorna la mayor de las dos alturas más 1, lo que representa la altura del árbol actual.

### size

Este método cuenta el número de nodos en el árbol.

```java
// Método público para obtener el tamaño del árbol
public int size() {
    return sizeRec(root);
}

// Método recursivo para contar el número de nodos
private int sizeRec(Node root) {
    if (root == null) {
        return 0; // Si el nodo es null, no cuenta como un nodo
    } else {
        return sizeRec(root.left) + sizeRec(root.right) + 1; // Cuenta del nodo actual
    }
}
```

`sizeRec(Node root)`: Si el nodo root es null, retorna 0. De lo contrario, cuenta el nodo actual y suma los nodos en el subárbol izquierdo y derecho. Este método recorre todo el árbol, sumando 1 por cada nodo encontrado.

### countLeaves

Este método cuenta el número de hojas en el árbol (nodos sin hijos).

```java
// Método público para contar las hojas en el árbol
public int countLeaves() {
    return countLeavesRec(root);
}

// Método recursivo para contar el número de hojas
private int countLeavesRec(Node root) {
    if (root == null) {
        return 0; // No hay hojas en un árbol vacío
    } 
    if (root.left == null && root.right == null) {
        return 1; // El nodo es una hoja
    } 
    return countLeavesRec(root.left) + countLeavesRec(root.right); // Suma de hojas en los subárboles
}
```

`countLeavesRec(Node root)`: Si el nodo es null, retorna 0 porque no hay hojas. Si el nodo no tiene hijos (left y right son null), retorna 1 porque es una hoja. Si el nodo tiene hijos, se llama recursivamente en ambos subárboles y se suman los resultados.