package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            int rsl = left.charAt(i) - right.charAt(i);
            if (rsl != 0) {
                return rsl;
            }
        }
        return left.length() - right.length();
    }
}