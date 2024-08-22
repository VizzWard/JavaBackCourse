package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.Interfaces;

/**
 * Ejemplo 2: Uso de Interfaz para Definir Métodos de Comunicación
 */

interface Communicator {
    void sendMessage(String message);
}

class EmailCommunicator implements Communicator {
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSCommunicator implements Communicator {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        Communicator email = new EmailCommunicator();
        Communicator sms = new SMSCommunicator();

        email.sendMessage("Hello via Email!");
        sms.sendMessage("Hello via SMS!");
    }
}


/**
 * La interfaz Communicator define un método sendMessage.
 *
 * Las clases EmailCommunicator y SMSCommunicator implementan
 * la interfaz proporcionando su propia implementación del método sendMessage.
 */