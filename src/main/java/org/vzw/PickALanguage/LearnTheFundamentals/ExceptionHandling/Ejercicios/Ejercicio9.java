package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;

import org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios.CustomExceptions.InsufficientBalanceException;

/**
 * Ejercicio 9;
 * Diseña una excepción personalizada llamada InsufficientBalanceException
 * y utilízala en un programa que simule una cuenta bancaria.
 *
 * Instrucciones:
 * Implementa el método withdraw para lanzar la excepción personalizada
 * InsufficientBalanceException cuando el balance sea insuficiente para
 * completar la transacción.
 */
public class Ejercicio9 {
    private static double balance;

    public static void BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public static void withdraw(double amount) throws InsufficientBalanceException {
        // Lanza `InsufficientBalanceException` si el balance es insuficiente
        if (amount > balance) {
            throw new InsufficientBalanceException("Fondos insuficientes");
        }
        balance -= amount;
        System.out.println("Transferencia Exitosa");
    }

    public static double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount(3465.78);

        try {
            double amount = 22345.34;
            withdraw(amount);

        } catch (InsufficientBalanceException e){
            System.out.println("Fondos insuficientes");
        }
    }
}
