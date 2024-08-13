### Terminología Básica en JAVA

1. **Clase**: La clase es un plano (plan) de la instancia de una clase (objeto). Se puede definir como una plantilla lógica que comparte propiedades y métodos comunes.
    - Ejemplo 1: El plano de la casa es la clase.
    - Ejemplo 2: En el mundo real, Alice es un objeto de la clase “Humano”.
2. **Objeto**: El objeto es una instancia de una clase. Es una entidad que tiene comportamiento y estado.
    - Ejemplo: Perro, Gato, Mono, etc., son objetos de la clase “Animal”.
    - Comportamiento: Correr en la carretera.
3. **Método**: El comportamiento de un objeto es el método.
    - Ejemplo: El indicador de combustible indica la cantidad de combustible restante en el automóvil.
4. **Variables de Instancia**: Cada objeto tiene su propio conjunto único de variables de instancia. El estado de un objeto se crea generalmente por los valores asignados a estas variables de instancia.
    - Ejemplo: Pasos para compilar y ejecutar un programa Java en una consola.

        ```java
        javac GFC.java
        java GFC
        ```

        ```java
        import java.util.*;
        public class GFG {
            public static void main(String[] args)
            {
                System.out.println("¡GeeksforGeeks!");
            }
        }
        ```

        - Salida

        ```java
        ¡GeeksforGeeks!
        ```

        **Nota:** Cuando la clase es pública, el nombre del archivo debe ser el mismo que el nombre de la clase.

### Sintaxis

1. **Comentarios en Java**
    
    ```java
    // Comentario de una sola línea
    
    /*
    	Comentario de
    	varias líneas
    */
    
    /** Documentación */
    ```

2. **Nombre del Archivo Fuente**
    
    El nombre de un archivo fuente debe coincidir exactamente con el nombre de la clase pública con la extensión .java. El nombre del archivo puede ser diferente si no tiene ninguna clase pública.
    
    ```java
    // Supongamos que tienes una clase pública GFG.
    	GFG.java     // sintaxis válida
    	gfg.java     // sintaxis inválida
    ```

3. **Sensibilidad a Mayúsculas y Minúsculas**
    
    Java es un lenguaje sensible a las mayúsculas, lo que significa que los identificadores Ab, Ab, aB y ab son diferentes en Java.
    
    ```java
    System.out.println("GeeksforGeeks"); // sintaxis válida
    system.out.println("GeeksforGeeks"); // sintaxis inválida porque la primera letra de la palabra clave System siempre es mayúscula.
    ```

4. **Nombres de Clases**
    - La primera letra de la clase debe estar en mayúscula (se permite en minúscula pero se desaconseja).
    - Si se utilizan varias palabras para formar el nombre de la clase, cada primera letra de las palabras internas debe estar en mayúscula. Se permiten guiones bajos, pero no se recomiendan. También se permiten números y símbolos de moneda, aunque estos últimos también se desaconsejan porque se utilizan para un propósito especial (para clases internas y anónimas).
        
        ```java
        class MyJavaProgram    // sintaxis válida
        class 1Program         // sintaxis inválida
        class My1Program       // sintaxis válida
        class $Program         // sintaxis válida, pero desaconsejada
        class My$Program       // sintaxis válida, pero desaconsejada (clase interna Program dentro de la clase My)
        class myJavaProgram    // sintaxis válida, pero desaconsejada
        ```

5. **public static void main(String [] args)**
    
    El método main() es el punto de entrada principal en un programa Java; aquí es donde comienza el procesamiento. También es válida la firma **public static void main(String… args)**.
    
6. **Nombres de Métodos**
    - Todos los nombres de los métodos deben comenzar con una letra minúscula (se permite el uso de mayúsculas, pero se recomienda minúsculas).
    - Si se utilizan varias palabras para formar el nombre del método, entonces cada primera letra de las palabras internas debe estar en mayúscula. Se permiten guiones bajos, pero no se recomiendan. También se permiten dígitos y símbolos de moneda.
    
    ```java
    public void employeeRecords() // sintaxis válida
    public void EmployeeRecords() // sintaxis válida, pero desaconsejada
    ```

7. **Identificadores en Java**
    
    Los identificadores son los nombres de variables locales, variables de instancia y de clase, y etiquetas, así como los nombres para clases, paquetes, módulos y métodos.
    
    - Todos los identificadores pueden comenzar con una letra, un símbolo de moneda o un guion bajo (**_**). Según la convención, una letra debería estar en minúscula para las variables.
    - El primer carácter de los identificadores puede estar seguido por cualquier combinación de letras, dígitos, símbolos de moneda y guiones bajos. El guion bajo no se recomienda para los nombres de las variables. Las constantes (atributos estáticos finales y enumeraciones) deben estar en mayúsculas.
    - Lo más importante es que los identificadores son sensibles a las mayúsculas.
    - Una palabra clave no puede usarse como identificador ya que es una palabra reservada y tiene un significado especial.
        
        ```java
        Identificadores válidos: MinNumber, total, ak74, hello_world, $amount, _under_value
        Identificadores inválidos: 74ak, -amount
        ```

8. **Espacios en Blanco en Java**
    
    Una línea que contenga solo espacios en blanco, posiblemente con un comentario, se conoce como una línea en blanco, y el compilador de Java la ignora por completo.

9. **Modificadores de Acceso**
    
    Estos modificadores controlan el alcance de clases y métodos.
    
    - **Modificadores de Acceso:** por defecto, público, protegido, privado.
    - **Modificadores No de Acceso:** final, abstracto, estático, transitorio, sincronizado, volátil, nativo.
    
10. **Comprendiendo los Modificadores de Acceso**
    
    | Modificador de Acceso | Dentro de la Clase | Dentro del Paquete | Fuera del Paquete por subclase solo | Fuera del Paquete |
    | --- | --- | --- | --- | --- |
    | Privado | Sí | No | No | No |
    | Por defecto | Sí | Sí | No | No |
    | Protegido | Sí | Sí | Sí | No |
    | Público | Sí | Sí | Sí | Sí |
    
11. **Palabras Clave de Java**
    
    **Palabras clave o reservadas** son las palabras en un lenguaje que se utilizan para algún proceso interno o representan algunas acciones predefinidas. Estas palabras no se permiten como nombres de variables u objetos.
    
    | abstract | assert | boolean | break |
    | --- | --- | --- | --- |
    | byte | case | catch | char |
    | class | const | continue | default |
    | do | double | else | enum |
    | extends | final | finally | float |
    | for | goto | if | implements |
    | import | instanceof | int | interface |
    | long | native | new | package |
    | private | protected | public | return |
    | short | static | strictfp | super |
    | switch | synchronized | this | throw |
    | throws | transient | try | void |
    | volatile | while |  |  |
