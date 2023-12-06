package com.examples;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;

public class Authors {
    public int author_id;

    private String author_name;

    private LocalDate author_birthdate;


    private List<Book> books;

    public Authors(String author_name, LocalDate author_birthdate) {
        this.author_name = author_name;
        this.author_birthdate = author_birthdate;
    }

    public Authors(int authorId, String author_name, LocalDate birthDate) {
        this.author_id = authorId;
        this.author_name = author_name;
        this.author_birthdate = author_birthdate;
    }

    @Override
    public String toString() {
        return "AuthorID: " + author_id +
                ", AuthorName: " + author_name +
                ", BirthDate: " + author_birthdate;
    }

    // Getters and Setters
    public int getAuthorId() {
        return author_id;
    }

    public void setAuthorId(int authorId) {
        this.author_id = authorId;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void setAuthorName(String author_name) {
        this.author_name = author_name;
    }

    public LocalDate getBirthDate() {
        return author_birthdate;
    }

    public void setBirthDate(LocalDate author_birthdate) {
        this.author_birthdate = author_birthdate;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
