package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.AbstractMethod;

/**
 * Ejemplo 1: Clase Abstracta para Definir Métodos de Comunicación
 *
 * En este ejemplo, se utiliza un método abstracto para definir
 * cómo los dispositivos de comunicación diferentes transmiten información.
 */

// Clase abstracta CommunicationDevice que define un método abstracto transmit()
abstract class CommunicationDevice {
    // Método abstracto que debe ser implementado por las subclases
    abstract void transmit(String message);

    // Método no abstracto que imprime el dispositivo que se está utilizando
    void startTransmission() {
        System.out.println("Starting transmission...");
    }
}

// Clase Radio que hereda de CommunicationDevice e implementa el método transmit()
class Radio extends CommunicationDevice {
    void transmit(String message) {
        System.out.println("Radio transmitting: " + message);
    }
}

// Clase Phone que hereda de CommunicationDevice e implementa el método transmit()
class Phone extends CommunicationDevice {
    void transmit(String message) {
        System.out.println("Phone calling: " + message);
    }
}

public class AbstractMethodExample1 {
    public static void main(String[] args) {
        CommunicationDevice radio = new Radio();
        CommunicationDevice phone = new Phone();

        radio.startTransmission();
        radio.transmit("Hello from the radio!");

        phone.startTransmission();
        phone.transmit("Hello from the phone!");
    }
}

/**
 * La clase abstracta CommunicationDevice tiene un método abstracto transmit()
 * que debe ser implementado por las subclases Radio y Phone.
 *
 * Cada subclase implementa transmit() de acuerdo a cómo transmite la información.
 */