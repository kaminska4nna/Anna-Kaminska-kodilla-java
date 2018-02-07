package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LibraryAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        // Given
        Book book1 = new Book("Author1", "Title1", 2000, "Signature1");
        Book book2 = new Book("Author2", "Title2", 2015, "Signature2");
        Book book3 = new Book("Author3", "Title3", 2002, "Signature3");
        Set<Book> booksLibraryA = new HashSet<>();
        booksLibraryA.add(book1);
        booksLibraryA.add(book2);
        booksLibraryA.add(book3);

        LibraryAdapter libraryAdapter = new LibraryAdapter();

        // When
        int publicationYearMedian = libraryAdapter.publicationYearMedian(booksLibraryA);

        // Then
        assertEquals(2002, publicationYearMedian);
    }
}