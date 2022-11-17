package com.denysborozenets.secondtask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FinderTest {

    @Test
    void testFindTop5TagsMethodReturnsTop5Tags() {
        List<String> list = List.of("Hi my friends #hello #hello", "#hello people", "#hello", "#for How are you",
                "#for you", "#for me", "#for #for", "#hello", "#hello", "#java spring", "#java #java", "#find", "#find",
                "#find", "#stack #stack", "#stack #stack", "#hi", "#hi", "#hi", "#hi");
        Map<String, Integer> actualResult = Finder.findTop5Tags(list);

        Map<String, Integer> expectedMap = new LinkedHashMap<>() {
            {
                put("#hello", 5);
                put("#hi", 4);
                put("#for", 4);
                put("#find", 3);
                put("#stack", 2);
            }
        };
        assertEquals(expectedMap, actualResult);
    }

    @Test
    void testFindTop5TagsMethodIfListEmptyReturnsNull() {
        List<String> expectedList = new ArrayList<>();
        assertNull(Finder.findTop5Tags(expectedList));
    }

    @Test
    void testPositiveSortingMethodIfListNullReturnsNull() {
        assertNull(Finder.findTop5Tags(null));
    }

    @org.junit.jupiter.api.Test
    void testRemoveDuplicateMethodReturnsListWithoutDuplicates() {
        List<String> list = List.of("#stack #stack", "#find #find", "#hello #hello");
        List<String> expectedList = List.of("#stack", "#find", "#hello");
        List<String> actualList = Finder.removeDuplicate(list);
        assertEquals(expectedList, actualList);
    }

    @Test
    void testRemoveDuplicateMethodIfListEmptyReturnsNull() {
        List<String> expectedList = new ArrayList<>();
        assertNull(Finder.removeDuplicate(expectedList));
    }

    @Test
    void testRemoveDuplicateMethodIfListNullReturnsNull() {
        assertNull(Finder.removeDuplicate(null));
    }

    @org.junit.jupiter.api.Test
    void testFindWordsWithTagsMethodReturnsListTags() {
        List<String> list = List.of("Hello #stack", "How are #find", "#hello something else");
        List<String> expectedList = List.of("#stack", "#find", "#hello");
        List<String> actualList = Finder.findWordsWithTags(list);
        assertEquals(expectedList, actualList);
    }

    @Test
    void testFindWordsWithTagsMethodIfListEmptyReturnsNull() {
        List<String> expectedList = new ArrayList<>();
        assertNull(Finder.findWordsWithTags(expectedList));
    }

    @Test
    void testFindWordsWithTagsMethodIfListNullReturnsNull() {
        assertNull(Finder.findWordsWithTags(null));
    }
}