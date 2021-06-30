package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put(5.1, "a");
        labels.put(5.2, "q");
        labels.put(5.3, "w");
        labels.put(5.4, "e");
        labels.put(5.5, "r");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
