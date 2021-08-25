package com.company.resource;

import com.company.model.Book;
import com.company.service.BookService;
import com.company.service.impl.BookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class BookResource {
    private final Scanner scanner;
    private final BookService bookService;

    public BookResource() {
        this.scanner = new Scanner(System.in);
        this.bookService = new BookServiceImpl();
    }

    public void start() {
        if (selectFromMenu()) {
            start();
        }
    }

    private void showMenu() {
        System.out.println("Add New Book - 1");
        System.out.println("Show All Books - 2");
        System.out.println("Get Book By Code - 3");
        System.out.println("Filter Books by Genre - 4");
        System.out.println("Filter Books by Author - 5");
        System.out.println("Filter Books by Language - 6");
        System.out.println("EXIT - 7");
    }

    private boolean selectFromMenu() {
        showMenu();
        int select = scanner.nextInt();
        scanner.nextLine();
        switch (select) {
            case 1:
                addBook();
                break;
            case 2:
                showAllBooks();
                break;
            case 3:
                getBookByCode();
                break;
            case 4:
                filterByGenre();
                break;
            case 5:
                filterByAuthor();
                break;
            case 6:
                filterByLanguage();
                break;
            case 7:
                return false;
        }
        return true;
    }

    private void addBook() {
        System.out.println("Enter Book Name");
        String bookName = scanner.nextLine();
        System.out.println("Enter Book Genre");
        String genre = scanner.nextLine();
        System.out.println("Enter Book Language");
        String language = scanner.nextLine();
        System.out.println("Enter Book Author");
        String author = scanner.nextLine();
        System.out.println("Enter Book Page");
        int page = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(bookName, genre, page, language, author);
        book = bookService.addNewBook(book);
        printBook(book);
    }

    private void showAllBooks() {
        List<Book> books = bookService.getAllBooks();
        books.forEach(this::printBook);
    }

    private void getBookByCode() {
        System.out.println("Enter Book Code");
        String bookCode = scanner.nextLine();
        Book book = bookService.getByCode(bookCode);
        printBook(book);
    }

    private void filterByGenre() {
        System.out.println("Enter Book Genre");
        String genre = scanner.nextLine();
        List<Book> books = bookService.filterByGenre(genre);
        books.forEach(this::printBook);
    }

    private void filterByAuthor() {
        System.out.println("Enter Book Author");
        String author = scanner.nextLine();
        List<Book> books = bookService.filterByAuthor(author);
        books.forEach(this::printBook);
    }

    private void filterByLanguage() {
        System.out.println("Enter Book Language");
        String language = scanner.nextLine();
        List<Book> books = bookService.filterByLanguage(language);
        books.forEach(this::printBook);
    }

    private void printBook(Book book) {
        System.out.println("BOOK CODE: " + book.getCode());
        System.out.println("BOOK NAME: " + book.getBookName());
        System.out.println("BOOK GENRE: " + book.getGenre());
        System.out.println("BOOK AUTHOR: " + book.getAuthor());
        System.out.println("BOOK LANGUAGE: " + book.getLanguage());
        System.out.println("BOOK PAGES: " + book.getPages());
        System.out.println("=".repeat(25));
    }
}
