package com.denysborozenets.firsttask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SortingTest {

    @Test
    void testPositiveSortingMethodReturnsSorted() {
        int[] testArray = new int[]{1, 2, 4, 8, -1, -5, 9};
        int[] expectedArray = {9, 8, 4, 2, 1};
        int[] actualArray = Sorting.positiveSorting(testArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testPositiveSortingMethodIfArrayEmptyReturnsNull() {
        int[] expected = new int[]{};
        assertNull(Sorting.positiveSorting(expected));
    }

    @Test
    void testPositiveSortingMethodIfArrayNullReturnsNull() {
        assertNull(Sorting.positiveSorting(null));
    }
}