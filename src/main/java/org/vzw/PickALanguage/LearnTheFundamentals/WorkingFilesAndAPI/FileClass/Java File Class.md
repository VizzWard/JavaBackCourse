# Java File Class

La clase File es una representación abstracta de las rutas de acceso a archivos y directorios. Un nombre de ruta puede ser absoluto o relativo.

La clase File tiene varios métodos para trabajar con directorios y archivos, como crear nuevos directorios o archivos, borrar y renombrar directorios o archivos, listar el contenido de un directorio, etc.

## Fields

| Modificador | Tipo   | Campo            | Descripción                                                                                 |
|-------------|--------|------------------|---------------------------------------------------------------------------------------------|
| static      | String | pathSeparator    | Es el carácter separador de ruta dependiente del sistema, representado como una cadena para mayor comodidad. |
| static      | char   | pathSeparatorChar | Es el carácter separador de ruta dependiente del sistema.                                    |
| static      | String | separator        | Es el carácter separador de nombres por defecto dependiente del sistema, representado como una cadena para mayor comodidad. |
| static      | char   | separatorChar    | Es el carácter separador de nombres por defecto dependiente del sistema.                     |

## Constructors

| Constructor                       | Descripción                                                                                     |
|-----------------------------------|-------------------------------------------------------------------------------------------------|
| File(File parent, String child)   | Crea una nueva instancia de `File` a partir de un objeto `File` padre y una cadena de ruta hija.|
| File(String pathname)             | Crea una nueva instancia de `File` convirtiendo la cadena de ruta proporcionada en una ruta abstracta.|
| File(String parent, String child) | Crea una nueva instancia de `File` a partir de una cadena de ruta padre y una cadena de ruta hija.|
| File(URI uri)                     | Crea una nueva instancia de `File` convirtiendo la URI `file:` proporcionada en una ruta abstracta.|

## Useful Methods

| Modificador y Tipo | Método                                 | Descripción                                                                                                    |
|--------------------|----------------------------------------|----------------------------------------------------------------------------------------------------------------|
| static File        | createTempFile(String prefix, String suffix) | Crea un archivo vacío en el directorio de archivos temporales por defecto, utilizando el prefijo y sufijo dados para generar su nombre. |
| boolean            | createNewFile()                        | Crea de manera atómica un nuevo archivo vacío con el nombre de esta ruta abstracta, solo si no existe un archivo con este nombre. |
| boolean            | canWrite()                             | Verifica si la aplicación puede modificar el archivo indicado por esta ruta abstracta.                         |
| boolean            | canExecute()                           | Verifica si la aplicación puede ejecutar el archivo indicado por esta ruta abstracta.                          |
| boolean            | canRead()                              | Verifica si la aplicación puede leer el archivo indicado por esta ruta abstracta.                              |
| boolean            | isAbsolute()                           | Verifica si esta ruta abstracta es absoluta.                                                                   |
| boolean            | isDirectory()                          | Verifica si el archivo indicado por esta ruta abstracta es un directorio.                                      |
| boolean            | isFile()                               | Verifica si el archivo indicado por esta ruta abstracta es un archivo normal.                                  |
| String             | getName()                              | Devuelve el nombre del archivo o directorio indicado por esta ruta abstracta.                                  |
| String             | getParent()                            | Devuelve la cadena de ruta del directorio padre de esta ruta abstracta, o `null` si no tiene un directorio padre. |
| Path               | toPath()                               | Devuelve un objeto `java.nio.file.Path` construido a partir de esta ruta abstracta.                            |
| URI                | toURI()                                | Construye una URI `file:` que representa esta ruta abstracta.                                                  |
| File[]             | listFiles()                            | Devuelve un array de rutas abstractas que representan los archivos en el directorio indicado por esta ruta abstracta. |
| long               | getFreeSpace()                         | Devuelve el número de bytes no asignados en la partición indicada por esta ruta abstracta.                     |
| String[]           | list(FilenameFilter filter)            | Devuelve un array de cadenas que nombran los archivos y directorios en el directorio indicado por esta ruta abstracta que cumplen con el filtro especificado. |
| boolean            | mkdir()                                | Crea el directorio indicado por esta ruta abstracta.                                                           |


## Ejemplos

Java File: [`Example1`](FileDemo.java)

Java File:  [`Example2`](FileDemo2.java)

Java File: [`Example3`](FileExample.java)

Java File: [`Example4`](FileExample2.java)