package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String a = o instanceof Cat ? "Кошка" : o instanceof Dog ? "Собака" : o instanceof Bird ? "Птица" : o instanceof Lamp ? "Лампа" : "Неизвстно";
        //Напишите тут ваше решение
        System.out.println(a);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
