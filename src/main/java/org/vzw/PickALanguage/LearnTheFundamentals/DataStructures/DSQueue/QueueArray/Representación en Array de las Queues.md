# Representación en Array de las Queues

Podemos representar fácilmente una cola utilizando matrices. 

Hay dos variables, frontal y trasera, que se implementan en cada cola. Las variables front y rear señalan la posición desde la que se realizan las inserciones y eliminaciones en una cola. 

Inicialmente, el valor de front y queue es -1, que representa una cola vacía. Representación en array de una cola que contiene 5 elementos junto con los valores respectivos de front y rear.

![img](https://static.javatpoint.com/ds/images/array-representation-of-queue.png)

La imagen muestra la cola de caracteres que forman la palabra "HELLO". Como hasta ahora no se ha borrado ningún carácter de la cola, el valor de la parte delantera sigue siendo -1 . Sin embargo, el valor de rear aumenta en uno cada vez que se realiza una inserción en la cola. Después de insertar un elemento en la cola mostrada en la figura anterior, la cola tendrá el siguiente aspecto. El valor de rear se convertirá en 5, mientras que el valor de front seguirá siendo el mismo.

![img](https://static.javatpoint.com/ds/images/array-representation-of-queue2.png)

Después de eliminar un elemento, el valor de front aumentará de -1 a 0. Sin embargo, la cola tendrá el siguiente aspecto.

![img](https://static.javatpoint.com/ds/images/array-representation-of-queue3.png)

## Algoritmo para insertar cualquier elemento en una cola (enqueue)
Comprueba si la cola ya está llena comparando rear con max - 1. Si es así, devuelve un error de desbordamiento.

Si el elemento se va a insertar como primer elemento de la lista, establece el valor de front y rear a 0 e inserta el elemento en el extremo posterior.

De lo contrario, sige aumentando el valor de rear e inserte cada elemento uno a uno teniendo rear como índice.

### Algoritmo
```java
// Método para insertar un elemento en la cola
public void enqueue(int item) {
    if (isFull()) {
        System.out.println("Queue is full");
        return;
    }
    queue[rear] = item;
    rear++;
}
```
#### Explicacion
- `void insert(int item)`:
    - Comprobación de Overflow: Si `rear + 1` es igual al tamaño máximo (`max`), significa que no hay espacio para insertar más elementos, y se imprime "Overflow".
    - Primera Inserción: Si tanto `front` como `rear` son `-1`, significa que la cola está vacía, por lo que ambos se establecen en `0`.
    - Inserción Normal: Si la cola no está vacía, `rear` se incrementa en `1` para apuntar a la próxima posición disponible, y luego el `item` se inserta en esa posición.
    - Finalmente, se imprime un mensaje confirmando la inserción del `item`.

## Algoritmo para eliminar un elemento de la cola (dequeue)
Si, el valor de front es -1 o el valor de front es mayor que rear , escribe un mensaje de desbordamiento y termina. 
De lo contrario, sige aumentando el valor de front y devuelve el elemento almacenado en el extremo frontal de la cola en cada momento.

### Algoritmo
```java
// Método para eliminar un elemento de la cola
public int dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }
    int item = queue[front];
    // Desplazar los elementos hacia adelante
    for (int i = 0; i < rear - 1; i++) {
        queue[i] = queue[i + 1];
    }
    rear--;
    return item;
}
```

#### Explicacion
- int delete():

    - Underflow Check: Comprueba si front es -1 o si front es mayor que rear, lo que indicaría que la cola está vacía o no es válida. En tal caso, se imprime "Underflow" y se devuelve -1.
    - Elemento Eliminado: El valor en el índice front del array se almacena en y y se devuelve.
    - Reiniciar Cola: Si front es igual a rear, significa que solo hay un elemento en la cola, y ambos se reinician a -1 para indicar que la cola está vacía.
    - Mover Frente: Si hay más elementos en la cola, front se incrementa en 1 para mover el frente al siguiente elemento.

## Algoritmo para consultar el primer elemento (peek)
Devuelve el elemento al frente de la cola sin eliminarlo.

### Algoritmo
```java
// Método para consultar el elemento al frente de la cola sin eliminarlo
public int peek() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }
    return queue[front];
}
```
#### Explicacion
1. Chequeo de Cola Vacía:
    - La condición `front == -1` comprueba si nunca se ha insertado ningún elemento en la cola (la cola está completamente vacía).
    - La condición `front > rear` verifica si todos los elementos han sido eliminados, lo que también indica que la cola está vacía.

2. Devolución del Elemento en el Frente:
    - Si ninguna de las condiciones anteriores es verdadera, significa que la cola tiene elementos.
    -En este caso, el método devuelve el valor almacenado en la posición front del array, que es el primer elemento de la cola.

3. Manejo de Cola Vacía:
    - Si la cola está vacía, el método imprime "Queue is empty" y devuelve `-1` como indicativo de que no hay elementos para retornar.

## Algoritmo para verificar si la cola esta vacia (isEmpty)
Verifica si la cola está vacía.

### Algoritmo
```java
// Método para verificar si la cola está vacía
public boolean isEmpty() {
    return front == rear;
}
```
#### Explicacion
- Devuelve true si front es -1 o si front es mayor que rear, indicando que no hay elementos en la cola.

## Algoritmo para verificar si la cola esta llena (isFull)
Utilizado para determinar si la cola ha alcanzado su capacidad máxima.

```java
// Método para verificar si la cola está llena
public boolean isFull() {
    return rear == capacity;
}
```
#### Explicacion
- Si la condición es verdadera (la cola está llena), el método devuelve true.

## Inconvenientes de la aplicación de matrices
Aunque, la técnica de crear una cola es fácil, hay algunos inconvenientes de usar esta técnica para implementar una cola.

- Desperdicio de memoria: El espacio de la matriz, que se utiliza para almacenar los elementos de la cola, nunca puede ser reutilizado para almacenar los elementos de esa cola porque los elementos sólo se pueden insertar en la parte delantera y el valor de la parte delantera puede ser tan alto que, todo el espacio antes de que, nunca puede ser llenado.
   
  ![img](https://static.javatpoint.com/ds/images/limitation-array-representation-of-queue.png)

La figura anterior muestra cómo se desperdicia el espacio de memoria en la representación de array de la cola. En la figura anterior, se muestra una cola de tamaño 10 con 3 elementos. El valor de la variable front es 5, por lo tanto, no podemos reinsertar los valores en el lugar del elemento ya borrado antes de la posición de front. Tanto espacio de la matriz se desperdicia y no se puede utilizar en el futuro (para esta cola).

- Decidir el tamaño de la matriz
  Uno de los problemas más comunes en la implementación de matrices es el tamaño de la matriz, que debe declararse de antemano. Debido al hecho de que, la cola puede ser extendida en tiempo de ejecución dependiendo del problema, la extensión en el tamaño del array es un proceso que lleva tiempo y es casi imposible de realizar en tiempo de ejecución ya que tienen lugar muchas reasignaciones. Debido a esta razón, podemos declarar el array lo suficientemente grande para que podamos almacenar los elementos de la cola tanto como sea posible, pero el principal problema con esta declaración es que, la mayoría de las ranuras del array (casi la mitad) nunca pueden ser reutilizadas. Esto conducirá de nuevo al desperdicio de memoria. 
