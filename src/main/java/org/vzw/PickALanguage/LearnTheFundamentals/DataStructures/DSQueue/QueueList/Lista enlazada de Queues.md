# Lista enlazada de Queue

Debido a los inconvenientes de la Queues en los Arrays, de que la implementación de matrices no se puede utilizar para las aplicaciones a gran escala en las que se implementan las colas. Una de las alternativas a la implementación de matrices es la implementación de listas enlazadas de colas.

El requisito de almacenamiento de la representación de una cola con una lista con n elementos es o(n), mientras que el requisito de tiempo para las operaciones es o(1).

En una cola enlazada, cada nodo de la cola consta de dos partes: la parte de datos y la parte de enlace. Cada elemento de la cola apunta a su elemento inmediato siguiente en la memoria.

En la cola enlazada, hay dos punteros que se mantienen en la memoria: el puntero delantero y el puntero trasero. El puntero delantero contiene la dirección del elemento inicial de la cola, mientras que el puntero trasero contiene la dirección del último elemento de la cola.

Las inserciones y eliminaciones se realizan en los extremos posterior y anterior, respectivamente. Si los extremos anterior y posterior son NULL, indica que la cola está vacía.

![img](https://static.javatpoint.com/ds/images/linked-list-implementation-of-queue.png)

## Operación en una cola enlazada

### Operación de inserción (insert)
La operación de inserción añade un elemento al final de la cola. El nuevo elemento será el último elemento de la cola.

En primer lugar, se asigna la memoria para el nuevo nodo.
```java
Node newNode = new Node(item); // Crea un nuevo nodo con el elemento
```

Puede haber dos escenarios de inserción de este nuevo nodo en la cola.

En el primer escenario, insertamos un elemento en una cola vacía. En este caso, la condición front = NULL se hace verdadera. Ahora, el nuevo elemento se añadirá como único elemento de la cola.

```java
// Si la cola está vacía, el nuevo nodo es tanto front como rear
if (this.rear == null) {
    this.front = this.rear = newNode;
    return;
}
```

En el segundo caso, la cola contiene más de un elemento. La condición front = NULL se convierte en falsa. En este escenario, necesitamos actualizar el puntero final rear para que el siguiente puntero de rear apunte al nuevo nodo. Como se trata de una cola enlazada, también tenemos que hacer que el puntero rear apunte al nuevo nodo.
```java
rear.next = new_node;
rear = new_node;
```

#### Metodo enqueue
```java
// Método para añadir un elemento a la cola
    void enqueue(int item) {
        Node newNode = new Node(item); // Crea un nuevo nodo con el elemento

        // Si la cola está vacía, el nuevo nodo es tanto front como rear
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }

        // Si no está vacía, añade el nuevo nodo al final y actualiza rear
        this.rear.next = newNode;
        this.rear = newNode;
    }
```

### Operacion de eliminacion (dequeue)
La operación de borrado elimina el elemento insertado en primer lugar entre todos los elementos de la cola. En primer lugar, tenemos que comprobar si la lista está vacía o no. La condición front == NULL se convierte en verdadera si la lista está vacía, en este caso, simplemente escribimos underflow en la consola y hacemos exit.

En caso contrario, borraremos el elemento apuntado por el puntero front. Para ello, copia el nodo apuntado por el puntero front en el puntero temp. Ahora, desplaza el puntero frontal y apunta a su siguiente nodo.

```java
Node temp = front;
front = front.next;
```

#### Metodo dequeue
```java
// Función para eliminar un elemento de la cola
    void dequeue() {
      
        // Si la cola está vacía, devuelve
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        // Almacenar el front anterior y mover fron un nodo
        // ahead
        Node temp = front;
        front = front.next;

        // Si la parte delantera es nula, entonces cambia también la trasera a nulo
        if (front == null) {
            rear = null;
        }
    }
```

