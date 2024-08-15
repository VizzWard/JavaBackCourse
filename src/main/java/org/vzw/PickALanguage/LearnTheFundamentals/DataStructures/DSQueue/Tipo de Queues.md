# Tipos de Queue

## Que es una queue?
La cola es una estructura de datos similar a las colas del mundo real. Una cola es una estructura de datos en la que lo que llega primero sale primero, y sigue la política FIFO (First-In-First-Out). La cola también puede definirse como la lista o colección en la que la inserción se realiza desde un extremo conocido como extremo posterior o cola de la cola, mientras que la eliminación se realiza desde otro extremo conocido como extremo anterior o cabeza de la cola.

Un ejemplo de cola en el mundo real es la cola de venta de entradas a la salida de un cine, en la que la persona que entra primero en la cola obtiene la entrada en primer lugar, y la última persona que entra en la cola obtiene la entrada en último lugar. Un enfoque similar se sigue en la cola en la estructura de datos.

![img](https://static.javatpoint.com/ds/images/ds-types-of-queue.png)

## Tipos de Queue

Existen cuatro tipos diferentes de colas que se enumeran a continuación:

![img](https://static.javatpoint.com/ds/images/ds-types-of-queue2.png)

### Queue simple o Queue lineal
En una cola lineal, una inserción tiene lugar desde un extremo mientras que la eliminación se produce desde otro extremo. El extremo en el que se produce la inserción se conoce como extremo posterior, y el extremo en el que se produce el borrado se conoce como extremo anterior. Sigue estrictamente la regla FIFO.

![img](https://static.javatpoint.com/ds/images/ds-types-of-queue3.png)

El mayor inconveniente de utilizar una Cola lineal es que la inserción se realiza sólo por el extremo posterior. Si se borran los tres primeros elementos de la Cola, no podremos insertar más elementos aunque haya espacio disponible en una Cola lineal. En este caso, la Cola lineal muestra la condición de desbordamiento ya que la trasera está apuntando al último elemento de la Cola.

### Circular Queue
En la cola circular, todos los nodos se representan como circulares. Es similar a la cola lineal, excepto en que el último elemento de la cola está conectado al primer elemento. También se conoce como Buffer en anillo, ya que todos los extremos están conectados a otro extremo

![img](https://static.javatpoint.com/ds/images/ds-types-of-queue4.png)

El inconveniente que se produce en una cola lineal se supera utilizando la cola circular. Si el espacio vacío está disponible en una cola circular, el nuevo elemento se puede añadir en un espacio vacío simplemente incrementando el valor de rear. La principal ventaja de utilizar la cola circular es una mejor utilización de la memoria.

### Queue prioritaria
Es un tipo especial de cola en la que los elementos se ordenan en función de la prioridad. Es un tipo especial de estructura de datos de colas en la que cada elemento tiene asociada una prioridad. Supongamos que aparecen algunos elementos con la misma prioridad, se ordenarán según el principio FIFO.

![img](https://static.javatpoint.com/ds/images/ds-types-of-queue5.png)

La inserción en la cola prioritaria se produce en función de la llegada, mientras que la eliminación en la cola prioritaria se produce en función de la prioridad. La cola de prioridad se utiliza principalmente para implementar los algoritmos de programación de la CPU. 

Existen dos tipos de cola de prioridad que se describen a continuación

- **Cola de prioridad ascendente**: En la cola de prioridad ascendente, los elementos se pueden insertar en un orden arbitrario, pero sólo el más pequeño se puede eliminar primero. Supongamos una matriz con elementos 7, 5 y 3 en el mismo orden, por lo que la inserción se puede hacer con la misma secuencia, pero el orden de eliminación de los elementos es 3, 5, 7.
- **Cola de prioridad descendente**: En la cola de prioridad descendente, los elementos se pueden insertar en un orden arbitrario, pero sólo el elemento más grande se puede borrar primero. Supongamos un array con elementos 7, 3, y 5 en el mismo orden, por lo que, la inserción se puede hacer con la misma secuencia, pero el orden de borrado de los elementos es 7, 5, 3.

## Deque (or, Double Ended Queue)
En Deque o Cola de doble extremo, la inserción y eliminación se puede hacer desde ambos extremos de la cola, ya sea desde la parte delantera o trasera. Esto significa que podemos insertar y borrar elementos desde ambos extremos de la cola. Deque se puede utilizar como un comprobador de palíndromo significa que si leemos la cadena de ambos extremos, entonces la cadena sería la misma.

Deque puede utilizarse tanto como pila como cola, ya que permite las operaciones de inserción y borrado en ambos extremos. Deque puede considerarse como pila porque la pila sigue el principio LIFO (último en entrar, primero en salir) en el que la inserción y la eliminación sólo pueden realizarse desde un extremo. Y en Deque, es posible realizar tanto la inserción como la eliminación desde un extremo, y Deque no sigue el principio FIFO.

![img](https://static.javatpoint.com/ds/images/ds-types-of-queue6.png)

**Existen dos tipos de deque que se analizan a continuación:**

- **Cola de entrada restringida**: Como su nombre indica, en la cola de entrada restringida, la operación de inserción sólo se puede realizar en un extremo, mientras que la eliminación se puede realizar desde ambos extremos.

  ![img](https://static.javatpoint.com/ds/images/ds-types-of-queue7.png)

- **Cola de salida restringida**: Como su nombre indica, en la cola de salida restringida, la operación de borrado sólo se puede realizar en un extremo, mientras que la inserción se puede realizar desde ambos extremos.

  ![img](https://static.javatpoint.com/ds/images/ds-types-of-queue8.png)

## Operaciones

- Enqueue: La operación Enqueue se utiliza para insertar el elemento en el extremo posterior de la cola. Devuelve un valor nulo.
- Dequeue: Realiza la eliminación del front-end de la cola. También devuelve el elemento que se ha eliminado del front-end. Devuelve un valor entero.
- Peek: Esta es la tercera operación que devuelve el elemento apuntado por el puntero frontal en la cola pero no lo borra.
- Queue overflow (isfull): Muestra la condición de desbordamiento cuando la cola está completamente llena.
- Queue underflow (isempty): Muestra la condición de desbordamiento cuando la cola está vacía, es decir, no hay elementos en la cola.

## Formas de implantar queues
- Implementación mediante array: La asignación secuencial en una Cola puede implementarse utilizando un array.
- Implementación mediante lista enlazada: La asignación de listas enlazadas en una cola puede implementarse utilizando una lista enlazada.

