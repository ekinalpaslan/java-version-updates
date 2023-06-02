package com.cydeo.indrekots;

public class LengthPredicate implements BookPredicate {
    private int length;

    public LengthPredicate(int length) {
        this.length = length;
    }

    @Override
    public boolean test(Book book) {
        return book.getPageCount() > length;
    }
}