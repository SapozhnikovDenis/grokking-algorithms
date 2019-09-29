package com.sapozhnikov.sort.select;

import org.junit.Test;

public class SelectSortTest {

    private final SelectSort selectSort;

    public SelectSortTest() {
        this.selectSort = new SelectSort();
    }

    @Test
    public void sort() {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] sortArray = selectSort.sort(array);
        for (Integer i : sortArray) {
            System.out.println(i);
        }
    }
}