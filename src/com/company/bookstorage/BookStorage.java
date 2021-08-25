package com.company.bookstorage;

import com.company.model.Book;
import com.company.util.BookFilter;

import java.util.ArrayList;
import java.util.List;

public class BookStorage {

    private final static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("The Lost Symbol", "Dedective", 600, "English", "Dan Brown"));
        books.add(new Book("Origin", "Dedective", 580, "English", "Dan Brown"));
        books.add(new Book("Demons", "Dedective", 620, "English", "Dan Brown"));
        books.add(new Book("Haci Murad", "Klassika", 189, "Azerbijan", "Lev Tolstoy"));
        books.add(new Book("Stepançikovo kəndi və sakinləri", "Klassika", 256, "Azerbaycan", "Dostoyevski"));
        books.add(new Book("Qumarbaz", "Klassika", 175, "Azerbaycan", "Dostoyevski"));
        books.add(new Book("Nadir Şah Əfşarın Fərman və məktubları", "Tarix", 256, "Azerbaycan", "Qanun"));
        books.add(new Book("Dünyaların müharibəsi", "Fantastika", 224, "Azerbaycan", "Herbert George Wells"));
        books.add(new Book("Varli Ata Kasib Ata", "Ozunu Inkisaf", 336, "Azerbaycan", "Robert Kiyosaki"));
    }

    public Book addNewBook(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getBooksByGenre(String genre) {
        return BookFilter.filterBookByGenre(books, genre);
    }

    public List<Book> getBooksByAuthor(String author) {
        return BookFilter.filterBookByAuthor(books, author);
    }

    public List<Book> getBooksByLanguage(String language) {
        return BookFilter.filterBookByLanguage(books, language);
    }

    public Book getBookByCode(String code) {
        return books
                .stream()
                .filter(book -> book.getCode().equals(code))
                .findFirst().get();
    }

}
