package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> even = new ArrayList<Integer>();
        for (int i : numbers) {

            if ((i % 2) == 0) {
                even.add(i);
            }

        }
        return even;
    }


}