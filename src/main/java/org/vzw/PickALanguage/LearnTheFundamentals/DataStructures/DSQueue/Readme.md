# Queue

1. Una cola puede definirse como una lista ordenada que permite realizar operaciones de inserción en un extremo denominado REAR y operaciones de eliminación en otro extremo denominado FRONT.
2. La cola se denomina lista "primero en entrar, primero en salir".
3. Por ejemplo, las personas que esperan para comprar un billete de tren forman una cola.

![img](https://static.javatpoint.com/ds/images/queue.png)

## Aplicaciones de la cola
1. Las colas se utilizan ampliamente como listas de espera para un único recurso compartido como impresora, disco, CPU. 
2. Las colas se utilizan en la transferencia asíncrona de datos (cuando los datos no se transfieren al mismo ritmo entre dos procesos) por ejemplo, tuberías, archivos IO, sockets. 
3. Las colas se utilizan como búferes en la mayoría de las aplicaciones como reproductor multimedia MP3, reproductor de CD, etc. 
4. Las colas se utilizan para mantener la lista de reproducción en los reproductores multimedia con el fin de añadir y eliminar las canciones de la lista de reproducción. 
5. Las colas se utilizan en los sistemas operativos para el manejo de interrupciones.

## Complejidad

| Data Structure | Time Complexity (Average) | Time Complexity (Worst) | Space Complexity (Worst) |
|----------------|---------------------------|--------------------------|---------------------------|
|                | Access | Search | Insertion | Deletion | Access | Search | Insertion | Deletion |           |
| Queue          | θ(n)   | θ(n)   | θ(1)      | θ(1)     | O(n)   | O(n)   | O(1)      | O(1)     | O(n)      |
