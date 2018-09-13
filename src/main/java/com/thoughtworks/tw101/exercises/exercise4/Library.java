package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        System.out.println("given" + partialBookTitle);
        for (int i = 0; i < this.books.length; ++i) {
            if (this.books[i].contains(partialBookTitle)) {
                this.printStream.println(this.books[i]);
            }
        }

    }
}
