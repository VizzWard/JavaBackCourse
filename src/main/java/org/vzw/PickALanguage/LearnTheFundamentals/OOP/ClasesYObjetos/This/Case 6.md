# this puede utilizarse para devolver la instancia de clase actual

Podemos devolver esta palabra clave como una sentencia del método. En tal caso, el tipo de retorno del método debe ser el tipo de la clase (no primitivo). Veamos el ejemplo:

**Syntax:**
```java
return_type method_name(){
    return this;
}
```

## Ejemplo que devuelve como declaración el método

```java
class A{
    A getA(){
        return this;
    }
    void msg(){
        System.out.println("Hello java");
    }
}
class Test1{
    public static void main(String args[]){
        new A().getA().msg();
    }
}
```

***Salida:***

```txt
Hello java
```

## Proving this keyword

Probemos que esta palabra clave se refiere a la variable de instancia de la clase actual. En este programa, estamos imprimiendo la variable de referencia y esto, la salida de ambas variables son iguales.

```java
class A5{
    void m(){
        System.out.println(this);//prints same reference ID  
    }
    public static void main(String args[]){
        A5 obj=new A5();
        System.out.println(obj);//prints the reference ID  
        obj.m();
    }
}
```

***Salida:***

```txt
A5@22b3ea59
A5@22b3ea59
```