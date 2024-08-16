# Que es un Nodo

Un nodo es una unidad fundamental que almacena información y está conectada a otros nodos. Los nodos forman la estructura del árbol, y cada nodo puede tener una relación jerárquica con otros nodos, lo que define la forma y el funcionamiento del árbol.

## Estructura

Un nodo generalmento contiene dos partes principales:

1. Dato o Valor:
    - Es la informacion que almacena el nodo. Puede ser un numero, un caracter, un objeto, etc.
2. Referencias o punteros:
    - Son enlaces que conectan el nodo con otros nodos en el arbol.

## Tipos de Nodos

1. Raíz (Root):
    - Es el nodo superior del árbol. No tiene ningún nodo padre.
    - Todos los demás nodos en el árbol son descendientes directos o indirectos de la raíz.

2. Hojas (Leaves):
    - Son nodos que no tienen hijos. En otras palabras, son los nodos terminales en el árbol.
    - En un árbol binario, son nodos cuyas referencias de hijo izquierdo y derecho son null.

3. Nodos Internos:
    - Son nodos que tienen al menos un hijo. No son ni hojas ni la raíz.
    - En un árbol binario, son nodos que tienen al menos una referencia de hijo no null.

4. Nodos Padre e Hijo:
    - Padre: Un nodo que tiene una referencia a otro nodo (su hijo).
    - Hijo: Un nodo que es referenciado por otro nodo (su padre).

5. Nodos Hermanos (Siblings):
    - Son nodos que comparten el mismo nodo padre.

```text
        1        <- Raíz
       / \
      2   3      <- Nodos Internos
     / \
    4   5        <- Hojas
```

- Nodo 1 es la raíz.
- Nodos 2 y 3 son nodos internos, hijos de 1.
- Nodos 4 y 5 son hojas, ya que no tienen hijos.
- Nodo 2 es el padre de 4 y 5.
- Nodos 4 y 5 son hermanos porque comparten el mismo nodo padre, que es 2.

## Calcular la cantidad de nodos por nivel

La cantidad de nodos que puede tener un árbol depende del tipo de árbol binario que estemos considerando y su altura (número de niveles).

Para un árbol binario perfecto (donde todos los niveles están completamente llenos), la cantidad máxima de nodos en un árbol de n niveles (contando el nivel 0) se calcula con la siguiente fórmula:

***Cantidad maxima = 2^(h+1) - 1***

### Ejemplo (Arbol de 3 niveles)

Niveles 0, 1, 2 y 3(total de 4 niveles).

Nodos en cada nivel:
- Nivel 0: 2^0 = 1 Nodo.
- Nivel 1: 2^1 = 2 Nodos.
- Nivel 2: 2^2 = 4 Nodos.
- Nivel 3: 2^3 = 8 nodos.

Cantidad Maxima:

1 + 2 + 4 + 8 = 15 Nodos.

Entonces, un árbol binario perfecto de 3 niveles (o altura 3) puede tener un máximo de 15 nodos.