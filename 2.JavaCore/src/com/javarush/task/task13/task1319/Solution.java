package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileNameString = br.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNameString));

        StringBuilder builder = new StringBuilder();

        String s = "";
        while (!s.equals("exit")) {
            s = br.readLine();
            builder.append(s).append("\n");
        }

        bufferedWriter.write(builder.toString());
        bufferedWriter.close();
    }
}
