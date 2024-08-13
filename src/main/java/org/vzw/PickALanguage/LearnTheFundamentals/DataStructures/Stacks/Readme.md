# Stacks
# Que es un Stack?

Una Pila es una estructura de datos lineal que sigue el principio LIFO (Last in, First Out). La Pila tiene un extremo, mientras que la Cola tiene dos extremos (anterior y posterior). Sólo contiene un puntero, el puntero superior, que apunta al elemento más alto de la pila. Cada vez que se añade un elemento en la pila, se añade en la parte superior de la pila, y el elemento sólo se puede eliminar de la pila. En otras palabras, una pila puede definirse como un contenedor en el que la inserción y la eliminación pueden realizarse desde un extremo conocido como la parte superior de la pila.

## Puntos clave

- Se denomina pila porque se comporta como una pila del mundo real, pilas de libros, etc.
- Una Pila es un tipo de datos abstracto con una capacidad predefinida, lo que significa que puede almacenar los elementos de un tamaño limitado.
- Es una estructura de datos que sigue algún orden para insertar y borrar los elementos, y ese orden puede ser LIFO o FILO.

## Funcionamiento de la pila

La pila funciona según el patrón LIFO. Como podemos observar en la figura de abajo hay cinco bloques de memoria en la pila; por lo tanto, el tamaño de la pila es 5. 

Supongamos que queremos almacenar los elementos en una pila y supongamos que la pila está vacía. Hemos tomado la pila de tamaño 5 como se muestra a continuación en la que estamos empujando los elementos uno por uno hasta que la pila se llena.

![img4](https://static.javatpoint.com/ds/images/ds-stack.png)

Puesto que nuestra pila está llena ya que el tamaño de la pila es 5. En los casos anteriores, podemos observar que va de arriba a abajo cuando estábamos introduciendo el nuevo elemento en la pila. La pila se llena de abajo hacia arriba.

Cuando realizamos la operación de borrado en la pila, sólo hay un camino de entrada y salida ya que el otro extremo está cerrado. Sigue el patrón LIFO, lo que significa que el valor introducido en primer lugar será eliminado en último lugar. En el caso anterior, el valor 5 se introduce en primer lugar, por lo que se eliminará sólo después de la eliminación de todos los demás elementos.

## Operaciones estándar de pila

- **push():** Cuando insertamos un elemento en una pila, la operación se conoce como push. Si la pila está llena, se produce un desbordamiento.
- **pop():** Cuando borramos un elemento de la pila, la operación se conoce como pop. Si la pila está vacía significa que no existe ningún elemento en la pila, este estado se conoce como estado underflow.
- **isEmpty():** Determina si la pila está vacía o no.
- **isFull():** Determina si la pila está llena o no.
- **peek():** Devuelve el elemento en la posición dada.
- **count():** Devuelve el número total de elementos disponibles en una pila.
- **change():** Cambia el elemento en la posición dada.
- **display():** Imprime todos los elementos disponibles en la pila.

## Operación PUSH

Los pasos de la operación PUSH son los siguientes: 

- Antes de insertar un elemento en una pila, se comprueba si la pila está llena.
- Si intentamos insertar un elemento en una pila, y la pila está llena, se produce la condición de desbordamiento.
- Cuando inicializamos una pila, establecemos el valor de top como -1 para comprobar que la pila está vacía.
- Cuando se inserta un nuevo elemento en una pila, primero se incrementa el valor de top, es decir, top=top+1 y el elemento se coloca en la nueva posición de top, top=top+1, y el elemento se colocará en la nueva posición de top.
- Los elementos se insertarán hasta que alcancemos el tamaño máximo de la pila.

![image.png](https://static.javatpoint.com/ds/images/ds-stack2.png)

## Operación POP

Los pasos de la operación POP son los siguientes: 

- Antes de borrar el elemento de la pila, se comprueba si la pila está vacía.
- Si se intenta borrar el elemento de una pila vacía, se produce la condición de desbordamiento.
- Si la pila no está vacía, primero se accede al elemento apuntado por top .
- Una vez realizada la operación pop, top se decrementa en 1, es decir, top=top-1.

![img](https://static.javatpoint.com/ds/images/ds-stack3.png)

## Aplicaciones de las pilas

- Inversión de cadenas
    
    La pila también se utiliza para invertir una cadena. Por ejemplo, queremos invertir una cadena "javaTpoint", así que podemos conseguirlo con la ayuda de una pila. Primero, empujamos todos los caracteres de la cadena en una pila hasta llegar al carácter nulo. Después de empujar todos los caracteres, empezamos a sacar el carácter uno a uno hasta llegar al fondo de la pila.
    
- UNDO/REDO
    
    También se puede utilizar para realizar operaciones UNDO/REDO. Por ejemplo, tenemos un editor en el que escribimos 'a', luego 'b', y luego 'c'; por lo tanto, el texto escrito en un editor es abc. Entonces, hay tres estados, a, ab y abc, que se almacenan en una pila. Habría dos pilas en las que una pila muestra el estado UNDO, y la otra muestra el estado REDO. Si queremos realizar la operación UNDO, y queremos conseguir el estado 'ab', entonces implementamos la operación pop.
    
- Recursión
    
    La recursión significa que la función se llama a sí misma de nuevo. Para mantener los estados anteriores, el compilador crea una pila del sistema en la que se mantienen todos los registros anteriores de la función.
    
- DFS (Búsqueda en profundidad)
    
    Esta búsqueda se implementa en un Graph, y Graph utiliza la estructura de datos de pila.
    
- Retroceso
    
    Supongamos que tenemos que crear un camino para resolver un problema de laberinto. Si nos estamos moviendo en un camino en particular, y nos damos cuenta de que venimos en el camino equivocado. Con el fin de llegar al principio de la ruta para crear un nuevo camino, tenemos que utilizar la estructura de datos de pila.
    
- Conversión de expresiones
    
    La pila también puede utilizarse para la conversión de expresiones. Esta es una de las aplicaciones más importantes de la pila. La lista de la conversión de expresión se da a continuación:
    
    - Infix to prefix
    - Infix to postfix
    - Prefix to infix
    - Prefix to postfix
    - Postfix to infix
- Gestión de la memoria
    
    La pila gestiona la memoria. La memoria se asigna en bloques de memoria contiguos. La memoria se conoce como memoria de pila, ya que todas las variables se asignan en una memoria de pila de llamada a función. El compilador conoce el tamaño de la memoria asignada al programa. Cuando se crea la función, todas sus variables se asignan en la memoria de pila. Cuando la función completa su ejecución, todas las variables asignadas en la pila son liberadas.