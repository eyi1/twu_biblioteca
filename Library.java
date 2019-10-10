package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> availableBooks;

    public Library(){
        availableBooks = new ArrayList<Book>();

        availableBooks.add(new Book("Kafka on the Shore", "Haruki Murakami", 2012));
        availableBooks.add(new Book("Becoming", "Michelle Obama", 2016));
        availableBooks.add(new Book("The Educated: Memoir", "Tara Westover", 2013));
        availableBooks.add(new Book("Kafka on the Shore", "Haruki Murakami", 2012));
    }

    public ArrayList<Book> getAvailableBooks() {
        return availableBooks;
    }

}
