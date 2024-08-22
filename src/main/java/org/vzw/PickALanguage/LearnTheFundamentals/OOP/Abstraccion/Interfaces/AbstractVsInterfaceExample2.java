package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.Interfaces;

/**
 * Ejemplo 2: Herencia Múltiple con Interfaz
 */

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionPrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

abstract class PrinterAbstract {
    abstract void print();

    void powerOn() {
        System.out.println("Printer is powered on.");
    }
}

class LaserPrinter extends PrinterAbstract {
    void print() {
        System.out.println("Printing document with Laser Printer...");
    }
}

public class AbstractVsInterfaceExample2 {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();

        LaserPrinter lp = new LaserPrinter();
        lp.powerOn();
        lp.print();
    }
}


/**
 * Interfaz: MultiFunctionPrinter implementa dos interfaces, Printer y Scanner,
 * lo que permite que una clase tenga múltiples comportamientos, algo que no es
 * posible con clases abstractas (ya que Java no soporta herencia múltiple de clases).
 *
 * Clase Abstracta: PrinterAbstract tiene un método abstracto print() y un método no
 * abstracto powerOn(). LaserPrinter es una subclase que implementa print() y hereda powerOn().
 */