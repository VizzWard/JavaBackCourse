package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.FinalKeyword;

/** Uso de final con Variables */

class FinalVariableExample {
    // Declaración de una variable final
    final int MAX_VALUE = 100;

    void displayValue() {
        // MAX_VALUE = 200; // Esto generaría un error de compilación, ya que MAX_VALUE es final
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.displayValue();
    }
}