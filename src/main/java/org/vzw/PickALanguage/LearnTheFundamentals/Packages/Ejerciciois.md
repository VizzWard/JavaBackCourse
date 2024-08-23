# Ejercicios

## 1. Cómo compilar un paquete Java

Vamos a crear una clase simple dentro de un paquete para mostrar cómo compilar un paquete Java.

Archivo: [`Example1.java`](pack1/Example1.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1;

public class Example1 {
    public void display() {
        System.out.println("Hello from Example1 in pack1");
    }
}
```

### Compilación

Para compilar este archivo desde la raíz del proyecto (donde se encuentra la carpeta org), ejecuta:

```text
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/pack1/Example1.java
```

Esto creará el archivo Example1.class dentro de la misma carpeta.

## 2. Cómo ejecutar el programa de un paquete Java

Vamos a usar la clase que creamos en el primer paso y ejecutarla.

Archivo: [`Example1.java`](pack1/Example1.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1;

public class Example1Main {
    public static void main(String[] args) {
        Example1 example = new Example1();
        example.display();
    }
}
```

### Compilación y Ejecución

Compila el archivo `Example1Main.java`:

```text
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/pack1/Example1Main.java
```
Ejecuta el programa usando el nombre completo de la clase:

```text
java org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1.Example1Main
```

## 3. Cómo acceder a un paquete desde otro paquete
Vamos a crear dos clases en paquetes diferentes y ver cómo se puede acceder a una clase desde otro paquete.

### 1. Using packagename.*

Archivo: [`ClassA.java`](pack1/ClassA.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1;

public class ClassA {
    public void display() {
        System.out.println("Hello from ClassA in pack1");
    }
}
```

Archivo: [`ClassB.java`](pack2/ClassB.java)
```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2;

// Importa todas las clases del paquete pack1
import org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1.*;

public class ClassB {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.display(); // Acceso a ClassA desde pack1
    }
}
```

#### Compilación y Ejecución

```text
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/pack1/ClassA.java
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/pack2/ClassB.java
java org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2.ClassB
```

### 2. Using packagename.classname

Puedes importar una clase específica:

Archivo: [`ClassB2.java`](pack2/ClassB2.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2;

// Importa solo ClassA del paquete pack1
import org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1.ClassA;

public class ClassB2 {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.display(); // Acceso a ClassA desde pack1
    }
}
```

#### Compilación y Ejecución

```text
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/pack1/ClassA.java
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/pack2/ClassB2.java
java org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2.ClassB2
```

### 3. Using Fully Qualified Name

Archivo: [`ClassB3.java`](pack2/ClassB3.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2;

public class ClassB3 {
    public static void main(String[] args) {
        org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1.ClassA objA = new org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1.ClassA();
        objA.display(); // Acceso a ClassA desde pack1
    }
}
```

#### Compilación y Ejecución

```text
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/pack2/ClassB3.java
java org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2.ClassB3
```

## 4. Subpackage en Java

Vamos a crear un subpaquete y acceder a una clase en él.

Archivo: [`ClassC.java`](subpack/ClassC.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.subpack;

public class ClassC {
    public void show() {
        System.out.println("Hello from ClassC in subpack");
    }
}
```

#### Compilación y Ejecución

```text
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/subpack/ClassC.java
javac org/vzw/PickALanguage/LearnTheFundamentals/Packages/pack2/ClassD.java
java org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2.ClassD
```

## 5. Cómo enviar el archivo de clase a otro directorio o unidad

Cuando compilas un archivo, puedes especificar la salida en otro directorio usando -d.

#### Compilación

```text
javac -d C:\Users\thega\OneDrive\Escritorio\packages org\vzw\PickALanguage\LearnTheFundamentals\Packages\pack1\Example1.java
```

Esto colocará el archivo .class en la ruta:

`C:\Users\thega\OneDrive\Escritorio\packages\org\vzw\PickALanguage\LearnTheFundamentals\Packages\pack1\`.

## Formas de cargar archivos de clase o archivos JAR

Puedes cargar archivos de clase o JAR de forma temporal o permanente.

### Temporalmente

```text
javac -d C:\Users\thega\OneDrive\Escritorio\packages org\vzw\PickALanguage\LearnTheFundamentals\Packages\pack1\*.java

jar cvf C:\Users\thega\OneDrive\Escritorio\packages\example1.jar -C C:\Users\thega\OneDrive\Escritorio\packages org
```

## 7. Cómo incluir dos clases públicas en un paquete

No puedes incluir más de una clase pública en un único archivo fuente, pero puedes crear múltiples clases públicas en un paquete distribuidas en diferentes archivos.

Archivo: [`ClassPublic1.java`](pack1/ClassPublic1.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1;

public class ClassPublic1 {
    public void display() {
        System.out.println("Public Class 1");
    }
}
```

Archivo: [`ClassPublic2.java`](pack1/ClassPublic2.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1;

public class ClassPublic2 {
    public void display() {
        System.out.println("Public Class 2");
    }
}
```

## 8. ¿Qué es la función de importación estática de Java 5?

La importación estática te permite importar métodos estáticos o variables estáticas de una clase para que puedas usarlas directamente sin el prefijo de la clase.

Archivo: [`StaticImportExample.java`](pack2/StaticImportExample.java)

```java
package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2;

// Importación estática de Math.*
import static java.lang.Math.*;

public class StaticImportExample {
    public static void main(String[] args) {
        // Uso de métodos estáticos de Math sin el prefijo Math.
        System.out.println("Square root of 16: " + sqrt(16));
        System.out.println("Random number: " + random());
    }
}
```