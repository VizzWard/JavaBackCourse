package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Association;

/**
 * Ejemplo de Composición
 *
 * En la composición, la relación "has-a" es más fuerte,
 * y el ciclo de vida del objeto contenido depende
 * completamente de la clase contenedora.
 */

// Clase Book que representa un libro
class Book2 {
    private String title;
    private String author;

    Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Clase Library que contiene múltiples libros (composición)
class Library2 {
    private Book2[] books;

    Library2() {
        // Creando una biblioteca con tres libros
        books = new Book2[3];
        books[0] = new Book2("1984", "George Orwell");
        books[1] = new Book2("To Kill a Mockingbird", "Harper Lee");
        books[2] = new Book2("The Great Gatsby", "F. Scott Fitzgerald");
    }

    void displayLibrary() {
        for (Book2 book : books) {
            book.displayBookInfo();
        }
    }
}

public class CompositionExample2 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Library
        Library2 library = new Library2();

        // Aquí se aplica la relación "has-a" (composición)
        // Una Library "has-a" multiple Books
        library.displayLibrary();
    }
}


/**
 * Composición: La clase Library tiene una colección de
 * Book objetos. Aquí, Library "has-a" Book, y los libros
 * son creados y gestionados dentro de la biblioteca. Si
 * la instancia de Library es destruida, los libros también
 * lo son. Esto es composición, ya que los objetos Book
 * dependen completamente de la existencia de Library.
 */