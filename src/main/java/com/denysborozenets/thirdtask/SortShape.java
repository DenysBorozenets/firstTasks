package com.denysborozenets.thirdtask;

import java.util.Comparator;
import java.util.List;

public class SortShape {
    public static List<Shape> sorting(List<Shape> listOfShape) {
        if (listOfShape == null || listOfShape.isEmpty()) {
            return null;
        }
        listOfShape.sort(new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.volume(), o2.volume());
            }
        });
        return listOfShape;
    }
}
