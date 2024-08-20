# this: para referirse a la variable de instancia de la clase actual

La palabra clave this se puede utilizar para referirse a la variable de instancia de la clase actual. Si hay ambigüedad entre las variables de instancia y los parámetros, esta palabra clave resuelve el problema de ambigüedad.

## Comprender el problema sin this

Entendamos el problema si no utilizamos esta palabra clave mediante el ejemplo que se da a continuación:

```java
class Student{
    int rollno;
    String name;
    float fee;
    
    Student(int rollno,String name,float fee){
        rollno=rollno;
        name=name;
        fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}

class TestThis1{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
```

***Salida:***

```txt
0 null 0.0
0 null 0.0
```

En el ejemplo anterior, los parámetros (argumentos formales) y las variables de instancia son iguales. Por lo tanto, estamos utilizando esta palabra clave para distinguir variable local y variable de instancia.

## Solución del problema anterior mediante this

```java
class Student{
    int rollno;
    String name;
    float fee;
    
    Student(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}

class TestThis2{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}  
```

***Salida:***

```txt
111 ankit 5000.0
112 sumit 6000.0
```

Si las variables locales (argumentos formales) y las variables de instancia son diferentes, no es necesario utilizar esta palabra clave como en el siguiente programa:

```java
class Student{
    int rollno;
    String name;
    float fee;
    
    Student(int r,String n,float f){
        rollno=r;
        name=n;
        fee=f;
    }
    
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}

class TestThis3{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
```

***Salida:***

```txt
111 ankit 5000.0 
112 sumit 6000.0
```

>  Es mejor utilizar nombres significativos para las variables. Así que usamos el mismo nombre para variables de instancia y parámetros en tiempo real, y siempre usamos esta palabra clave.