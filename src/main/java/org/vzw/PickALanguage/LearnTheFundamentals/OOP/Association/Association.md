# Association en Java

Asociación en Java define la conexión entre dos clases que se establecen a través de sus objetos. La Asociación gestiona relaciones uno a uno, uno a muchos y muchos a muchos. 

En Java, la multiplicidad entre objetos viene definida por la Asociación. Muestra cómo los objetos se comunican entre sí y cómo utilizan la funcionalidad y los servicios proporcionados por ese objeto comunicado. La asociación gestiona relaciones uno a uno, uno a muchos, muchos a uno y muchos a muchos.

![](https://static.javatpoint.com/core/images/association-in-java.png)

Tomemos un ejemplo de cada relación a gestionar por la Asociación.

1. Una persona sólo puede tener un pasaporte. Define el uno a uno
2. Si hablamos de la Asociación entre un Colegio y un Estudiante, un Colegio puede tener muchos estudiantes. Define el uno a muchos
3. Un estado puede tener varias ciudades, y esas ciudades están relacionadas con ese único estado. Define la relación
4. Un único alumno puede asociarse a varios profesores, y varios alumnos también pueden asociarse a un único profesor. Ambos se crean o eliminan de forma independiente, por lo que define la relación muchos-a-muchos

Tomemos un ejemplo de Asociación para entender cómo funciona en Java.

```java
import java.util.*;

class Mobile {
    private String mobile_no;

    public String getMobileNo() {
        return mobile_no;
    }
    public void setMobileNo(String mobile_no) {
        this.mobile_no = mobile_no;
    }
}
class Person {
    private String name;
    List<Mobile> numbers;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Mobile> getNumbers() {
        return numbers;
    }
    public void setNumbers(List<Mobile> numbers) {
        this.numbers = numbers;
    }
}
public class AssociationExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Shubham Rastogi");

        Mobile number1 = new Mobile();
        number1.setMobileNo("8868923136");
        Mobile number2 = new Mobile();
        number2.setMobileNo("8630023310");

        List<Mobile> numberList = new ArrayList<Mobile>();
        numberList.add(number1);
        numberList.add(number2);
        person.setNumbers(numberList);
        System.out.println(person.getNumbers()+" are mobile numbers of the person "+ person.getName());
    }
}
```

***Salida:***

```text
Association.Mobile@5f184fc6 
Association.Mobile@3feba861 are mobile numbers of the person Shubham Rastogi
```

En el ejemplo anterior, creamos dos clases distintas, Persona y Móvil, asociadas a través de sus objetos. Una persona puede tener muchos números de móvil, por lo que se define la relación uno a muchos.

## Tipos de Asociación

1. IS-A Association
2. HAS-A Association
    - Aggregation
    - Composition

![](https://static.javatpoint.com/core/images/association-in-java3.png)

### IS-A Association

La Asociación IS-A también se denomina [Herencia](../Herencia/Herencia.md).

### HAS-A Association

La Asociación HAS-A se clasifica a su vez en dos partes, Agregación y Composición. Entendamos la diferencia entre ambas una por una.

#### Aggregation

En Java, la asociación de [agregación](../Herencia/Aggregation.md) define la relación HAS-A. La agregación sigue la relación uno a uno o unidireccional. Si dos entidades están en la composición de agregación, y una entidad falla debido a algún error, no afectará a la otra entidad.

Tomemos el ejemplo de un juguete y su pila. La pila pertenece a un juguete, y si el juguete se rompe y se borra de nuestra base de datos, la pila seguirá estando en nuestra base de datos, y puede que siga funcionando. Así que en la agregación, los objetos siempre tienen sus propios ciclos de vida cuando la propiedad existe allí.

![](https://static.javatpoint.com/core/images/association-in-java4.png)

<mark>Code :</mark> [AggregationExample](AggregationExample.java)

En el ejemplo anterior, hay una universidad que tiene varios cursos como BSC-CS, MCA, y Poly. Cada curso tiene varios estudiantes, así que creamos una clase Colegio que tiene una referencia al objeto o lista de objetos de la clase Curso. Esto significa que la clase Colegio está asociada con la clase Curso a través de los objetos. La clase Curso también tiene una referencia al objeto o lista de objetos de la clase Alumno, lo que significa que está asociada con la clase Alumno a través de su objeto y define la relación HAS-A.

![](https://static.javatpoint.com/core/images/association-in-java6.png)

#### Composition

Una forma restringida de la Agregación en la que las entidades son fuertemente dependientes entre sí. A diferencia de la Agregación, la Composición representa la relación parte-de. Cuando se produce una agregación entre dos entidades, el objeto agregado puede existir sin la otra entidad, pero en el caso de la composición, el objeto compuesto no puede existir.

Pongamos un ejemplo para entender el concepto de Composición.

Creamos una clase Mobile que contiene variables, es decir, nombre, ram y rom. También creamos una clase MobileStore que tiene una referencia para referirse a la lista de móviles. Un almacén de móviles puede tener más de un móvil. Por lo tanto, si se destruye un almacén de móviles, también se destruirán todos los móviles de ese almacén, porque los móviles no pueden existir sin un almacén de móviles. La relación entre la tienda de móviles y los móviles es la composición.

<mark>Code :</mark> [CompositionExample](CompositionExample.java)

