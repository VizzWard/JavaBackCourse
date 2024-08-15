# Circular Queue

## ¿Por qué se introdujo el concepto de cola circular?
Había una limitación en la implementación de la cola. Si la parte posterior llega a la posición final de la cola, existe la posibilidad de que queden espacios libres al principio que no se pueden utilizar. Por lo tanto, para superar estas limitaciones, se introdujo el concepto de cola circular.

![img](https://static.javatpoint.com/ds/images/circular-queue.png)

la parte trasera está en la última posición de la cola y la delantera está apuntando a algún sitio en lugar de a la posición 0. En el array anterior, sólo hay dos elementos y las otras tres posiciones están vacías. La parte trasera está en la última posición de la cola; si intentamos insertar el elemento, se mostrará que no hay espacios vacíos en la cola. Hay una solución para evitar este desperdicio de espacio de memoria desplazando ambos elementos a la izquierda y ajustando la parte delantera y trasera en consecuencia. En la práctica no es una buena solución porque desplazar todos los elementos consume mucho tiempo. El enfoque más eficaz para evitar el desperdicio de memoria es utilizar la estructura de datos de cola circular.

## Que es una cola circular?
Una cola circular es similar a una cola lineal, ya que también se basa en el principio FIFO (First In First Out), salvo que la última posición está conectada a la primera posición en una cola circular que forma un círculo. También se conoce como buffer en anillo.

### Operaciones

- **Front**: Se utiliza para obtener el elemento anterior de la cola.
- **Rear**: Se utiliza para obtener el elemento posterior de la Cola. 
- **enQueue(valor)**: Esta función se utiliza para insertar el nuevo valor en la Cola. El nuevo elemento se inserta siempre por el extremo posterior. 
- **deQueue()**: Esta función borra un elemento de la Cola. El borrado en una Cola siempre se realiza desde el front end.

![img](https://static.javatpoint.com/ds/images/circular-queue7.png)