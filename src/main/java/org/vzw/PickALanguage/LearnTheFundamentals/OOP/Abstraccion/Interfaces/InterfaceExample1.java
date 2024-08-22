package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.Interfaces;

/**
 * Ejemplo 1: Uso de Interfaz para Definir Métodos de Pago
 */

interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        payment1.processPayment(100.0);
        payment2.processPayment(150.0);
    }
}

/**
 * La interfaz Payment define un método processPayment.
 *
 * Las clases CreditCardPayment y PayPalPayment implementan la
 * interfaz Payment proporcionando su propia implementación del método processPayment.
 */