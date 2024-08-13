# Introduccion

Desde la invención de los ordenadores, la gente utiliza el término "Datos" para referirse a la información informática, ya sea transmitida o almacenada. Sin embargo, hay datos que existen también en tipos de orden. Los datos pueden ser números o textos escritos en un trozo de papel, en forma de bits y bytes almacenados en la memoria de dispositivos electrónicos, o hechos almacenados en la mente de una persona. A medida que el mundo empezó a modernizarse, estos datos se convirtieron en un aspecto importante del día a día de todos, y diversas implementaciones permitieron almacenarlos de forma diferente.

<mark>Los datos son un conjunto de hechos y cifras o un conjunto de valores de un formato específico que se refiere a un único conjunto de valores de ítems.</mark> A continuación, los elementos de datos se clasifican en subelementos, que es el grupo de elementos que no se conocen como la forma primaria simple del elemento.

Consideremos un ejemplo en el que el nombre de un empleado puede desglosarse en tres subapartados: Nombre, Segundo nombre y Apellidos. Sin embargo, un ID asignado a un empleado se considerará generalmente un único elemento.

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction.png)

En el ejemplo mencionado anteriormente, los elementos como ID, Edad, Sexo, Nombre, Segundo nombre, Apellidos, Calle, Localidad, etc., son elementos de datos elementales. En cambio, el Nombre y la Dirección son datos de grupo.

### ¿Qué es la estructura de datos?

La estructura de datos es una rama de la informática. <mark>El estudio de la estructura de datos permite comprender la organización de los datos y la gestión del flujo de datos para aumentar la eficacia de cualquier proceso o programa.</mark> La estructura de datos es una forma particular de almacenar y organizar datos en la memoria del ordenador, de modo que estos datos puedan recuperarse fácilmente y utilizarse de forma eficiente en el futuro cuando sea necesario. Los datos pueden gestionarse de varias formas, como el modelo lógico o matemático para una organización específica de datos se conoce como estructura de datos.

**El alcance de un determinado modelo de datos depende de dos factores:**

1. En primer lugar, debe cargarse lo suficiente en la estructura para reflejar la correlación definitiva de los datos con un objeto del mundo real.
2. En segundo lugar, la formación debe ser tan sencilla que uno pueda adaptarse para procesar los datos de forma eficaz siempre que sea necesario.

Algunos ejemplos de Estructuras de Datos son las Matrices, las Listas Enlazadas, los Stacks, las Queue, los Árboles, etc. Las estructuras de datos se utilizan ampliamente en casi todos los aspectos de la informática: diseño de compiladores, sistemas operativos, gráficos, inteligencia artificial y muchos más.

Las estructuras de datos son la parte principal de muchos algoritmos informáticos, ya que permiten a los programadores gestionar los datos de forma eficaz. Desempeñan un papel crucial en la mejora del rendimiento de un programa o software, ya que el objetivo principal del software es almacenar y recuperar los datos del usuario lo más rápido posible.

### Terminología básica relacionada con las estructuras de datos

Las estructuras de datos son los componentes básicos de cualquier software o programa. Seleccionar la estructura de datos adecuada para un programa es una tarea extremadamente difícil para un programador.

A continuación se presentan algunas terminologías fundamentales utilizadas cuando se trata de estructuras de datos:

- **Data:** Podemos definir los datos como <mark>un valor elemental o una colección de valores.</mark> Por ejemplo, el nombre y el ID del Empleado son los datos relacionados con el Empleado.
- **Data Items:** Una <mark>Unidad de valor individual</mark> se conoce como Elemento de datos.
- **Group Items:** Los <mark>elementos de datos que tienen elementos de datos subordinados</mark> se conocen como elementos de grupo. Por ejemplo, el nombre de un empleado puede tener nombre, segundo nombre y apellidos.
- **Elementary Items:** Los <mark>Elementos de Datos que no pueden dividirse en subelementos</mark> se conocen como Elementos Elementales. Por ejemplo, el ID de un Empleado.
- **Entity and Attribute:** <mark>Una clase de ciertos objetos es representada por una Entidad.</mark> Se compone de diferentes Atributos. <mark>Cada Atributo simboliza la propiedad específica de esa Entidad.</mark> Por ejemplo,
    
    
    | Attributes | ID | Name | Gender | Job Title |
    | --- | --- | --- | --- | --- |
    | Values | 1234 | Stacey M. Hill | Female | Software Developer |
    
    Las entidades con atributos similares forman un conjunto de entidades (**Entity Set)**. Cada atributo de un conjunto de entidades tiene un rango de valores, el conjunto de todos los valores posibles que podrían asignarse al atributo específico.
    

El término "información" se utiliza a veces para datos con determinados atributos de datos significativos o procesados.

