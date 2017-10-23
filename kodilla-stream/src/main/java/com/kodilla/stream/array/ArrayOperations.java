package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));


        return Arrays.stream(numbers).asDoubleStream()
                .average();
    }


}
