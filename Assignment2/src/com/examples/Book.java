package com.examples;
import java.util.ArrayList;
import java.util.List;

public class Book {

    private int book_id;
    private String title;
    private int publicationYear;
    private int stock;

    private Authors authors;
    private orders order;

    private List<orders> orders = new ArrayList<>();

    public Book(int book_id, String title, int publicationYear, int stock) {
        this.book_id = book_id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.stock = stock;
    }

    public Book(int book_id, String title, int publicationYear, int stock, Authors authors, orders order) {
        this.book_id = book_id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.stock = stock;
        this.authors = authors;
        this.order = order;
    }

    public Book(int book_id, String title, int publicationYear, int stock, Authors authors) {
        this.book_id = book_id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.stock = stock;
        this.authors = authors;
    }

    public Book(String title, int publicationYear, int stock, int authorId) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.stock = stock;
        this.authors = new Authors(author_id, null, null, null);
    }

    public int getBookId() {
        return book_id;
    }

    public void setBookId(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Authors getAuthor() {
        return authors;
    }

    public void setAuthor(Authors authors) {
        this.authors = authors;
    }

    public orders getOrder() {
        return order;
    }

    public void setOrder(orders order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "book_id: " + book_id +
                ", title: " + title +
                ", publicationyear: " + publicationYear +
                ", stock: " + stock +
                ", author: " + authors +
                ", order: " + order;
    }

    public void addOrder(orders order) {
        orders.add(order);
    }

    public List<orders> getOrders() {
        return orders;
    }
}
