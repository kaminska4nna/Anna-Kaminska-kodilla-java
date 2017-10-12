package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    private OddNumbersExterminator oddNumbersExterminator;

    @Before
    public void beforeTests() {
        System.out.println("Before test");
        oddNumbersExterminator = new OddNumbersExterminator();
    }


    @After
    public void afterTests() {
        System.out.println("After test");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        System.out.println("Testing array is empty ");

        List<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<>());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        System.out.println("Testing ");

    }

}
