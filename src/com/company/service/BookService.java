package com.company.service;

import com.company.model.Book;

import java.util.List;

public interface BookService {

    Book addNewBook(Book book);

    Book getByCode(String code);

    List<Book> getAllBooks();

    List<Book> filterByGenre(String genre);

    List<Book> filterByLanguage(String language);

    List<Book> filterByAuthor(String author);

}
