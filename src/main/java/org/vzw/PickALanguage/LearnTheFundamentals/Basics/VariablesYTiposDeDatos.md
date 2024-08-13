# Tipos de Datos y Variables

## **¿Qué es una Variable en Java?**

Una **variable** es un contenedor de datos que almacena los valores de datos durante la ejecución de un programa Java. Cada variable tiene un tipo de dato asignado que designa el tipo y la cantidad de valor que puede contener. La variable es un nombre de ubicación en la memoria para los datos. Las variables en Java se dividen principalmente en tres tipos: Local, de Instancia y Estáticas.

Para usar una variable en un programa necesitas realizar 2 pasos:

1. Declaración de la Variable
2. Inicialización de la Variable

## **Declaración de Variables**

Para declarar una variable, debes especificar el tipo de dato y darle un nombre único a la variable.

```java
int a, b, c;

float pi;

double d;

char a;
```

##  Inicialización de Variables
Para inicializar una variable, debes asignarle un valor válido.
```java
pi = 3.14f;

d = 20.22d;

a = 'v';
```

Puedes combinar la declaración y la inicialización de variables.
```java
int a = 2, b = 4, c = 6;

float pi = 3.14f;

double d = 20.22d;

char a = 'v';
```

## Tipos de variables
En Java, hay tres tipos de variables:

1. Variables Locales: Son variables que se declaran dentro del cuerpo de un método.

2. Variables de Instancia: Se definen sin la palabra clave STATIC. Se definen fuera de la declaración de un método. Son específicas de un objeto y se conocen como variables de instancia.

3. Variables Estáticas: Se inicializan solo una vez, al inicio de la ejecución del programa. Estas variables deben ser inicializadas primero, antes de la inicialización de cualquier variable de instancia.
java

```java
class Variables {
	static int a = 1; // variable estática
	int data = 99; // variable de instancia
	
	void method(){
		int b = 90; // variable local
}
```
## Que son los tipos de datos en Java?
Los Tipos de Datos en Java se definen como especificadores que asignan diferentes tamaños y tipos de valores que pueden ser almacenados en una variable o identificador. Java tiene un conjunto amplio de tipos de datos. Los tipos de datos en Java se pueden dividir en dos partes:

1. Tipos de Datos Primitivos: que incluyen enteros, caracteres, booleanos y flotantes.

2. Tipos de Datos No Primitivos: que incluyen clases, arreglos e interfaces.

![img](https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.btechsmartclass.com%2Fjava%2Fjava_images%2Fjava-data-types.jpg&f=1&nofb=1&ipt=1fa34cf34fe057ac2363edeb0331555c677e29a800b21b29f676796c1a11c11a&ipo=images)

### Tipos de datos primitivos
Los Tipos de Datos Primitivos están predefinidos y disponibles dentro del lenguaje Java. Los valores primitivos no comparten estado con otros valores primitivos. Hay 8 tipos primitivos:

```java
// Tipos de Datos Enteros
byte (1 byte)
short (2 bytes)
int (4 bytes)
long (8 bytes)

// Tipos de Datos Flotantes
float (4 bytes)
double (8 bytes)

// Tipo de Datos Textual
char (2 bytes)

// Lógico
boolean (1 byte) (true / false)
```

| Tipo de Dato |	Valor por Defecto |	Tamaño por Defecto |
| ---    | ---       | ---      |
|byte    |	0        |	1 byte  |
|short   |	0        |	2 bytes |
|int     |	0        |	4 bytes |
|long    |	0L       |	8 bytes |
|float   |	0.0f     |	4 bytes |
|double  |	0.0d     |	8 bytes |
|boolean |	false    | 	1 bit   |
|char    |	‘\u0000’ |	2 bytes |

**Puntos a Recordar**
- Todos los tipos de datos numéricos son firmados (+/-).
- El tamaño de los tipos de datos permanece constante en todas las plataformas (estandarizado).
- El tipo de dato char en Java es de 2 bytes porque utiliza el conjunto de caracteres UNICODE. Gracias a esto, Java soporta la internacionalización. UNICODE es un conjunto de caracteres que cubre todos los scripts y lenguajes conocidos en el mundo.

## Conversión de Tipos de Variables en Java y Casting de Tipos
Una variable de un tipo puede recibir el valor de otro tipo. Aquí hay 2 casos.
- Cuando una variable de menor capacidad se asigna a otra variable de mayor capacidad.

```java
double d;
int i = 10;
d = i;
```
Este proceso es automático y no explícito, y se conoce como Conversión.

- Cuando una variable de mayor capacidad se asigna a otra variable de menor capacidad.
```java
double d = 10;
int i;
i = (int)d;
```
En tales casos, debes especificar explícitamente el operador de casting. Este proceso se conoce como Casting de Tipos.