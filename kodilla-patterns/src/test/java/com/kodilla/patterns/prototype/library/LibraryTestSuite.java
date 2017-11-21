package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Book book1 = new Book("W poszukiwaniu straconego czasu", "Proust", LocalDate.of(1877, 1, 19));
        Book book2 = new Book("Klin", "Chmielewska", LocalDate.of(1968, 1, 1));
        Book book3 = new Book("Nowe Szaty Cesarza", "Andersen", LocalDate.of(1888, 1, 9));


        Library library = new Library("Bilblioteka");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Biblioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book1);

        System.out.println(library);
        System.out.println(cloneLibrary);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, cloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());


    }
}