1. **Field**: Se denomina Campo a una única unidad elemental de información que simboliza el Atributo de una Entidad.
2. **Record**: Una colección de diferentes elementos de datos se conoce como Registro. Por ejemplo, si hablamos de la entidad empleado, entonces su nombre, id, dirección y cargo pueden agruparse para formar el registro del empleado.
3. **File**: Una colección de diferentes Registros de un tipo de entidad se conoce como Fichero. Por ejemplo, si hay 100 empleados, habrá 25 registros en el fichero relacionado que contiene datos sobre cada empleado.

___Field - seria el elementary item, record - seria una entidad, file - una colección de instancias de una entidad.___

### Comprender la necesidad de las estructuras de datos

A medida que las aplicaciones se vuelven más complejas y la cantidad de datos aumenta día a día, pueden surgir problemas con la búsqueda de datos, la velocidad de procesamiento, la gestión de múltiples solicitudes y muchos más. 

Las Estructuras de Datos soportan diferentes métodos para organizar, gestionar y almacenar datos de forma eficiente. 

Con la ayuda de las Estructuras de Datos, podemos recorrer fácilmente los elementos de datos. 

<mark>Las estructuras de datos proporcionan eficiencia, reutilización y abstracción.</mark>

### ¿Por qué debemos aprender estructuras de datos?

1. Las Estructuras de Datos y los Algoritmos son dos de los aspectos clave de la Informática. 
2. <mark>Las Estructuras de Datos nos permiten organizar y almacenar datos, mientras que los Algoritmos nos permiten procesar esos datos de forma significativa.</mark>
3. Aprender Estructuras de Datos y Algoritmos nos ayudará a convertirnos en mejores Programadores. 
4. Podremos escribir código más eficaz y fiable. 
5. También podremos resolver problemas de forma más rápida y eficiente.

### Comprender los objetivos de las estructuras de datos

Las estructuras de datos cumplen dos objetivos complementarios:

1. **Corrección**: Las estructuras de datos están diseñadas para funcionar correctamente con todo tipo de entradas basadas en el dominio de interés. En otras palabras, la corrección es el objetivo principal de las estructuras de datos, que siempre depende de los problemas que se pretenden resolver con ellas.
2. **Eficiencia**: Las estructuras de datos también deben ser eficientes. Debe procesar los datos rápidamente sin utilizar muchos recursos informáticos como el espacio de memoria. En un estado de tiempo real, la eficiencia de una estructura de datos es un factor clave para determinar el éxito o el fracaso del proceso.

### Comprender algunas características clave de las estructuras de datos

Algunas de las Características Significativas de las Estructuras de Datos son:

1. **Robustez**: En general, todos los programadores informáticos aspiran a producir software que produzca una salida correcta para cada entrada posible, junto con una ejecución eficiente en todas las plataformas de hardware. Este tipo de software robusto debe gestionar tanto las entradas válidas como las inválidas.
2. **Adaptabilidad**: La creación de aplicaciones de software como navegadores web, procesadores de texto y motores de búsqueda en Internet incluye enormes sistemas de software que requieren un funcionamiento o ejecución correctos y eficientes durante muchos años. Además, el software evoluciona debido a las tecnologías emergentes o a las condiciones siempre cambiantes del mercado.
3. **Reutilización**: Características como la reutilización y la adaptabilidad van de la mano. Es sabido que el programador necesita muchos recursos para construir cualquier software, lo que lo convierte en una empresa costosa. Sin embargo, si el software se desarrolla de forma reutilizable y adaptable, podrá aplicarse en la mayoría de las aplicaciones futuras. Así pues, mediante la ejecución de estructuras de datos de calidad, es posible construir software reutilizable, lo que resulta rentable y ahorra tiempo.

## Clasificación de las estructuras de datos

Una Estructura de Datos proporciona un conjunto estructurado de variables relacionadas entre sí de diversas maneras. Constituye la base de una herramienta de programación que significa la relación entre los elementos de datos y permite a los programadores procesar los datos de forma eficiente.

Podemos clasificar las Estructuras de Datos en dos categorías:

- Estructura de datos primitiva
- Estructura de datos no primitiva

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction2.png)

## Estructuras de datos primitivas

1. Las estructuras de datos primitivas son las estructuras de datos formadas por los números y los caracteres que vienen incorporados en los programas.
2. Estas estructuras de datos pueden manipularse u operarse directamente mediante instrucciones a nivel de máquina.
3. Los tipos de datos básicos como Entero, Flotante, Carácter y Booleano entran dentro de las Estructuras de Datos Primitivos.
4. Estos tipos de datos también se denominan tipos de datos simples, ya que contienen caracteres que no se pueden dividir más.

## Estructuras de datos no primitivas

