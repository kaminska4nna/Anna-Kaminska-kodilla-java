package com.kodilla.testing.library;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class BookDirectoryTestSuite {
    private LibraryDatabase libraryDatabaseMock;
    private BookLibrary bookLibrary;
    private LibraryUser user1;
    private ArrayList<Book> booksRented;

    @Before
    public void before() {
        libraryDatabaseMock = mock(LibraryDatabase.class);
        bookLibrary = new BookLibrary(libraryDatabaseMock);
        user1 = new LibraryUser("Jan", "Nowak", "88020599881");
        booksRented = new ArrayList<Book>();
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        List<Book> resultListOfBooks = new ArrayList<Book>();
        resultListOfBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        resultListOfBooks.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        resultListOfBooks.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        resultListOfBooks.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));

        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testlistBooksInHandsOf0() {
        // Given
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(booksRented);
        // When
        List<Book> books = bookLibrary.listBooksInHandsOf(user1);
        // Assert
        assertEquals(0, books.size());
    }

    @Test
    public void testlistBooksInHandsOf1() {
        // Given
        booksRented.add(new Book("Słoń", "Julian Tuwim", 1988));

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(booksRented);
        // When
        List<Book> books = bookLibrary.listBooksInHandsOf(user1);
        // Assert
        assertEquals(1, books.size());
    }

    @Test
    public void testlistBooksInHandsOf5() {
        // Given
        booksRented.add(new Book("Słoń", "Julian Tuwim", 1988));
        booksRented.add(new Book("W poszukiwaniu straconego czasu", "Marcel Proust", 1977));
        booksRented.add(new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 1974));
        booksRented.add(new Book("Latarnik i inne pieśni", "Czesław Miłosz", 1977));
        booksRented.add(new Book("W stronę zachodzącego słońca", "Beata Kozidrak", 1947));

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(booksRented);
        // When
        List<Book> books = bookLibrary.listBooksInHandsOf(user1);
        // Assert
        assertEquals(5, books.size());
    }


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}