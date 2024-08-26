# Common File Operations

Cuando se trabaja con archivos o rutas, es probable que utilice la clase java.nio.file.Files. Contiene una tonelada de métodos estáticos comunes y útiles, que operan sobre archivos y directorios.

## Cómo comprobar si un fichero existe

```java
Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
boolean exists = Files.exists(path);
System.out.println("exists = " + exists);
```

Comprueba si existe un archivo o directorio. También permite especificar parámetros adicionales, para definir cómo se tratan los enlaces simbólicos, es decir, si se siguen (por defecto) o no.

Al ejecutar este fragmento, obtendrá un simple indicador booleano.

```text
true
```

## Cómo obtener la última fecha de modificación de un fichero

```java
Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
FileTime lastModifiedTime = Files.getLastModifiedTime(path);
System.out.println("lastModifiedTime = " + lastModifiedTime);
```

Se explica por sí mismo. Devuelve la última fecha en que se modificó el archivo como un objeto FileTime.

```text
lastModifiedTime = 2020-05-20T08:41:30.905176Z
```

## Cómo comparar archivos (Java12+)

```java
Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
long mismatchIndex = Files.mismatch(path, Paths.get("c:\\dev\\whatever.txt"));
System.out.println("mismatch = " + mismatchIndex);
```

Se trata de una adición relativamente nueva a Java, disponible desde Java 12. Compara los tamaños y bytes de dos archivos y devuelve la posición de la primera discrepancia (byte). O, -1L si no hubo ninguna discordancia.

Por lo tanto, si está comparando dos archivos completamente diferentes, obtendrá esto como salida de la consola: el primer byte ya no coincide, por lo que la falta de coincidencia es la posición cero.

```text
mismatch = 0
```

## Cómo obtener el propietario de un fichero

```java
Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
UserPrincipal owner = Files.getOwner(path);
System.out.println("owner = " + owner);
```

Devuelve el propietario de un archivo o directorio como UserPrincipal (que se extiende desde Principal). En Windows, esto será un WindowsUserPrincipal, que contiene el nombre de cuenta del usuario (que se muestra a continuación), así como su sid, su identificador de seguridad único en su máquina Windows.

```text
owner = DESKTOP-168M0IF\marco_local (User)
```

## Cómo crear archivos temporales

```java
Path tempFile1 = Files.createTempFile("somePrefixOrNull", ".jpg");
System.out.println("tempFile1 = " + tempFile1);

Path tempFile2 = Files.createTempFile(path.getParent(), "somePrefixOrNull", ".jpg");
System.out.println("tempFile2 = " + tempFile2);

Path tmpDirectory = Files.createTempDirectory("prefix");
System.out.println("tmpDirectory = " + tmpDirectory);
```

Vamos a desglosarlo:

```java
Path tempFile1 = Files.createTempFile("somePrefixOrNull", ".jpg");
System.out.println("tempFile1 = " + tempFile1);
```

Al crear archivos temporales, puede especificar un prefijo (primer parámetro) y un sufijo (segundo parámetro). Ambos pueden ser nulos.

El prefijo se antepondrá al nombre del archivo temporal, el sufijo es esencialmente la extensión del archivo, y si lo omites se utilizará la extensión por defecto ".tmp".

El archivo se creará en el directorio de archivos temporales predeterminado.

```java
Path tempFile2 = Files.createTempFile(path.getParent(), "somePrefixOrNull", ".jpg");
System.out.println("tempFile2 = " + tempFile2);
```

En lugar del directorio temporal predeterminado, también puede especificar su propio directorio donde desea que se cree el archivo temporal.

```java
Path tmpDirectory = Files.createTempDirectory("prefix");
System.out.println("tmpDirectory = " + tmpDirectory);
```

Además de ficheros, también puedes crear directorios temporales. Como no necesitas el parámetro sufijo para crear directorios, sólo tienes que especificar un parámetro prefijo.

Al ejecutar el fragmento de código anterior, obtendrá el siguiente resultado (o uno similar):

```text
tempFile1 = C:\Users\marco\AppData\Local\Temp\somePrefixOrNull8747488053128491901.jpg
tempFile2 = c:\dev\licenses\windows\somePrefixOrNull11086918945318459411.jpg
tmpDirectory = C:\Users\marco\AppData\Local\Temp\prefix9583768274092262832
```

> Nota: Los archivos temporales, contrariamente a la creencia popular, no se borran solos. Tienes que asegurarte de borrarlos explícitamente, al crearlos en pruebas unitarias o al ejecutarlos en producción.

## Cómo crear archivos y directorios

Ya has visto cómo crear archivos temporales, y es exactamente lo mismo con los archivos y directorios normales. Simplemente llamarás a métodos diferentes:

```java
Path newDirectory = Files.createDirectories(path.getParent().resolve("some/new/dir"));
System.out.println("newDirectory = " + newDirectory);

Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
System.out.println("newFile = " + newFile);
```

Algunas personas se confunden con esto: La llamada a .resolve no crea el fichero, simplemente devuelve una referencia al fichero (hijo) que se va a crear.

Al ejecutar el fragmento de código anterior, obtendrá el siguiente resultado (o uno similar):

```java
newDirectory = c:\dev\licenses\windows\some\new\dir
newFile = c:\dev\licenses\windows\some\new\dir\emptyFile.txt
```

## Cómo obtener los permisos Posix de un fichero

Si está ejecutando su programa Java en un sistema tipo Unix (incluidos Linux y MacOS), puede obtener los permisos Posix de un archivo. Piense: "-rw-rw-rw-" o "-rwxrwxrwx", etc.

```java
Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
try {
    Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path);
    System.out.println("permissions = " + permissions);
} catch (UnsupportedOperationException e) {
    System.err.println("Looks like you're not running on a posix file system");
}
```

Ejecutando esto en Linux o MacOS, obtendrías este tipo de salida:

```text
OWNER_WRITE
OWNER_READ
GROUP_WRITE
OTHERS_READ
...
```

***[`Escritura y lectura de archivos`](../Escritura%20y%20lectura%20de%20archivos.md)***