package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int minValue = 255;
        while(fileInputStream.available()>0){
            int currentByteValue = fileInputStream.read();
            minValue = currentByteValue > minValue ? minValue : currentByteValue;
        }
        fileInputStream.close();
        System.out.println(minValue);
    }
}
