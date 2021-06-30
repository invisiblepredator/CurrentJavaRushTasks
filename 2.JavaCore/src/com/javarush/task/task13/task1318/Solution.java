package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(a));
        while(inputStreamReader.ready()){
            char chara = (char) inputStreamReader.read();
            System.out.print(chara);
        }



        bufferedReader.close();
        inputStreamReader.close();
    }
}