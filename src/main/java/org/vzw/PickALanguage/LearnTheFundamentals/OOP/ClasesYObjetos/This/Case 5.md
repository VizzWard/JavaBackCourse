# this: para pasar como argumento en la llamada al constructor

Podemos pasar la palabra clave this en el constructor también. Es útil si tenemos que usar un objeto en múltiples clases. Veamos el ejemplo:

```java
class B{
    A4 obj;
    B(A4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of A4 class  
    }
}

class A4{
    int data=10;
    A4(){
        B b=new B(this);
        b.display();
    }
    public static void main(String args[]){
        A4 a=new A4();
    }
}
```

