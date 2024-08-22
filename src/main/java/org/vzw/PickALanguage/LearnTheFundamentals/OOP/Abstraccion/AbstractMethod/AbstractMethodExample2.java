package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.AbstractMethod;

/**
 * Ejemplo 2: Clase Abstracta para Definir Métodos de Pago
 *
 * En este ejemplo, se utiliza un método abstracto para definir
 * cómo se procesa un pago utilizando diferentes métodos de pago.
 */

// Clase abstracta PaymentMethod que define un método abstracto processPayment()
abstract class PaymentMethod {
    // Método abstracto que debe ser implementado por las subclases
    abstract void processPayment(double amount);

    // Método no abstracto que muestra la cantidad que se va a pagar
    void initiatePayment(double amount) {
        System.out.println("Initiating payment of $" + amount);
    }
}

// Clase CreditCard que hereda de PaymentMethod e implementa el método processPayment()
class CreditCard extends PaymentMethod {
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Clase PayPal que hereda de PaymentMethod e implementa el método processPayment()
class PayPal extends PaymentMethod {
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class AbstractMethodExample2 {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        creditCard.initiatePayment(100.0);
        creditCard.processPayment(100.0);

        payPal.initiatePayment(150.0);
        payPal.processPayment(150.0);
    }
}

/**
 * La clase abstracta PaymentMethod tiene un método abstracto processPayment()
 * que es implementado por las subclases CreditCard y PayPal.
 *
 * Cada subclase implementa processPayment() de acuerdo al método de pago específico.
 */