package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.MethodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args){
        System.out.println(Adder1.add(11,11));
        System.out.println(Adder1.add(12.3,12.6));
    }
}

class Adder1{
    static int add(int a, int b){
        return a+b;
    }

    static double add(double a, double b){
        return a+b;
    }
}

