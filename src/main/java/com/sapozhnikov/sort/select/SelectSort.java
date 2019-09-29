package com.sapozhnikov.sort.select;

import com.sapozhnikov.sort.Sort;

public class SelectSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            int save = array[i];
            array[i] = array[indexMin];
            array[indexMin] = save;
        }
        return array;
    }
}
