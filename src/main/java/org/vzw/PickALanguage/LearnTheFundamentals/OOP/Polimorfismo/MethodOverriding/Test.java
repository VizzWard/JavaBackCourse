package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.MethodOverriding;

//Programa para demostrar el escenario real de Java Method Overriding
//donde tres clases sobrescriben el método de una clase padre.

//Clase de prueba para crear objetos y llamar a los métodos
class Test{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}

//Creación de una clase padre.
class Bank{
    int getRateOfInterest(){return 0;}
}


//Creación de clases hijo.

class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
