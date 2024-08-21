package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.MethodOverloading;

public class MethodOverloading1 {
    public static void main(String[] args){

        System.out.println(Adder.add(11,11));

        System.out.println(Adder.add(11,11,11));
    }
}

class Adder{
    static int add(int a,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }
}