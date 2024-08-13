# Resumen de las Estructura de Datos

La estructura de datos es una forma de almacenar y organizar los datos para poder utilizarlos con eficacia.

**¿Qué es la estructura de datos?**

El nombre de ‘Estructura de Datos’ indica por si mismo, que es una forma de organizar los datos en la memoria. Hay muchas formas de organizar los datos en la memoria, como ya hemos visto una de las estructuras de datos como Array. 

Array es una colección de elementos de memoria en la que los datos se almacenan secuencialmente, es decir, uno tras otro. En otras palabras, podemos decir que array almacena los elementos de forma continua. Esta organización de los datos se realiza con la ayuda de una matriz de estructuras de datos. También hay otras formas de organizar los datos en la memoria.

La estructura de datos no es ningún lenguaje de programación como C, C++, java, etc. Es un conjunto de algoritmos que podemos utilizar en cualquier lenguaje de programación para estructurar los datos en la memoria.

Para estructurar los datos en memoria, se propusieron 'n' número de algoritmos, y todos estos algoritmos se conocen como tipos de datos abstractos. Estos tipos de datos abstractos son el conjunto de reglas.

![img](https://static.javatpoint.com/ds/images/data-structure-tutorial2.png)

## Tipos de estructura de datos:

Existen dos tipos de estructuras de datos:

- **Estructura de datos primitiva**
    
    Las estructuras de datos primitivos son tipos de datos primitivos. Los tipos int, char, float, double y pointer son estructuras de datos primitivas que pueden contener un único valor.
    
- **Estructura de datos no primitiva**
    
    La estructura de datos no primitiva se divide en dos tipos:
    
    - Estructura de datos lineal
        
        La disposición de los datos de forma secuencial se conoce como estructura de datos lineal. Las estructuras de datos utilizadas con este fin son las matrices, las listas enlazadas, las pilas y las colas. En estas estructuras de datos, un elemento está conectado a otro elemento de forma lineal.
        
    - Estructura de datos no lineal
        
        Cuando un elemento está conectado al número 'n' de elementos se conoce como estructura de datos no lineal. El mejor ejemplo son los árboles y los grafos. En este caso, los elementos se disponen de forma aleatoria.
        
- **Las estructuras de datos también pueden clasificarse en**
    
    **Estructura de datos estática**: Es un tipo de estructura de datos cuyo tamaño se asigna en tiempo de compilación. Por lo tanto, el tamaño máximo es fijo.
    
    **Estructura de datos dinámica**: Es un tipo de estructura de datos cuyo tamaño se asigna en tiempo de ejecución. Por lo tanto, el tamaño máximo es flexible.
    

## Operaciones importantes

Las operaciones principales o comunes que se pueden realizar en las estructuras de datos son:

- **Searching: B**uscar cualquier elemento en una estructura de datos.
- **Sorting: O**rdenar los elementos de una estructura de datos en orden ascendente o descendente.
- **Insertion: I**nsertar un nuevo elemento en una estructura de datos.
- **Updation: Actualizar el elemento, es decir, sustituirlo por otro.**
- **Deletion: Es** la operación de borrado para eliminar el elemento de la estructura de datos.

## ¿Qué es una estructura de datos?

Una estructura de datos es una forma de organizar los datos para que puedan utilizarse de manera eficiente. Aquí, hemos utilizado la palabra de “manera eficiente”, para términos de espacio y tiempo. Por ejemplo, una pila es un ADT (tipo de datos abstracto) que utiliza una estructura de datos de tipo arrays o lista enlazada para su implementación. Por lo tanto, concluimos que necesitamos alguna estructura de datos para implementar un ADT concreto.

Un ADT dice lo que hay que hacer y la estructura de datos dice cómo hay que hacerlo. En otras palabras, podemos decir que el ADT nos da el plano, mientras que la estructura de datos proporciona la parte de implementación. Ahora surge la pregunta: ¿cómo se puede llegar a saber qué estructura de datos se debe utilizar para un ADT particular?.

Como las diferentes estructuras de datos se pueden implementar en un ADT particular, pero las diferentes implementaciones se comparan por el tiempo y el espacio. Por ejemplo, el ADT de pila puede implementarse tanto con arrays como con listas enlazadas. Supongamos que el array proporciona eficiencia de tiempo mientras que la lista enlazada proporciona eficiencia de espacio, por lo que se seleccionará la que mejor se adapte a los requisitos actuales del usuario.

## Ventajas de las estructuras de datos

- Eficiencia: Si la elección de una estructura de datos para implementar un ADT en particular es adecuada, hace que el programa sea muy eficiente en términos de tiempo y espacio.
- Reutilización: La estructura de datos proporciona reusabilidad significa que múltiples programas cliente pueden utilizar la estructura de datos.
- Abstracción: La estructura de datos especificada por un ADT también proporciona el nivel de abstracción. El cliente no puede ver el funcionamiento interno de la estructura de datos, por lo que no tiene que preocuparse de la parte de implementación. El cliente sólo puede ver la interfaz.