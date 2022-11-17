package com.denysborozenets.firsttask;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static int[] positiveSorting(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int size = 0;
        for (int i : array) {
            if (i >= 0) {
                size++;
            }
        }
        int[] intermediateArray = new int[size];
        int index = 0;
        for (int j : array) {
            if (j >= 0) {
                intermediateArray[index] = j;
                index++;
            }
        }
        return Arrays.stream(intermediateArray)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

    }
}
