package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Association;

// Programa para ilustrar el concepto de composición

// Importación de clases necesarias
import java.util.*;

// Class 1
// Clase auxiliar
// Book class
class Book {
    // Variables de esta clase
    public String title;
    public String author;

    // Constructor de la clase
    Book(String title, String author) {
        // This keyword se refiere a la instancia superior actual
        this.title = title;
        this.author = author;
    }
}

// Class 2
// Clase auxiliar
// La clase Library contiene una lista de Books.
class Library {
    // Referencia para consultar la lista de libros.
    private final List<Book> books;

    // Constructor de la clase
    Library(List<Book> books) {
        // This keyword se refiere a la instancia actual
        this.books = books;
    }

    // Método de esta clase
    // Obtener la lista de libros
    public List<Book> getListOfBooksInLibrary() {
        return books;
    }
}

// Main class
class GFG {
    // Main driver method
    public static void main(String[] args) {
        // Creación de los objetos de la clase 1 (clase Libro)
        // dentro del método main()
        Book b1 = new Book("EffectiveJ Java","Joshua Bloch");
        Book b2 = new Book("Thinking in Java","Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference","Herbert Schildt");

        // Creación de la lista que contiene los numeros de libros.
        List<Book> book = new ArrayList<Book>();

        // Añadir libros al objeto Lista utilizando el método add()
        book.add(b1);
        book.add(b2);
        book.add(b3);

        // Creación de un objeto de clase 2
        Library library = new Library(book);

        // Llamada al método de la clase 2 y almacenamiento de la lista de
        // libros en List Aquí List se declara de tipo
        // Books(user-defined)
        List<Book> books = library.getListOfBooksInLibrary();

        // Iteración sobre el bucle for each
        for (Book bk : books) {
            // Imprimir y mostrar el título y el autor de
            // libros dentro del objeto Lista
            System.out.println("Title: " + bk.title + ", " + "Author: " + bk.author);
        }
    }
}
