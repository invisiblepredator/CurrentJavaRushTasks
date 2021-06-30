package com.javarush.task.task17.task1708;

import com.sun.tools.javac.util.List;

import java.util.Arrays;

public  class ReverseStringTest {

    public static String reverseString(String a){

        char[] array = a.toCharArray();
      char[] reverseString = new char[array.length];


        for (int i = 0; i < array.length/2; i++) {

            reverseString[i]= array[array.length-i-1];
            reverseString[array.length-i-1]=array[i];

            System.out.println(reverseString[i]);
            System.out.println(reverseString[array.length-i-1]);

        }
        if (array.length%2==1){
            reverseString[array.length/2]=array[array.length/2];
        }
        String finaling = new String(reverseString) ;



        return finaling;
    }
}