1. Las estructuras de datos no primitivas son aquellas estructuras de datos derivadas de las estructuras de datos primitivas.
2. Estas estructuras de datos no pueden manipularse ni operarse directamente mediante instrucciones a nivel de máquina.
3. Estas estructuras de datos se centran en formar un conjunto de elementos de datos homogéneos (mismo tipo de datos) o heterogéneos (tipos de datos diferentes).
4. En función de la estructura y la disposición de los datos, podemos dividir estas estructuras de datos en dos subcategorías.
    1. Estructuras de datos lineales
    2. Estructuras de datos no lineales

## Estructuras de datos lineales

Una estructura de datos que <mark>preserva una conexión lineal entre sus elementos</mark> de datos se conoce como Estructura Lineal de Datos. La disposición de los datos se realiza de forma lineal, donde cada elemento está formado por los sucesores y predecesores excepto el primer y el último elemento de datos. Sin embargo, no es necesariamente cierto en el caso de la memoria, ya que la disposición puede no ser secuencial.

En función de la asignación de memoria, las estructuras de datos lineales se clasifican a su vez en dos tipos:

1. Estructuras de datos estáticas: <mark>Las estructuras de datos que tienen un tamaño fijo</mark> se conocen como Estructuras de Datos Estáticas. <mark>La memoria para estas estructuras de datos se asigna en tiempo de compilación, y su tamaño no puede ser cambiado</mark> por el usuario después de ser compilado; sin embargo, <mark>los datos almacenados en ellas pueden ser alterados.</mark> 
    
    El Array es el mejor ejemplo de Estructura de Datos Estática ya que tienen un tamaño fijo, y sus datos pueden ser modificados posteriormente.
    
2. Estructuras de datos dinámicas: Las estructuras de datos que tienen un tamaño dinámico se conocen como Estructuras de Datos Dinámicas. <mark>La memoria de estas estructuras de datos se asigna en tiempo de ejecución, y su tamaño varía durante el tiempo de ejecución del código. Además, el usuario puede cambiar el tamaño y los elementos de datos almacenados</mark> en estas estructuras de datos en tiempo de ejecución del código.
    
     Las listas enlazadas, los stack y las queue son ejemplos comunes de estructuras de datos dinámicas.
    

## Tipos de estructuras de datos lineales

La siguiente es la lista de Estructuras de Datos Lineales que generalmente utilizamos: 

### *Array*

Una Matriz es una estructura de datos <mark>utilizada para reunir múltiples elementos de datos del mismo tipo de datos en una variable.</mark> En lugar de almacenar múltiples valores de los mismos tipos de datos en nombres de variables separadas, podríamos almacenarlos todos juntos en una variable. Esta afirmación no implica que tengamos que unir todos los valores del mismo tipo de datos en cualquier programa en un array de ese tipo de datos. Pero a menudo habrá ocasiones en las que algunas variables específicas de los mismos tipos de datos estén todas relacionadas entre sí de una manera apropiada para un array.

<mark>Un array es una lista de elementos en la que cada elemento ocupa un lugar único en la lista. Los elementos de datos del array comparten el mismo nombre de variable; sin embargo, cada uno lleva un número de índice diferente llamado subíndice.</mark> Podemos acceder a cualquier elemento de datos de la lista con la ayuda de su ubicación en la lista. Así pues, la característica clave de las matrices es que los datos se almacenan en posiciones de memoria contiguas, lo que permite a los usuarios recorrer los elementos de datos de la matriz utilizando sus índices respectivos.

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction3.png)

Las matrices pueden clasificarse en distintos tipos:

1. Matriz unidimensional: Un Array con una sola fila de elementos de datos se conoce como Array Unidimensional. Se almacena en ubicación ascendente.
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2F3.bp.blogspot.com%2F-YE_2kQ7cnI4%2FWtA80dPCYwI%2FAAAAAAAAAWE%2FO3Yp0HixW5Mv5OlCac4xsO4Zw8oZWj9ewCLcBGAs%2Fs1600%2FArraysVB.jpg&f=1&nofb=1&ipt=8d91c973e42cefe2944b2313fc0e17fd0fdf18fd10ab4233ae2465c06209a8e6&ipo=images)
    
2. Matriz Bidimensional: Un Arreglo que consiste en múltiples filas y columnas de elementos de datos se llama Arreglo Bidimensional. También se conoce como Matriz.
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.tutorialesprogramacionya.com%2Fgoya%2Fimagentema%2Ffoto053.jpg&f=1&nofb=1&ipt=a2ff532dcc5188e95deef182803c6758f41e0f807ac959cbe5f34d6c04fe8b19&ipo=images)
    
