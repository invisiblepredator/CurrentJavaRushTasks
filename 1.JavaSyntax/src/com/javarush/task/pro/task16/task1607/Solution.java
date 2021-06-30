package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.util.Calendar;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш кодL


        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        LocalDate ldd = LocalDate.ofYearDay(2020, 256);

        return ldd;
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        LocalDate ldds = LocalDate.ofEpochDay(18517);

        return ldds;
    }
}
