package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BooksManager {
    private ArrayList<Book> books;
    private int bookId;

    public BooksManager() {
        this.books = new ArrayList<>();
        this.bookId = 0;
    }

    public void addBook(Book book) {
        bookId++;
        book.setId(bookId);

        books.add(book);
    }

    public boolean deleteBook(int bookId) {
        return books.removeIf(book -> book.getId() == bookId);
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public ArrayList<Book> getBooksByCondition(Predicate<Book> condition) {
        return (ArrayList<Book>) books.stream().filter(condition).collect(Collectors.toList());
    }

    public void sortBooksByPrice() {
        books.sort(Comparator.comparingInt(Book::getPrice));
    }


}
