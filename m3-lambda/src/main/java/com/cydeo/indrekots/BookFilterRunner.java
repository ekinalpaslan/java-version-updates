package com.cydeo.indrekots;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BookFilterRunner {
    public static void main(String[] args) {
        //create a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Moby Dick", 250, "Herman Melville"));
        books.add(new Book("Alice's Adventures in Wonderland", 190, "Lewis Carrol"));
        books.add(new Book("Sylvie and Bruno", 400, "Lewis Carrol"));

        //filter a list of books
        filterBooksByAuthor(books, "Lewis Carrol");
       
        //filter the same list using Java 8 (lambda and Streams API)
        books.stream().filter(b -> "Lewis Carrol".equals(b.getAuthor())).collect(toList());
    }

    //filtering a list of books before Java 8
    public static List<Book> filterBooksByAuthor(List<Book> books, String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                result.add(book);
            }
        }
        return result;
    }
    public static List<Book> findLongNovels(List<Book> books) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPageCount() > 200) {
                result.add(book);
            }
        }
        return result;
    }
    public static List<Book> filterBooks(List<Book> books, BookPredicate p) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (p.test(book)) {
                result.add(book);
            }
        }
        return result;
    }
    //https://blog.indrek.io/articles/java-8-behavior-parameterization/
}