# this: para invocar el constructor de la clase actual

La llamada al constructor this() puede utilizarse para invocar al constructor de la clase actual. Se utiliza para reutilizar el constructor. En otras palabras, se utiliza para encadenar constructores.

***Llamada al constructor por defecto desde el constructor parametrizado:***

```java
class A{
    A(){
        System.out.println("hello a");
    }
    
    A(int x){
        this();
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String args[]){
        A a=new A(10);
    }
}
```

***Salida:***

```txt
hello a
10
```

***Llamada a constructor parametrizado desde constructor por defecto:***

```java
class A{
    A(){
        this(5);
        System.out.println("hello a");
    }
    
    A(int x){
        System.out.println(x);
    }
}
class TestThis6{
    public static void main(String args[]){
        A a=new A();
    }
}
```

***Salida:***

```txt
5
hello a
```

## Uso real de la llamada al constructor this()

La llamada al constructor this() debe usarse para reutilizar el constructor desde el constructor. Mantiene la cadena entre los constructores, es decir, se utiliza para encadenar constructores. Veamos el siguiente ejemplo que muestra el uso real de esta palabra clave.

```java
class Student{
    int rollno;
    String name,course;
    float fee;
    
    Student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    
    Student(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor  
        this.fee=fee;
    }
    
    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}

class TestThis7{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit","java");
        Student s2=new Student(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }
}
```

***Salida:***

```txt
111 ankit java 0.0
112 sumit java 6000.0
```

> Regla: La llamada a this() debe ser la primera sentencia del constructor.

```java
class Student{
    int rollno;
    String name,course;
    float fee;
    
    Student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    
    Student(int rollno,String name,String course,float fee){
        this.fee=fee;
        this(rollno,name,course);//C.T.Error  
    }
    
    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}

class TestThis8{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit","java");
        Student s2=new Student(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }
}
```

***Salida:***

```txt
Compile Time Error: Call to this must be first statement in constructor
```