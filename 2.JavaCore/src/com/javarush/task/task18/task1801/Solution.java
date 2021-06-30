package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int maxValue = 0;
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        while (fileInputStream.available() > 0) {
            int readByte = fileInputStream.read();
            maxValue = readByte > maxValue ? readByte : maxValue;
        }
        fileInputStream.close();
        System.out.println(maxValue);
    }
}
