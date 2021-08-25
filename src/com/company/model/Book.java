package com.company.model;

import java.util.UUID;

public class Book {
    private String code;
    private String bookName;
    private String genre;
    private int pages;
    private String language;
    private String author;

    public Book() {
    }

    public Book(String bookName, String genre,int pages, String language, String author) {
        this.code = UUID.randomUUID().toString().substring(0,8);
        this.bookName = bookName;
        this.genre = genre;
        this.pages = pages;
        this.language = language;
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", bookName='" + bookName + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", language='" + language + '\'' +
                ", author='" + author + '\'' +
                "}\n";
    }
}
