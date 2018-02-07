package com.kodilla.kodillapatterns2.adapter.bookclasifier;


import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LibraryAdapter extends LibraryAdaptee implements Classifier {
    private Book bookLibraryB;
    private BookSignature bookSignature;

    @Override
    public int publicationYearMedian(Set<com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book> booksLibraryA) {

        Map<BookSignature, Book> books = new HashMap<>();

        for (com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book bookLibraryA : booksLibraryA) {
            bookLibraryB = new Book(bookLibraryA.getAuthor(), bookLibraryA.getTitle(), bookLibraryA.getPublicationYear());
            bookSignature = new BookSignature(bookLibraryA.getSignature());
            books.put(bookSignature, bookLibraryB);
        }
        return medianPublicationYear(books);
    }
}
