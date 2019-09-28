package com.sapozhnikov.search.binary;

import com.sapozhnikov.search.SearchResult;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private final BinarySearch binarySearch;
    private final int[] array;

    public BinarySearchTest() {
        binarySearch = new BinarySearch();
        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    }

    @Test
    public void searchOne() {
        int findNumber = 1;

        SearchResult search = binarySearch.search(array, findNumber);

        assertEquals(findNumber, search.getFindNumber());
        assertEquals(2, search.getIteration());
    }

    @Test
    public void searchThree() {
        int findNumber = 3;

        SearchResult search = binarySearch.search(array, findNumber);

        assertEquals(findNumber, search.getFindNumber());
        assertEquals(4, search.getIteration());
    }

    @Test
    public void searchEight() {
        int findNumber = 8;

        SearchResult search = binarySearch.search(array, findNumber);

        assertEquals(findNumber, search.getFindNumber());
        assertEquals(3, search.getIteration());
    }

    @Test
    public void searchZero() {
        int findNumber = 0;

        SearchResult search = binarySearch.search(array, findNumber);

        assertEquals(findNumber, search.getFindNumber());
        assertEquals(3, search.getIteration());
    }

    @Test
    public void searchNine() {
        int findNumber = 9;

        SearchResult search = binarySearch.search(array, findNumber);

        assertEquals(findNumber, search.getFindNumber());
        assertEquals(4, search.getIteration());
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchNotContainsNumber() {
        binarySearch.search(array, 10);
    }
}