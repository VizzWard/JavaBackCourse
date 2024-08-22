package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Encapsulacion;

/**
 * Ejemplo 2: Encapsulación con una Clase BankAccount
 *
 * En este ejemplo, la clase BankAccount encapsula los detalles de la
 * cuenta bancaria, como el número de cuenta y el saldo, y proporciona
 * métodos públicos para realizar operaciones de depósito y retiro.
 */

class BankAccount {
    // Atributos privados
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Método getter para el número de cuenta
    public String getAccountNumber() {
        return accountNumber;
    }

    // Método getter para el saldo
    public double getBalance() {
        return balance;
    }

    // Método para depositar dinero
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Método para retirar dinero
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
}

public class EncapsulationExample2 {
    public static void main(String[] args) {
        // Creación de un objeto de la clase BankAccount
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Realizar operaciones en la cuenta bancaria
        account.deposit(500.0);
        account.withdraw(200.0);

        // Mostrar el saldo actual
        System.out.println("Current Balance: " + account.getBalance());
    }
}

/**
 * Los atributos accountNumber y balance están encapsulados dentro de la clase BankAccount.
 *
 * Se proporciona acceso a través de los métodos getAccountNumber() y getBalance().
 *
 * Las operaciones de depósito y retiro se realizan a través de los métodos deposit() y
 * withdraw(), lo que permite controlar cómo se modifican los atributos encapsulados.
 */