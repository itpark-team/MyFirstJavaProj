package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BooksManager booksManager = new BooksManager();
        int action;

        booksManager.addBook(
                new Book("kolobok", 4, 115)
        );
        booksManager.addBook(
                new Book("masha i medved", 5, 118)
        );

        while (true){
            ConsoleHelper.printAllBooks(booksManager.getAllBooks());
            ConsoleHelper.printlnDivider();

            System.out.println("1. Add book");
            System.out.println("2. Delete book by Id");
            System.out.println("3. Sort books by price");
            System.out.println("4. Print books expensive 115");
            System.out.println("0. Exit");
            action = ConsoleHelper.scannerInt("input action: ");

            switch (action){
                case 1:{
                    Book book = ConsoleHelper.scannerBook();
                    booksManager.addBook(book);
                }break;
                case 2:{
                    int bookId =  ConsoleHelper.scannerInt("input bookId: ");
                    booksManager.deleteBook(bookId);
                }break;
                case 3:{
                    booksManager.sortBooksByPrice();
                }break;
                case 4:{
                    ArrayList<Book> filteredBooks = booksManager.getBooksByCondition(book -> book.getPrice()>115);
                    ConsoleHelper.printAllBooks(filteredBooks);
                }break;
                case 0:{
                    return;
                }
                default:{
                    System.out.println("unknown command");
                }break;
            }
        }
    }
}
