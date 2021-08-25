package com.company.util;

import com.company.model.Book;

import java.util.List;
import java.util.stream.Collectors;

public class BookFilter {

    public static List<Book> filterBookByGenre(List<Book> bookList, String genre) {
        return bookList
                .stream()
                .filter(book -> book.getGenre().contains(genre))
                .collect(Collectors.toList());
    }

    public static List<Book> filterBookByLanguage(List<Book> bookList, String language) {
        return bookList
                .stream()
                .filter(book -> book.getLanguage().contains(language))
                .collect(Collectors.toList());
    }

    public static List<Book> filterBookByAuthor(List<Book> bookList, String author) {
        return bookList
                .stream()
                .filter(book -> book.getAuthor().contains(author))
                .collect(Collectors.toList());
    }
}
