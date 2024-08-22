# Abstract Class And Interface

Las interfaces son otros bloques de construcción que implementan la abstracción. Las interfaces son contratos, y las clases que implementan la interfaz tienen que cumplir estos contratos.

Los contratos en las interfaces no son más que métodos que no están implementados. Dentro de las interfaces, sólo tendremos prototipos de métodos. No habrá una sola implementación de métodos dentro de interfaces.

**Si tenemos una declaración de interfaz como la siguiente:**

```java
public interface interfaceA{ 
    void myInterfaceMethod ();
}
```

A continuación, cualquier clase que implemente la interfazA necesita anular el `myInterfaceMethod()`.

Si no anulamos el método en una clase, entonces esa clase se representa como abstracta.

```java
abstract class TestClass implements interfaceA{
    // no  es una obligación de anular myInterfaceMethod.
}
```

## Diferencia entre clase abstracta e interfaz

| Abstract class | Interface |
|---|---|
|Una clase abstracta puede tener métodos abstractos y/o no abstractos.|Una interfaz sólo puede tener métodos abstractos.|
|El resumen puede contener o no las variables finales.|Las interfaces pueden variables finales como variables por defecto.|
|Una clase abstracta puede tener variables finales, estáticas o no estáticas o no finales.|Las interfaces sólo pueden tener variables finales y estáticas.|
|Una clase abstracta puede proporcionar la implementación de una interfaz.|	Las interfaces no pueden implementar una clase abstracta.|
|Una clase abstracta se hereda utilizando la palabra clave "extends".|La interfaz se implementa mediante la palabra clave "implements".|
|Una clase abstracta puede extender otras clases o implementar múltiples interfaces.|La interfaz sólo puede implementar otra interfaz.|
|Una clase abstracta puede tener miembros de datos privados o protegidos aparte de los miembros públicos.|Los miembros de la interfaz son públicos por defecto.|

## Cuándo usar clases abstractas e interfaces en Java

La decisión sobre cuándo usar clases abstractas y cuándo usar interfaces en las aplicaciones Java debe tomarse inteligentemente después de comprender a fondo el problema en cuestión. Hay dos aspectos que tenemos que considerar como se muestra a continuación.

### Clases abstractas con comportamiento parcial

Sabemos que las clases abstractas pueden no estar completamente implementadas. Pueden tener un comportamiento parcial. Por otro lado, las interfaces no tienen ninguna implementación. Así que cuando tenemos que elegir entre una clase abstracta y una implementación, entonces tenemos que considerar este aspecto de nuestra aplicación.

Esto significa que primero tenemos que decidir si la aplicación que estamos diseñando tiene alguna implementación parcial común que podamos separar en una clase abstracta.

Por ejemplo, consideremos que estamos diseñando una aplicación web. Para ello, tendremos que utilizar alguna tecnología web como Servlet, REST API, etc. Ahora bien, cada una de estas tecnologías web tiene algunas técnicas o pasos que hay que implementar independientemente de la aplicación que estemos desarrollando. Entonces construimos nuestra aplicación personalizada.

Así que en este caso, el código definitivo que la tecnología web tiene que ejecutar se puede poner en una clase abstracta. ¿Podemos tener una interfaz para esto? No. Esto se debe a que la interfaz no puede tener una implementación.

### Interfaces sólo para Contract

Sabemos que las interfaces tienen contratos o métodos que forman parte de ellas. Estos métodos son sólo prototipos. Tenemos que implementar estas interfaces en una clase y luego anular los métodos.

Consideremos ahora la interfaz Map de Java Collections Framework. Muchas clases como HashMap, TreeMap, HashTable, etc. implementan esta interfaz. Cada una de estas clases tiene una implementación diferente. No tienen ningún comportamiento común que pueda representarse en la clase abstracta.

Así que lo que hacemos es diseñar una interfaz con prototipos de métodos y luego implementar cada una de las clases.

De este modo, deberíamos sopesar cada factor adecuadamente antes de elegir entre una clase abstracta y una interfaz.