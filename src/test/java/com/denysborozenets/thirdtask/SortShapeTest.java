package com.denysborozenets.thirdtask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SortShapeTest {
    @Test
    void testSortingMethodReturnsSorted() {
        Shape cube = new Cube(4);
        Shape ball = new Ball(4);
        Shape cylinder = new Cylinder(4, 2);

        List<Shape> list = new ArrayList<>();
        list.add(cube);
        list.add(ball);
        list.add(cylinder);

        List<Shape> expectedList = List.of(cylinder, cube, ball);

        List<Shape> actualList = SortShape.sorting(list);

        assertEquals(expectedList, actualList);
    }

    @Test
    void testSortingMethodIfListEmptyReturnsNull() {
        List<Shape> expectedList = new ArrayList<>();
        assertNull(SortShape.sorting(expectedList));
    }

    @Test
    void testSortingMethodIfListNullReturnsNull() {
        assertNull(SortShape.sorting(null));
    }
}