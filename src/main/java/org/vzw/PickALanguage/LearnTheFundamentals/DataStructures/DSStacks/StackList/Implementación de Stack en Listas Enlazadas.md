# Implementación de Stacks en Listas enlazadas
En lugar de utilizar matrices, también podemos utilizar listas enlazadas para implementar la pila. La lista enlazada asigna la memoria dinámicamente. Sin embargo, la complejidad temporal en ambos escenarios es la misma para todas las operaciones, es decir, push, pop y peek.

En la implementación de listas enlazadas de la pila, los nodos se mantienen de forma no contigua en la memoria. Cada nodo contiene un puntero a su nodo sucesor inmediato en la pila. Se dice que la pila está desbordada si el espacio que queda en el montón de memoria no es suficiente para crear un nodo.

![img](https://static.javatpoint.com/ds/images/ds-linked-list-implementation-stack.png)

El nodo más alto de la pila siempre contiene null en su campo de dirección. Vamos a discutir la forma en que, cada operación se realiza en la implementación de lista enlazada de la pila.

## Añadir un nodo a la pila (operación Push)
Añadir un nodo a la pila se denomina operación push. Empujar un elemento a la pila en la implementación de una lista enlazada es diferente de la implementación de un array. Para empujar un elemento a la pila, se siguen los siguientes pasos.

1. Crea primero un nodo y asígnale memoria.
2. Si la lista está vacía, entonces el elemento debe ser empujado como el nodo de inicio de la lista. Esto incluye asignar valor a la parte de datos del nodo y asignar null a la parte de dirección del nodo.
3. Si ya hay algunos nodos en la lista, entonces tenemos que añadir el nuevo elemento al principio de la lista (para no violar la propiedad de la pila). Para ello, asigne la dirección del elemento inicial al campo de dirección del nuevo nodo y haga del nuevo nodo, el nodo inicial de la lista.
***Complejidad temporal : o(1)***

![img](https://static.javatpoint.com/ds/images/ds-linked-list-implementation-stack2.png)

### Algoritmo
```java
// Método para añadir un elemento al stack
    void push(int val) {
        Node newNode = new Node(val); // Crear un nuevo nodo con el valor proporcionado
        if (newNode == null) {
            System.out.println("Not able to push the element");
        } else {
            if (head == null) {
                head = newNode; // Si el stack está vacío, el nuevo nodo es la cabeza
            } else {
                newNode.next = head; // Apuntar el siguiente del nuevo nodo al nodo actual de la cabeza
                head = newNode; // Actualizar la cabeza para que sea el nuevo nodo
            }
            System.out.println("Item pushed");
        }
    }
```
#### Explicacion
1. Crear un Nuevo Nodo:
    - `Node newNode = new Node(val)`;
    - Este código crea un nuevo nodo de la lista enlazada usando el valor `val` que se pasa al método `push`. El nuevo nodo (`newNode`) contendrá este valor (`val`) y, al principio, no estará conectado a ningún otro nodo (`next` es `null`).
   
2. Verificar Si el Nodo es Nulo:
   - `if (newNode == null)`
   - Esta condición verifica si la asignación de memoria para el nuevo nodo falló, lo cual es una medida de seguridad. En Java, esta verificación no es realmente necesaria como en C (donde podría ocurrir que la asignación de memoria falle).
   
3. Condición para un Stack Vacío:
    - `if (head == null)`
    - Esta condición comprueba si el stack está vacío. En una lista enlazada, esto se determina verificando si la head (cabeza) es null. Si `head` es `null`, significa que no hay nodos en el stack.
   
4. Añadir el Primer Nodo al Stack:
    - `head = newNode;`
    - Si el stack está vacío (`head == null`), el nuevo nodo se convierte en la cabeza del stack. Esto significa que el stack ahora contiene un solo elemento, y ese elemento es el nuevo nodo que acabamos de crear.
   
5. Añadir un Nodo a un Stack No Vacío:
    - `newNode.next = head;`
    - `head = newNode;`
    - Si el stack no está vacío, el nuevo nodo debe colocarse en la parte superior del stack. Para hacer esto:
        - El nuevo nodo (`newNode`) se enlaza al nodo que actualmente está en la cima del stack (`head`) asignando `newNode.next = head`.
        - Luego, la cabeza del stack se actualiza para que apunte al nuevo nodo (`head = newNode`), haciendo que el nuevo nodo sea ahora la cima del stack.
      
6. Mensaje de Confirmación:
    - `System.out.println("Item pushed");`
    - Este mensaje se imprime para confirmar que el elemento ha sido añadido exitosamente al stack.

## Borrar un nodo de la pila (operación POP)
Eliminar un nodo de la parte superior de la pila se denomina operación pop. Borrar un nodo de la pila de listas enlazadas es diferente de la implementación de arrays. Para borrar un elemento de la pila, hay que seguir los siguientes pasos:

1. Comprueba la condición de desbordamiento: La condición de desbordamiento se produce cuando intentamos hacer un pop desde una pila ya vacía. La pila estará vacía si el puntero de cabecera de la lista apunta a null.
2. Ajuste el puntero de la cabeza en consecuencia: En la pila, los elementos se extraen sólo de un extremo, por lo tanto, el valor almacenado en el puntero de la cabeza debe ser borrado y el nodo debe ser liberado. El nodo siguiente del nodo cabeza se convierte ahora en el nodo cabeza.

***Time Complexity : o(n)***

### Algoritmo
```java
// Método para eliminar (pop) el elemento de la cima del stack
    void pop() {
        if (head == null) {
            System.out.println("Underflow"); // El stack está vacío
        } else {
            int item = head.val; // Obtener el valor de la cabeza
            Node ptr = head; // Apuntar al nodo actual de la cabeza
            head = head.next; // Mover la cabeza al siguiente nodo
            // En Java no necesitas liberar explícitamente la memoria como en C, el recolector de basura se encarga de eso
            System.out.println("Item popped: " + item);
        }
    }
```

### Explicacion

1. Comprobar Si el Stack Está Vacío:
    - `if (head == null) {...}`
    - Esta condición verifica si la cabeza del stack es `null`, lo que indica que el stack está vacío. Si es así, imprime "Underflow" porque no hay elementos para eliminar.

2. Eliminar el Nodo en la Cima:

    - `int item = head.val;`
    - Aquí se guarda el valor del nodo en la cima del stack (el nodo apuntado por `head`) en la variable `item`.
    - `Node ptr = head;`
    - `ptr` se utiliza como referencia temporal al nodo actual de la cabeza.
    - `head = head.next;`
    - La cabeza del stack se actualiza para apuntar al siguiente nodo en la lista enlazada, efectivamente eliminando el nodo actual de la cima.
    - Liberación de Memoria:
      - En C, se utiliza `free(ptr);` para liberar la memoria del nodo eliminado. En Java, no necesitas preocuparte por la liberación de memoria manualmente, ya que el recolector de basura de Java se encargará de ello automáticamente.

3. Imprimir el Elemento Eliminado:
    - System.out.println("Item popped: " + item);
    - Imprime el valor del elemento que se ha eliminado del stack.

## Visualizar los nodos (Traversing)
Para visualizar todos los nodos de una pila es necesario recorrer todos los nodos de la lista enlazada organizada en forma de pila. Para ello, hay que seguir los siguientes pasos.

1. Copia el puntero de la cabeza en un puntero temporal.
2. Mueve el puntero temporal por todos los nodos de la lista e imprime el campo de valor adjunto a cada nodo.

***Time Complexity : o(n)***

### Algoritmo
```java
// Método para imprimir los elementos del stack
    void display() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Printing Stack elements:");
            Node ptr = head;
            while (ptr != null) {
                System.out.println(ptr.val);
                ptr = ptr.next; // Mover al siguiente nodo
            }
        }
    }
```
#### Explicacion
1. Verificar Si el Stack Está Vacío:
    - `if (head == null) {...}`
    - Esta condición comprueba si el stack está vacío verificando si la cabeza (`head`) es `null`. Si es así, imprime "Stack is empty".

2. Recorrer e Imprimir los Elementos del Stack:
    - `Node ptr = head;`
    - El puntero ptr se inicializa apuntando a la cabeza del stack.
    - `while (ptr != null) {...}`
      - Este bucle recorre cada nodo del stack.
      - En cada iteración, se imprime el valor del nodo actual (`ptr.val`), y luego ptr se mueve al siguiente nodo (`ptr = ptr.next`).
    - El bucle termina cuando `ptr` llega a `null`, lo que indica que se ha llegado al final del stack.

3. Imprimir Elementos:
    - `System.out.println(ptr.val);`
    - Imprime el valor de cada nodo en el stack en orden desde la cabeza hacia abajo.

### Clase `Node`
```java
// Definición de la clase Node para la lista enlazada
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
```

