package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //When

        double result = getAverage(numbers);
        double averageTest = 4.5;

        //Then
        Assert.assertEquals(averageTest, result, 0.01);
    }
}
