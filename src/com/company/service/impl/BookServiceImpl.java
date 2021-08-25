package com.company.service.impl;

import com.company.bookstorage.BookStorage;
import com.company.model.Book;
import com.company.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookStorage bookStorage;

    public BookServiceImpl() {
        this.bookStorage = new BookStorage();
    }

    @Override
    public Book addNewBook(Book book) {
        return bookStorage.addNewBook(book) ;
    }

    @Override
    public Book getByCode(String code) {
        return bookStorage.getBookByCode(code);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookStorage.getAllBooks();
    }

    @Override
    public List<Book> filterByGenre(String genre) {
        return bookStorage.getBooksByGenre(genre);
    }

    @Override
    public List<Book> filterByLanguage(String language) {
        return bookStorage.getBooksByLanguage(language);
    }

    @Override
    public List<Book> filterByAuthor(String author) {
        return bookStorage.getBooksByAuthor(author);
    }
}
