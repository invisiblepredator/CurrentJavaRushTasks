package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {

        //add your code here - добавьте код тут

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String code = bufferedReader.readLine();
            if (code.equals("helicopter")) {
                bufferedReader.close();
                result = new Helicopter();

            } else if (code.equals("plane")) {
                int valuePas = Integer.parseInt(bufferedReader.readLine());
                bufferedReader.close();

                result = new Plane(valuePas);
            } else {
                bufferedReader.close();

            }

        } catch (IOException e) {

        }
    }
}
