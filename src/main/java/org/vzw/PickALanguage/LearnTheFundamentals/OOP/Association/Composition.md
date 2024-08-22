 # Composition in Java

La composición es una técnica de diseño en java para implementar una relación has-a. La herencia en Java se utiliza para reutilizar el código y lo mismo podemos hacer utilizando la composición. 

La composición se logra mediante el uso de una variable de instancia que se refiere a otros objetos. Si un objeto contiene a otro objeto y el objeto contenido no puede existir sin la existencia de ese objeto, entonces se llama composición. 

En palabras más específicas, la composición es una forma de describir la referencia entre dos o más clases utilizando una variable de instancia y una instancia debe ser creada antes de ser utilizada.

![](https://media.geeksforgeeks.org/wp-content/uploads/Associatn.png)

**Las ventajas de utilizar Composition son:**

- La composición permite reutilizar el código.
- Java no soporta herencias múltiples pero usando la composición podemos conseguirlo.
- La composición ofrece una mejor capacidad de prueba de una clase.
- Al utilizar la composición, somos lo suficientemente flexibles como para sustituir la implementación de una clase compuesta por una versión mejorada.
- Mediante el uso de la composición, también podemos cambiar los objetos miembros en tiempo de ejecución, para cambiar dinámicamente el comportamiento de su programa.

**Recuerda los siguientes puntos clave de la composición en java:**

- Representa una relación has-a.
- En la composición, ambas entidades dependen la una de la otra.
- Cuando hay una composición entre dos entidades, el objeto compuesto no puede existir sin la otra entidad. Por ejemplo, una biblioteca puede tener varios libros del mismo tema o de temas diferentes. Si se destruye la biblioteca, se destruirán todos los libros de esa biblioteca. Esto se debe a que los libros no pueden existir sin una biblioteca.
- La composición se consigue utilizando una variable de instancia que hace referencia a otros objetos.
- Tenemos que favorecer la Composición frente a la Herencia.

Por último, veamos la siguiente imagen para hacernos una ligera idea de la agregación y comprender mejor cómo funciona la composición, tomemos un ejemplo del sistema de bibliotecas en tiempo real.

> Ejemplo de la vida real: Sistema de bibliotecas
> 
> Vamos a entender la composición en Java con el ejemplo de libros y biblioteca. En este ejemplo, creamos una clase Libro que contiene miembros de datos como autor, y título y creamos otra clase Biblioteca que tiene una referencia para referirse a la lista de libros. Una biblioteca puede tener varios libros del mismo tema o de temas diferentes. Por tanto, si se destruye la biblioteca, se destruirán todos los libros de esa biblioteca, es decir, los libros no pueden existir sin una biblioteca. La relación entre la biblioteca y los libros es la composición.

[`Implementation`]()