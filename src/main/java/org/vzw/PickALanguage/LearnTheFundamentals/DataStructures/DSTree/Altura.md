# Que es la altura?

La altura de un árbol se refiere a la longitud del camino más largo desde la raíz hasta una hoja. 

Es una medida importante para entender la "profundidad" de un árbol.

## Altura de un Nodo

- La altura de un nodo en un árbol binario es la longitud del camino más largo desde ese nodo hasta una hoja.
- Una hoja tiene una altura de 0 porque no tiene hijos.

## Altura del Arbol

- La altura de un árbol binario es la altura del nodo raíz.
- Si un árbol solo tiene la raíz, su altura es 0. 
- En un árbol con más nodos, la altura se calcula como 1 + la altura máxima de sus subárboles.

## Ejemplo

```text
       1
      / \
     2   3
    / \
   4   5
  /
 6
```

- Altura del Nodo 6: 0 (es una hoja). 
- Altura del Nodo 4: 1 (el camino más largo desde 4 hasta una hoja es hacia 6). 
- Altura del Nodo 2: 2 (el camino más largo desde 2 es hacia 6). 
- Altura del Nodo 1 (Raíz): 3 (el camino más largo desde 1 es hacia 6).

Entonces, la altura del árbol es 3.

## Importancia

En un árbol binario balanceado, la altura es relativamente baja, lo que asegura operaciones rápidas (por ejemplo, en un árbol balanceado de altura h, las operaciones tienen una complejidad de O(h)).

En un árbol binario degenerado (como una lista enlazada), la altura puede ser n - 1 (donde n es el número de nodos), lo que lleva a operaciones menos eficientes (O(n)).

## Altura minima de un arbol binario completo

La formula _log2(n+1) - 1_ se utiliza para calcular la altura minima de un arbol binario completo dado un numero de nodos 'n'.

***Descomposicion de la formula***
1. n + 1
    - 'n' es el numero total de nodos en el arbol.
    - Se suma 1 porque estamos considerando la estrucutra de un arbol binario completo. Donde el numero de nodos y niveles estan relacionados por portencias 2.
2. log2(n+1)
    - El logaritmo base 2, nos dice cuantas veces debemos multiplicar 2 para obtener un valor cercano a 'n + 1'.
    - Este termino nos ayuda a determinar cuantos niveles completos se necesitan para albergar 'n' nodos.
3. -1
    - Restar 1 es necesario porque la formula log2(n+1) de como resultado el numero de niveles que se necesitan para contener 'n + 1' nodos, y nodotros queremos la altura en terminos de niveles desde la raiz empezando en 0.
    - Asi, el resultado final nos de la altura minima contando desde 0 para la raiz hasta el nivel mas bajo.