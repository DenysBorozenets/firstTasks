package com.denysborozenets.secondtask;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Finder {
    public static Map<String, Integer> findTop5Tags(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> intermediateList = findWordsWithTags(removeDuplicate(list));
        Map<String, Integer> map = new HashMap<>();
        for (String i : intermediateList) {
            Integer j = map.get(i);
            map.put(i, (j == null) ? 1 : j + 1);
        }

        Map<String, Integer> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

//        for (Map.Entry<String, Integer> val : result.entrySet()) {
//            System.out.println("Element " + val.getKey() + " "
//                    + ": " + val.getValue() + " times");
//        }

        return result;

    }

    public static List<String> removeDuplicate(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> result = new ArrayList<>();
        for (String s : list) {
            String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(s);

            while (matcher.find()) {
                s = s.replaceAll(matcher.group(), matcher.group(1));
            }
            result.add(s);
        }
        return result;
    }

    public static List<String> findWordsWithTags(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> result = new ArrayList<>();
        String regex = "\\B(\\#[a-zA-Z]+\\b)(?!;)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(list.toString());
        while (matcher.find()) {
            result.add(matcher.group(1));
        }
        return result;
    }
}

