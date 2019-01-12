package com.edureka.assignments.module3.oops.composition.compositiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nandigama on 1/10/2019.
 */

/**
 * Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
 * It represents part-of relationship.
 * In composition, both the entities are dependent on each other.
 * When there is a composition between two entities, the composed object cannot exist without the other entity.
 */
public class CompositionTest {
    public static void main(String[] args) {
        LibraryBooks b1 = new LibraryBooks("AAA", "aaa");
        LibraryBooks b2 = new LibraryBooks("BBB", "bbb");
        LibraryBooks b3 = new LibraryBooks("CCC", "ccc");
        LibraryBooks b4 = new LibraryBooks("DDD", "ddd");

        List<LibraryBooks> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        Library library = new Library(list);
        for (LibraryBooks bks : library.getBookTitlesAndAuthorNames()) {
            System.out.println("Title : " + bks.title + " ,  Author is : " + bks.author);
        }

    }
}