3. Matriz Multidimensional: Podemos definir un Arreglo Multidimensional como un Arreglo de Arreglos. Los Arrays Multidimensionales no están limitados a dos índices o dos dimensiones ya que pueden incluir tantos índices como sean necesarios.
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fwp-content%2Fuploads%2F3D-array.jpg&f=1&nofb=1&ipt=11d2c5f25288166b49829cd33d5ff265fb0407c16b4d6fcd7a4b45a7086596a1&ipo=images)
    

Algunas aplicaciones de Array:

- Podemos almacenar una lista de elementos de datos pertenecientes al mismo tipo de datos.
- Array actúa como almacenamiento auxiliar para otras estructuras de datos.
- La matriz también ayuda a almacenar elementos de datos de un árbol binario de la cuenta fija.
- Array también actúa como almacenamiento de matrices.

### *Linked List*

Una lista enlazada es otro ejemplo de estructura de datos lineal <mark>utilizada para almacenar dinámicamente una colección de elementos de datos.</mark> Los elementos de datos de esta estructura de datos <mark>están representados por los Nodos, conectados mediante enlaces o punteros.</mark> Cada nodo contiene dos campos, el campo de información consiste en los datos reales, y el campo de puntero consiste en la dirección de los nodos subsiguientes de la lista. El puntero del último nodo de la lista enlazada consiste en un puntero nulo, ya que no apunta a nada. A diferencia de las matrices, el usuario puede ajustar dinámicamente el tamaño de una lista enlazada según sus necesidades.

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction4.png)

Las listas enlazadas pueden clasificarse en distintos tipos:

1. Lista simple: Una lista enlazada simple es el tipo más común de lista enlazada. <mark>Cada nodo contiene datos y un campo puntero que contiene una dirección al siguiente nodo.</mark>
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fblogger.googleusercontent.com%2Fimg%2Fb%2FR29vZ2xl%2FAVvXsEhNjfJvda4rwhPGg9yaSfai4rkj5vwZzfdDG-uPMvl2iQrGWy3HObXz9R59cHMhwuSxD1kZ-KU3P01jprIWU--bjeDNRPQDDRT94l4eumFna8wdE2jciGgpr-OAfa0aSeFo6kraEdtQhhuTvp4bu_ky4Q24dHBFjSxhaHjwMYqWTzxeX7_NIezkSksgUQ%2Fs1803%2FSingly%2520Linked%2520List.png&f=1&nofb=1&ipt=43bb96812474df9ed0a5d00606f7d6badc2ef3e9454364113339573b29120f4f&ipo=images)
    
2. **Lista doblemente enlazada**: Una lista doblemente enlazada <mark>consta de un campo de información y dos campos de puntero.</mark> El campo de información contiene los datos. El primer campo puntero contiene una dirección del nodo anterior, mientras que otro campo puntero contiene una referencia al nodo siguiente. Así, podemos ir en ambas direcciones (tanto hacia atrás como hacia delante).
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fwp-content%2Fcdn-uploads%2Fgq%2F2014%2F03%2FDLL1.png&f=1&nofb=1&ipt=c9fa0acf9df1865a63f74a7bdaf0cb219f0255e4108e10782395f1dc01913a0f&ipo=images)
    
3. **Lista enlazada circular**: La lista circular es similar a la lista simple. <mark>La única diferencia clave es que el último nodo contiene la dirección del primer nodo</mark>, formando un bucle circular en la Lista Enlazada Circular.
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.alphacodingskills.com%2Fimgfiles%2Fcircular-singly-linked-list.PNG&f=1&nofb=1&ipt=e6c0c9bae7f383eea1f3ad1e59b61a84ded7d1f4971b98dbda420ae75bbb1c11&ipo=images)
    

Algunas aplicaciones de las listas enlazadas:

1. Las listas enlazadas nos ayudan a implementar pilas, colas, árboles binarios y grafos de tamaño predefinido.
2. También podemos implementar la función del sistema operativo para la gestión dinámica de la memoria.
3. Las listas enlazadas también permiten la implementación polinómica de operaciones matemáticas.
4. Podemos utilizar Circular Linked List para implementar sistemas operativos o funciones de aplicación que redondean la ejecución de tareas.
5. La Lista Enlazada Circular también es útil en una Presentación de Diapositivas en la que un usuario necesita volver a la primera diapositiva después de presentar la última.
6. La lista doblemente enlazada se utiliza para implementar botones de avance y retroceso en un navegador para avanzar y retroceder en las páginas abiertas de un sitio web.

### *Stacks*

Un stack es una Estructura de Datos Lineal que sigue el principio <mark>LIFO (Last In, First Out)</mark> que permite operaciones como inserción y borrado desde un extremo de la Pila, es decir, el Superior. Las pilas pueden implementarse con la ayuda de memoria contigua, una matriz, y memoria no contigua, una lista enlazada. Ejemplos reales de pilas son los montones de libros, una baraja de cartas, montones de dinero y muchos más.

