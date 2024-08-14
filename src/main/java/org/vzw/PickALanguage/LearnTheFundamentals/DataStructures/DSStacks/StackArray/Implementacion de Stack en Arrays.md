# Implementacion de Stack en un Array

En la implementación de matrices, la pila se forma utilizando la matriz. Todas las operaciones relativas a la pila se realizan utilizando arrays. Vamos a ver cómo cada operación se puede implementar en la pila utilizando la estructura de datos de matriz.

## Añadir un elemento a la pila (operación push)
Añadir un elemento en la parte superior de la pila se denomina operación push. 
La operación push implica dos pasos: 
- Incrementa la variable Top para que pueda referirse a la siguiente posición de memoria.
- Añade un elemento en la posición de la parte superior incrementada. Esto se denomina añadir un nuevo elemento en la parte superior de la pila.

La pila se desborda cuando intentamos insertar un elemento en una pila completamente llena, por lo tanto, nuestra función principal debe evitar siempre la condición de desbordamiento de pila.

### Algoritmo
```java
void push(int item) {
    if (top == n - 1) {
        System.out.println("Stack full");
    } else {
        top = top + 1;
        stack[top] = item;
    }
}
```
#### Explicacion
- `if (top == n - 1)`: Verifica si el stack está lleno. El índice top empieza en -1, por lo que el índice máximo cuando el stack está lleno es n - 1.
- `top = top + 1`: Incrementa el valor de top para apuntar al siguiente espacio en el stack.
- `stack[top] = item`: Asigna el elemento item al lugar en el array stack indicado por top.

***Complejidad temporal : o(1)***

## Implementación del algoritmo push

```java
class Stack {
    int n; // Tamaño del stack
    int[] stack;
    int top;

    Stack(int size) {
        n = size;
        stack = new int[n];
        top = -1; // Inicializamos top a -1 para indicar que el stack está vacío
    }

    void push(int val) {
        if (top == n - 1) {
            System.out.println("Overflow");
        } else {
            top = top + 1;
            stack[top] = val;
        }
    }
}
```
### **Explicacion de la Clase `Stack` en Java**

Esta clase implementa una estructura de datos de tipo stack (pila) utilizando un array. A continuación se desglosa cada parte del código:

#### Variables de Instancia

- **`int n;`**
    - Representa el tamaño del stack, es decir, la capacidad máxima de elementos que puede contener.

- **`int[] stack;`**
    - Es un array de enteros que almacena los elementos del stack.

- **`int top;`**
    - Es un índice que apunta a la posición del último elemento añadido al stack. Se inicializa en `-1`, lo que indica que el stack está vacío.

#### Constructor

- **`Stack(int size)`**
    - Constructor de la clase que inicializa el stack con el tamaño proporcionado.
    - **`n = size;`** Asigna el tamaño del stack.
    - **`stack = new int[n];`** Inicializa el array `stack` con el tamaño `n`.
    - **`top = -1;`** Inicializa `top` en `-1`, indicando que el stack está vacío.

#### Método `push`

- **`void push(int val)`**
    - Método para añadir un nuevo elemento al stack.
    - **`if (top == n - 1)`**
        - Verifica si el stack está lleno. Si `top` es igual a `n - 1`, significa que el stack no tiene más espacio para nuevos elementos.
        - Si el stack está lleno, se imprime "Overflow" y no se añade el nuevo elemento.
    - **`else { top = top + 1; stack[top] = val; }`**
        - Si el stack no está lleno, `top` se incrementa en 1 para apuntar al siguiente espacio libre en el stack.
        - Luego, el valor `val` se almacena en el array `stack` en la posición `top`.

## Eliminación de un elemento de una pila (operación Pop)

La eliminación de un elemento de la parte superior de la pila se denomina operación pop. El valor de la variable top se incrementa en 1 cada vez que se elimina un elemento de la pila. 
El elemento más alto de la pila se almacena en otra variable y luego la parte superior se disminuye en 1. la operación devuelve el valor eliminado que se almacena en otra variable como resultado. 

La condición de desbordamiento se produce cuando tratamos de eliminar un elemento de una pila ya vacía.

### Algoritmo:
```java
int pop() {
    if (top == -1) {
        System.out.println("Stack empty");
        return -1; // Puedes regresar otro valor o lanzar una excepción si prefieres
    } else {
        int item = stack[top];
        top = top - 1;
        return item;
    }
}
```
#### Explicacion

- `if (top == -1)`: Verifica si el stack está vacío. Si `top` es `-1`, significa que no hay elementos en el stack.
    - Si el stack está vacío, se imprime "Stack empty" y se regresa un valor de error (en este caso `-1`, pero puedes elegir otro valor o lanzar una excepción).
- `else { int item = stack[top]; top = top - 1; return item; }`:
    - Si el stack no está vacío, se obtiene el valor del elemento en la posición `top` del array `stack`.
    - Luego, se decrementa `top` en 1 para indicar que el elemento ha sido eliminado.
    - Finalmente, se regresa el valor del elemento eliminado.

***Complejidad temporal : o(1)***

## Visitar cada elemento de la pila (operación Peek)

La operación Peek consiste en devolver el elemento que se encuentra en la parte superior de la pila sin borrarlo. Si intentamos devolver el elemento superior de una pila ya vacía, puede producirse un desbordamiento.

### Algoritmo
```java
int peek() {
    if (top == -1) {
        System.out.println("Underflow");
        return 0; // Nuevamente, puedes elegir otro valor o lanzar una excepción
    } else {
        return stack[top];
    }
}
```
#### Explicacion

1. Verificación del Stack Vacío:
    - `if (top == -1)`:
        - Se verifica si el stack está vacío. El índice `top` es `-1` cuando el stack no tiene elementos, ya que `top` comienza en `-1` y se incrementa cuando se añaden elementos.
        - Si `top` es igual a `-1`, se imprime "Underflow", lo que indica que el stack está vacío y no se pueden realizar operaciones como ver el elemento superior.
        - `return 0`;: Devuelve un valor por defecto (en este caso, `0`). Este valor puede ser reemplazado con un valor adecuado o una excepción, dependiendo de cómo se desee manejar el caso de stack vacío.
2. Retorno del Elemento Superior:
    - `else { return stack[top]; }`:
      - Si el stack no está vacío (`top` no es `-1`), se devuelve el elemento en la posición `top` del array `stack`.
      - Este valor es el elemento que está en la cima del stack, el cual es accesible pero no se elimina (a diferencia de `pop`).