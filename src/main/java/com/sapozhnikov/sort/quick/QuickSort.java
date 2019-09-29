package com.sapozhnikov.sort.quick;

import com.sapozhnikov.sort.Sort;

public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    private int[] sort(int[] array, int low, int high) {
        if (low >= high) {
            return array;
        }
        int middle = low + (high - low) / 2;
        int middleValue = array[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < middleValue) {
                i++;
            }
            while (array[j] > middleValue) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        sort(array, low, j);
        sort(array, i, high);
        return array;
    }
}
