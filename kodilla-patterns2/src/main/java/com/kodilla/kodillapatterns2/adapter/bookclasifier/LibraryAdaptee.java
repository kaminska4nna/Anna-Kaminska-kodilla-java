package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class LibraryAdaptee implements BookStatistics {

    private Statistics statisticsLibraryB = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statisticsLibraryB.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statisticsLibraryB.medianPublicationYear(books);
    }
}