package com.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Dune", "Frank Herbert"));

        System.out.println("Books in library:");
        library.printAllBooks();
    }
}
