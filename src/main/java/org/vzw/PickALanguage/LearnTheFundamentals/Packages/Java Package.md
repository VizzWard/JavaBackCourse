# Java Package

Un paquete java es un grupo de tipos similares de clases, interfaces y subpaquetes.

Los paquetes en java se pueden clasificar de dos formas, paquetes integrados y paquetes definidos por el usuario.

Hay muchos paquetes integrados como `java`, `lang`, `awt`, `javax`, `swing`, `net`, `io`, `util`, `sql`, etc.

### Ventajas del paquete Java

1. Los paquetes Java se utilizan para clasificar las clases e interfaces de modo que puedan mantenerse fácilmente.
2. El paquete Java proporciona protección de acceso.
3. El paquete Java elimina la colisión de nombres.

![](https://static.javatpoint.com/images/package.JPG)

### Ejemplo simple

La palabra clave `package` se utiliza para crear un paquete en java.

```java
//save as Simple.java  
package mypack;  

public class Simple{ 
    public static void main(String args[]){
        System.out.println("Welcome to package");  
    }  
}  
```

### Cómo compilar un paquete java

Si no utiliza ningún IDE, deberá seguir la sintaxis que se indica a continuación:

```java
javac -d directory javafilename  
```

**Por ejemplo:**

```java
javac -d . Simple.java
```

El modificador `-d` especifica el destino donde colocar el archivo de clase generado. Puede utilizar cualquier nombre de directorio como /home (en caso de Linux), `d:/abc` (en caso de windows), etc. Si desea mantener el paquete dentro del mismo directorio, puede utilizar `.` (punto).

### Cómo ejecutar el programa paquete java

Es necesario utilizar el nombre completo, por ejemplo, `mypack.Simple` etc para ejecutar la clase.

**Para compilar**: `javac -d . Simple.java`

**Para ejecutar**: `java mypack.Simple`

El `-d` es un interruptor que indica al compilador dónde colocar el archivo de clase, es decir, representa el destino. El `.` representa la carpeta actual.

## ¿Cómo acceder a un paquete desde otro paquete?

Existen tres formas de acceder al paquete desde el exterior.

### 1. Using packagename.*

Si usas paquete.* entonces todas las clases e interfaces de este paquete serán accesibles pero no los subpaquetes.

La palabra clave import se utiliza para hacer que las clases y la interfaz de otro paquete sean accesibles al paquete actual.

```java
//save by A.java  
package pack;

public class A{ 
    public void msg(){
        System.out.println("Hello");
    }  
}  
```

```java
//save by B.java  
package mypack;
import pack.*; 
  
class B{
    public static void main(String args[]){
        A obj = new A();
        obj.msg();
    }
}
```

***Salida:***

```text
Hello
```

### 2. Using packagename.classname

Si importas paquete.nombreclase, sólo se podrá acceder a la clase declarada de este paquete.

```java
//save by A.java
package pack;

public class A{ 
    public void msg(){
        System.out.println("Hello");
    }  
}  
```

```java
//save by B.java  
package mypack;
import pack.A;
  
class B{
    public static void main(String args[]){
        A obj = new A();
        obj.msg();
    }
}
```

***Salida:***

```text
Hello
```

### 3. Using fully qualified name

Si utilizas el nombre completo, solo se podrá acceder a la clase declarada de este paquete. Ahora no hay necesidad de importar. Pero es necesario utilizar el nombre completo cada vez que se accede a la clase o interfaz.

Se utiliza generalmente cuando dos paquetes tienen el mismo nombre de clase, por ejemplo, los paquetes `java.util` y `java.sql` contienen la clase Date.

```java
//save by A.java  
package pack; 

public class A {
    public void msg() {
        System.out.println("Hello");
    }
}
```

```java
//save by B.java  
package mypack; 

class B{ 
    public static void main(String args[]){
        pack.A obj = new pack.A();//using fully qualified name
        // obj.msg();
    }  
}
```

***Salida:***

```text
Hello
```

> Nota: Si importa un paquete, no se importarán los subpaquetes.

Si importa un paquete, todas las clases e interfaces de ese paquete se importarán excluyendo las clases e interfaces de los subpaquetes. Por lo tanto, es necesario importar también el subpaquete.

> Nota: La secuencia del programa debe ser package luego import luego class.
> 
> ![](https://static.javatpoint.com/images/sequenceofpackage.JPG)

## Subpackage in java

El paquete dentro del paquete se llama subpaquete. Se debe crear para categorizar el paquete aún más.

Tomemos un ejemplo, Sun Microsystem ha definido un paquete llamado java que contiene muchas clases como System, String, Reader, Writer, Socket, etc. Estas clases representan grupos particulares. Estas clases representan un grupo particular, por ejemplo, las clases Reader y Writer son para operaciones de Entrada/Salida, las clases Socket y ServerSocket son para redes, etc, etc. Así, Sun ha subcategorizado el paquete java en subpaquetes como lang, net, io, etc. y ha puesto las clases relacionadas con Input/Output en el paquete io, las clases Server y ServerSocket en los paquetes net, etc.

> El estándar de definición de paquete es dominio.empresa.paquete por ejemplo com.javatpoint.bean o org.sssit.dao.

```java
package com.javatpoint.core;

class Simple{ 
    public static void main(String args[]){
        System.out.println("Hello subpackage");
    }  
}
```

**To Compile**: javac -d . Simple.java


**To Run**: java com.javatpoint.core.Simple

## ¿Cómo enviar el archivo de clase a otro directorio o unidad?

Hay un escenario, quiero poner el archivo de clase del archivo fuente A.java en la carpeta classes de la unidad c:. Por ejemplo:

![](https://static.javatpoint.com/images/anotherpackage.JPG)

```java
//save as Simple.java  
package mypack;

public class Simple{ 
    public static void main(String args[]){
        System.out.println("Welcome to package");
    }  
}
```

### To Compile:

**e:\sources> javac -d c:\classes Simple.java**

### To Run:

Para ejecutar este programa desde el directorio e:\source, es necesario establecer classpath del directorio donde reside el archivo de clase.

**e:\sources> set classpath=c:\classes;.;**

**e:\sources> java mypack.Simple**

### Otra forma de ejecutar este programa por -classpath interruptor de java:

El modificador -classpath puede utilizarse con javac y la herramienta java.

Para ejecutar este programa desde el directorio e:\source, puede utilizar el parámetro -classpath de java que le indica dónde buscar el archivo de clase. Por ejemplo:

**e:\sources> java -classpath c:\classes mypack.Simple**

## Formas de cargar los archivos de clase o los archivos jar

Hay dos maneras de cargar los archivos de clase temporal y permanente.

- Temporary
    - Estableciendo el classpath en el símbolo del sistema
    - Mediante el interruptor -classpath
- Permanent
    - Estableciendo el classpath en las variables de entorno
    - Creando el archivo jar, que contiene todos los archivos de clase, y copiando el archivo jar en la carpeta jre/lib/ext.

> Regla: Sólo puede haber una clase pública en un archivo fuente java y debe ser guardado por el nombre de clase pública.
> 
> ```java
> //save as C.java otherwise Compilte Time Error  
>
> class A{}  
> class B{}  
> public class C{}
> ```

## ¿Cómo incluir dos clases públicas en un paquete?

Si quieres poner dos clases públicas en un paquete, ten dos archivos fuente java que contengan una clase pública, pero mantén el mismo nombre del paquete. Por ejemplo:

```java
//save as A.java  
  
package javatpoint;  
public class A{}  
```

```java
//save as B.java  
  
package javatpoint;  
public class B{} 
```

## ¿Qué es la función de importación estática de Java5?

La función de importación estática de Java 5 facilita al programador java el acceso directo a cualquier miembro estático de una clase. No hay necesidad de calificarlo por el nombre de la clase.

### Ventaja de la importación estática

- Se requiere menos codificación si tiene acceso a cualquier miembro estático de una clase a menudo.

### Desventaja de la importación estática

- Si se abusa de la función de importación estática, el programa se vuelve ilegible e imposible de mantener.

### Ejemplo

```java
import static java.lang.System.*;

class StaticImportExample{ 
    public static void main(String args[]){
        out.println("Hello");//Now no need of System.out
        out.println("Java");
    }   
}
```

***Salida:***

```text
Hello
Java
```

### ¿Cuál es la diferencia entre importación e importación estática?

La importación permite al programador java acceder a las clases de un paquete sin la cualificación del paquete, mientras que la importación estática permite acceder a los miembros estáticos de una clase sin la cualificación de la clase. 

La importación permite acceder a las clases y a la interfaz, mientras que la importación estática permite acceder a los miembros estáticos de la clase.