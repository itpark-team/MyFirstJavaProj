package com.company;

public class Book {
    private int id;
    private String name;
    private int rating;
    private int price;

    public Book(String name, int rating, int price) {
        this.id = 0;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}