La figura anterior representa el ejemplo real de una Pila en la que las operaciones se realizan desde un solo extremo, como la inserción y eliminación de nuevos libros desde la parte superior de la Pila. Implica que la inserción y la eliminación en la Pila sólo pueden realizarse desde la parte superior de la Pila. Sólo podemos acceder a la parte superior de la Pila en un momento dado.

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction5.png)

Las principales operaciones de un Stack son:

1. **Push**: La operación para <mark>insertar un nuevo elemento en la Pila</mark> se denomina Operación Push.
2. **Pop**: La operación para <mark>eliminar o borrar elementos de la Pila</mark> se denomina Operación Pop.

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction6.png)

Algunas aplicaciones de Stack:

1. Se utiliza como Estructura de Almacenamiento Temporal para operaciones recursivas.
2. También se utiliza como estructura de almacenamiento auxiliar para llamadas a funciones, operaciones anidadas y funciones diferidas/pospuestas.
3. Podemos gestionar las llamadas a funciones utilizando stacks.
4. También se utilizan para evaluar las expresiones aritméticas en distintos lenguajes de programación.
5. También son útiles para convertir expresiones infijas en expresiones postfijas.
6. Nos permiten comprobar la sintaxis de la expresión en el entorno de programación.
7. Podemos emparejar paréntesis utilizando stacks.
8. Los stacks se pueden utilizar para invertir un string.
9. Son útiles para resolver problemas basados en el backtracking.
10. Podemos utilizar stacks en la búsqueda en profundidad en el recorrido de grafos y árboles.
11. También se utilizan en las funciones del sistema operativo.
12. También se utilizan en las funciones UNDO y REDO de una edición.

### *Queues*

Una Cola (Queue) es una estructura de datos lineal similar a una Pila con algunas limitaciones en la inserción y eliminación de los elementos. <mark>La inserción de un elemento en una Cola se realiza en un extremo, y la eliminación se realiza en otro o en el extremo opuesto.</mark> Por lo tanto, podemos concluir que la estructura de datos de Cola sigue el principio <mark>FIFO (First In, First Out)</mark> para manipular los elementos de datos. Las colas se pueden implementar utilizando matrices, listas enlazadas o pilas. Algunos ejemplos de colas en la vida real son una cola en una taquilla, una escalera mecánica, un túnel de lavado y muchos más.

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction7.png)

La imagen anterior es una ilustración real de una taquilla de cine que puede ayudarnos a entender la cola en la que el cliente que llega primero siempre es atendido en primer lugar. El cliente que llega en último lugar será sin duda atendido en último lugar. Ambos extremos de la cola están abiertos y pueden ejecutar operaciones diferentes. Otro ejemplo es la cola de un patio de comidas, en la que el cliente se introduce por el extremo posterior mientras que el cliente se retira por el extremo anterior tras prestarle el servicio que ha solicitado.

A continuación se describen las principales operaciones de la cola:

1. **Enqueue**: La <mark>inserción o Adición de algunos elementos</mark> de datos a la Cola se denomina Enqueue. La inserción de elementos se realiza siempre con la ayuda del puntero trasero.
2. Dequeue: El <mark>borrado o eliminación de elementos de datos</mark> de la Cola se denomina Dequeue. El borrado del elemento se realiza siempre con la ayuda del puntero frontal.

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction8.png)

Algunas aplicaciones de las colas:

1. Las colas se utilizan generalmente en la operación de búsqueda de amplitud en Grafos.
2. Las colas también se utilizan en las operaciones de programación de trabajos de los sistemas operativos, como una cola de memoria intermedia de teclado para almacenar las teclas pulsadas por los usuarios y una cola de memoria intermedia de impresión para almacenar los documentos impresos por la impresora.
3. Las colas son responsables de la programación de la CPU, la programación de trabajos y la programación de discos.
4. Las colas prioritarias se utilizan en las operaciones de descarga de archivos en un navegador.
5. Las colas también se utilizan para transferir datos entre los dispositivos periféricos y la CPU.
6. Las colas también son responsables de gestionar las interrupciones generadas por las Aplicaciones de Usuario para la CPU.

## Estructuras de datos no lineales

Las estructuras de datos no lineales <mark>son aquellas en las que los elementos de datos no están dispuestos en orden secuencial.</mark> Aquí, la inserción y eliminación de datos no es factible de forma lineal. Existe una relación jerárquica entre los distintos datos.

## Tipos de estructuras de datos no lineales

### *Trees*

Un Árbol es una Estructura de Datos No Lineal y una jerarquía que contiene una colección de nodos de tal forma que <mark>cada nodo del árbol almacena un valor y una lista de referencias a otros nodos</mark> (los "hijos").

