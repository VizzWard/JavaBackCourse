# Singly Linked List
En una lista enlazada simple, cada nodo consta de dos partes: datos y un puntero al nodo siguiente. La parte de datos almacena la información real, mientras que la parte de puntero (o referencia) almacena la dirección del siguiente nodo de la secuencia. Esta estructura permite enlazar nodos de forma dinámica, formando una secuencia en cadena.

![img](https://static.javatpoint.com/ds/images/ds-types-of-linked-list.png)

En esta representación, cada casilla representa un nodo, con una flecha que indica el enlace con el nodo siguiente. El último nodo apunta a NULL, indicando el final de la lista.

## Estructura de los nodos de una lista enlazada simple

```java
// Definición de un nodo en una lista enlazada simple
public class Node {
    // Parte de datos del nodo
    int data;

    // Puntero al siguiente nodo de la lista
    Node next;

    // Constructor para inicializar el nodo con datos
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

En este ejemplo, la clase Nodo contiene un campo de datos entero (data) para almacenar la información y un puntero a otro Nodo (next) para establecer el enlace con el siguiente nodo de la lista.

## Declaración de una lista enlazada simple

Para declarar e implementar una lista enlazada simple (singly linked list) en Java, necesitarás definir dos clases: una para el nodo (Node) y otra para la lista enlazada (SinglyLinkedList). Luego, puedes agregar métodos para insertar elementos y realizar otras operaciones. 

1. Clase `Node`
    
    Esta clase representa un nodo en la lista enlazada. Cada nodo contiene un valor y una referencia al siguiente nodo en la lista.
    
    ```java
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    ```
    
2. Definir la clase `SinglyLinkedList`
La clase `SinglyLinkedList` manejará las operaciones de la lista enlazada, como añadir, eliminar y buscar elementos. Tendrá un campo `head` que representa el primer nodo de la lista.
    
    ```java
    class SinglyLinkedList {
        Node head;
    
        // Constructor para inicializar una lista vacía
        SinglyLinkedList() {
            this.head = null;
        }
    
        // Método para añadir un nuevo nodo al final de la lista
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    
        // Método para imprimir los elementos de la lista
        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
    ```
    
3. Usar la lista enlazada
    
    Ahora puedes usar la clase SinglyLinkedList para crear y manipular una lista enlazada simple.
    
    ```java
    public class Main {
        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();
            
            // Añadir elementos a la lista
            list.add(10);
            list.add(20);
            list.add(30);
    
            // Imprimir la lista
            list.printList(); // Salida: 10 20 30
        }
    }
    
    ```
    

Explicacion de los componentes:

- **Clase `Node`**: Representa un nodo de la lista enlazada con un campo `data` para los datos y un campo `next` para la referencia al siguiente nodo.
- **Clase `SinglyLinkedList`**: Representa la lista enlazada simple con un campo `head` para el primer nodo de la lista y métodos para añadir nodos (`add`) y para imprimir la lista (`printList`).
- **Clase `Main`**: Una clase de ejemplo para demostrar cómo usar la lista enlazada.

## Operaciones con listas simples

### **Traversal**

El recorrido implica visitar cada nodo de la lista enlazada y realizar alguna operación con los datos. Una función de recorrido simple imprimiría o procesaría los datos de cada nodo.

Paso a paso:

- Inicializa un puntero actual a la cabeza de la lista.
- Utilice un bucle while para recorrer la lista hasta que el puntero actual llegue a NULL.
- Dentro del bucle, imprime los datos del nodo actual y mueve el puntero actual al siguiente nodo.

```java
// Función Java para recorrer e imprimir los elementos de la tabla
// linked list
public static void traverseLinkedList(Node head) {
    // Inicia por el head de la linked list
    Node current = head;

    // Recorrer la lista enlazada hasta llegar al final
    // (null)
    while (current != null) {

        // Imprime los datos del nodo actual
        System.out.print(current.data + " ");

        // Pasar al nodo siguiente
        current = current.next;
    }

    System.out.println();
}
```

### Searching

La búsqueda en una lista enlazada se refiere al proceso de buscar un elemento o valor específico dentro de los elementos de la lista enlazada.

Paso a paso:

1. Recorre la lista enlazada empezando por la cabeza.
2. Comprueba si los datos del nodo actual coinciden con el valor objetivo.
    - Si se encuentra una coincidencia, devuelve true.
3. En caso contrario, desplácese al siguiente nodo y repita los pasos 2.
4. Si se llega al final de la lista sin encontrar ninguna coincidencia, devuelve false.

```java
    // Metodo para buscar un valor en la lista enlazada
    boolean searchLinkedList(Node head, int target)
    {
        // Recorrer la lista enlazada
        while (head != null) {
            // Comprueba si los datos del nodo actual coinciden con los datos
            // valor objetivo
            if (head.data == target) {

                // Valor encontrado
                return true;
            }
            // Pasar al nodo siguiente
            head = head.next;
        }
        // Valor no encontrado
        return false;
    }
```

### Finding

Hallar la longitud en una lista simple se refiere al proceso de determinar el número total de nodos en una lista simple.

Paso a paso:

1. Inicializa una longitud de contador a 0.
2. Empieza por la cabeza de la lista, asígnale corriente.
3. Recorre la lista:
    - Incrementa la longitud de cada nodo.
    - Moverse al siguiente nodo (current = current->next).
4. Devuelve el valor final de la longitud.

```java
    // Función para hallar la longitud de la lista enlazada
    public int findLength(Node head) {

        // Inicializar un contador para la longitud
        int length = 0;

        // Empezar por la cabeza de la lista
        Node current = head;

        // Recorre la lista e incrementa la longitud para cada Nodo
        while (current != null) {
            length++;
            current = current.next;
        }

        // Devuelve la longitud final de la lista enlazada
        return length;
    }
```

### Insertion

La inserción es una operación fundamental en las listas enlazadas que consiste en añadir un nuevo nodo a la lista. Existen varios escenarios para la inserción:

- Inserción al principio de una lista enlazada simple
    
    Paso a paso:
    
    1. Crea un nuevo nodo con el valor dado. 
    2. Establece el siguiente puntero del nuevo nodo a la cabeza actual. 
    3. Mueve la cabeza para que apunte al nuevo nodo. 
    4. Devuelve la nueva cabeza de la lista enlazada.
    
    ```java
        // Función para insertar un nuevo nodo al principio del archivo
        // linked list
        Node insertAtBeginning(Node head, int value) {
            // Crea un nuevo nodo con el valor dado
            Node newNode = new Node(value);
    
            // Establece el siguiente puntero del nuevo nodo al actual
            // head
            newNode.next = head;
    
            // Mueve la cabeza para que apunte al nuevo nodo
            head = newNode;
    
            // Devuelve la nueva cabeza de la lista enlazada
            return head;
        }
    ```
    
- Inserción al final de una lista enlazada simple
    
    Para insertar un nodo al final de la lista, recorra la lista hasta llegar al último nodo y, a continuación, enlace el nuevo nodo con el último nodo actual
    
    Paso a paso:
    
    - Crea un nuevo nodo con el valor dado.
    - Comprueba si la lista está vacía:
        - Si lo es, haz que el nuevo nodo sea la cabeza y vuelve.
    - Recorre la lista hasta llegar al último nodo.
    - Vincula el nuevo nodo al último nodo actual estableciendo el puntero siguiente del último nodo al nuevo nodo.
    
    ```java
        // Método para añadir un nuevo nodo al final de la lista
        void add(Object data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    ```
    
- Inserción en una posición específica de la lista enlazada simple
    
    Para insertar un nodo en una posición concreta, recorra la lista hasta la posición deseada, enlace el nuevo nodo con el siguiente y actualice los enlaces en consecuencia.
    
    Paso a paso:
    
    - Comprueba si la posición dada es válida.
        - Si no es válida, imprime "¡Posición no válida!" y sal.
    - Bucle hasta que pos llegue a 0:
        - Si pos es 0:
            - Crea un nuevo nodo con los datos dados.
            - Establece el siguiente puntero del nuevo nodo al nodo actual.
            - Actualiza el nodo actual al nuevo nodo.
        - Si no, pasa al siguiente nodo actualizando el puntero doble.
    - Incrementa el tamaño de la lista enlazada.
    
    ```java
    // Método para insertar un nodo en una posición específica
        public void insertPos(int pos, Object data) {
            // Verificar si la posición es válida
            System.out.println(size);
            if (pos < 1 || pos > size + 1) {
                System.out.println("Invalid position!");
                return;
            }
    
            // Crear el nuevo nodo
            Node newNode = new Node(data);
    
            // Si la posición es la primera, actualizar el head
            if (pos == 1) {
                newNode.next = head;
                head = newNode;
            } else {
                // Encontrar el nodo en la posición anterior a la deseada
                Node current = head;
                for (int i = 1; i < pos - 1; i++) {
                    current = current.next;
                }
                // Insertar el nuevo nodo en la posición deseada
                newNode.next = current.next;
                current.next = newNode;
            }
    
            // Incrementar el tamaño de la lista
            size++;
        }
    ```
    

### Deletion

El borrado consiste en eliminar un nodo de la lista enlazada. Al igual que ocurre con la inserción, existen diferentes escenarios para la eliminación:

- Borrado al principio de una lista enlazada simple
    
    Para eliminar el primer nodo, actualiza la cabeza para que apunte al segundo nodo de la lista.
    
    Paso a paso:
    
    - Comprueba si head es NULL.
        - Si lo es, devuelve NULL (la lista está vacía).
    - Almacena el nodo head actual en una variable temporal temp.
    - Mueve el puntero cabeza al siguiente nodo.
    - Borra el nodo temporal.
    - Devuelve el nuevo head de la lista enlazada.
    
    ```java
        // Función para eliminar el primer nodo
        // de la lista enlazada
        static Node removeFirstNode(Node head)
        {
            if (head == null)
                return null;
    
            // Mover el puntero del head al siguiente nodo
            Node temp = head;
            head = head.next;
    
            //Eliminar el nodo temporal
            temp = null;
    
            //Retornar el nuevo head
            return head;
        }
    ```
    
- Eliminación al final de una lista simple
    
    Para eliminar el último nodo, recorre la lista hasta el penúltimo nodo y actualiza su siguiente campo a Ninguno.
    
    Paso a paso:
    
    - Comprueba si la head es NULL.
        - Si lo es, devuelve NULL (la lista está vacía).
    - Comprueba si el siguiente de head es NULL (sólo un nodo en la lista).
        - Si es true, borra head y devuelve NULL.
    - Recorre la lista hasta encontrar el penúltimo nodo (**second_last**).
    - Elimina el último nodo (el nodo después de **second_last**).
    - Establece el siguiente puntero del penúltimo nodo a NULL.
    - Devuelve el head de la lista enlazada.
    
    ```java
    // Función Java para eliminar el último nodo de la lista enlazada
        Node removeLastNode(Node head)
        {
            // Si la lista está vacía, devuelve null
            if (head == null)
                return null;
    
            // Si la lista sólo tiene un nodo, elimínalo y devuelve
            // null
            if (head.next == null) {
                head = null;
                return null;
            }
    
            // Encuentra el penúltimo nodo
            Node second_last = head;
            while (second_last.next.next != null) {
                second_last = second_last.next;
            }
    
            // Eliminar el último nodo
            second_last.next = null;
    
            // Devuelve la lista modificada
            return head;
        }
    ```
    
- Borrado en una posición específica de una lista enlazada simple
    
    Para eliminar un nodo en una posición concreta, recorra la lista hasta la posición deseada, actualice los enlaces para pasar por alto el nodo que desea eliminar.
    
    Paso a paso:
    
    - Comprueba si la lista está vacía o la posición no es válida, devuelve si es así.
    - Si hay que borrar la cabeza, actualiza la cabeza y borra el nodo.
    - Recorre hasta el nodo anterior a la posición que hay que borrar.
    - Si la posición está fuera de rango, devuelve.
    - Almacena el nodo que hay que borrar.
    - Actualiza los enlaces para evitar el nodo.
    - Borra el nodo almacenado.
    
    ```java
    // Función para eliminar un nodo en una posición determinada
        public void deleteAtPosition(Node head, int position)
        {
            // Si la lista está vacía o la posición no es válida
            if (head == null || position < 1) {
                return;
            }
    
            //  Si hay que borrar el head
            if (position == 1) {
                Node temp = head;
                head = head.next;
                temp = null;
                return;
            }
    
            // Desplazarse al nodo anterior a la posición que se va a borrar
            Node current = head;
            for (int i = 1; i < position - 1 && current != null;
                 i++) {
                current = current.next;
            }
    
            // Si la posición está fuera de rango
            if (current == null || current.next == null) {
                return;
            }
    
            // Almacenar el nodo a eliminar
            Node temp = current.next;
    
            // Actualizar los enlaces para evitar el nodo que se va a eliminar
            current.next = current.next.next;
    
            // Eliminar el nodo
            temp = null;
        }
    ```