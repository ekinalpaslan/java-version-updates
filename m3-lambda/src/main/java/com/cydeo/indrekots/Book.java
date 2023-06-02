package com.cydeo.indrekots;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private int pageCount;
    private String author;

    //getters and setters omitted...


    public Book(String name, int pageCount, String author) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}