La estructura de datos en árbol es un método especializado para organizar y recopilar datos en el ordenador y utilizarlos de forma más eficaz. <mark>Contiene un nodo central, nodos estructurales y subnodos conectados mediante aristas.</mark> También podemos decir que la estructura de datos de árbol consta de raíces, ramas y hojas conectadas.

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction9.png)

Los árboles pueden clasificarse en distintos tipos:

1. **Binary Tree:** Una estructura de datos de árbol en la que <mark>cada nodo padre puede tener como máximo dos hijos</mark> se denomina árbol binario**.**
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ffavtutor.com%2Fresources%2Fimages%2Fuploads%2FFig%25204%2520(1).jpg&f=1&nofb=1&ipt=648464cc455d57ac7bc0e760e2806b7fe86655c1855c9048bfb4323bc9c7dc60&ipo=images)
    
2. **Binary Search Tree:** Un árbol de búsqueda binario es una estructura de datos en forma de árbol en la que podemos mantener fácilmente una lista ordenada de números.
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sahinarslan.tech%2Fstatic%2F5244e7df88bb17dedb1e57f02548ec30%2F3f513%2Fbinary-search-tree-anatomy.jpg&f=1&nofb=1&ipt=e460b201c3df46b245d6eaa71d845e4f2bc981c15423aab7d2434919a8eb6c76&ipo=images)
    
3. **AVL Tree:** Un Árbol AVL es un Árbol de Búsqueda Binario auto-equilibrado en el que cada nodo mantiene una información extra conocida como Factor de Equilibrio cuyo valor es -1, 0 o +1.
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.programiz.com%2Fsites%2Ftutorial2program%2Ffiles%2Favl-tree-final-tree-1_0_2.png&f=1&nofb=1&ipt=123fb687c05751c4b5dbdd1606d4c4a093ee76c3fda627fba2b6b66723569e1b&ipo=images)
    
4. **B-Tree:** Un árbol B es un tipo especial de árbol de búsqueda binaria auto equilibrado en el que cada nodo consta de varias claves y puede tener más de dos hijos.
    
    ![Untitled](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.programiz.com%2Fsites%2Ftutorial2program%2Ffiles%2Fsearch-1.png&f=1&nofb=1&ipt=2417ba927380540af7bf1507e777011e149c3c55e698f5f866a268202e5f6ccc&ipo=images)
    

Algunas aplicaciones de los árboles:

1. Los árboles implementan estructuras jerárquicas en sistemas informáticos como directorios y sistemas de archivos.
2. Los árboles también se utilizan para implementar la estructura de navegación de un sitio web.
3. Podemos generar código como el de Huffman utilizando Árboles.
4. Los árboles también son útiles para la toma de decisiones en aplicaciones de juegos de azar.
5. Los árboles son responsables de implementar las colas de prioridad para las funciones de programación del SO basadas en prioridades.
6. Los árboles también se encargan de analizar expresiones y sentencias en los compiladores de distintos lenguajes de programación.
7. Podemos utilizar Árboles para almacenar claves de datos para la indexación de Sistemas de Gestión de Bases de Datos (SGBD).
8. Los árboles de expansión nos permiten tomar decisiones de encaminamiento en las redes de ordenadores y comunicaciones.
9. Los árboles también se utilizan en el algoritmo de búsqueda de caminos implementado en aplicaciones de Inteligencia Artificial (IA), Robótica y Videojuegos.

### *Graphs*

Un grafo es otro ejemplo de estructura de datos no lineal que <mark>comprende un número finito de nodos o vértices y las aristas que los conectan.</mark> Los Grafos se utilizan para abordar problemas del mundo real en los que se denota el área del problema como una red, como las redes sociales, las redes de circuitos y las redes telefónicas. Por ejemplo, los nodos o vértices de un grafo pueden representar a un único usuario en una red telefónica, mientras que las aristas representan el enlace entre ellos a través del teléfono.

La estructura de datos Graph, G se considera una estructura matemática compuesta por un conjunto de vértices, V y un conjunto de aristas, E como se muestra a continuación:

G = (V,E)

