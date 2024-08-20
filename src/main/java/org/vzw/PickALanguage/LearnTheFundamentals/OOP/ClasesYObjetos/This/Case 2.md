# this: para invocar el método actual de la clase

Puede invocar el método de la clase actual utilizando la palabra clave this. Si no utilizas la palabra clave this, el compilador añade automáticamente esta palabra clave al invocar el método. Veamos el ejemplo:

![](https://static.javatpoint.com/images/thismethod.JPG)

```java
class A{
    void m(){
        System.out.println("hello m");
    }
    
    void n(){
        System.out.println("hello n");
        //m();  //same as this.m()  
        this.m();
    }
}
class TestThis4{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }
}
```

***Salida:***

```txt
hello n
hello m
```