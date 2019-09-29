package com.sapozhnikov.sort.quick;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    private final QuickSort quickSort;

    public QuickSortTest() {
        this.quickSort = new QuickSort();
    }

    @Test
    public void sort() {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] sortArray = quickSort.sort(array);

        for (Integer i : sortArray) {
            assertEquals(i.intValue(), sortArray[i]);
        }
    }
}