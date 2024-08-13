# Análisis Asintótico

El [análisis asintótico](https://www.javatpoint.com/data-structure-asymptotic-analysis) se utiliza para medir la eficiencia de las estructuras de datos y algoritmos en términos de tiempo y espacio. Nos centramos en la complejidad temporal para comparar estructuras de datos y seleccionar la más adecuada para un algoritmo.

## Comparación de Complejidad Temporal
La complejidad temporal se compara en función de las operaciones realizadas. Por ejemplo, insertar un elemento en un array requiere desplazar todos los elementos, mientras que en una lista enlazada, solo se actualiza el puntero del nodo.

## Cálculo de la Complejidad Temporal
Calcular el tiempo de ejecución real no es práctico; en cambio, se utiliza la función f(n), donde n es el tamaño de la entrada. La complejidad temporal se expresa eliminando términos menos significativos y enfocándose en el término dominante.

Ejemplo:
Si f(n) = 5n^2 + 6n + 12, para grandes valores de n, el término 5n^2 domina.

## Notaciones Asintóticas
1. Notación Big O (O)

    La notación Big O proporciona un límite superior en el crecimiento de una función, indicando el peor caso de complejidad temporal.
    Ejemplo: Si f(n) = 2n + 3 y g(n) = n, f(n) = O(g(n)) si existe un c tal que 2n + 3 ≤ c * n.

2. Notación Omega (Ω)

    La notación Omega describe el límite inferior, representando el mejor caso de tiempo de ejecución.
    Ejemplo: Si f(n) = 2n + 3 y g(n) = n, f(n) = Ω(g(n)) si existe un c tal que 2n + 3 ≥ c * n.

3. Notación Theta (θ)

    La notación Theta proporciona un límite tanto superior como inferior, representando la complejidad promedio.
    Ejemplo: Si f(n) = 2n + 3 y g(n) = n, f(n) = θ(g(n)) si c1 * g(n) ≤ f(n) ≤ c2 * g(n).

## Casos de Tiempo de Ejecución

- Peor Caso: Tiempo máximo que puede tomar el algoritmo.
- Promedio Caso: Tiempo promedio de ejecución.
- Mejor Caso: Tiempo mínimo de ejecución.

## Ejemplos de Notaciones Asintóticas Comunes
|   |   |
|---|---|
|Constante | O(1) |
|Lineal | O(n) |
|Logarítmica | O(log n) |
|n log n | O(n log n) |
|Exponencial | O(2^n) |
|Cúbica | O(n^3) |
|Polinómica | O(n^k) |
|Cuadrática | O(n^2) |