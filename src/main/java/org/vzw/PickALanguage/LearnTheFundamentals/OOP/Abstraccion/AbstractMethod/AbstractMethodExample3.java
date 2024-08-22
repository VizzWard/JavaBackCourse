package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.AbstractMethod;

/**
 * Ejemplo 3: Clase Abstracta para Definir Métodos de Reproducción de Medios
 *
 * En este ejemplo, se utiliza un método abstracto para definir cómo
 * diferentes dispositivos reproducen medios (audio, video, etc.).
 */

// Clase abstracta MediaDevice que define un método abstracto play()
abstract class MediaDevice {
    // Método abstracto que debe ser implementado por las subclases
    abstract void play(String media);

    // Método no abstracto que muestra el tipo de medio que se está reproduciendo
    void startPlaying() {
        System.out.println("Starting to play media...");
    }
}

// Clase CDPlayer que hereda de MediaDevice e implementa el método play()
class CDPlayer extends MediaDevice {
    void play(String media) {
        System.out.println("Playing CD: " + media);
    }
}

// Clase DVDPlayer que hereda de MediaDevice e implementa el método play()
class DVDPlayer extends MediaDevice {
    void play(String media) {
        System.out.println("Playing DVD: " + media);
    }
}

public class AbstractMethodExample3 {
    public static void main(String[] args) {
        MediaDevice cdPlayer = new CDPlayer();
        MediaDevice dvdPlayer = new DVDPlayer();

        cdPlayer.startPlaying();
        cdPlayer.play("Favorite Album");

        dvdPlayer.startPlaying();
        dvdPlayer.play("Favorite Movie");
    }
}

/**
 * La clase abstracta MediaDevice tiene un método abstracto play()
 * que es implementado por las subclases CDPlayer y DVDPlayer.
 *
 * Cada subclase implementa play() de acuerdo al tipo de medio que reproduce.
 */