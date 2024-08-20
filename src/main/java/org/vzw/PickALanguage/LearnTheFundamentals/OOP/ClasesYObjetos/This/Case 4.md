# this: para pasarlo como argumento en el método

La palabra clave this también se puede pasar como argumento en el método. Se utiliza principalmente en el manejo de eventos. Veamos el ejemplo:

```java
class S2{
    void m(S2 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
    }
}
```

***Salida:***

```txt
method is invoked
```

###  Aplicación de esto que se puede pasar como argumento:

En el manejo de eventos (o) en una situación en la que tenemos que proporcionar referencia de una clase a otra. Se utiliza para reutilizar un objeto en muchos métodos.