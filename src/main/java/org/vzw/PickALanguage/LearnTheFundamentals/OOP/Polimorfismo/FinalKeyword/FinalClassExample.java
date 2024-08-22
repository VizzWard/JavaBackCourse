package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.FinalKeyword;

final class FinalClass {
    void showMessage() {
        System.out.println("This is a method in a final class.");
    }
}

// class SubClass extends FinalClass { // Esto generaría un error de compilación, ya que FinalClass es final
// }

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.showMessage();
    }
}