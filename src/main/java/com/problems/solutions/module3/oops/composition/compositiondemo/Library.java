package com.edureka.assignments.module3.oops.composition.compositiondemo;

import java.util.List;

/**
 * Created by nandigama on 1/10/2019.
 */
public class Library {
    //creating an object for class LibraryBooks
    private final List<LibraryBooks> books;
    //constructor
    public Library(List<LibraryBooks> books) {
        this.books = books;
    }

    /**
     * Method to get titles and authors
     * @return returs title and author
     */
    public List<LibraryBooks> getBookTitlesAndAuthorNames() {
        return books;

    }
}
