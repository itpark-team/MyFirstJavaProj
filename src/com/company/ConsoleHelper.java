package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleHelper {
    public static void printlnBook(Book book) {
        System.out.println(book);
    }

    public static Book scannerBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = scanner.nextLine();

        System.out.print("Input rating: ");
        int rating = scanner.nextInt();

        System.out.print("Input price: ");
        int price = scanner.nextInt();

        return new Book(name, rating, price);
    }

    public static void printAllBooks(ArrayList<Book> books) {
        for (Book book : books) {
            printlnBook(book);
        }
    }

    public static void printlnDivider(){
        System.out.println("-------");
    }

    public static int scannerInt(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        int number = scanner.nextInt();

        return number;
    }
}