![Untitled](https://static.javatpoint.com/ds/images/ds-introduction10.png)

La figura anterior representa un Grafo que tiene siete vértices A, B, C, D, E, F, G, y diez aristas [A, B], [A, C], [B, C], [B, D], [B, E], [C, D], [D, E], [D, F], [E, F], y [E, G].

**En función de la posición de los vértices y las aristas, los grafos pueden clasificarse en distintos tipos:**

1. **Null Graph:** Un grafo con un conjunto vacío de aristas se denomina grafo nulo.
2. **Trivial Graph:** Un gráfico que sólo tiene un vértice se denomina gráfico trivial.
3. **Simple Graph:** Un grafo sin bucles propios ni aristas múltiples se conoce como grafo simple.
4. **Multi Graph:** Se dice que un grafo es Multi si consta de múltiples aristas pero no de bucles propios.
5. **Pseudo Graph:** Un grafo con bucles propios y múltiples aristas se denomina pseudografo.
6. **Non-Directed Graph:** Un grafo formado por aristas no dirigidas se denomina grafo no dirigido.
7. **Directed Graph:** Un grafo formado por las aristas dirigidas entre los vértices se conoce como grafo dirigido.
8. **Connected Graph:** Un grafo con al menos un camino entre cada par de vértices se denomina grafo conexo.
9. **Disconnected Graph:** Un grafo en el que no existe ningún camino entre al menos un par de vértices se denomina grafo desconectado.
10. **Regular Graph:** Un grafo en el que todos los vértices tienen el mismo grado se denomina grafo regular.
11. **Complete Graph:** Un grafo en el que todos los vértices tienen una arista entre cada par de vértices se conoce como grafo completo.
12. **Cycle Graph:** Se dice que un grafo es un ciclo si tiene al menos tres vértices y aristas que forman un ciclo.
13. **Cyclic Graph:** Se dice que un grafo es cíclico si y sólo si existe al menos un ciclo.
14. **Acyclic Graph:** Un gráfico con cero ciclos se denomina gráfico acíclico.
15. **Finite Graph:** Un grafo con un número finito de vértices y aristas se conoce como grafo finito.
16. **Infinite Graph:** Un grafo con un número infinito de vértices y aristas se conoce como grafo infinito.
17. **Bipartite Graph:** Un grafo en el que los vértices pueden dividirse en conjuntos independientes A y B, y todos los vértices del conjunto A sólo deben conectarse a los vértices presentes en el conjunto B con algunas aristas se denomina grafo bipartito.
18. **Planar Graph:** Se dice que una Gráfica es Plana si podemos dibujarla en un solo plano con dos aristas que se intersecan.
19. **Euler Graph:** Se dice que un grafo es de Euler si y sólo si todos los vértices son de grados pares.
20. **Hamiltonian Graph:** Un grafo conectado formado por un circuito hamiltoniano se conoce como grafo hamiltoniano.

**Algunas aplicaciones de los grafos:**

1. Los grafos nos ayudan a representar rutas y redes en aplicaciones de transporte, viajes y comunicaciones.
2. Los gráficos se utilizan para mostrar rutas en el GPS.
3. Los grafos también nos ayudan a representar las interconexiones en las redes sociales y otras aplicaciones basadas en redes.
4. Los gráficos se utilizan en aplicaciones cartográficas.
5. Los gráficos se encargan de representar las preferencias de los usuarios en las aplicaciones de comercio electrónico.
6. Los gráficos también se utilizan en las redes de servicios públicos para identificar los problemas que se plantean a las corporaciones locales o municipales.
7. Los gráficos también ayudan a gestionar la utilización y disponibilidad de recursos en una organización.
8. Los gráficos también se utilizan para elaborar mapas de enlaces documentales de los sitios web con el fin de mostrar la conectividad entre las páginas a través de hipervínculos.
9. Los grafos también se utilizan en movimientos robóticos y redes neuronales.

## Operaciones básicas de estructuras de datos

En la siguiente sección, discutiremos los diferentes tipos de operaciones que podemos realizar para manipular datos en cada estructura de datos:

1. **Traversal**: <mark>Recorrer una estructura de datos</mark> significa acceder a cada elemento de datos exactamente una vez para poder administrarlo. Por ejemplo, es necesario recorrerla para imprimir los nombres de todos los empleados de un departamento.
2. **Search**: La búsqueda es otra operación de estructura de datos que significa <mark>encontrar la ubicación de uno o más elementos de datos que cumplan ciertas restricciones.</mark> Dicho elemento de datos puede o no estar presente en el conjunto dado de elementos de datos. Por ejemplo, podemos utilizar la operación de búsqueda para encontrar los nombres de todos los empleados que tienen una experiencia de más de 5 años.
3. **Insertion**: Insertar significa <mark>insertar o añadir nuevos elementos de datos a la colección.</mark> Por ejemplo, podemos utilizar la operación de inserción para añadir los datos de un nuevo empleado que la empresa ha contratado recientemente.
4. **Deletion**: Borrar significa <mark>eliminar o suprimir un elemento de datos específico</mark> de la lista dada de elementos de datos. Por ejemplo, podemos utilizar la operación de borrado para eliminar el nombre de un empleado que ha dejado el trabajo.
5. **Sorting**: Ordenar significa <mark>organizar los elementos de datos en orden ascendente o descendente</mark> dependiendo del tipo de aplicación. Por ejemplo, podemos utilizar la operación de ordenación para ordenar los nombres de los empleados de un departamento por orden alfabético o estimar los tres empleados con mayor rendimiento del mes ordenando el rendimiento de los empleados por orden descendente y extrayendo los datos de los tres primeros.
6. **Merge**: Fusionar significa <mark>combinar elementos de datos de dos listas ordenadas para formar una única lista</mark> de elementos de datos ordenados.
7. **Create**: Crear es una operación <mark>utilizada para reservar memoria para los elementos de datos del programa.</mark> Podemos realizar esta operación mediante una sentencia de declaración. La creación de la estructura de datos puede tener lugar tanto durante
    1. Tiempo de compilación
    2. Tiempo de ejecución
8. **Selection**: Selección significa <mark>seleccionar un dato en particular de los datos disponibles.</mark> Podemos seleccionar cualquier dato concreto especificando condiciones dentro del bucle.
9. **Update**: La operación Actualizar nos permite <mark>actualizar o modificar los datos</mark> de la estructura de datos. También podemos actualizar cualquier dato en particular especificando algunas condiciones dentro del bucle, al igual que la operación Selección.
10. **Splitting**: La operación de Splitting nos permite <mark>dividir los datos en varias subpartes</mark> disminuyendo el tiempo total de finalización del proceso.

## Comprender el tipo de datos abstracto

Según el Instituto Nacional de Normas y Tecnología (NIST), una estructura de datos es una disposición de la información, generalmente en la memoria, para mejorar la eficacia de los algoritmos. Las estructuras de datos incluyen listas enlazadas, pilas, colas, árboles y diccionarios. También pueden ser una entidad teórica, como el nombre y la dirección de una persona.

De la definición mencionada anteriormente, podemos concluir que las operaciones en la estructura de datos incluyen:

1. Un alto nivel de abstracciones como la adición o eliminación de un elemento de una lista.
2. Buscar y ordenar un elemento en una lista.
3. Acceder al elemento más prioritario de una lista.

Cuando una estructura de datos realiza este tipo de operaciones, se denomina tipo de datos abstracto (ADT (**Abstract Data Type**)).

Podemos definirlo como un conjunto de elementos de datos junto con las operaciones sobre los datos. El término "abstracto" se refiere al hecho de que los datos y las operaciones fundamentales definidas sobre ellos se estudian independientemente de su aplicación. Incluye lo que podemos hacer con los datos, no cómo podemos hacerlo.

Una implementación ADT contiene una estructura de almacenamiento para guardar los elementos de datos y algoritmos de funcionamiento fundamentales. Todas las estructuras de datos, como un array, lista enlazada, cola, pila, etc., son ejemplos de ADT.

## Comprender las ventajas de utilizar ADT

En el mundo real, los programas evolucionan como consecuencia de nuevas restricciones o requisitos, por lo que modificar un programa suele requerir un cambio en una o varias estructuras de datos. Por ejemplo, supongamos que queremos insertar un nuevo campo en el registro de un empleado para llevar un registro de más detalles sobre cada empleado. En ese caso, podemos mejorar la eficacia del programa sustituyendo una matriz por una estructura enlazada. En tal situación, reescribir cada procedimiento que utiliza la estructura modificada es inadecuado. Por lo tanto, una alternativa mejor es separar una estructura de datos de su información de implementación. Este es el principio en el que se basa el uso de los tipos de datos abstractos (TDA).

## Algunas aplicaciones de las estructuras de datos

1. Las estructuras de datos ayudan a organizar los datos en la memoria de un ordenador.
2.  Las estructuras de datos también ayudan a representar la información en las bases de datos.
3. Las estructuras de datos permiten implementar algoritmos de búsqueda de datos (por ejemplo, un motor de búsqueda). 
4. Las estructuras de datos permiten implementar algoritmos de manipulación de datos (por ejemplo, procesadores de texto). 
5. Las estructuras de datos también permiten implementar algoritmos de análisis de datos (por ejemplo, mineros de datos).
6. Las Estructuras de Datos admiten algoritmos para generar datos (por ejemplo, un generador de números aleatorios). 
7. Las Estructuras de Datos también admiten algoritmos para comprimir y descomprimir datos (por ejemplo, una utilidad zip).
8. También podemos utilizar las Estructuras de Datos para implementar algoritmos para cifrar y descifrar datos (por ejemplo, un sistema de seguridad). 
9. Con la ayuda de las Estructuras de Datos, podemos crear software que gestione archivos y directorios (por ejemplo, un gestor de archivos). 
10. También podemos desarrollar software que represente gráficos utilizando Estructuras de Datos. (Por ejemplo, un navegador web o un software de renderizado 3D).

Aparte de las mencionadas anteriormente, existen muchas otras aplicaciones de las Estructuras de Datos que pueden ayudarnos a construir cualquier software deseado.