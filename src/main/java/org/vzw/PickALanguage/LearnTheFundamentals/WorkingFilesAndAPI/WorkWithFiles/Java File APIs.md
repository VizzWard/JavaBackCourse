# Java’s File APIs

Java dispone dos API de archivos:

- La API java.io.File original, disponible desde Java 1.0 (1996).
- La nueva API java.nio.file.Path, disponible desde Java 1.7 (2011).

## ¿Cuál es la diferencia entre las APIs File y Path?

La antigua API de archivos se utiliza en un montón de proyectos, frameworks y bibliotecas antiguos. A pesar de su antigüedad, no está obsoleta (y probablemente nunca lo estará) y puedes seguir utilizándola con cualquiera de las últimas versiones de Java.

Sin embargo, java.nio.file.Path hace todo lo que java.io.File puede, pero generalmente de mejor manera y más. Algunos ejemplos:

- Características de los archivos: Las nuevas clases soportan enlaces simbólicos, atributos de archivo adecuados y soporte de metadatos (piense: PosixFileAttributes), ACLs y más.
- Mejor uso: Por ejemplo, al eliminar un archivo, se obtiene una excepción con un mensaje de error significativo (no existe tal archivo, archivo bloqueado, etc.), en lugar de un simple booleano que diga false.
- Desacoplamiento: Habilitación de la compatibilidad con sistemas de archivos en memoria, que trataremos más adelante.

## ¿Qué API de archivos debo utilizar?

Por las razones mencionadas anteriormente, si usted está comenzando un nuevo proyecto Java, es muy recomendable utilizar `API Paths` sobre la `API File`.