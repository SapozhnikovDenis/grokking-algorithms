package com.sapozhnikov.search.binary;

import com.sapozhnikov.search.Search;
import com.sapozhnikov.search.SearchResult;

public class BinarySearch implements Search {

    public SearchResult search(int[] numbers, int findNumber) {
        int low = 0;
        int high = numbers.length - 1;
        int iteration = 0;
        while (low <= high) {
            iteration++;
            int cursor = (low + high) / 2;
            int number = numbers[cursor];
            if (number == findNumber) {
                return new SearchResult(iteration, number);
            } else if (number < findNumber) {
                low = cursor + 1;
            } else {
                high = cursor - 1;
            }
        }
        throw new IllegalArgumentException(String.format("number=%s , not contains in input numbers", findNumber));
    }
}
