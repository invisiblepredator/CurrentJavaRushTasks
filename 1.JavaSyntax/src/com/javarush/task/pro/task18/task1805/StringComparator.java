package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int value = o1.length() < o2.length() ? -1 : o1.length() == o2.length() ? 0 : 1;
        return value;
    }
}
