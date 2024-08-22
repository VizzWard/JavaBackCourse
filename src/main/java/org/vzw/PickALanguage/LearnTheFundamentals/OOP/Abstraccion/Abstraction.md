# Abstraction 

En términos sencillos, la abstracción "muestra" sólo los atributos relevantes de los objetos y "oculta" los detalles innecesarios.

Por ejemplo, cuando conducimos un coche, sólo nos preocupamos de la conducción, como arrancar/parar el coche, acelerar/frenar, etc. No nos preocupa cómo funciona internamente el mecanismo de arranque/parada o el proceso de aceleración/frenado. No nos interesan esos detalles.

Lo que nos preocupa es la visión "abstracta" de estas operaciones que nos ayudarán a propulsar el coche hacia delante y llegar a nuestro destino. Este es un ejemplo sencillo de abstracción.

Así, el coche tiene todos los mecanismos y procesos en marcha, pero desde la perspectiva del usuario final, es decir, del conductor del coche, sólo le interesará la visión abstracta de estos procesos.

La abstracción reduce los esfuerzos de programación y, por tanto, la complejidad. El usuario final de la aplicación no tiene por qué preocuparse de cómo se implementa una función concreta. Basta con que utilice las funciones según sus necesidades.

Así, en la abstracción, nos ocupamos de las ideas y no de los eventos. Esto significa que ocultamos al usuario los detalles de la implementación y sólo exponemos la funcionalidad al usuario final. De este modo, el usuario sólo sabrá "qué hace" y no "cómo lo hace".

### La abstracción en la programación orientada a objetos puede ser de dos tipos.

#### 1) Data Abstraction

En la abstracción de datos, la mayoría de las veces creamos tipos de datos complejos y ocultamos su implementación. Sólo exponemos las operaciones para manipular estos tipos de datos sin entrar en los detalles de su implementación.

Una ventaja de este enfoque es que podemos cambiar la implementación en cualquier momento sin cambiar el comportamiento que se expone al usuario.

#### 2) Control Abstraction

La abstracción de control recoge todas las sentencias de control que forman parte de la aplicación y las expone como una unidad. Esta función se utiliza cuando tenemos que realizar una función de trabajo utilizando esta unidad de control.

La abstracción de control constituye la unidad principal de la programación estructurada y mediante la abstracción de control podemos definir funciones sencillas en marcos complejos.

## ¿Qué es la abstracción en Java?

Dado que Java es un lenguaje de programación orientada a objetos, la abstracción puede considerarse una de las características y componentes básicos más importantes del lenguaje Java. En Java, la abstracción se implementa mediante una clase abstracta y una interfaz.

Entonces, ¿cómo implementamos la abstracción en Java? Java proporciona un modificador de no acceso "abstract" para implementar la abstracción. Este modificador abstracto puede utilizarse con clases y métodos, pero no con variables.

La interfaz proporciona abstracción completa, es decir, sólo proporciona prototipos de métodos y no su implementación. Una clase abstracta proporciona abstracción parcial en la que al menos un método no debe ser implementado.

```java
//clase abstracta
abstract class Car{
    abstract void accelerate();
}

// clase concreta
class Suzuki extends Car{
    void accelerate(){
        System.out.println("Suzuki: accelerate");
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Suzuki(); // Objeto: car -> contenido de suzuki
        car.accelerate(); // llamada al metodo
    }
}
```

***Salida:***

```text
Suzuki: accelerate
```

El ejemplo de abstracción simple que se ha dado anteriormente tiene una clase Coche. En esta clase Coche, tenemos un método abstracto para acelerar (). Luego heredamos esta clase en la clase Suzuki. Dentro de la clase Suzuki, implementamos el método acelerado.

El ejemplo anterior muestra simplemente la forma en que se define una clase abstracta, se hereda y luego se utiliza en el programa.

## 

