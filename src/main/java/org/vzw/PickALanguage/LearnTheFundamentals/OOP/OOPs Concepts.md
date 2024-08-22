# OOPs Concepts

Simula está considerado el primer lenguaje de programación orientado a objetos. El paradigma de programación en el que todo se representa como un objeto se conoce como un verdadero lenguaje de programación orientado a objetos.

Smalltalk está considerado el primer lenguaje de programación verdaderamente orientado a objetos.

Los lenguajes orientados a objetos más populares son Java, C#, PHP, Python, C++, etc.

El objetivo principal de la programación orientada a objetos es implementar entidades del mundo real, por ejemplo, objetos, clases, abstracción, herencia, polimorfismo, etc.

##  OOPs (Object-Oriented Programming System)

Por objeto se entiende una entidad del mundo real, como un bolígrafo, una silla, una mesa, un ordenador, un reloj, etc. La programación orientada a objetos es una metodología o paradigma para diseñar un programa utilizando clases y objetos. Simplifica el desarrollo y el mantenimiento del software aportando algunos conceptos:

- Objeto
- Clase
- Herencia
- Polimorfismo
- Abstracción
- Encapsulación

Además de estos conceptos, existen otros términos que se utilizan en el diseño orientado a objetos:

- Coupling
- Cohesion
- Association
- Aggregation
- Composition

### Object

Cualquier entidad que tenga estado y comportamiento se conoce como objeto. Por ejemplo, una silla, un bolígrafo, una mesa, un teclado, una bicicleta, etc. Puede ser físico o lógico.

![](https://static.javatpoint.com/images/objects.png)

Un objeto puede definirse como una instancia de una clase. Un objeto contiene una dirección y ocupa cierto espacio en la memoria. Los objetos pueden comunicarse sin conocer los detalles de los datos o el código del otro. Lo único necesario es el tipo de mensaje aceptado y el tipo de respuesta devuelta por los objetos.

### Clase

Una colección de objetos se denomina clase. Es una entidad lógica.

Una clase también puede definirse como un plano a partir del cual se puede crear un objeto individual. Las clases no consumen espacio.

### Herencia

Cuando un objeto adquiere todas las propiedades y comportamientos de un objeto padre, se conoce como herencia. Permite reutilizar el código. Se utiliza para lograr polimorfismo en tiempo de ejecución.

![](https://static.javatpoint.com/images/polymorphism.gif)

### Polimorfismo

Si una tarea se realiza de diferentes maneras, se conoce como polimorfismo. Por ejemplo: convencer al cliente de otra manera, dibujar algo, por ejemplo, forma, triángulo, rectángulo, etc.

En Java, utilizamos la sobrecarga y la anulación de métodos para lograr el polimorfismo.

Otro ejemplo puede ser hablar algo; por ejemplo, un gato habla miau, un perro ladra guau, etc.

### Abstracción

Ocultar los detalles internos y mostrar la funcionalidad se conoce como abstracción. Por ejemplo, en una llamada telefónica, no conocemos el procesamiento interno.

En Java, utilizamos la clase abstracta y la interfaz para lograr la abstracción.

### Encapsulación

La unión (o envoltura) de código y datos en una sola unidad se conoce como encapsulación. Por ejemplo, una cápsula, se envuelve con diferentes medicamentos.

![](https://static.javatpoint.com/images/capsule.png)

Una clase Java es un ejemplo de encapsulación. Java bean es la clase totalmente encapsulada porque todos los miembros de datos son privados aquí.

### Coupling

El acoplamiento se refiere al conocimiento o información o dependencia de otra clase. Surge cuando las clases son conscientes unas de otras. 

Si una clase tiene la información detallada de otra clase, existe un acoplamiento fuerte. En Java, utilizamos los modificadores private, protected y public para mostrar el nivel de visibilidad de una clase, un método y un campo. Puede utilizar interfaces para el acoplamiento más débil porque no hay ninguna implementación concreta.

### Cohesion

La cohesión se refiere al nivel de un componente que realiza una única tarea bien definida. Una única tarea bien definida la realiza un método altamente cohesionado. 

El método débilmente cohesivo dividirá la tarea en partes separadas. 

El paquete java.io es un paquete altamente cohesivo porque tiene clases e interfaces relacionadas con E/S. Sin embargo, el paquete java.util es un paquete poco cohesionado porque tiene clases e interfaces no relacionadas.

### Association

La asociación representa la relación entre los objetos. En este caso, un objeto puede estar asociado a otro objeto o a muchos objetos. Puede haber cuatro tipos de asociación entre los objetos:

- Uno a uno.
- Uno a muchos.
- Muchos a uno.
- Muchos a muchos.

Entendamos la relación con ejemplos en tiempo real. Por ejemplo, un país puede tener un primer ministro (uno a uno), y un primer ministro puede tener muchos ministros (uno a muchos). Asimismo, muchos diputados pueden tener un primer ministro (muchos a uno), y muchos ministros pueden tener muchos departamentos (muchos a muchos).

La asociación puede ser unidireccional o bidireccional.

### Aggregation

La agregación es una forma de lograr la asociación. La agregación representa la relación en la que un objeto contiene otros objetos como parte de su estado. 

Representa la relación débil entre objetos. También se denomina relación has-a en Java. Al igual, la herencia representa la relación is-a. Es otra forma de reutilizar objetos.

### Composition

La composición es también una forma de lograr la Asociación. La composición representa la relación en la que un objeto contiene a otros objetos como parte de su estado. 

Existe una fuerte relación entre el objeto contenedor y el objeto dependiente. Es el estado en el que los objetos contendores no tienen una existencia independiente. Si eliminas el objeto padre, todos los objetos hijos se eliminarán automáticamente.

## Ventajas de las OOP sobre los lenguajes de programación orientados a procedimientos

1. Las OOP facilitan el desarrollo y el mantenimiento, mientras que, en un lenguaje de programación orientado a procedimientos, no es fácil gestionar si el código crece a medida que aumenta el tamaño del proyecto.
2. Las OOP ocultan los datos, mientras que en un lenguaje de programación orientado a procedimientos se puede acceder a los datos globales desde cualquier lugar.

![](https://static.javatpoint.com/images/globaldata2.png)

Figura: Representación de datos en la programación orientada a procedimientos

![](https://static.javatpoint.com/images/objectdata2.png)

Figura: Representación de datos en la programación orientada a objetos

3. La programación orientada a objetos permite simular acontecimientos del mundo real de forma mucho más eficaz. Si utilizamos el lenguaje de programación orientada a objetos, podremos resolver problemas reales.

### ¿Cuál es la diferencia entre un lenguaje de programación orientado a objetos y un lenguaje de programación basado en objetos?

El lenguaje de programación basado en objetos sigue todas las características de la programación orientada a objetos excepto la herencia. JavaScript y VBScript son ejemplos de lenguajes de programación basados en objetos.